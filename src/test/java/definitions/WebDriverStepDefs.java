package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;

import java.lang.reflect.Array;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class WebDriverStepDefs {
    @Given("^I go to \"([^\"]*)\" page$")
    public void iGoToPage(String page) throws Throwable {
        if (page.equalsIgnoreCase("sample")) {
            getDriver().get("https://skryabin.com/webdriver/html/sample.html");
        }
        else if (page.equalsIgnoreCase("google")) {
            getDriver().get("https://www.google.com");
        }
        else if (page.equalsIgnoreCase("documents")) {
            getDriver().get("https://skryabin.com/webdriver/html/new_window.html");
        }
        else if (page.equalsIgnoreCase("ups_global")) {
            getDriver().get("https://www.ups.com/us/en/global.page");
        }
        else if (page.equalsIgnoreCase("ups")) {
            getDriver().get("https://www.ups.com/us/en/Home.page");
        }
        else if (page.equalsIgnoreCase("converter")) {
            getDriver().get("https://www.unitconverters.net/");
        }
        else if (page.equalsIgnoreCase("calculator")) {
            getDriver().get("https://www.calculator.net/");
        }
        else if (page.equalsIgnoreCase("workday")) {
            getDriver().get("https://workday.wd5.myworkdayjobs.com/Workday");
        }
        else {
            throw new Exception("Page not recognized: " + page);
        }
    }

    @And("^I print page details$")
    public void iPrintPageDetails() {
        System.out.println("Page Title: " + getDriver().getTitle());
        System.out.println("Page Url: " + getDriver().getCurrentUrl());
        System.out.println("Window Handle: " + getDriver().getWindowHandle());
      //  System.out.println("Page Source: " + getDriver().getPageSource());
    }

    @And("^I go back and forward, then refresh the page$")
    public void iGoBackAndForwardThenRefreshThePage() throws Throwable {
        getDriver().navigate().back();
        getDriver().navigate().forward();
        getDriver().navigate().refresh();
    }

    @And("^I change resolution to \"([^\"]*)\"$")
    public void iChangeResolutionTo(String arg0) throws Throwable {
        if (arg0.equalsIgnoreCase("phone")) {
            Dimension phone = new Dimension(400, 768);
            getDriver().manage().window().setSize(phone);
            Thread.sleep(3000);
        }
        else if (arg0.equalsIgnoreCase("desktop")) {
            getDriver().manage().window().setSize(new Dimension(1024, 768));
            Thread.sleep(3000);
        }
        else {
            throw new Exception("Unknown layout: " + arg0);
        }
    }

    @And("^I fill required fields$")
    public void iFillRequiredFields() throws Throwable {
        getDriver().findElement(By.xpath("//*[@name='username']")).click();
        getDriver().findElement(By.xpath("//*[@name='username']")).sendKeys("SoniS");

        getDriver().findElement(By.xpath("//*[@name='email']")).click();
        getDriver().findElement(By.xpath("//*[@name='email']")).sendKeys("soniya.singhal@epsilon.com");

        getDriver().findElement(By.xpath("//*[@id='password']")).click();
        getDriver().findElement(By.xpath("//*[@id='password']")).sendKeys("sonia");

        getDriver().findElement(By.xpath("//*[@id='confirmPassword']")).click();
        getDriver().findElement(By.xpath("//*[@id='confirmPassword']")).sendKeys("sonia");

        getDriver().findElement(By.xpath("//*[@id='name']")).click();
        getDriver().findElement(By.xpath("//*[@id='firstName']")).click();
        getDriver().findElement(By.xpath("//*[@id='firstName']")).sendKeys("Sony");

        getDriver().findElement(By.xpath("//*[@id='middleName']")).click();
        getDriver().findElement(By.xpath("//*[@id='middleName']")).sendKeys("Krish");

        getDriver().findElement(By.xpath("//*[@id='lastName']")).click();
        getDriver().findElement(By.xpath("//*[@id='lastName']")).sendKeys("Sing");

        getDriver().findElement(By.xpath("//*/span[text()='Save']")).click();

        getDriver().findElement(By.xpath("//*[@type='checkbox'][@name='agreedToPrivacyPolicy']")).click();
    }

    @And("^I fill non required fields$")
    public void iFillNonRequiredFields() throws Throwable {

        getDriver().findElement(By.xpath("//*[@name='phone']")).click();
        getDriver().findElement(By.xpath("//*[@name='phone']")).sendKeys("111-222-3333");

        getDriver().findElement(By.xpath("//*[@id='dateOfBirth']")).click();
        getDriver().findElement(By.xpath("(//select[@class='ui-datepicker-month']/option)[4]")).click();
        getDriver().findElement(By.xpath("//select[@class='ui-datepicker-year']/option[@value='2000']")).click();
        getDriver().findElement(By.xpath("//*[@data-handler='selectDay']/*[text()='11']")).click();

        getDriver().findElement(By.xpath("//select[@name='countryOfOrigin']/*[@value='India']")).click();
        getDriver().findElement(By.xpath("//*[@name='gender'][@value='female']")).click();

        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//*[@type='checkbox'][@name='allowedToContact']")).click();

        getDriver().findElement(By.xpath("//*[@id='address']")).click();
        getDriver().findElement(By.xpath("//*[@id='address']")).sendKeys("800 willow st san jose ca 95125");

        getDriver().findElement(By.xpath("//*[@name='carMake']/*[@value='Other']")).click();

        getDriver().switchTo().frame("additionalInfo");
        getDriver().findElement(By.xpath("//*[@id='contactPersonName']")).click();
        getDriver().findElement(By.xpath("//*[@id='contactPersonName']")).sendKeys("kris");

        getDriver().findElement(By.xpath("//*[@id='contactPersonPhone']")).click();
        getDriver().findElement(By.xpath("//*[@id='contactPersonPhone']")).sendKeys("408-111-2233");
        getDriver().switchTo().defaultContent();

        getDriver().findElement(By.xpath("//*[@id='thirdPartyButton']")).click();
        getDriver().switchTo().alert().accept();

        getDriver().findElement(By.xpath("//*[contains(@onclick,'window.open')]")).click();
    }

    @And("^I submit page$")
    public void iSubmitPage() {
        getDriver().findElement(By.xpath("//*[@id='formSubmit']")).click();
    }

    @And("^I go to iframe$")
    public void iGoToIframe() throws Throwable {
        getDriver().switchTo().frame("additionalInfo");
        getDriver().findElement(By.xpath("//*[@id='contactPersonName']")).click();
        getDriver().findElement(By.xpath("//*[@id='contactPersonName']")).sendKeys("kris");

        getDriver().findElement(By.xpath("//*[@id='contactPersonPhone']")).click();
        getDriver().findElement(By.xpath("//*[@id='contactPersonPhone']")).sendKeys("408-111-2233");

        getDriver().switchTo().defaultContent();

        getDriver().findElement(By.xpath("//*[contains(@onclick,'window.open')]")).click();
    }

    @And("^I pick my DOB$")
    public void iPickMyDOB() throws Throwable {
        getDriver().findElement(By.xpath("//*[@id='dateOfBirth']")).click();
        getDriver().findElement(By.xpath("(//select[@class='ui-datepicker-month']/option)[4]")).click();
        getDriver().findElement(By.xpath("//select[@class='ui-datepicker-year']/option[@value='2000']")).click();
        getDriver().findElement(By.xpath("//*[@data-handler='selectDay']/*[text()='11']")).click();
    }

    @And("^I tab and fill fields$")
    public void iTabAndFillFields() throws Throwable {
        getDriver().findElement(By.xpath("//*[@name='username']")).sendKeys("SoniS");
        getDriver().findElement(By.xpath("//*[@name='email']")).sendKeys("soniya.singhal@epsilon.com");
        getDriver().findElement(By.xpath("//*[@id='password']")).sendKeys("sonia");
        getDriver().findElement(By.xpath("//*[@id='confirmPassword']")).sendKeys("sonia");

        getDriver().findElement(By.xpath("//*[@id='name']")).click();
        getDriver().findElement(By.xpath("//*[@id='firstName']")).sendKeys("Sony");
        getDriver().findElement(By.xpath("//*[@id='middleName']")).sendKeys("Krish");
        getDriver().findElement(By.xpath("//*[@id='lastName']")).sendKeys("Sing");
        getDriver().findElement(By.xpath("//*/span[text()='Save']")).click();

        getDriver().findElement(By.xpath("//*[@name='phone']")).sendKeys("111-222-3333");

        getDriver().findElement(By.xpath("//*[@id='dateOfBirth']")).click();
        getDriver().findElement(By.xpath("(//select[@class='ui-datepicker-month']/option)[4]")).click();
        getDriver().findElement(By.xpath("//select[@class='ui-datepicker-year']/option[@value='2000']")).click();
        getDriver().findElement(By.xpath("//*[@data-handler='selectDay']/*[text()='11']")).click();

        getDriver().findElement(By.xpath("//select[@name='countryOfOrigin']/*[@value='India']")).click();
        getDriver().findElement(By.xpath("//*[@name='gender'][@value='female']")).click();

        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[@type='checkbox'][@name='allowedToContact']")).click();

        getDriver().findElement(By.xpath("//*[@id='address']")).sendKeys("800 willow st san jose ca 95125");

        getDriver().findElement(By.xpath("//*[@name='carMake']/*[@value='Other']")).click();

        getDriver().switchTo().frame("additionalInfo");
        getDriver().findElement(By.xpath("//*[@id='contactPersonName']")).click();
        getDriver().findElement(By.xpath("//*[@id='contactPersonName']")).sendKeys("kris");
        getDriver().switchTo().defaultContent();

        getDriver().findElement(By.xpath("//*[@id='thirdPartyButton']")).click();
        getDriver().switchTo().alert().accept();

        getDriver().findElement(By.xpath("//*[contains(@onclick,'window.open')]")).click();

// add code
        getDriver().switchTo().window(getDriver().getWindowHandles().iterator().next());
        getDriver().findElement(By.xpath("//*[@type='checkbox'][@name='agreedToPrivacyPolicy']")).click();
    }

    @When("^I verify email field behavior$")
    public void iVerifyEmailFieldBehavior() throws Throwable {
        getDriver().findElement(By.xpath("//*[@name='email']")).clear();
        getDriver().findElement(By.xpath("//*[@name='email']")).sendKeys("sonis");
        getDriver().findElement(By.xpath("//*[@name='email']")).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(By.xpath("//*[@name='email']")).clear();
        getDriver().findElement(By.xpath("//*[@name='email']")).sendKeys("soniya.singhal@epsilon.com");
    }

    @And("^I verify \"([^\"]*)\" page$")
    public void iVerifyPage(String str1) throws Throwable {
        getDriver().findElement(By.xpath("//body/*[text()='Documents List:']")).isDisplayed();
    }

    @Then("^I verify input data$")
    public void iVerifyInputData() {
        WebElement resultLegend = getDriver().findElement(By.xpath("//legend[@class='applicationResult']"));
        assertThat(resultLegend.isDisplayed()).isTrue();

        String agreedToPrivacyPolicy = getDriver().findElement(By.xpath("//b[@name='agreedToPrivacyPolicy']")).getText();
        assertThat(agreedToPrivacyPolicy).isEqualToIgnoringCase("true");

        String allowedToContact = getDriver().findElement(By.xpath("//b[@name='allowedToContact']")).getText();
        assertThat(allowedToContact).isEqualToIgnoringCase("true");

        String resultText = getDriver().findElement(By.xpath("//*[@id='samplePageResult']//section")).getText();
        System.out.println();
        System.out.println("text displayed on page is: ");
        System.out.println(resultText);

        assertThat(resultText).containsIgnoringCase("SoniS");
        assertThat(resultText).containsIgnoringCase("soniya.singhal@epsilon.com");
        assertThat(resultText).containsIgnoringCase("Sony");
        assertThat(resultText).containsIgnoringCase("Krish");
        assertThat(resultText).containsIgnoringCase("Sing");
        assertThat(resultText).containsIgnoringCase("04/11/2000");
        assertThat(resultText).containsIgnoringCase("India");
        assertThat(resultText).containsIgnoringCase("female");

        assertThat(resultText).containsIgnoringCase("800 willow st san jose ca 95125");
        assertThat(resultText).containsIgnoringCase("Other");
        assertThat(resultText).containsIgnoringCase("kris");
        assertThat(resultText).containsIgnoringCase("accepted");
        assertThat(resultText).containsIgnoringCase("[entered]");
        assertThat(resultText).doesNotContain("sonia");
    }

    @And("^I print browser logs$")
    public void iPrintBrowserLogs() {
        LogEntries logs = getDriver().manage().logs().get("browser");

        for (LogEntry log : logs){
            System.out.println(log);

            if(log.getLevel().equals("SEVERE")){
                System.out.println("Severe : ");
            }

        }
    }

    @And("^I \"([^\"]*)\" third party agreement$")
    public void iThirdPartyAgreement(String action) throws Throwable {
        getDriver().findElement(By.xpath("//*[@id='thirdPartyButton']")).click();

        if (action.equals("accept")) {
            getDriver().switchTo().alert().accept();
        } else if (action.equals("dismiss")) {
            getDriver().switchTo().alert().dismiss();
        } else {
            throw new Exception("Unsupported action: " + action);
        }
    }

    @And("^I verify \"([^\"]*)\" in related documents$")
    public void iVerifyInRelatedDocuments(String documentName) throws Throwable {
        String originalWindow = getDriver().getWindowHandle(); //this can be below next line too, doesn't make difference
        getDriver().findElement(By.xpath("//*[contains(@onclick,'window.open')]")).click();

        Set<String> windows = getDriver().getWindowHandles();
        for(String window: windows) {
            getDriver().switchTo().window(window);
        }

        String documentPageText = getDriver().findElement(By.xpath("//body")).getText();
        assertThat(documentPageText).containsIgnoringCase(documentName);

        getDriver().switchTo().window(originalWindow);
    }

    @And("^I add contact \"([^\"]*)\" with phone \"([^\"]*)\"$")
    public void iAddContactWithPhone(String name, String phone) throws Throwable {
        getDriver().switchTo().frame("additionalInfo");

        getDriver().findElement(By.xpath("//*[@id='contactPersonName']")).sendKeys(name);
        getDriver().findElement(By.xpath("//*[@id='contactPersonPhone']")).sendKeys(phone);

        getDriver().switchTo().defaultContent();
    }
}