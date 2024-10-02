package withThreadLocalSelenoid;

import org.testng.annotations.Test;


public class TestInteria extends BaseTestWithThreadLocalSelenoid {
   @Test
   public void testLambdaTestEcommerce() {
       getDriver2().get("https://www.interia.pl/");
       System.out.println(getDriver2().getTitle());
   }
}