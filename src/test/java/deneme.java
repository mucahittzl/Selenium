package Day1_SeleniumMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class deneme {
    WebDriver driver;
    @Before
    public void before(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Test
   public void meth(){

        driver.get("https://www.amazon.com/");
        WebElement element= driver.findElement(By.id("nav-cart-text-container"));
        element.click();


   }
//   @After
//  public void after(){
//       driver.quit();
//  }
}
