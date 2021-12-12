package ClassWork;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://booking.com");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Москва");
        driver.findElement(By.xpath("//button[@class='sb-searchbox__button ']")).click();
        WebElement webElement = driver.findElement(By.xpath("//div[@id='search_results_table']//div[@data-testid='property-card'][10]"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", webElement);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green'", webElement);
        WebElement element = driver.findElement(By.xpath("//div[@id='search_results_table']//div[@data-testid='property-card'][10]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'red'", element);

        WebElement actual = driver.findElement(By.xpath("//div[@id='search_results_table']//div[@data-testid='property-card'][10]"));
        String  colorExpected = actual.getCssValue("color");
        Assert.assertEquals("Result isn't correct", actual, colorExpected );
    }
}