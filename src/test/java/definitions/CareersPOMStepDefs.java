package definitions;

import com.mashape.unirest.http.exceptions.UnirestException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.*;
import support.RestWrapper;
import support.TestContext;

import java.io.FileNotFoundException;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.*;

public class CareersPOMStepDefs {
    @Given("^I open \"([^\"]*)\" page object$")
    public void iOpenPageObject(String page) throws Throwable {
        switch(page) {
            case "careers":
                new LandingPage().open();
                break;
            case "sample":
                new SampleForm().open();
                break;
            default:
                throw new Exception("Page " + page + " not recognized!");
        }
    }

    @And("^I login as \"([^\"]*)\"$")
    public void iLoginAs(String role) throws Throwable {
        HashMap<String, String> user = getData(role);

        LandingPage landingPage = new LandingPage();
        landingPage.assertHeader();
        landingPage.clickLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.assertHeader();
        loginPage.login(user.get("email"), user.get("password"));
    }

    @Then("^I verify \"([^\"]*)\" login$")
    public void iVerifyLogin(String role) throws Throwable {
        HashMap<String, String> user = getData(role);
        String actualName = new LandingPage().getNameOfLoggedUser();
        assertThat(actualName).isEqualTo(user.get("firstName") + " " + user.get("lastName"));
    }

    @When("^I create new position$")
    public void iCreateNewPosition() throws FileNotFoundException {
        new LandingPage().clickRecruit();

        RecruitPage recruitPage = new RecruitPage();
        recruitPage.assertHeader();

        recruitPage.clickNewPosition();

        NewPositionPage newPositionPage = new NewPositionPage();
        newPositionPage.assertHeader();

        HashMap<String, String> position = TestContext.getPosition();

        String title = position.get("title");
        title = TestContext.addTimestamp(title);

        TestContext.setTestData("positionTitle", title);

        position.put("title", title);

        newPositionPage.fillPosition(position);
        newPositionPage.submit();
    }

    @And("^I verify position created$")
    public void iVerifyPositionCreated() throws FileNotFoundException {
        boolean isPresent = new RecruitPage().isPositionPresentOnPage(TestContext.getStringTestData("positionTitle"));
        assertThat(isPresent).isTrue();
    }

    @And("^I apply to a new position$")
    public void iApplyToANewPosition() throws FileNotFoundException, InterruptedException {
        String positionId = new LandingPage().applyToNewPosition();

        TestContext.setTestData("positionId", positionId);

        ApplyPage applyPage = new ApplyPage();
        applyPage.assertHeader();

        HashMap<String, String> candidate = TestContext.getCandidate();
        applyPage.fillProfileDetails(candidate);

        applyPage.submit();

        Thread.sleep(9000);
    }

    @Then("^I verify profile is created$")
    public void iVerifyProfileIsCreated() throws FileNotFoundException {
        MyJobsPage myJobsPage = new MyJobsPage();
        myJobsPage.assertHeader();

        HashMap<String, String> candidate = TestContext.getCandidate();

        String actualName = myJobsPage.getNameOfLoggedUser();
        assertThat(actualName).isEqualTo(candidate.get("firstName") + " " + candidate.get("lastName"));
    }

    @And("^I see position in my jobs$")
    public void iSeePositionInMyJobs() {
        String positionId = TestContext.getStringTestData("positionId");
        new MyJobsPage().isPositionAdded(positionId);
    }

    @When("^I apply for a new job$")
    public void iApplyForANewJob() throws InterruptedException {
        String positionId = new LandingPage().applyToNewPosition();
        TestContext.setTestData("positionId", positionId);
    }

    @Then("^I see position marked as applied$")
    public void iSeePositionMarkedAsApplied() throws InterruptedException {
        String positionId = TestContext.getStringTestData("positionId");
        Thread.sleep(9000);
        new LandingPage().isPositionSelected(positionId);
    }

    @And("^I see position added in my jobs$")
    public void iSeePositionAddedInMyJobs() {
        LandingPage landingPage = new LandingPage();
        landingPage.clickMyJobs();

        String positionId = TestContext.getStringTestData("positionId");
        new MyJobsPage().isPositionAdded(positionId);
    }

