package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.json.JSONArray;
import org.json.JSONObject;
import support.SlavaRestWrapper;

import java.util.HashMap;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.*;

public class SlavaCareersPOMStepDefs {

    @Given("^I login to REST as \"([^\"]*)\" Slava step$")
    public void iLoginToRESTAsSlavaStep(String role) throws Throwable {
        HashMap<String, String> user = getData(role);
        new SlavaRestWrapper().login(user);
    }

    @When("^I create via REST new position$")
    public void iCreateViaRESTNewPosition() throws Exception {
        HashMap<String, String> position = getPositionWithTimestamp();
        new SlavaRestWrapper().createPosition(position);
    }

    @And("^I delete via REST new position$")
    public void iDeleteViaRESTNewPosition() throws Exception {
        int positionId = getJsonTestData(SlavaRestWrapper.POSITION).getInt("id");
        new SlavaRestWrapper().deletePosition(positionId);
    }

    @Then("^I verify via REST new position in the list$")
    public void iVerifyViaRESTNewPositionInTheList() throws Exception {
        JSONArray actualPositions = new SlavaRestWrapper().getPositions();
        JSONObject expectedPosition = getJsonTestData(SlavaRestWrapper.POSITION);

        boolean found = false;
        for (int i = 0; i < actualPositions.length(); i++) {
            JSONObject actualPosition = actualPositions.getJSONObject(i);
            if (actualPosition.getInt("id") == expectedPosition.getInt("id")) {
                found = true;
                break;
            }
        }
        assertThat(found).isTrue();
    }

    @And("^I update via REST new position$")
    public void iUpdateViaRESTNewPosition() throws Exception {
        HashMap<String, String> fieldsToUpdate = new HashMap<>();
        fieldsToUpdate.put("city", "Mountain View");
        int positionId = getJsonTestData(SlavaRestWrapper.POSITION).getInt("id");

        JSONObject response = new SlavaRestWrapper().updatePosition(fieldsToUpdate, positionId);
        assertThat(response.getString("city")).isEqualTo("Mountain View");

        JSONObject position = getJsonTestData(SlavaRestWrapper.POSITION);
        position.put("city", "Mountain View");
        setTestData(SlavaRestWrapper.POSITION, position);
    }

    @Then("^I verify via REST position details$")
    public void iVerifyViaRESTPositionDetails() throws Exception {
        JSONObject expectedPosition = getJsonTestData(SlavaRestWrapper.POSITION);
        int positionId = expectedPosition.getInt("id");
        JSONObject actualPosition = new SlavaRestWrapper().getPositionById(positionId);

        Set<String> keys = expectedPosition.keySet();
        for (String key : keys) {
            System.out.println("\n Actual: " + actualPosition.get(key));
            System.out.println("\n Expected: " + expectedPosition.get(key));
            assertThat(actualPosition.get(key).equals(expectedPosition.get(key))).isTrue();
        }
    }
}
