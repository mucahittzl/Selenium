package Day1_SeleniumMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverManagerTest {


            // Set Path.
            // Create chrome driver.
            // Maximize the window.
            // Open google home page https://www.google.com/
            // Verify that you are Google in the title.

    public static void main(String[] args) {

        //Webdriver Manager calss'ini kullanarak chromedriver binary lerimizi indirdik   ( System.setProperty() yerine mavende bu var)
        WebDriverManager.chromedriver().setup();

        //Driver objemizi olusturduk
        WebDriver driver=new ChromeDriver();

        //window u maximize ettik
        driver.manage().window().maximize();

        //google anasayfffamızı actık
        driver.get("https://www.google.com/");

        //title imizi aldık
        String title = driver.getTitle();

        //title imizi dogruladık
        if (title.equals("Google")){
            System.out.println("test PASSED");
        }else {
            System.out.println("test FAİLED");
        }

        driver.quit();
    }

}
