package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

import static support.TestContext.getDriver;

public class MyJobsPage extends Header {

    public MyJobsPage() {
        setHeaderText("My Jobs");
    }

    public void isPositionAdded(String positionId) {

        List<WebElement> positionsList = getDriver().findElements(By.xpath("//li[contains(@class,'li-selected')]"));

        for (WebElement position : positionsList) {
            if (position.getAttribute("id").equals(positionId)) {
                System.out.println("position is selected");
            }
        }
    }
}
