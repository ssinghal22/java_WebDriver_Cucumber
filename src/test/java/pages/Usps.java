package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.TestContext;

import java.util.List;

public class Usps extends Page {
    public Usps() {
        setUrl("https://www.usps.com/");
    }

    @FindBy(xpath = "//a[@id='mail-ship-width']")
    private WebElement mailShip;

    @FindBy(xpath = "//img[@id='icon-zip']")
    private WebElement iconZip;

    @FindBy(xpath = "//a[contains(@class,'zip-code-address')]")
    private WebElement zipCodeAddress;

    public void lookUpZipByAddress() {
       // mailShip.click();
       // iconZip.click();
        //zipCodeAddress.click();
        click(mailShip);
        click(iconZip);
        click(zipCodeAddress);
    }

    @FindBy(xpath = "//input[@id='tAddress']")
    private WebElement address;

    @FindBy(xpath = "//input[@id='tCity']")
    private WebElement city;

    @FindBy(xpath = "//select[@id='tState']")
    private WebElement state;

    @FindBy(xpath = "//a[@id='zip-by-address']")
    private WebElement zipByAddress;

    public void fillAddress(String aStreet, String aCity, String aState) {
        //address.sendKeys(aStreet);
        sendKeys(address, aStreet);
        //city.sendKeys(aCity);
        sendKeys(city, aCity);
        new Select(state).selectByValue(aState);
        //zipByAddress.click();
        click(zipByAddress);
    }

    @FindBy(xpath = "//div[@id='zipByAddressDiv']")
    private WebElement zipSearchResultElement;

    @FindBy(xpath = "(//div[@id='zipByAddressDiv']//li)[1]")
    private WebElement firstResultItem;

    @FindBy(xpath = "//div[@id='zipByAddressDiv']//li")
    private List<WebElement> items;

    public List<WebElement> getZipList(String aZip) {
        //how to write corresponding waits?

        TestContext.getWait().until(ExpectedConditions.textToBePresentInElement(zipSearchResultElement, aZip));

        TestContext.getWait().until(ExpectedConditions.textToBePresentInElement(firstResultItem, aZip));

        return items;
    }

    @FindBy(xpath = "//img[@id='icon-calculate']")
    private WebElement iconPrice;

    public void calculatePrice() {
        click(mailShip);
        click(iconPrice);
    }

    @FindBy(xpath = "//select[@id='CountryID']")
    private WebElement country;

    @FindBy(xpath = "//input[@id='option_1']")
    private WebElement postcard;

    public void selectCountryShape(String aCountry, String aShape) {
        new Select(country).selectByValue("10150");
        click(postcard);
    }

    @FindBy(xpath = "//input[@id='quantity-0']")
    private WebElement quantity;

    public void selectQty(String aQty) {
        sendKeys(quantity, aQty);
    }

    @FindBy(xpath = "//div[@id='continue-section']/input[@type='button']")
    private WebElement calculate;

    @FindBy(xpath = "//div[@id='total']")
    private WebElement total;

    public String getTotal() {
        click(calculate);
        return total.getText();
    }

    @FindBy(xpath = "//a[@id='navpostalstore']/../a[@class='menuitem']")
    private WebElement postalStore;

    public void postalStoreTab() {
        click(postalStore);
    }

    @FindBy(xpath = "//input[@id='store-search']")
    private WebElement storeSearch;

    public void storeSearch(String aStore) {
        sendKeys(storeSearch, aStore);
    }

    @FindBy(xpath = "//input[@id='store-search-btn']")
    private WebElement storeSearchBtn;

    @FindBy(xpath = "//div[@class='no-product']/p")
    private WebElement result;

    public void searchBtn() {
        click(storeSearchBtn);
    }

    public String getResult() {
        return result.getText();
    }
}
