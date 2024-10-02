package pages.rahul;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.base.BasePage;

@Slf4j
public class AlertPage extends BasePage {

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#name")
    private WebElement nameField;
    @FindBy(id = "alertbtn")
    private WebElement alertBtnField;

    public void fillAlertForm() {
        fillAlertName();
        clickAlert();
        switchAlert();
    }

    private void fillAlertName() {
        log.info("Clicking btn {} ", "test123");
        nameField
                .sendKeys("ddddd");
    }

    private void clickAlert() {
        log.info("Clicking {} alert", "alert");
        alertBtnField
                .click();
    }

    private void switchAlert() {
        log.info("Presenting {}", getAlert().getText());
        getAlert()
                .accept();
    }

    private Alert getAlert() {
        return driver
                .switchTo()
                .alert();
    }
}
