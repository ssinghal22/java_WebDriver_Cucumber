package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.Page;
import support.TestContext;

import java.io.FileNotFoundException;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;
import static support.TestContext.getWait;

public class UpsStepDefs {

    @When("^I go to Create Shipment page$")
    public void iGoToCreateShipmentPage() {
        getDriver().findElement(By.xpath("//*[@id='ups-menuPanel1']//a[contains(@href,'ship?loc=en_US')]")).click();

        /*WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        By progressOne = By.xpath("//span[@class='ng-star-inserted'][contains(text(), 'Where')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(progressOne));*/
    }

    @And("^I Submit the form$")
    public void iSubmitTheForm() throws InterruptedException {
        String oldUrl = getDriver().getCurrentUrl();

        String nextButtonXpath;
        if (oldUrl.contains("payment")) {
            nextButtonXpath = "//button[@id='nbsBackForwardNavigationReviewPrimaryButton']";
        }
        else {
            nextButtonXpath = "//button[@id='nbsBackForwardNavigationContinueButton']";
        }

        WebElement nextButton = getDriver().findElement(By.xpath(nextButtonXpath));
        Page.clickWithJS(nextButton);

        getWait().until(ExpectedConditions.not(ExpectedConditions.urlToBe(oldUrl)));
    }

    @Then("^I verify submitted data saved successfully$")
    public void iVerifySubmittedDataSavedSuccessfully() {

        HashMap<String, String> originAddress = new HashMap<>();
        originAddress.put("country", "United States");
        originAddress.put("name", "Administrator");
        originAddress.put("address", "4970 El Camino Real");
        originAddress.put("zip", "94022");
        originAddress.put("city", "Los Altos");
        originAddress.put("state", "California");
        originAddress.put("email", "mail@example.com");
        originAddress.put("phone", "1234567890");

        String origin = getDriver().findElement(By.xpath("//agent-summary[@prefix='origin']")).getText();
        assertThat(origin).containsIgnoringCase("US");
        assertThat(origin).containsIgnoringCase(originAddress.get("name"));
        assertThat(origin).containsIgnoringCase(originAddress.get("address"));
        assertThat(origin).contains(originAddress.get("zip"));
        assertThat(origin).containsIgnoringCase(originAddress.get("city"));
        assertThat(origin).containsIgnoringCase("CA");
        assertThat(origin).containsIgnoringCase(originAddress.get("email"));
        assertThat(origin).containsIgnoringCase(originAddress.get("phone"));
    }

    @And("^I fill out required fields$")
    public void iFillOutRequiredFields() {
        HashMap<String, String> originAddress = new HashMap<>();
        originAddress.put("country", "United States");
        originAddress.put("name", "Administrator");
        originAddress.put("address", "4970 El Camino Real");
        originAddress.put("zip", "94022");
        originAddress.put("city", "Los Altos");
        originAddress.put("state", "California");
        originAddress.put("email", "mail@example.com");
        originAddress.put("phone", "1234567890");

        getDriver().findElement(By.xpath("//select[@id='origincountry']/option[text()='" + originAddress.get("country") + "']")).click();
        getDriver().findElement(By.xpath("//input[@id='originname']")).sendKeys(originAddress.get("name"));
        getDriver().findElement(By.xpath("//input[@id='originaddress1']")).sendKeys(originAddress.get("address"));
        getDriver().findElement(By.xpath("//input[@id='originpostal']")).sendKeys(originAddress.get("zip"));
        getDriver().findElement(By.xpath("//input[@id='origincity']")).sendKeys(originAddress.get("city"));
        getDriver().findElement(By.xpath("//select[@id='originstate']/option[text()='" + originAddress.get("state") + "']")).click();
        getDriver().findElement(By.xpath("//input[@id='originemail']")).sendKeys(originAddress.get("email"));
        getDriver().findElement(By.xpath("//input[@id='originphone']")).sendKeys(originAddress.get("phone"));
    }

    @When("^I cancel the form$")
    public void iCancelTheForm() {
        getDriver().findElement(By.xpath("//button[@id='nbsBackForwardNavigationCancelShipmentButton']")).click();
        getDriver().findElement(By.xpath("//button[@id='nbsCancelShipmentWarningYes']")).click();
    }

