package Utils;
import com.google.common.collect.ImmutableMap;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.Response;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Rectangle;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

//    public class BaseMethod extends DriverUtils {
//        public Robot re;
//        public Select se;
//        public Actions ac;
//        public WebDriverWait wait;
//        public Properties prop;
//        private static WebDriver driver;
//
//        @AfterMethod(alwaysRun = true, enabled = true)
//        public void afterMethod(ITestResult result) throws Exception {
//            if (result.getStatus() == ITestResult.FAILURE) {
//                saveFullPageScreenshot("./src/test/resources/Reports/Images/" + result.getTestClass().getName() + "." + result.getMethod().getMethodName() + ".png");
//            }
//        }
//
//        private void saveFullPageScreenshot(String s) {
//        }
//
//        public BaseMethod() {
//            driver = getWebDriver();
//            try {
//                re = new Robot();
//            } catch (AWTException e) {
//                throw new RuntimeException(e);
//            }
//            wait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(20));
//            ac = new Actions(getWebDriver());
//        }
//
//        public WebDriver getWebDriver() {
//            if (prop == null) initializeProperties();
//            if (driver != null && !driver.toString().contains("(null)")) return driver;
//            String browser = prop.getProperty("browser");
//            System.out.println("### Creating new " + browser + " web driver.");
//            switch (browser.toLowerCase()) {
//                case "chrome":
//                    WebDriverManager.chromedriver().setup();
//                    driver = new ChromeDriver();
//                    break;
//                case "chrome_headless":
//                    var chromeOptions = new ChromeOptions();
//                    chromeOptions.addArguments("--headless");
//                    chromeOptions.addArguments("--disable-gpu");
//                    chromeOptions.addArguments("--window-size=1280,800");
//                    chromeOptions.addArguments("--allow-insecure-localhost");
//                    WebDriverManager.chromedriver().setup();
//                    driver = new ChromeDriver(chromeOptions);
//                    break;
//                case "safari":
//                    driver = WebDriverManager.safaridriver().create();
//                    break;
//                case "firefox":
//                case "mozilla":
//                    driver = WebDriverManager.firefoxdriver().create();
//                    break;
//                case "ie":
//                case "internet explorer":
//                    WebDriverManager.iedriver().setup();
//                    driver = new InternetExplorerDriver();
//                    break;
//                case "edge":
//                    driver = WebDriverManager.edgedriver().create();
//                    break;
//                case "edge_headless":
//                    WebDriverManager.edgedriver().setup();
//                    EdgeOptions edgeOptions = new EdgeOptions();
//                    edgeOptions.addArguments("--headless");
//                    driver = new EdgeDriver(edgeOptions);
//                    break;
//                default:
//                    throw new NotFoundException("Browser Not Found. Please Provide a Valid Browser in the List");
//            }
//            return driver;
//        }
//
//        private void initializeProperties() {
//        }
//
//        public void quitWebdriver() {
//            if (driver != null && !driver.toString().contains("(null)")) {
//                System.out.println("Browser open: closing now");
//                driver.quit();
//            }
//        }
// }
