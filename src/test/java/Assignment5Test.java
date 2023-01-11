import Utils.DriverUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assignment5Test {
    WebDriver driver;


    @BeforeClass
    void setup() {
        WebDriverManager.chromedriver();
        driver = DriverUtils.getWebDriver();
        driver.get("https://demoqa.com/login");
    }


    @Test
    void JavaAssignment5() throws InterruptedException {
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#userName")).sendKeys("sam.has1999@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("Hasina12345$");
//        driver.findElement(By.cssSelector("#login")).click();
        DriverUtils.clickUsingJS(By.cssSelector("#login"));
        Thread.sleep(5000);
//        driver.findElement(By.cssSelector("#gotoStore")).click();
        DriverUtils.clickUsingJS(By.cssSelector("#gotoStore"));
        DriverUtils.clickUsingJS(By.cssSelector("//span[@id='see-book-Learning JavaScript Design Patterns']"));
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#addNewRecordButton")).click();


    }

//       @AfterClass
//       void wrapUp(){
//       driver.quit();
//      }
}

