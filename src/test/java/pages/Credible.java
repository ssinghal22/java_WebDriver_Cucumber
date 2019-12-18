package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static support.TestContext.getDriver;
import static support.TestContext.getWait;

public class Credible extends Page {
    public Credible() {
        setUrl("https://www.credible.com/?vt_disabled=true");
    }

    @FindBy(xpath = "//*[text()='Get My Loan Rates']")
    private WebElement studentLoans;

    @FindBy(xpath = "//*[text()='I am the student']")
    private WebElement iAmStudent;

    @FindBy(xpath = "//*[@id='c148_checked_rates-1']")
    private WebElement NotCheckRates;

    @FindBy(xpath = "//*[@id='c92_borrower_has_cosigner-1']")
    private WebElement NoCosigner;

    @FindBy(xpath = "//*[@id='c92_education_name']")
    private WebElement school;

    @FindBy(xpath = "//*[@role='option'][contains(text(),'Center for Employment Training')]")
    private WebElement schoolName;

    @FindBy(xpath = "//*[@id = 's2id_c92_education_degree_type']")
    private WebElement degreeType;

    @FindBy(xpath = "//ul/li/div[text()='Certificate']")
    private WebElement pickDegreeType;

//    @FindBy(xpath = "//select[@id='c92_education_degree_type']")
//    private WebElement degreeTypeUsingSelect1;

    @FindBy(xpath = "//*[@id='s2id_c92_education_current_year']")
    private WebElement currentYrOfStudy;

    @FindBy(xpath = "//ul/li/div[text()='Freshman']")
    private WebElement pickCurrentYrOfStudy;

//    @FindBy(xpath = "//select[@id='c92_education_degree_type']//*[@value='certificate']")
//    private WebElement degreeTypeUsingSelect;
//
//    @FindBy(xpath = "//select[@id='c92_education_current_year']//*[@value='freshman']")
//    private WebElement selectCurrentYrOfStudy;

    @FindBy(xpath = "//*[@id='c92_education_completion_date']")
    private WebElement graduationDate;

    @FindBy(xpath = "//*[@id='s2id_c92_education_academic_period_loan']")
    private WebElement academicPeriodOfLoan;

    @FindBy(xpath = "//ul/li/div[text()='Spring only 2020']")
    private WebElement pickAcademicPeriodOfLoan;

//    @FindBy(xpath = "//select[@id='c92_education_academic_period_loan']/*[@value='spring-only-2019']")
//    private WebElement pickAcademicPeriodOfLoan;

    @FindBy(xpath = "//*[@id='c92_education_requested_loan_amount']")
    private WebElement requestedLoanAmount;

    @FindBy(xpath = "//*[contains(@class, 'cta')][contains(text(), 'Continue')]")
    private WebElement continueButton;

    public void clickStudentLoans() {
        click(studentLoans);
        click(iAmStudent);
    }

    public void enterEducationInfo() throws InterruptedException {
        click(NotCheckRates);
        click(NoCosigner);
        sendKeys(school,"san jose");
        click(schoolName);
        click(degreeType);
        click(pickDegreeType);
        click(currentYrOfStudy);
        click(pickCurrentYrOfStudy);
        sendKeys(graduationDate, "062025");
        click(academicPeriodOfLoan);
        click(pickAcademicPeriodOfLoan);
        sendKeys(requestedLoanAmount, "50000");
        click(continueButton);
        Thread.sleep(5000);

//        new Select(degreeTypeUsingSelect).selectByValue("certificate");
//        waitForVisible(degreeTypeUsingSelect);
//        waitForClickable(degreeTypeUsingSelect1);
//        new Select(degreeTypeUsingSelect1).selectByVisibleText("Certificate");
        // new Actions(getDriver()).moveToElement(degreeTypeUsingSelect).click().perform();
        //click(degreeTypeUsingSelect);

       // click(selectCurrentYrOfStudy);
        //new Actions(getDriver()).moveToElement(selectCurrentYrOfStudy).click().perform();

//        new Actions(getDriver()).moveToElement(pickAcademicPeriodOfLoan).click().perform();

    }

    @FindBy(xpath = "//*[@id='c92_borrower_income_yearly']")
    private WebElement employmentIncome;

    @FindBy(xpath = "//*[@id='c92_borrower_additional_income']")
    private WebElement additionalIncome;

    @FindBy(xpath = "//*[@id='c92_borrower_housing_payment']")
    private WebElement housingPayment;

    public void enterFinanceInfo(){
        sendKeys(employmentIncome, "60000");
        sendKeys(additionalIncome, "1000");
        sendKeys(housingPayment, "600");
        click(continueButton);
    }

    @FindBy(xpath = "//*[@id='c92_borrower_first_name']")
    private WebElement firstName;

    @FindBy(xpath = "//*[@id='c92_borrower_last_name']")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id='c240_email']")
    private WebElement emailId;

    Calendar cal = Calendar.getInstance();

    int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

    String dayOfMonthStr = String.valueOf(dayOfMonth);

    int month = cal.get(Calendar.MONTH) + 1;

    String monthStr = String.valueOf(month);

    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

    String email = "Great" + monthStr + dayOfMonthStr + timeStamp + "@credible.com";

    @FindBy(xpath = "//*[@id='c240_password']")
    private WebElement password;

    public void enterProfileInfo(){
        sendKeys(firstName, "Great");
        sendKeys(lastName, "CredibleProd");
        sendKeys(emailId, email);
        sendKeys(password, "Passw0rd");
    }
}
