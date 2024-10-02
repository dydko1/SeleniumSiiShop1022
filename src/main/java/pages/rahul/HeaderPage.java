package pages.rahul;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class HeaderPage extends BasePage {

    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[class='theme-btn']")
    private WebElement loginBtn;

    public void clickLogin() {
        loginBtn.click();

       // return new LoginPage(driver);
    }
}
