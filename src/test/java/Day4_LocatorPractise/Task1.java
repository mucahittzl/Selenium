package Day4_LocatorPractise;

import com.fasterxml.jackson.core.json.PackageVersion;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task1 {

     //https://id.heroku.com/login sayfasına gidiniz.
     //Bir mail adresi giriniz.
     //Bir password giriniz.
     //Login butonuna tıklayınız.
     //"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
     //Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
     //Tüm sayfaları kapatınız.

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @After
    public void tearDown(){
       // driver.quit();
    }

    @Test
    public void mail(){
        driver.get("https://id.heroku.com/login");

        WebElement mailYaz=driver.findElement(By.id("email"));
        mailYaz.sendKeys("mucahit@tezel");
        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("12346579"+ Keys.ENTER);
        String exception= driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();

        if (exception.equals("There was a problem with your login.")){
            System.out.println("Kayıt yapılamadı");
        }else System.out.println("kayıt yapıldı");
    }
}
