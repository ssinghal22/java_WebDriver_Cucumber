package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.Credible;
import pages.Usps;

public class CrediblePomStepdefs {
    @Given("^I go to credible page object$")
    public void iGoToCrediblePageObject() {
        new Credible().open();
    }

    @When("^I click on Student Loans tile in the landing page$")
    public void iClickOnStudentLoansTileInTheLandingPage() {
        new Credible().clickStudentLoans();
    }

    @And("^I enter Education info$")
    public void iEnterEducationInfo() throws InterruptedException {
        new Credible().enterEducationInfo();
    }

    @And("^I enter Financial info$")
    public void iEnterFinancialInfo() {
        new Credible().enterFinanceInfo();
    }

    @And("^I enter Profile info$")
    public void iEnterProfileInfo() {
        new Credible().enterProfileInfo();
    }
}
