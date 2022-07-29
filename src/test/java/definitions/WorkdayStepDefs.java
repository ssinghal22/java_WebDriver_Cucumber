package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;
import static support.TestContext.getWait;

public class WorkdayStepDefs {
    @When("^I select any position$")
    public void iSelectAnyPosition() throws Throwable {

        By element = By.xpath("//span[contains(@id,'newFacetSearch.Report_Entry')]");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(element));

        List<WebElement> results = getDriver().findElements(By.xpath("//div[contains(@id,'promptOption')]"));

        int num = new Random().nextInt(50);
        results.get(num).click();
    }

   // @Then("^I apply with LinkedIn$")
    //public void iApplyWithLinkedIn() throws Throwable {
      //  getDriver().findElement(By.xpath("(//div[contains(@id,'Import_from_LinkedIn')])[1]")).click();
    //}

    @Then("^I verify that valid OAuth LinkedIn login page opens$")
    public void iVerifyThatValidOAuthLinkedInLoginPageOpens() throws Throwable {
        By headerIcon = By.xpath("(//li-icon[@type='linkedin-logo'])[1]");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(headerIcon));

        String title = getDriver().getTitle();
        assertThat(title).containsIgnoringCase("Sign In to LinkedIn");
    }

    @And("^I Apply with LinkedIn$")
    public void iApplyWithLinkedIn() throws InterruptedException {
        getDriver().findElement(By.xpath("(//div[contains(@id,'Import_from_LinkedIn')])[1]")).click();
        Thread.sleep(5000);
    }
}