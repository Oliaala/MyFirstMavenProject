package webdriv;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;


public class WebDriTest {

    @Test
    public void demo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://booking.com");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Париж");
        driver.findElement(By.xpath("//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']")).click();
        driver.findElement(By.xpath("//span[@aria-label='8 Декабрь 2021']")).click();
        driver.findElement(By.xpath("//span[@aria-label='14 Декабрь 2021']")).click();
        driver.findElement(By.xpath("//label[@id='xp__guests__toggle']")).click();
        driver.findElement(By.xpath("//button[@class='bui-button bui-button--secondary bui-stepper__add-button ']")).click();
        driver.findElement(By.xpath("//button[@class='bui-button bui-button--secondary bui-stepper__add-button ']")).click();
        driver.findElement(By.xpath("//button[@aria-label='Номера: увеличить количество']")).click();
        driver.findElement(By.xpath("//button[@class='sb-searchbox__button ']")).click();
        Thread.sleep(700);
        driver.findElement(By.xpath(" //input[@id='__bui-6']/ancestor::label//div[contains(text(), '+')]")).click();

        WebElement element = new WebDriverWait(driver, 1000).until(
                ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Цена ')]"))
        );
        element.click();

        WebElement webElement = driver.findElement(
                By.xpath("//div[@id='search_results_table']//div[@data-testid='property-card'][1]//div[@data-testid='price-and-discounted-price']/span[1]"));
        String number = webElement.getText();
        System.out.println(number);
        number.replaceAll("\\D+", "");
        System.out.println("Expected price" + number);
        //сделать число из стринги
        // System.out.println("Actual price" + (number / 7));


    }
}
