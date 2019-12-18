package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Page;

import java.util.HashMap;
import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.*;

public class Ups2StepDefs {
    @When("^I fill out destination shipment fields$")
    public void iFillOutDestinationShipmentFields() throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@id='destinationname']")).sendKeys("John Doe");
        getDriver().findElement(By.xpath("//input[@id='destinationaddress1']")).sendKeys("870 7th Ave");
        getDriver().findElement(By.xpath("//input[@id='destinationpostal']")).sendKeys("10019");

        // can't verify for city, please advice

        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        By state = By.xpath("//select[@id='destinationstate']/option[text()='New York']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(state));
    }

    @Then("^I verify total charges appear$")
    public void iVerifyTotalChargesAppear() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        By totalCharges = By.xpath("//span[@id='total-charges-spinner'][contains(text(), '$11.71')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(totalCharges));
    }

    @And("^I submit the shipment form$")
    public void iSubmitTheShipmentForm() throws InterruptedException {
        WebElement element = getDriver().findElement(By.xpath("//button[@id='nbsBackForwardNavigationContinueButton']"));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", element);
    }

    @And("^I set packaging type$")
    public void iSetPackagingType() throws InterruptedException {
        getDriver().findElement(By.xpath("//select[@id='nbsPackagePackagingTypeDropdown0']/option[text()='UPS Express Box - Small']")).click();
        getDriver().findElement(By.xpath("//input[@id='nbsPackagePackageWeightField0']")).sendKeys("1");
    }

    @Then("^I verify total charges changed$")
    public void iVerifyTotalChargesChanged() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        By spinner = By.xpath("//span[@id='total-charges-spinner'][contains(text(), '$37.47')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(spinner));
    }

    @And("^I select cheapest delivery option$")
    public void iSelectCheapestDeliveryOption() throws InterruptedException {
        getDriver().findElement(By.xpath("//label[@for='nbsServiceTileServiceRadio1_0_1']")).click();
    }

    @And("^I set Saturday Delivery type$")
    public void iSetSaturdayDeliveryType() throws InterruptedException {
        WebElement saturday = getDriver().findElement(By.xpath("//label[@for='nbsSaturdayDeliveryOptionBaseOptionSwitch']"));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", saturday);
    }

    @Then("^I verify total charges changed again$")
    public void iVerifyTotalChargesChangedAgain() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        By spinner = By.xpath("//span[@id='total-charges-spinner'][contains(text(), '$54.47')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(spinner));
    }
    
    @Then("^I verify total charges changed to \"([^\"]*)\"$")
    public void iVerifyTotalChargesChangedTo(String totalCharges) throws Throwable {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        By chargesSpinner = By.xpath("//span[@id='total-charges-spinner'][contains(text(),'" + totalCharges + "')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(chargesSpinner));
    }

    @And("^I select Paypal payment type$")
    public void iSelectPaypalPaymentType() {
       WebElement otherWays = getDriver().findElement(By.xpath("//label[@for='other-ways-to-pay-tile']"));
       Page.clickWithJS(otherWays);

        /*WebElement payPal = getDriver().findElement(By.xpath("//label[@for='cpcAlternateTypes0'][contains(text(), 'PayPal')]"));
        assertThat(payPal.isDisplayed()).isTrue();

        WebElement element = getDriver().findElement(By.xpath("//input[@id='cpcAlternateTypes0']"));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", element);*/

        By xpathLocator = By.xpath("//img[contains(@src, 'paypal')]");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(xpathLocator));

        WebElement payPal = getDriver().findElement(xpathLocator);
        Page.clickWithJS(payPal);
    }

    @And("^I submit the paypal form$")
    public void iSubmitThePaypalForm() {
        WebElement element = getDriver().findElement(By.xpath("//button[@id='nbsBackForwardNavigationReviewPrimaryButton']"));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", element);
    }

    @Then("^I review all recorded details on the review$")
    public void iReviewAllRecordedDetailsOnTheReview() {

        HashMap<String, String> originAddress = new HashMap<>();
        originAddress.put("country", "United States");
        originAddress.put("name", "Administrator");
        originAddress.put("address", "4970 El Camino Real");
        originAddress.put("zip", "94022");
        originAddress.put("city", "Los Altos");
        originAddress.put("state", "California");
        originAddress.put("email", "mail@example.com");
        originAddress.put("phone", "1234567890");

        String origin = getDriver().findElement(By.xpath("//span[@id='originnbsAgentSummaryName']/../..")).getText();
        assertThat(origin).containsIgnoringCase("US");
        assertThat(origin).containsIgnoringCase(originAddress.get("name"));
        assertThat(origin).containsIgnoringCase(originAddress.get("address"));
        assertThat(origin).contains(originAddress.get("zip"));
        assertThat(origin).containsIgnoringCase(originAddress.get("city"));
        assertThat(origin).containsIgnoringCase("CA");
        assertThat(origin).containsIgnoringCase(originAddress.get("email"));
        assertThat(origin).containsIgnoringCase(originAddress.get("phone"));

        String shipTo = getDriver().findElement(By.xpath("//span[@id='destinationnbsAgentSummaryName']/../..")).getText();
        assertThat(shipTo).containsIgnoringCase("John Doe");
        assertThat(shipTo).containsIgnoringCase("870 7th Ave");
        assertThat(shipTo).contains("10019");
        assertThat(shipTo).containsIgnoringCase("New York");
        assertThat(shipTo).containsIgnoringCase("NY");

        String packageInfo = getDriver().findElement(By.xpath("//package[@id='nbsShipmentPackagesPackage0']")).getText();
        assertThat(packageInfo).containsIgnoringCase("UPS Express Box - Small - 1 lbs");

        String satDelivery = getDriver().findElement(By.xpath("//*[@id='optionReviewsaturdayDeliveryShip']")).getText();
        assertThat(satDelivery).containsIgnoringCase("Saturday Delivery");

        String payment = getDriver().findElement(By.xpath("//span[@id='nbsPaymentSummaryBillPayPalSummary']")).getText();
        assertThat(payment).containsIgnoringCase("PayPal");
    }

    @And("^I cancel the shipment form$")
    public void iCancelTheShipmentForm() {
        WebElement element = getDriver().findElement(By.xpath("//button[@id='nbsBackForwardNavigationCancelShipmentButton']"));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", element);

        getDriver().findElement(By.xpath("//button[@id='nbsCancelShipmentWarningYes']")).click();
    }
}