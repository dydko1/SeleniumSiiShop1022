package pages.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.cart.CartPage;

public class ProductPopupPage extends BasePage {
    public ProductPopupPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".modal-dialog .btn-primary")
    private WebElement proceedToCheckoutBtn;

    public CartPage proceedToCheckout() {
        click(proceedToCheckoutBtn);
        return new CartPage(driver);
    }
}
