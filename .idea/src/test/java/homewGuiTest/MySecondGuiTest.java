package homewGuiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySecondGuiTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //Задание: 1. Перейти на сайт booking.com
        driver.get("https://booking.com");
        // 2. Ввести в поиск «Москва», выбрать для проживания 2 гостей и 1 номер.
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Москва");
        driver.findElement(By.xpath("//button[@class='sb-searchbox__button ']")).click();
        // 3. Отфильтровать отели с максимальным рейтингом
        driver.findElement(By.xpath("//a[@data-type='class']")).click();
        Thread.sleep(700);
        // 4. Открыть страницу с первым таким отелем и проверить, что его рейтинг >=9
        driver.findElement(By.xpath("//div[@class='fde444d7ef _c445487e2']")).click();

    }
}