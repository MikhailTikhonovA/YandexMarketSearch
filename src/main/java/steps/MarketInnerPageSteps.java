package steps;

import pages.YandexMarketInnerSectionPage;
import static steps.BaseSteps.driver;


public class MarketInnerPageSteps {
    YandexMarketInnerSectionPage yandexMarketInnerSectionPage = new YandexMarketInnerSectionPage(driver);

    public void stepSelectInnerCategory(String name){
        yandexMarketInnerSectionPage.selectInnerCategory(name);
    }

}
