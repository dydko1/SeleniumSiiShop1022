package withoutThreadLocal;


import org.testng.annotations.Test;


public class TestLambdaTestPlaygroundWithoutThreadLocal extends BaseTestWithoutThreadLocal {
   @Test
   public void testLambdaTestPlayground() {
       System.out.println("<- TestLambdaTestPlayground -> Executed by Thread : " + Thread.currentThread().getId()
               + " on driver reference : " + driver);
       driver.get("https://www.lambdatest.com/selenium-playground/");
       System.out.println("Title printed by Thread : " + Thread.currentThread().getId() + " <- " + driver.getTitle()
               + " -> on driver reference : " + driver);
   }
}