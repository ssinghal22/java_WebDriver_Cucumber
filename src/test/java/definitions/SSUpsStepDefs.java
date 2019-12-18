/*
package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;
import static support.TestContext.getWait;

public class SSUpsStepDefs {
    @And("^I select \"([^\"]*)\" and \"([^\"]*)\" on global page$")
    public void iSelectAndOnGlobalPage(String region, String country) throws Throwable {
        WebElement topHeader = getDriver().findElement(By.xpath("//*[@class='page-title_cell']"));
        new Actions(getDriver()).moveToElement(topHeader).perform();
        By countrySelector = By.xpath("//a[text()='" + country + "']");

        if (getDriver().findElements(countrySelector).size() == 0) {
            getDriver().findElement(By.xpath("//a[text()='" + region + "']")).click();
        }

        getDriver().findElement(countrySelector).click();
    }

    @And("^I open Shipping menu$")
    public void iOpenShippingMenu() {
        getDriver().findElement(By.xpath("//a[@id='ups-menuLinks1']")).click();
    }

    @And("^I go to Create a Shipment$")
    public void iGoToCreateAShipment() {
        getDriver().findElement(By.xpath("//*[@id='ups-menuPanel1']//a[contains(@href,'ship?loc')]")).click();
    }

    @When("^I fill out origin shipment fields$")
    public void iFillOutOriginShipmentFields() {
        getDriver().findElement(By.xpath("//input[@id='originname']")).sendKeys("Administrator");
        getDriver().findElement(By.xpath("//input[@id='originaddress1']")).sendKeys("4970 El Camino Real");
        getDriver().findElement(By.xpath("//input[@id='originpostal']")).sendKeys("94022");

        getWait().until(ExpectedConditions.textToBePresentInElementValue(By.xpath("//input[@id='origincity']"), "LOS ALTOS"));
        getWait().until(ExpectedConditions.elementToBeSelected(By.xpath("//select[@id='originstate']/option[text()='California']")));

        getDriver().findElement(By.xpath("//input[@id='originemail']")).sendKeys("mail@example.com");
        getDriver().findElement(By.xpath("//input[@id='originphone']")).sendKeys("1234567890");
    }

    @And("^I submit the shipment form$")
    public void iSubmitTheShipmentForm() {
        String oldUrl = getDriver().getCurrentUrl();
        getDriver().findElement(By.xpath("//button[@id='nbsBackForwardNavigationContinueButton']")).click();
        getWait().until(ExpectedConditions.not(ExpectedConditions.urlToBe(oldUrl)));
    }

    @Then("^I verify origin shipment fields submitted$")
    public void iVerifyOriginShipmentFieldsSubmitted() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='originnbsAgentSummaryName']")));
        String textToVerify = getDriver().findElement(By.xpath("//*[@prefix='origin']")).getText();

        assertThat(textToVerify).containsIgnoringCase("Administrator");
        assertThat(textToVerify).containsIgnoringCase("4970 El Camino Real");
        assertThat(textToVerify).containsIgnoringCase("94022");
        assertThat(textToVerify).containsIgnoringCase("mail@example.com");
        assertThat(textToVerify).containsIgnoringCase("1234567890");
        assertThat(textToVerify).containsIgnoringCase("Los Altos");
        assertThat(textToVerify).containsIgnoringCase("CA");
    }

    @And("^I cancel the shipment form$")
    public void iCancelTheShipmentForm() {
        getDriver().findElement(By.xpath("//button[@id='nbsBackForwardNavigationCancelShipmentButton']")).click();
        getDriver().findElement(By.xpath("//button[@id='nbsCancelShipmentWarningYes']")).click();
    }

    @Then("^I verify shipment form is reset$")
    public void iVerifyShipmentFormIsReset() {
        String value = getDriver().findElement(By.xpath("//input[@id='originname']")).getAttribute("value");
        assertThat(value).isEmpty();
    }
}*/
