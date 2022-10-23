package pages.cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import java.math.BigDecimal;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".product-line-info a")
    private WebElement productName;

    @FindBy(css = "span.product-price")
    private WebElement productTotalPrice;

    public String getProductName() {
        return productName.getText();
    }

    public BigDecimal getProductTotalPrice() {
        return getPrice(productTotalPrice);
    }
}
