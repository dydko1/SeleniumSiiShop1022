package pages.rahul;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.base.BasePage;

public class SelectPage extends BasePage {

    public SelectPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#dropdown-class-example")
    private WebElement SelectOption;

    public void selectElement() {
        Select select = new Select(SelectOption);
        select.selectByIndex(1);

        // return new LoginPage(driver);
    }
}
