/*
package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static support.TestContext.*;
import static org.assertj.core.api.Assertions.*;


public class SSUspsStepdefs {
    @When("^I go to Lookup ZIP page by address$")
    public void iGoToLookupZIPPageByAddress() throws Exception {
        getDriver().findElement(By.xpath("//a[@id='mail-ship-width']")).click();
        getDriver().findElement(By.xpath("//img[@id='icon-zip']")).click();
        getDriver().findElement(By.xpath("//a[contains(@class,'zip-code-address')]")).click();
    }

    @And("^I fill out \"([^\"]*)\" street, \"([^\"]*)\" city, \"([^\"]*)\" state$")
    public void iFillOutStreetCityState(String street, String city, String state) throws Throwable {
        getDriver().findElement(By.xpath("//input[@id='tAddress']")).sendKeys(street);
        getDriver().findElement(By.xpath("//input[@id='tCity']")).sendKeys(city);

        getDriver().findElement(By.xpath("//select[@id='tState']/option[@value='" + state + "']")).click();
        // Another approach below
        // getDriver().findElement(By.xpath(String.format("//select[@id='tState']/option[@value='%s']", state))).click();

        getDriver().findElement(By.xpath("//a[@id='zip-by-address']")).click();

    }

    @Then("^I validate \"([^\"]*)\" zip code exists in the result$")
    public void iValidateZipCodeExistsInTheResult(String zip) throws Throwable {

        WebDriverWait wait = new WebDriverWait(getDriver(), 5);

        // this wait checking that text is not empty, then we proceed. Using lambda function
        WebElement zipSearchResultElement = getDriver().findElement(By.xpath("//div[@id='zipByAddressDiv']"));
        System.out.println(String.format("Search result: |%s|", zipSearchResultElement.getText()));
        wait.until((ExpectedCondition<Boolean>) driver -> zipSearchResultElement.getText().length() > 0);
        System.out.println(String.format("Search result after wait: |%s|", zipSearchResultElement.getText()));

        // this wait checking that LI element was generated inside of DIV, then we proceed (same purpose as above, redundant)
        By firstResultItem = By.xpath("(//div[@id='zipByAddressDiv']//li)[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstResultItem));

        String zipSearchResult = zipSearchResultElement.getText();
        assertThat(zipSearchResult).contains(zip);

        // Notice findsElements - i.e. plural
        List<WebElement> items = getDriver().findElements(By.xpath("//div[@id='zipByAddressDiv']//li"));

        for (WebElement item : items) {
            assertThat(item.getText()).contains(zip);
        }
    }
}
*/
