package classWork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleActionsTest {

    @Test
    public void demo() {

        WebDriver driver = new ChromeDriver();
        //Задание: 1. Перейти на сайт
        driver.get("https://www.w3schools.com/java/");
        WebElement nameField = driver.findElement(By.xpath("//span[@class='color_h1']"));
        Actions make = new Actions(driver);
        make
                .doubleClick(nameField)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c")
                .keyDown(Keys.LEFT_CONTROL)
                .build().perform();

        driver.get("https://google.com/");
        WebElement nameEl = driver.findElement(By.xpath("//input"));
        make
                .doubleClick(nameEl)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v")
                .keyUp(Keys.LEFT_CONTROL)
                .sendKeys(Keys.ENTER)
                .build().perform();

        int actualResult = driver.findElements(By.xpath("//div[@class='g']")).size();
        int expectedResult = driver.findElements(By.xpath("//div[@class='g' and contains(., 'tutorial')]")).size();

        Assert.assertEquals("Result isn't correct", actualResult, expectedResult);
    }
}
