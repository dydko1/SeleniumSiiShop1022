package pages.rahul;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

@Slf4j
public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#inputUsername")
    private WebElement userNameField;
    @FindBy(css = "input[placeholder='Password']")
    private WebElement passwordField;
    @FindBy(css = "#chkboxOne")
    private WebElement userNameCheckBox;
    @FindBy(css = "#chkboxTwo")
    private WebElement agreeCheckBox;
    @FindBy(css = "button[type='submit']")
    private WebElement signInBtn;

    public void fillLoginForm() {
        fillEmail();
        fillPassword();
        userNameCheckBox
                .click();
        agreeCheckBox
                .click();
        System.out.println();
        signInBtn
                .click();
        System.out.println();
    }


    private void fillEmail() {
        log.info("miro {} blablbla","test123");
        //userNameField.clear();
        userNameField.sendKeys("miroslaw.dyduch@gmail.com");
    }

    private void fillPassword() {
        //passwordField.clear();
        passwordField.sendKeys("rahulshettyacademy");
    }
}
