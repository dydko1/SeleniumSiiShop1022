package base;

import helpers.UrlProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import listerner.Listener1;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(Listener1.class)
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

        driver = new ChromeDriver(options);
        driver.get(UrlProvider.app);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