    @Given("^I login to REST as \"([^\"]*)\"$")
    public void iLoginToRESTAs(String role) throws Throwable {
        HashMap<String, String> user = getData(role);
        new RestWrapper().login(user);

        if (role.equals("candidate")) {
            new RestWrapper().getCandidateId(user);
        }
    }

    @When("^I create a new position with REST$")
    public void iCreateANewPositionWithREST() throws FileNotFoundException, UnirestException {
        HashMap<String, String> position = getPosition();
        String title = position.get("title");
        title = TestContext.addTimestamp(title);
        TestContext.setTestData("positionTitle", title);
        position.put("title", title); //only adds timestamp in hashmap

        new RestWrapper().addNewPosition(position);
    }

    @And("^I delete this new position with REST$")
    public void iDeleteThisNewPositionWithREST() throws UnirestException {
        String id = TestContext.getStringTestData("positionId");
        String token = TestContext.getStringTestData("token");

        new RestWrapper().deleteNewAddedPosition(token, id);
    }

    @And("^I verify position created, in REST$")
    public void iVerifyPositionCreatedInREST() throws UnirestException {
        String id = TestContext.getStringTestData("positionId");
        System.out.println("position id from TestData: " + id);

        String title = TestContext.getStringTestData("positionTitle");

        String atitle = new RestWrapper().verifyNewAddedPosition(id);

       assertThat(atitle).isEqualTo(title);
       System.out.println("Position title from testData: " + title);
       System.out.println("Position title from REST: " + atitle);
    }

    @Given("^I apply to a new position with REST$")
    public void iApplyToANewPositionWithREST() throws FileNotFoundException, UnirestException {
        HashMap<String, String> candidate = getCandidate();
        new RestWrapper().addNewCandidate(candidate);

        new RestWrapper().login(candidate);

        new RestWrapper().PickARandomPosition();

        String candidateId = TestContext.getStringTestData("candidateId");
        String positionId = TestContext.getStringTestData("positionId");
        HashMap<String, String> body = new HashMap<>();
        body.put("positionId", positionId);
        body.put("candidateId", candidateId);

        new RestWrapper().candidateAppliesToPosition(body);
    }

    @Then("^I verify profile is created with REST$")
    public void iVerifyProfileIsCreatedWithREST() throws UnirestException {
        String candidateId = TestContext.getStringTestData("candidateId");
        new RestWrapper().verifyCandidateProfile(candidateId);
    }

    @And("^I see position in my jobs with REST$")
    public void iSeePositionInMyJobsWithREST() throws UnirestException {
        String candidateId = TestContext.getStringTestData("candidateId");
        String positionId = TestContext.getStringTestData("positionId");
        new RestWrapper().verifyPositionInMyJobs(candidateId, positionId);
    }

    @When("^I apply for a job with REST$")
    public void iApplyForAJobWithREST() throws UnirestException {
        new RestWrapper().PickARandomPosition();

        String positionId = TestContext.getStringTestData("positionId");
        String candidateId = TestContext.getStringTestData("candidateId");
        HashMap<String, String> body = new HashMap<>();
        body.put("positionId", positionId);
        body.put("candidateId", candidateId);
        new RestWrapper().candidateAppliesToPosition(body);
    }

    @Then("^I see position marked as applied with REST$")
    public void iSeePositionMarkedAsAppliedWithREST() throws UnirestException {
        String positionId = TestContext.getStringTestData("positionId");
        String candidateId = TestContext.getStringTestData("candidateId");
        new RestWrapper().verifyPositionInMyJobs(candidateId, positionId);
    }

    @Then("^position is deleted$")
    public void positionIsDeleted() throws UnirestException {
        String token = TestContext.getStringTestData("token");
        String applicationId = TestContext.getStringTestData("applicationId");
        new RestWrapper().deleteAppliedPosition(token, applicationId);

        String positionId = TestContext.getStringTestData("positionId");
        new RestWrapper().deleteNewAddedPosition(token, positionId);
    }
}
