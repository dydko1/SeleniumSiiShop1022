package withThreadLocalSelenoid;

import org.testng.annotations.Test;


public class TestOnet extends BaseTestWithThreadLocalSelenoid {
   @Test
   public void testLambdaTestEcommerce() {
       getDriver2().get("https://www.onet.pl/");
       System.out.println(getDriver2().getTitle());
   }
}