package withThreadLocalSelenoid;

import org.testng.annotations.Test;


public class TestLambdaTestEcommerceSelenoid extends BaseTestWithThreadLocalSelenoid {
   @Test
   public void testLambdaTestEcommerce() {
       System.out.println("<- TestLambdaTestEcommerce -> Executed by Thread : " + Thread.currentThread().getId()
               + " on driver reference : " + getDriver());
       getDriver().get("https://ecommerce-playground.lambdatest.io/");
       System.out.println("Title printed by Thread : " + Thread.currentThread().getId() + " <- "
               + getDriver().getTitle() + " -> on driver reference : " + getDriver());
   }
}