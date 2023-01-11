import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.http.io.SessionOutputBuffer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoQA {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

        By elementLocator = new By.ByCssSelector(".mt-4:first-child");
        WebElement element = driver.findElement(elementLocator);
        element.click();

        // Header element
        By headerLocator = new By.ByCssSelector("main-header");
        WebElement header = driver.findElement(headerLocator);
        String headerText = header.getText();
        Assert.assertEquals(headerText, "Elements");

//        if (headerText.equals("Elements")) {
//            System.out.println("'Elements found in the header");
//        }else{
//            System.out.println("'Elements not found in the header");
//        }

        // Click on the logo to come to the home screen
        By logoLocator = new By.ByCssSelector("header img");
        WebElement logo = driver.findElement( logoLocator );
        logo.click();

        //Click on the form menu
        By formsLocator = new By.ByCssSelector(".mt-4:nth-child(2)");
        WebElement forms = driver.findElement(formsLocator);
        forms.click();

//        if (headerText.equals("Forms")) {
//            System.out.println("'Forms found in the header");
//        }else{
//            System.out.println("'Forms' not found in the header");
//        }


        driver.quit();
    }
}
