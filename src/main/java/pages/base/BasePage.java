package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.math.BigDecimal;
import java.time.Duration;

public class BasePage {
    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        initDriver(driver);
    }

    public BasePage(WebDriver driver, WebElement parent) {
        PageFactory.initElements(new DefaultElementLocatorFactory(parent), this);
        initDriver(driver);
    }

    private void initDriver(WebDriver driver){
        this.driver = driver;
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public WebDriver driver;
    public Actions actions;
    public WebDriverWait wait;

    public void click(WebElement element){
        System.out.println("Clicking on: " + element.getText());
        element.click();
    }

    public void sendKeys(WebElement element, String textToSet){
        System.out.println("Typing: " + textToSet);
        element.sendKeys(textToSet);
    }


    public void sendKeysAndClear(WebElement element, String textToSet){
        element.clear();
        sendKeys(element, textToSet);
    }

    public BigDecimal getPrice(WebElement element){
        return new BigDecimal(element.getText().replace("$", ""));
    }

}
