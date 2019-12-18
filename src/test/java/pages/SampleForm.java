package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static support.TestContext.getDriver;

public class SampleForm extends Page {

    public SampleForm() {
        setUrl("https://skryabin.com/webdriver/html/sample.html");
    }

    @FindBy(xpath = "//*[@name='username']")
    private WebElement username;

    @FindBy(xpath = "//*[@name='email']")
    private WebElement email;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//*[@id='confirmPassword']")
    private WebElement confirmPassword;

    //enter name
    @FindBy(xpath = "//*[@id='name']")
    private WebElement name;

    @FindBy(xpath = "//*[@id='firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//*[@id='middleName']")
    private WebElement middleName;

    @FindBy(xpath = "//*[@id='lastName']")
    private WebElement lastName;

    @FindBy(xpath = "//div[@aria-describedby='nameDialog']//span[text()='Save']")
    private WebElement saveButton;
    //end of enter name

    @FindBy(xpath = "//*[@name='phone']")
    private WebElement phone;

    //add for DOB
    @FindBy(xpath = "//*[@id='dateOfBirth']")
    private WebElement dateOfBirth;

   // @FindBy(xpath = "(//select[@class='ui-datepicker-month']/option)[4]")
    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    private WebElement month;

   // @FindBy(xpath = "//select[@class='ui-datepicker-year']/option[@value='2000']")
    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    private WebElement year;

    @FindBy(xpath = "//*[@data-handler='selectDay']/*[text()='11']")
    private WebElement day;
    //end of DOB

    //@FindBy(xpath = "//select[@name='countryOfOrigin']/*[@value='India']")
    //private WebElement countryOfOrigin;

    @FindBy(xpath = "//select[@name='countryOfOrigin']")
    private WebElement countryOfOrigin;

    @FindBy(xpath = "//*[@name='gender'][@value='female']")
    private WebElement gender;

//need to add sleep
    @FindBy(xpath = "//*[@type='checkbox'][@name='allowedToContact']")
    private WebElement allowedToContact;

    @FindBy(xpath = "//*[@id='address']")
    private WebElement address;

   // @FindBy(xpath = "//*[@name='carMake']/*[@value='Other']")

    @FindBy(xpath = "//*[@name='carMake']")
    private WebElement carMake;

    //add for additional info
    @FindBy(xpath = "//iframe[@name='additionalInfo']")
    private WebElement iFrame;

    @FindBy(xpath = "//input[@name='contactPersonName']")
    private WebElement contactPersonName;

    @FindBy(xpath = "//input[@id='contactPersonPhone']")
    private WebElement contactPersonPhone;

public void fillContactNamePhone(String name, String phone) {
    getDriver().switchTo().frame(iFrame);
    sendKeys(contactPersonName, name);
    sendKeys(contactPersonPhone, phone);
    getDriver().switchTo().defaultContent();
    }

    //add for thirdPartyButton
    //add for RelatedDocuments - maybe not

    @FindBy(xpath = "//*[@type='checkbox'][@name='agreedToPrivacyPolicy']")
    private WebElement agreedToPrivacyPolicy;

    @FindBy(xpath = "//*[@id='formSubmit']")
    private WebElement submitButton;

    //public void fillUsername(String value) { username.sendKeys(value); }
    public void fillUsername(String value) {
        sendKeys(username, value);
    }

    //public void fillEmail(String value) {email.sendKeys(value);}
    public void fillEmail(String value) {
        sendKeys(email, value);
    }

    //public void fillPassword(String value) {password.sendKeys(value);}
    public void fillPassword(String value) {
        sendKeys(password, value);
    }

   // public void fillConfirmPassword(String value) {confirmPassword.sendKeys(value);}
    public void fillConfirmPassword(String value) {
        sendKeys(confirmPassword, value);
    }

    //public void clickName() { name.click(); }

    //public void fillFirstName(String value) { firstName.sendKeys(value);}

