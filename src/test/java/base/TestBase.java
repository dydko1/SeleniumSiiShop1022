package base;

import helpers.UrlProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    public WebDriver driver;
    public SoftAssertions softAssertions;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        softAssertions = new SoftAssertions();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        driver = new ChromeDriver(option);
        driver.get(UrlProvider.app);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
