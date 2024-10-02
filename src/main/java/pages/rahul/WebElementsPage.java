package pages.rahul;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v127.network.Network;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
public class WebElementsPage extends BasePage {

    public WebElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.product h4")
    private List<WebElement> productList;

    public void listElements() {
        wait.until(s -> s.getTitle().contains("GreenKart - veg and fruits kart"));
        driver.get("https://rahulshettyacademy.com/#/index");
        devTools.createSession();

        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

        devTools.addListener(Network.requestWillBeSent(), requestSent -> {

                    System.out.println("Request URL => " + requestSent.getRequest().getUrl());

                    System.out.println("Request Method => " + requestSent.getRequest().getMethod());

                    System.out.println("Request Headers => " + requestSent.getRequest().getHeaders().toString());
                });
        System.out.println("------------------ Miro --------------");
//        List<String> l = productList
//                .stream()
//                // .filter(w -> w.findElements(By.xpath("//h4")).size() >= 1)
//                .map(WebElement::getText)
//                .collect(Collectors.toList());
//        l.forEach(System.out::println);

        // return new LoginPage(driver);
    }
}
