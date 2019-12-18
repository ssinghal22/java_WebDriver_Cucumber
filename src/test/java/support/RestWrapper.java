package support;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.HttpRequestWithBody;
import com.mashape.unirest.request.body.RequestBodyEntity;
import org.json.JSONArray;
import org.json.JSONObject; //notation always unique, so that no collision

import java.util.HashMap;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getStringTestData;

public class RestWrapper {

    private final String baseUrl = "https://skryabin.com/recruit/api/v1/";
   // private final String baseUrl = "http://localhost:8090/recruit/api/v1/";
    private String loginToken;

    private final String CONTENT_TYPE = "Content-Type"; //in java, constants written as all caps
    private final String JSON = "application/json";
    private final String  X_ACCESS_TOKEN = "x-access-token";

    public void login(HashMap<String, String> credentials) throws UnirestException {
        RequestBodyEntity request =  Unirest.post(baseUrl + "login")
                .header(CONTENT_TYPE, JSON)
                .body(new JSONObject(credentials)); //preparation of request, JSONObject comes from org.json,
        // always look at last to get return type
        //can use .asJson() too, good to separate prep nd execution

        HttpResponse<JsonNode> response = request.asJson(); //execution, get request as json
        //making request and save response as json, both headers nd body

        assertThat(response.getStatus()).isEqualTo(200); //verify
        JSONObject body = response.getBody().getObject(); //do something w it
        loginToken = body.getString("token");
        System.out.println("\nLogin Successful! Token from DB: " + loginToken);

        TestContext.setTestData("token", loginToken);
    }

    public void addNewPosition(HashMap<String, String> position) throws UnirestException {
        String loginToken = getStringTestData("token");

        HashMap<String, String> headers = new HashMap<>();
        headers.put(CONTENT_TYPE, JSON);
        headers.put(X_ACCESS_TOKEN, loginToken);

        RequestBodyEntity request = Unirest.post(baseUrl + "positions")
                .headers(headers)
                .body(new JSONObject(position));

        HttpResponse<JsonNode> response = request.asJson();

        assertThat(response.getStatus()).isEqualTo(201);
        JSONObject body = response.getBody().getObject();
        String title = body.getString("title");
        System.out.println("\nPosition added with Title: " + title);

        int id = body.getInt("id");
        System.out.println("\nPosition added with id in DB: " + id);

        TestContext.setTestData("positionId", String.valueOf(id));
        System.out.println("\nposition added with id: " + getStringTestData("positionId") + " in testData");
    }

    public void deleteNewAddedPosition(String token, String id) throws UnirestException {
        HttpRequestWithBody request = Unirest.delete(baseUrl + "positions/{id}")
                .routeParam("id", id)
                .header(X_ACCESS_TOKEN, token); //use return from last one, 'header' here

        HttpResponse<JsonNode> response = request.asJson();
        assertThat(response.getStatus()).isEqualTo(204);
        System.out.println("\nPosition successfully deleted with id: " + id);
    }

    public String verifyNewAddedPosition(String id) throws UnirestException {
        GetRequest request = Unirest.get(baseUrl + "positions/{id}")
                .routeParam("id", id);

        HttpResponse<JsonNode> response = request.asJson();
        assertThat(response.getStatus()).isEqualTo(200);

        JSONObject body = response.getBody().getObject();
        String title = body.getString("title");
        return title;
    }

    public void addNewCandidate(HashMap<String, String> candidate) throws UnirestException {
        RequestBodyEntity request = Unirest.post(baseUrl + "candidates")
                                            .header(CONTENT_TYPE, JSON)
                                            .body(new JSONObject(candidate));

        HttpResponse<JsonNode> response = request.asJson();
        assertThat(response.getStatus()).isEqualTo(201);

        JSONObject body = response.getBody().getObject();

        int id = body.getInt("id");
        System.out.println("\nCandidate added in DB with id: " + id);

        TestContext.setTestData("candidateId", String.valueOf(id));
        System.out.println("\ncandidate id added in TestData: " + getStringTestData("candidateId"));
    }

    public void candidateAppliesToPosition(HashMap<String, String> body) throws UnirestException {
        String loginToken = getStringTestData("token");
        RequestBodyEntity request = Unirest.post(baseUrl + "applications")
                .header(CONTENT_TYPE, JSON)
                .header(X_ACCESS_TOKEN, loginToken)
                .body(new JSONObject(body));

        HttpResponse<JsonNode> response = request.asJson();
        assertThat(response.getStatus()).isEqualTo(201);

        JSONObject reponseBody = response.getBody().getObject();
        int applicationId = reponseBody.getInt("id");
        TestContext.setTestData("applicationId", String.valueOf(applicationId));

        System.out.println("\nCandidate with id from TestData: " + body.get("candidateId") + " applied to Position with Id from TestData: " + body.get("positionId"));
    }

    public void verifyCandidateProfile(String candidateId) throws UnirestException {
        GetRequest request = Unirest.get(baseUrl + "candidates/{id}")
                .routeParam("id", candidateId);

        HttpResponse<JsonNode> response = request.asJson();
        assertThat(response.getStatus()).isEqualTo(200);
    }

    public void verifyPositionInMyJobs(String candidateId, String positionId) throws UnirestException {
         GetRequest request = Unirest.get(baseUrl + "candidates/{id}/positions")
                 .routeParam("id", candidateId);

        HttpResponse<JsonNode> response = request.asJson();
        assertThat(response.getStatus()).isEqualTo(200);

        //verify position id exists in list of ids returned
        JSONArray results = response.getBody().getArray(); //no for each here
        for (int i=0; i<results.length(); i++){ //same as ++i
            int apositionId = results.getJSONObject(i).getInt("id");

            if (String.valueOf(apositionId).equals(positionId)) {
                System.out.println("\nPosition exists in my jobs.");
            }
        }
    }

    public void getCandidateId(HashMap<String, String> candidate) throws UnirestException {
        GetRequest request = Unirest.get(baseUrl + "candidates");

        HttpResponse<JsonNode> response = request.asJson();
        assertThat(response.getStatus()).isEqualTo(200);

       JSONArray results = response.getBody().getArray();
        for (int i=0; i<results.length(); i++){
            String email = results.getJSONObject(i).getString("email");

            if (email.equals(candidate.get("email"))) {
                System.out.println("\ncandidate with email match found in DB");
                int candidateId = results.getJSONObject(i).getInt("id");
                TestContext.setTestData("candidateId", String.valueOf(candidateId));
            }
        }
    }

    public void PickARandomPosition() throws UnirestException {
        GetRequest request = Unirest.get(baseUrl + "positions");

        HttpResponse<JsonNode> response = request.asJson();
        assertThat(response.getStatus()).isEqualTo(200);

        JSONArray results = response.getBody().getArray();
        int len = results.length();
        System.out.println("\nno of total positions found on page: " + len);
        int randomNum = new Random().nextInt(len);
        System.out.println("\nrandom position num picked: " + randomNum);

        int positionId = results.getJSONObject(randomNum).getInt("id");
        System.out.println("\nposition id of random position: " + positionId);
        TestContext.setTestData("positionId", String.valueOf(positionId));
    }

    public void deleteAppliedPosition(String token, String applicationId) throws UnirestException {
        HttpRequestWithBody request = Unirest.delete(baseUrl + "applications/" + applicationId)
                .header(X_ACCESS_TOKEN, token);

        HttpResponse<JsonNode> response = request.asJson();
        assertThat(response.getStatus()).isEqualTo(204);
    }

}