    @And("^I verify form reset successfully$")
    public void iVerifyFormResetSuccessfully() {
        HashMap<String, String> originAddress = new HashMap<>();
        originAddress.put("country", "United States");
        originAddress.put("name", "Administrator");
        originAddress.put("address", "4970 El Camino Real");
        originAddress.put("zip", "94022");
        originAddress.put("city", "Los Altos");
        originAddress.put("state", "California");
        originAddress.put("email", "mail@example.com");
        originAddress.put("phone", "1234567890");

        assertThat(getDriver().findElement(By.xpath("//select[@id='origincountry']")).getAttribute("value")).isEqualToIgnoringCase("24: Object");
        //please suggest better way to assert it

        assertThat(getDriver().findElement(By.xpath("//input[@id='originname']"))).isNotEqualTo(originAddress.get("name"));
        assertThat(getDriver().findElement(By.xpath("//input[@id='originname']")).getAttribute("value")).isEmpty();

        assertThat(getDriver().findElement(By.xpath("//input[@id='originaddress1']"))).isNotEqualTo(originAddress.get("address"));
        assertThat(getDriver().findElement(By.xpath("//input[@id='originaddress1']")).getAttribute("value")).isEmpty();

        assertThat(getDriver().findElement(By.xpath("//input[@id='originpostal']"))).isNotEqualTo(originAddress.get("zip"));
        assertThat(getDriver().findElement(By.xpath("//input[@id='originpostal']")).getAttribute("value")).isEmpty();

        assertThat(getDriver().findElement(By.xpath("//input[@id='origincity']"))).isNotEqualTo(originAddress.get("city"));
        assertThat(getDriver().findElement(By.xpath("//input[@id='origincity']")).getAttribute("value")).isEmpty();

        assertThat(getDriver().findElement(By.xpath("//select[@id='originstate']"))).isNotEqualTo(originAddress.get("state"));
        assertThat(getDriver().findElement(By.xpath("//select[@id='originstate']")).getAttribute("value")).isEqualToIgnoringCase("0: null");
        //please advice better way to assert it

        assertThat(getDriver().findElement(By.xpath("//input[@id='originemail']"))).isNotEqualTo(originAddress.get("email"));
        assertThat(getDriver().findElement(By.xpath("//input[@id='originemail']")).getAttribute("value")).isEmpty();

        assertThat(getDriver().findElement(By.xpath("//input[@id='originphone']"))).isNotEqualTo(originAddress.get("phone"));
        assertThat(getDriver().findElement(By.xpath("//input[@id='originphone']")).getAttribute("value")).isEmpty();
    }

    @And("^I select \"([^\"]*)\" and \"([^\"]*)\" on global page$")
    public void iSelectAndOnGlobalPage(String region, String country) throws Throwable {

        Actions actions = new Actions(getDriver());
        WebElement heading = getDriver().findElement(By.xpath("//div[@class='page-title_cell']"));
        actions.moveToElement(heading).perform();

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

    @When("^I fill out origin shipment fields$")
    public void iFillOutOriginShipmentFields() throws FileNotFoundException {
        HashMap<String, String> sender = TestContext.getSender();

        getDriver().findElement(By.xpath("//input[@id='originname']")).sendKeys(sender.get("name"));
        getDriver().findElement(By.xpath("//input[@id='originaddress1']")).sendKeys(sender.get("address"));
        getDriver().findElement(By.xpath("//input[@id='originpostal']")).sendKeys(sender.get("zip"));

        getWait().until(ExpectedConditions.attributeToBe(By.xpath("//input[@id='origincity']"), "value", sender.get("city").toUpperCase()));

        getWait().until(ExpectedConditions.elementToBeSelected(By.xpath("//select[@id='originstate']/option[text()='California']")));

        getDriver().findElement(By.xpath("//input[@id='originemail']")).sendKeys(sender.get("email"));
        getDriver().findElement(By.xpath("//input[@id='originphone']")).sendKeys(sender.get("phone"));
    }

    @Then("^I verify origin shipment fields submitted$")
    public void iVerifyOriginShipmentFieldsSubmitted() throws FileNotFoundException {
        HashMap<String, String> sender = TestContext.getSender();

        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='originnbsAgentSummaryName']")));

        String origin = getDriver().findElement(By.xpath("//agent-summary[@prefix='origin']")).getText();

        assertThat(origin).containsIgnoringCase(sender.get("name"));
        assertThat(origin).containsIgnoringCase(sender.get("address"));
        assertThat(origin).contains(sender.get("zip"));
        assertThat(origin).containsIgnoringCase(sender.get("city"));
        assertThat(origin).containsIgnoringCase(sender.get("state"));
        assertThat(origin).containsIgnoringCase(sender.get("email"));
        assertThat(origin).containsIgnoringCase(sender.get("phone"));
    }

    @Then("^I verify shipment form is reset$")
    public void iVerifyShipmentFormIsReset() {

        assertThat(getDriver().findElement(By.xpath("//input[@id='originname']")).getAttribute("value")).isEmpty();
        assertThat(getDriver().findElement(By.xpath("//input[@id='originaddress1']")).getAttribute("value")).isEmpty();
        assertThat(getDriver().findElement(By.xpath("//input[@id='originpostal']")).getAttribute("value")).isEmpty();

        assertThat(getDriver().findElement(By.xpath("//input[@id='origincity']")).getAttribute("value")).isEmpty();

        assertThat(getDriver().findElement(By.xpath("//select[@id='originstate']")).getAttribute("value")).isEqualToIgnoringCase("0: null");
        //please advice better way to assert it

        assertThat(getDriver().findElement(By.xpath("//input[@id='originemail']")).getAttribute("value")).isEmpty();

        assertThat(getDriver().findElement(By.xpath("//input[@id='originphone']")).getAttribute("value")).isEmpty();
    }
}
