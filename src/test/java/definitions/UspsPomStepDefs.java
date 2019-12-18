package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import pages.Usps;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class UspsPomStepDefs {
    @Given("^I open \"([^\"]*)\" page, using POM$")
    public void iOpenPageUsingPOM(String page) throws Throwable {
        if (page.equalsIgnoreCase("usps")) {
            new Usps().open();
        }
    }

    @When("^I go to Lookup ZIP page by address, using POM$")
    public void iGoToLookupZIPPageByAddressUsingPOM() {
        new Usps().lookUpZipByAddress();
    }

    @And("^I fill out \"([^\"]*)\" street, \"([^\"]*)\" city, \"([^\"]*)\" state, using POM$")
    public void iFillOutStreetCityStateUsingPOM(String street, String city, String state) throws Throwable {
        new Usps().fillAddress(street, city, state);
    }

    @Then("^I validate \"([^\"]*)\" zip code exists in the result, using POM$")
    public void iValidateZipCodeExistsInTheResultUsingPOM(String zip) throws Throwable {
        List<WebElement> resultZip = new Usps().getZipList(zip);

        for (WebElement item : resultZip) {
            assertThat(item.getText()).contains(zip);
        }
    }

    @Given("^I go to usps page object$")
    public void iGoToUspsPageObject() {
        new Usps().open();
    }

    @When("^I go to Calculate Price page object$")
    public void iGoToCalculatePricePageObject() {
        new Usps().calculatePrice();
    }

    @And("^I select \"([^\"]*)\" with \"([^\"]*)\" shape page object$")
    public void iSelectWithShapePageObject(String country, String shape) throws Throwable {
        new Usps().selectCountryShape(country, shape);
    }

    @And("^I define \"([^\"]*)\" quantity page object$")
    public void iDefineQuantityPageObject(String quantity) throws Throwable {
        new Usps().selectQty(quantity);
    }

    @Then("^I calculate the price and validate cost is \"([^\"]*)\" page object$")
    public void iCalculateThePriceAndValidateCostIsPageObject(String cost) throws Throwable {
        String totalCost = new Usps().getTotal();
        assertThat(totalCost).isEqualTo(cost);
    }

    @When("^I go to Postal Store tab$")
    public void iGoToPostalStoreTab() {
        new Usps().postalStoreTab();
    }

    @And("^I enter \"([^\"]*)\" into store search page object$")
    public void iEnterIntoStoreSearchPageObject(String store) throws Throwable {
        new Usps().storeSearch(store);
    }

    @Then("^I search and validate no products found page object$")
    public void iSearchAndValidateNoProductsFoundPageObject() {
        Usps postalService = new Usps();
        postalService.searchBtn();
        String message = postalService.getResult();
        assertThat(message).contains("Your search - ");
        assertThat(message).contains(" - did not match any products.");
    }
}
