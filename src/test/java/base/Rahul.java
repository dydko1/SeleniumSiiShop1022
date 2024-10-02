package base;

import org.testng.annotations.BeforeMethod;
import pages.rahul.AlertPage;
import pages.rahul.LoginPage;
import pages.rahul.SelectPage;
import pages.rahul.WebElementsPage;

public class Rahul extends TestBase {

    public LoginPage loginPage;
    public AlertPage alertPage;
    public SelectPage selectPage;
    public WebElementsPage webElementsPage;

    @BeforeMethod
    public void setupPages() {
        loginPage = new LoginPage(driver);
        alertPage = new AlertPage(driver);
        selectPage = new SelectPage(driver);
        webElementsPage = new WebElementsPage(driver);
    }
}
