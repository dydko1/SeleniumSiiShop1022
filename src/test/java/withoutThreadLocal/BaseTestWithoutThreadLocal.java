package withoutThreadLocal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTestWithoutThreadLocal {

    public static WebDriver driver;

    @BeforeClass
    public void setDriver()
    {
        driver = new ChromeDriver();
        System.out.println(
                "Browser setup by Thread : " + Thread.currentThread().getId() + " and Driver reference is : " + driver);
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("Browser closed by Thread : " + Thread.currentThread().getId()
                + " and Closing driver reference is :" + driver);
        driver.quit();
    }
}