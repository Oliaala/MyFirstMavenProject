package webdriv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.name("search"));
    }
}