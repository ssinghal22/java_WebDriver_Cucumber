package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;

public class ApplyPage extends Header {

    public ApplyPage() {
        setHeaderText("Apply");
    }

    @FindBy(xpath = "//label[@for='candidateFirstName']/../input")
    private WebElement firstname;

    @FindBy(xpath = "//label[@for='candidateLastName']/../input")
    private WebElement lastname;

    @FindBy(xpath = "//label[@for='candidateEmail']/../input")
    private WebElement email;

    @FindBy(xpath = "//label[@for='candidatePassword']/../input")
    private WebElement password;

    @FindBy(xpath = "//label[@for='candidateConfirmPassword']/../input")
    private WebElement confirmPassword;

    @FindBy(xpath = "//label[@for='candidateSummary']/../textarea")
    private WebElement summary;

    @FindBy(xpath = "//label[@for='candidateAddress']/../input")
    private WebElement address;

    @FindBy(xpath = "//label[@for='candidateCity']/../input")
    private WebElement city;

    @FindBy(xpath = "//label[@for='candidateState']/../select")
    private WebElement state;

    @FindBy(xpath = "//label[@for='candidateZip']/../input")
    private WebElement zip;

    @FindBy(xpath = "//button[@id='candidateSubmit']")
    private WebElement submit;

    public void fillProfileDetails(HashMap<String, String> candidate) {
        sendKeys(firstname, candidate.get("firstName"));
        sendKeys(lastname, candidate.get("lastName"));
        sendKeys(email, candidate.get("email"));
        sendKeys(password, candidate.get("password"));
        sendKeys(confirmPassword, candidate.get("password"));
        sendKeys(summary, candidate.get("summary"));
        sendKeys(address, candidate.get("address"));
        sendKeys(city, candidate.get("city"));
        new Select(state).selectByValue(candidate.get("state"));
        sendKeys(zip, candidate.get("zip"));
    }

    public void submit() {
        click(submit);
    }
}
