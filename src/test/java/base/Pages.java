package base;

import org.testng.annotations.BeforeMethod;
import pages.cart.CartPage;
import pages.product.ProductDetailsPage;
import pages.product.ProductGridPage;
import pages.product.ProductPopupPage;
import pages.user.MyAccountPage;
import pages.user.RegistrationPage;
import pages.user.SignInPage;

public class Pages extends TestBase {

    public CartPage cartPage;
    public ProductDetailsPage productDetailsPage;
    public ProductGridPage productGridPage;
    public ProductPopupPage productPopupPage;
    public MyAccountPage myAccountPage;
    public RegistrationPage registrationPage;
    public SignInPage signInPage;

    @BeforeMethod
    public void setupPages() {
        cartPage = new CartPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
        productGridPage = new ProductGridPage(driver);
        productPopupPage = new ProductPopupPage(driver);
        myAccountPage = new MyAccountPage(driver);
        registrationPage = new RegistrationPage(driver);
        signInPage = new SignInPage(driver);
    }
}
