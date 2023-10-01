package pages.product;

import org.apache.hc.core5.annotation.Contract;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.cart.CartPage;

public class ProductPopupPage extends BasePage {
    public ProductPopupPage(WebDriver driver) {
        super(driver);
    }

    private final static String TEST1="//a[@class='btn btn-primary']";
    private final static String xx=test22();

    //@FindBy(css = ".modal-dialog .btn-primary")
    @FindBy(xpath = TEST1)
    private WebElement proceedToCheckoutBtn;
            //=driver.findElement(By.xpath(TEST1));

    public CartPage proceedToCheckout() {
        click(proceedToCheckoutBtn);
        return new CartPage(driver);
    }
    private static String test22()  {
        String s= String.format(TEST1);
        return s;
    }

}
