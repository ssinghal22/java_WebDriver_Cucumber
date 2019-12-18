package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class CalculatorStepDefs {
    @When("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String arg0) throws Throwable {
        WebElement autoLoanMenuItem = getDriver().findElement(By.xpath("//a[contains(@href,'auto-loan-calculator.html')]"));
       new Actions(getDriver()).moveToElement(autoLoanMenuItem).click().perform();
    }

    @And("^I clear all calculator fields$")
    public void iClearAllCalculatorFields() throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@id='cloanamount']")).clear();
        getDriver().findElement(By.xpath("//input[@id='cloanterm']")).clear();
        getDriver().findElement(By.xpath("//input[@id='cinterestrate']")).clear();
        getDriver().findElement(By.xpath("//input[@id='cdownpayment']")).clear();
        getDriver().findElement(By.xpath("//input[@id='ctradeinvalue']")).clear();
        getDriver().findElement(By.xpath("//input[@id='csaletax']")).clear();
        getDriver().findElement(By.xpath("//input[@id='ctitlereg']")).clear();
    }

    @And("^I calculate$")
    public void iCalculate() throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@value='Calculate']")).click();
    }

    @Then("^I verify \"([^\"]*)\" calculator error$")
    public void iVerifyCalculatorError(String errorMessage) throws Throwable {
        WebElement message = getDriver().findElement(By.xpath("//font[@color='red'][text()='" + errorMessage + "']"));
        assertThat(message.isDisplayed()).isTrue();
    }

    @And("^I enter \"([^\"]*)\" price, \"([^\"]*)\" months, \"([^\"]*)\" interest, \"([^\"]*)\" downpayment, \"([^\"]*)\" trade-in, \"([^\"]*)\" state, \"([^\"]*)\" percenttax, \"([^\"]*)\" fees$")
    public void iEnterPriceMonthsInterestDownpaymentTradeInStatePercenttaxFees(String price, String months, String interest, String downpayment, String tradeIn, String state, String percentTax, String fees) throws Throwable {
        getDriver().findElement(By.xpath("//input[@id='cloanamount']")).sendKeys(price);
        getDriver().findElement(By.xpath("//input[@id='cloanterm']")).sendKeys(months);
        getDriver().findElement(By.xpath("//input[@id='cinterestrate']")).sendKeys(interest);
        getDriver().findElement(By.xpath("//input[@id='cdownpayment']")).sendKeys(downpayment);
        getDriver().findElement(By.xpath("//input[@id='ctradeinvalue']")).sendKeys(tradeIn);

        Select select = new Select(getDriver().findElement(By.xpath("//select[@name='cstate']")));
        select.selectByVisibleText(state);

        getDriver().findElement(By.xpath("//input[@id='csaletax']")).sendKeys(percentTax);
        getDriver().findElement(By.xpath("//input[@id='ctitlereg']")).sendKeys(fees);
    }

    @Then("^I verify monthly pay is \"([^\"]*)\"$")
    public void iVerifyMonthlyPayIs(String monthlyPayment) throws Throwable {
        WebElement element = getDriver().findElement(By.xpath("//h2[@class='h2result'][contains(text(),'$372.86')]"));
        assertThat(element.isDisplayed()).isTrue();
    }
}

