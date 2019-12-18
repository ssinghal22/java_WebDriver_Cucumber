package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.Page;
import support.TestContext;

import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.*;

public class Ups2_1_StepDefs {
    @When("^I fill out destination shipment info$")
    public void iFillOutDestinationShipmentInfo() throws FileNotFoundException {
        HashMap<String, String> receiver = TestContext.getReceiver();

        getDriver().findElement(By.xpath("//input[@id='destinationname']")).sendKeys(receiver.get("name"));
        getDriver().findElement(By.xpath("//input[@id='destinationaddress1']")).sendKeys(receiver.get("address"));
        getDriver().findElement(By.xpath("//input[@id='destinationpostal']")).sendKeys(receiver.get("zip"));

        getWait().until(ExpectedConditions.textToBePresentInElementValue(By.xpath("//*[@id='destinationcity']"), receiver.get("city").toUpperCase()));

        By state = By.xpath("//select[@id='destinationstate']/option[text()='New York']");
        getWait().until(ExpectedConditions.elementToBeSelected(state));
    }

    @Then("^I verify total charges display$")
    public void iVerifyTotalChargesDisplay() {
        By total = By.xpath("//span[@id='total-charges-spinner']");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(total));
        String totalCharges = getDriver().findElement(total).getText();
        assertThat(totalCharges).isNotEmpty();
    }

    @And("^I set the packaging type$")
    public void iSetThePackagingType() {
        WebElement selectElement = getDriver().findElement(By.xpath("//select[@id='nbsPackagePackagingTypeDropdown0']"));

        Select select = new Select(selectElement);
        select.selectByVisibleText("UPS Express Box - Small");

        getDriver().findElement(By.xpath("//input[@id='nbsPackagePackageWeightField0']")).sendKeys("1");
    }

    @Then("^I verify that total charges changed$")
    public void iVerifyThatTotalChargesChanged() {
        By totalChargesSelector = By.xpath("//span[@id='total-charges-spinner']");

        //WebElement totalChargesElement = getDriver().findElement(By.xpath("//span[@id='total-charges-spinner']"));

        WebElement totalChargesElement = getDriver().findElement(totalChargesSelector);

        String oldCharges = totalChargesElement.getText();

        //getWait().until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(totalChargesElement, oldCharges)));
        getWait().until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElementLocated(totalChargesSelector, oldCharges)));
    }

    @And("^I select the cheapest delivery option$")
    public void iSelectTheCheapestDeliveryOption() throws ParseException {
        List<WebElement> prices = getDriver().findElements(By.xpath("//p[contains(@id,'nbsServiceTileTotalCharge')]"));
        Locale locale = new Locale("en", "US");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        double cheapestPrice = Double.MAX_VALUE;
        for(WebElement price: prices) {
            if (price.isDisplayed()) {
                double currentPrice = formatter.parse(price.getText()).doubleValue();
                if (currentPrice < cheapestPrice) {
                    cheapestPrice = currentPrice;
                }
            }
        }
        WebElement cheapestPriceElement = getDriver().findElement(By.xpath("//p/strong[contains(text(), '" + cheapestPrice + "')]"));
        Page.clickWithJS(cheapestPriceElement);
    }

    @Then("^I review all recorded details on the review page$")
    public void iReviewAllRecordedDetailsOnTheReviewPage() throws FileNotFoundException {
        HashMap<String, String> sender = getSender();
        String origin = getDriver().findElement(By.xpath("//origin-return[@id='nbsSpaOriginReturn']")).getText();
        assertThat(origin).containsIgnoringCase(sender.get("name"));
        assertThat(origin).containsIgnoringCase(sender.get("address"));
        assertThat(origin).containsIgnoringCase(sender.get("zip"));
        assertThat(origin).containsIgnoringCase(sender.get("city"));
        assertThat(origin).containsIgnoringCase(sender.get("state"));

        String destination = getDriver().findElement(By.xpath("//destination[@id='nbsSpaDestination']")).getText();
        HashMap<String, String> receiver = getReceiver();
        assertThat(destination).containsIgnoringCase(receiver.get("name"));
        assertThat(destination).containsIgnoringCase(receiver.get("address"));
        assertThat(destination).containsIgnoringCase(receiver.get("zip"));
        assertThat(destination).containsIgnoringCase(receiver.get("city"));
        assertThat(destination).containsIgnoringCase(receiver.get("state"));
    }
}
