package base;

import helpers.UrlProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class TestBase {
    public WebDriver driver;
    public SoftAssertions softAssertions;

    @BeforeMethod
    public void setUp() {
        //WebDriverManager.chromedriver().setup();
        softAssertions = new SoftAssertions();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");
        options.setCapability("selenoid:options", new HashMap<String, Object>() {{
            //put("enableVideo", true);
            put("enableVNC", true); // add this key!!! see
            /*
            !!!!! http://192.168.10.61:8080/#/capabilities/ !!!!!

            ChromeOptions options = new ChromeOptions();
            options.setCapability("selenoid:options", new HashMap<String, Object>() {{
            put("name", "Test badge...");

            put("sessionTimeout", "15m");

            put("env", new ArrayList<String>() {{
                add("TZ=UTC");
            }});

            put("labels", new HashMap<String, Object>() {{
                put("manual", "true");
            }});

            put("enableVideo", true);
        }});
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.10.61:4444/wd/hub"), options);
             */
        }});

        try {
            driver = new RemoteWebDriver(new URL("http://192.168.10.61:4444/wd/hub"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.get(UrlProvider.app);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
