package WayToAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Year;
import java.util.ArrayList;

public class RegistrationFormTest {

    WebDriver driver;

    @BeforeClass
    void setup(){
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.get("https://www.way2automation.com/way2auto_jquery/automation-practice-site.html");
    }

    @Test
    void completeRegistration() throws InterruptedException {
        // locator for Registration menu
        By regLInk = new By.ByCssSelector(".linkbox:nth-child(5) a");
        WebElement regLinkElement = driver.findElement(regLInk);
        regLinkElement.click();
        ArrayList<String> tabs = new ArrayList <> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        // locator for first name
        By firstName = new By.ByCssSelector("fieldset:first-child p:first-child input");
        WebElement firstNameEl = driver.findElement(firstName);
        firstNameEl.sendKeys("donald");

        // locator for last name
        By lastName = new By.ByCssSelector("fieldset:first-child p:last-child input");
        WebElement lastNameEl = driver.findElement(lastName);
        lastNameEl.sendKeys("trump");

        Thread.sleep(3000);

        // click on the Single button
        By Single = new By.ByCssSelector("single");
        WebElement SingleEl = driver.findElement(Single);
        regLinkElement.click();

        Thread.sleep(3000);

        // click on the hobby
        By Cricket = new By.ByCssSelector("cricket");
        WebElement CricketElement = driver.findElement(Cricket);
        CricketElement.click();

        Thread.sleep(3000);

        // choose the country
        By country = new By.ByCssSelector("fieldset:nth-child(4) select");
        Select countrySelect = new Select(driver.findElement(country));
        countrySelect.deselectByVisibleText("india");

        Thread.sleep(3000);

        // select a month
        By Month = new By.ByCssSelector("div:nth-child(2) > select");
        Select MonthSelect = new Select(driver.findElement(country) );
        MonthSelect.selectByVisibleText("Novemver");

        Thread.sleep(3000);


        // select the day
        By Day = new By.ByCssSelector("div:nth-child(3) > select");
        Select DaySelect = new Select(driver.findElement(Day) );
        DaySelect.selectByVisibleText("Day");

        Thread.sleep(3000);

        // select the year
        By Year = new By.ByCssSelector("");
        Select YearSelect = new Select(driver.findElement(Year) );
        YearSelect.selectByVisibleText("year");

        Thread.sleep(3000);

        By Phonenumber = new By.ByCssSelector("");
//        WebElement PhonenumberEl = new Select(driver.findElement(Phonenumber) );
        YearSelect.selectByVisibleText("Phonenumber");

        Thread.sleep(3000);

        By Username = new By.ByCssSelector("");
        Select UserNameType = new Select(driver.findElement(country) );
        YearSelect.selectByVisibleText("Username");

        By Email = new By.ByCssSelector("");
        Select EmailType = new Select(driver.findElement(country) );
        YearSelect.selectByVisibleText("E-mail");


//      driver.getWindowHandle();
//      driver.switchTo().window(tabs.get(1));

//      Thread.sleep(3000)
//      Action act = new Actions(driver);
//      act.moveToElement(regLinkElement).click.build().perform();
    }

    @AfterClass
    void wrapUp(){
        driver.quit();
    }
}
