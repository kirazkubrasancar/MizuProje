package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver driver;


    public static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public static ThreadLocal<String> browserName = new ThreadLocal<>();


    public static WebDriver getDriver() {

        if (browserName.get() == null) {
            browserName.set("chrome");
        }

        if (threadDriver.get() == null) {


            System.setProperty("webdriver.chrome.driver", "C:\\Users\\gookh\\OneDrive\\Masaüstü\\chromedriver.exe");
            threadDriver.set(new ChromeDriver());


        }
        return threadDriver.get();
    }


    public static void quitDriver() {


        if (threadDriver.get() != null) {

            threadDriver.get().quit();
            WebDriver driver = threadDriver.get();
            driver = null;

            threadDriver.set(driver);
        }

    }
}








