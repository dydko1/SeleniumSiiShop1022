package withThreadLocal;

import org.testng.annotations.Test;


public class TestLambdaTestPlayground extends BaseTestWithThreadLocal {


   @Test
   public void testLambdaTestPlayground() {
       System.out.println("<- TestLambdaTestPlayground -> Executed by Thread : " + Thread.currentThread().getId()
               + " on driver reference : " + getDriver());
       getDriver().get("https://www.lambdatest.com/selenium-playground/");
       System.out.println("Title printed by Thread : " + Thread.currentThread().getId() + " <- "
               + getDriver().getTitle() + " -> on driver reference : " + getDriver());
   }
}