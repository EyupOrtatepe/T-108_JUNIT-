package day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class googleTest {
    // ilgili kurulumlari tamamlayalim
    // Kullanici https://www.google.com adresine gider
    // Kullanici cookies i kabul eder

    WebDriver driver;
    String https = "https://www.";

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }
    @Test
    public void googleTest(){
        driver.get(https+"google.com");
        //cookies i kabul eder
        WebElement cookies = driver.findElement(By.xpath("//div[text()='Alles accepteren']"));
        cookies.click();

        // Arama Kutusuna karsilastirma yapmak istedigi para birimlerini girer
        WebElement searchBox = driver.findElement(By.xpath("//input[@class='gLFyf']"));


        // Para birimlerinin karsilastirmasini alir
        // Karsilastirilacak olan para biriminin 1.5 den kucuk oldugu test edilir
    }

    @After
    public void tearDown(){
        //driver.close();
    }
}
