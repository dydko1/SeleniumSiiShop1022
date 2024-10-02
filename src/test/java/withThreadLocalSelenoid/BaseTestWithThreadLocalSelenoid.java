package withThreadLocalSelenoid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;


public class BaseTestWithThreadLocalSelenoid {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    @BeforeClass
    public void setDriver() {
        //driver.set(new ChromeDriver());
        System.out.println("Browser setup by Thread : " + Thread.currentThread().getId() + " and Driver reference is : "
                + getDriver());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");
        options.setCapability("selenoid:options", new HashMap<String, Object>() {{
            //put("enableVideo", true);
            put("enableVNC", true);
        }});

        try {
            driver.set( new RemoteWebDriver(new URL("http://192.168.10.61:4444/wd/hub"), options));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("Browser closed by Thread : " + Thread.currentThread().getId()
                + " and Closing driver reference is :" + getDriver());
        driver.get().close();
        driver.remove();
    }
}