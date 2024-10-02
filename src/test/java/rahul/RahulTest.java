package rahul;

import base.Rahul;
import org.testng.annotations.Test;

public class RahulTest extends Rahul {

    @Test
    public void loginIn() {
//        headerPage
//                .clickLogin();
        loginPage
                .fillLoginForm();
    }

    @Test
    public void alerts() {
        alertPage
                .fillAlertForm();

    }

    @Test
    public void selectOpt() {
        selectPage
                .selectElement();
    }

    @Test
    public void cards() {
        webElementsPage
                .listElements();
    }
}
