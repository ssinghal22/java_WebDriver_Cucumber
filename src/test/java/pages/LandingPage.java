package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;
import static support.TestContext.getWait;

public class LandingPage extends Header{

    public LandingPage() {
        setUrl("https://skryabin-careers.herokuapp.com/");
        setHeaderText("Careers");
    }

    public String applyToNewPosition() throws InterruptedException {

        List<WebElement> listOfPositions = getDriver().findElements(By.xpath("//li[contains(@class,'list-item')]"));

        List<WebElement> listOfIcons = getDriver().findElements(By.xpath("//i[contains(@class,'fa-check')]"));

        int size =  listOfPositions.size();
        int num = new Random().nextInt(size);
        WebElement position = listOfPositions.get(num);
       //WebElement position =  listOfPositions.get(1);
        String idValue =  position.getAttribute("id");

       // WebElement clickIcon = listOfIcons.get(1);
        WebElement clickIcon = listOfIcons.get(num);

        new Actions(getDriver()).moveToElement(position).perform();
        click(clickIcon);

        return idValue;
    }

   public void isPositionSelected(String positionId) {
        //List<WebElement> selectedPositions = getDriver().findElements(By.xpath("//li[contains(@class,'li-selected')]"));

        // String positionClass = getDriver().findElement(By.xpath("//li[@id = '" + positionId + "']")).getAttribute("class");

         WebElement element = getDriver().findElement(By.xpath("//li[@id = '" + positionId + "']"));
         new Actions(getDriver()).moveToElement(element).perform();
        String positionClass = element.getAttribute("class");

         System.out.println("positionClass: " + positionClass);

         assertThat(positionClass.contains("li-selected")).isTrue();
    }
}
