package WayToAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

//public class JSAlert {
//    WebDriver driver;
//
//    @BeforeClass
//    void setup() {
//        WebDriverManager.chromedriver();
//        driver = new ChromeDriver();
//        driver.get("https://https://www.way2automation.com/way2auto_jquery/alert.php#load_box");
//    }
//
//    @Test
//    void test_Alert(){
//
//        By promptLocator = new By.ByCssSelector("promptButton");
//        WebElement promptButton = driver.findElement(resultSelector);
//
//        //Nositive test
//        promptButton.click();
//        driver.switchTo().sendkeys("jfkjjf");
//        Thread.sleep(3000);
//        driver.switchTo().alert().dismiss();
//
//        By resultSelector = new By.ByCssSelector("yjgyjg");
//        WebElement resultEl = driver.findElement(resultSelector);
//        Assert.assertThrows(()-> driver.findElement(resultSelector);
//
//    }
//
//        @AfterClass
//        void wrapUp() throws InterruptedException {
//            driver.quit();
//        }




