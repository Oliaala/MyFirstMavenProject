package homewGuiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyGuiTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //Перейти на сайт booking.com
        driver.get("https://booking.com");
        //Ввести в поиск «Москва», выбрать для проживания 2 гостей и 1 номер.
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Москва");
        //Проверить, что в Москве есть отели на введенные даты
        driver.findElement(By.xpath("//button[@class='sb-searchbox__button ']")).click();
        driver.close();
        driver.quit();
    }

}
