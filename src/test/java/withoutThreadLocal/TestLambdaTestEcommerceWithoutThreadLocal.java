package withoutThreadLocal;


import org.testng.annotations.Test;


public class TestLambdaTestEcommerceWithoutThreadLocal extends BaseTestWithoutThreadLocal {

    @Test
    public void testLambdaTestEcommerce() {
        System.out.println("<- TestLambdaTestEcommerce -> Executed by Thread : " + Thread.currentThread().getId()
                + " on driver reference : " + driver);
        driver.get("https://ecommerce-playground.lambdatest.io/");
        System.out.println("Title printed by Thread : " + Thread.currentThread().getId() + " <- " + driver.getTitle()
                + " -> on driver reference : " + driver);
    }
}