    //public void fillMiddleName(String value) {middleName.sendKeys(value);}

    //public void fillLastName(String value) {lastName.sendKeys(value);}

    //public void clickSave() { saveButton.click(); }

    public void fillName(String firstName, String middleName, String lastName) {
        click(name);
        sendKeys(this.firstName, firstName);
        sendKeys(this.middleName, middleName);
        sendKeys(this.lastName, lastName);
        click(saveButton);
    }

   // public void fillPhone(String value) {phone.sendKeys(value);}
    public void fillPhone(String value) {
        sendKeys(phone, value);
    }

    //public void selectDateOfBirth() { dateOfBirth.click(); }
    public void selectDateOfBirth() {
        click(dateOfBirth);
    }

    //public void selectMonth() { month.click(); }
    public void selectMonth(String value) {
        new Select(month).selectByVisibleText(value); }

   // public void selectYear() { year.click(); }
    public void selectYear(String value) {
        new Select(year).selectByValue(value); }

    //public void selectDay() { day.click();}
    public void selectDay() {
        click(day);
    }


   // public void selectCountryOfOrigin() {countryOfOrigin.click(); }

    public void selectCountryOfOrigin(String value) {
        new Select(countryOfOrigin).selectByValue(value);
    }

   // public void selectGender() { gender.click(); }
    public void selectGender() { click(gender); }

    public void selectAllowedToContact() {
        //allowedToContact.click();
        click(allowedToContact);
    }

    public void fillAddress(String value) {
        //address.sendKeys(value);
        sendKeys(address, value);
    }

    //public void selectCarMake() { carMake.click(); }

    public void selectCarMake(String value) {
        new Select(carMake).selectByValue(value);
    }

    public void selectAgreedToPrivacyPolicy() {
        //agreedToPrivacyPolicy.click();
        click(agreedToPrivacyPolicy);
    }

    public void clickSubmit() {
        //submitButton.click();
        click(submitButton);

    }

    //verify result
    /*@FindBy(xpath = "//legend[@class='applicationResult']")
    private WebElement resultLegend;

    public void assertResultLegend() { assertThat(resultLegend.isDisplayed()).isTrue(); }

    @FindBy(xpath = "//b[@name='agreedToPrivacyPolicy']")
    private WebElement resultAgreedToPrivacyPolicy;

    public void assertResultAgreedToPrivacyPolicy() { assertThat(resultAgreedToPrivacyPolicy.getText()).isEqualToIgnoringCase("true"); }

    @FindBy(xpath = "//b[@name='allowedToContact']")
    private WebElement resultAllowedToContact;

    public void assertResultAllowedToContact() { assertThat(resultAllowedToContact.getText()).isEqualToIgnoringCase("true"); }

    @FindBy(xpath = "//*[@id='samplePageResult']//section")
    private WebElement resultSection;

    public void assertResultSection(HashMap<String, String> sampleData) {
        String resultText = resultSection.getText();

        assertThat(resultText).containsIgnoringCase(sampleData.get("username"));
        assertThat(resultText).containsIgnoringCase(sampleData.get("email"));
        assertThat(resultText).containsIgnoringCase(sampleData.get("fname"));
        assertThat(resultText).containsIgnoringCase(sampleData.get("mname"));
        assertThat(resultText).containsIgnoringCase(sampleData.get("lname"));
        //assertThat(resultText).containsIgnoringCase(sampleData.get("dob"));
        assertThat(resultText).containsIgnoringCase("04");
        assertThat(resultText).containsIgnoringCase(sampleData.get("year"));


        assertThat(resultText).containsIgnoringCase(sampleData.get("origin"));
        assertThat(resultText).containsIgnoringCase(sampleData.get("gender"));
        assertThat(resultText).containsIgnoringCase(sampleData.get("address"));
        assertThat(resultText).containsIgnoringCase(sampleData.get("phone"));
        assertThat(resultText).containsIgnoringCase(sampleData.get("car"));
    }*/
}
