package cart;

import base.Pages;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class CartTest extends Pages {

    @Test
    public void shouldVerifyCartCalculations() {
        productGridPage.openProduct("HUMMINGBIRD SWEATER");

        productDetailsPage.setQuantity(5)
                .addProductToBasket();

        productPopupPage.proceedToCheckout();

        softAssertions.assertThat(cartPage.getProductName()).isEqualTo("HUMMINGBIRD SWEATER");
        softAssertions.assertThat(cartPage.getProductTotalPrice()).isEqualTo(new BigDecimal("143.60"));
        softAssertions.assertAll();
    }

    @Test
    public void shouldVerifyCartCalculationsV2() {
        productGridPage
                .openProduct("HUMMINGBIRD SWEATER")
                .setQuantity(5)
                .addProductToBasket()
                .proceedToCheckout();

        softAssertions.assertThat(cartPage.getProductName()).isEqualTo("HUMMINGBIRD SWEATER");
        softAssertions.assertThat(cartPage.getProductTotalPrice()).isEqualTo(new BigDecimal("143.60"));
        softAssertions.assertAll();

    }
}
