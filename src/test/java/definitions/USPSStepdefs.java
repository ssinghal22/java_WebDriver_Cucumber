package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static support.TestContext.getDriver;

public class USPSStepdefs {
    @Given("^I open \"([^\"]*)\" page$")
    public void iOpenPage(String page) throws Throwable {
        if (page.equalsIgnoreCase("usps")) {
            getDriver().get("https://www.usps.com/");
            getDriver().manage().window().setSize(new Dimension(1400, 768));
        }
        else if (page.equalsIgnoreCase("ups")) {
            getDriver().get("https://www.ups.com/us/en/Home.page");
            getDriver().manage().window().setSize(new Dimension(1400, 768));
        }
    }

    @And("^I go to Lookup ZIP page by address$")
    public void iGoToLookupZIPPageByAddress() {
        getDriver().findElement(By.xpath("//a[@id='mail-ship-width']")).click();
        getDriver().findElement(By.xpath("//img[@id='icon-zip']")).click();
        getDriver().findElement(By.xpath("//a[@role='button'][text()='Find by Address']")).click();
        getDriver().findElement(By.xpath("//input[@id='tAddress']")).sendKeys("4970 El Camino Real");
        getDriver().findElement(By.xpath("//input[@id='tCity']")).sendKeys("Los Altos");
        getDriver().findElement(By.xpath("//select[@id='tState']/option[@value='CA']")).click();
    }

    @And("^I search for result$")
    public void iSearchForResult() throws Throwable {
      getDriver().findElement(By.xpath("//a[@id='zip-by-address']")).click();
      Thread.sleep(1000);
    }

    @Then("^result must contain \"([^\"]*)\" zip code$")
    public void resultMustContainZipCode(String zipcode) throws Throwable {
        WebElement youEntered = getDriver().findElement(By.xpath("//ul[@class='entered-address']//*[text()='You entered:']"));
        Assertions.assertThat(youEntered.isDisplayed()).isTrue();

        String zipResult = getDriver().findElement(By.xpath("//div[@id='zipByAddressDiv']")).getText();
        Assertions.assertThat(zipResult).contains(zipcode);
    }

    @When("^I goto Lookup ZIP page by address$")
    public void iGotoLookupZIPPageByAddress() {
        getDriver().findElement(By.xpath("//a[@id='mail-ship-width']")).click();
        getDriver().findElement(By.xpath("//img[@id='icon-zip']")).click();
        //getDriver().findElement(By.xpath("//a[@role='button'][text()='Find by Address']")).click();
        getDriver().findElement(By.xpath("//a[contains(@class,'zip-code-address')]")).click();
    }

    @And("^I fill out \"([^\"]*)\" street, \"([^\"]*)\" city, \"([^\"]*)\" state$")
    public void iFillOutStreetCityState(String street, String city, String state) throws Throwable {
        getDriver().findElement(By.xpath("//input[@id='tAddress']")).sendKeys(street);
        getDriver().findElement(By.xpath("//input[@id='tCity']")).sendKeys(city);
        //getDriver().findElement(By.xpath("//select[@id='tState']/option[contains(text(),'CA')]")).click();
       // getDriver().findElement(By.xpath("//select[@id='tState']/option[contains(text(),'" + state + "')]")).click();

       // getDriver().findElement(By.xpath("//select[@id='tState']/option[@value='CA']")).click();
        getDriver().findElement(By.xpath("//select[@id='tState']/option[@value = '" + state + "']")).click();

        // Another approach below
        // getDriver().findElement(By.xpath(String.format("//select[@id='tState']/option[@value='%s']", state))).click();
    }

    @When("^I go to Calculate price page$")
    public void iGoToCalculatePricePage() {
        getDriver().findElement(By.xpath("//a[@id='mail-ship-width']")).click();
        getDriver().findElement(By.xpath("//img[@id='icon-calculate']")).click();
    }

    @And("^I put country, shape, quantity$")
    public void iPutCountryShapeQuantity() {
        getDriver().findElement(By.xpath("//select[@id='CountryID']/option[contains(text(),'United Kingdom')]")).click();
        getDriver().findElement(By.xpath("//input[@value='Postcard']")).click();
        getDriver().findElement(By.xpath("//input[@id='quantity-0']")).sendKeys("2");
    }

    @And("^I submit for result$")
    public void iSubmitForResult() {
        getDriver().findElement(By.xpath("//input[@value='Calculate']")).click();
    }

    @Then("^result must have price \"([^\"]*)\"$")
    public void resultMustHavePrice(String price) throws Throwable {
        String actualPrice = getDriver().findElement(By.xpath("//div[@id='cost-0']")).getText();
        Assertions.assertThat(actualPrice).isEqualTo(price);
    }

    @And("^I select \"([^\"]*)\" with \"([^\"]*)\" shape$")
    public void iSelectWithShape(String country, String shape) throws Throwable {
        //getDriver().findElement(By.xpath("//select[@id='CountryID']/option[contains(text(),'United Kingdom')]")).click();
        getDriver().findElement(By.xpath("//select[@id='CountryID']/option[contains(text(),'" + country +"')]")).click();

        //getDriver().findElement(By.xpath("//input[@value='Postcard']")).click();
        getDriver().findElement(By.xpath("//input[@value='" + shape + "']")).click();
    }

    @And("^I define \"([^\"]*)\" quantity$")
    public void iDefineQuantity(String quantity) throws Throwable {
        getDriver().findElement(By.xpath("//input[@id='quantity-0']")).sendKeys(quantity);
    }

    @Then("^I calculate the price and validate cost is \"([^\"]*)\"$")
    public void iCalculateThePriceAndValidateCostIs(String cost) throws Throwable {
        getDriver().findElement(By.xpath("//input[@value='Calculate']")).click();
        String actualPrice = getDriver().findElement(By.xpath("//div[@id='cost-0']")).getText();
        Assertions.assertThat(actualPrice).isEqualTo(cost);
    }

    @When("^I mouse over and go to Lookup Zip page by address$")
    public void iMouseOverAndGoToLookupZipPageByAddress() {
        Actions actions = new Actions(getDriver());

        WebElement mailShip = getDriver().findElement(By.xpath("//a[@id='mail-ship-width']"));
        actions.moveToElement(mailShip).perform();

        getDriver().findElement(By.xpath("//li[@class='tool-zip']/a")).click();
        getDriver().findElement(By.xpath("//a[contains(@class,'zip-code-address')]")).click();
    }

    //getDriver().findElement(By.xpath("//input[@value='ShapeAndSize']")).click();
    //WebElement headline = getDriver().findElement(By.xpath("//h2[text()='Weight and Shape/Size']"));
    //Assertions.assertThat(headline.isDisplayed()).isTrue();
}
