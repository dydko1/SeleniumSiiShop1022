package withThreadLocalSelenoid;

import org.testng.annotations.Test;


public class TestWp extends BaseTestWithThreadLocalSelenoid {
   @Test
   public void testLambdaTestEcommerce() {
       getDriver2().get("https://www.wp.pl/");
       System.out.println(getDriver2().getTitle());
   }
}