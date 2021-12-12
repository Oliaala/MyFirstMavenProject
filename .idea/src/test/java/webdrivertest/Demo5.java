package webdrivertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class Demo5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("погода Минск");
        Thread.sleep(700);
        driver.findElement(By.xpath("//span[contains(.,'сейчас')]")).click();
        driver.findElement(By.xpath("//*[@id='wob_dp']/div[2]")).click();
        WebElement temperature = driver.findElement(
                By.xpath("//*[contains(@aria-label, 'Celsius понедельник 12:00')][1]"));
        String dayOfWeek =
                DateTimeFormatter.ofPattern("EEEE")
                        .withLocale(new Locale("ru", "RU"))
                        .format(LocalDate.now().plus(1, ChronoUnit.DAYS));
        WebElement el2 = driver.findElement(
                By.xpath(String.format("//*[contains(@aria-label, 'Celsius %s 12:00')][1]", dayOfWeek)));

        System.out.println(el2.getAttribute("aria-label").split(" ")[0]);
        driver.close();
    }
}