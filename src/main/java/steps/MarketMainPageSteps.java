package steps;

import pages.YandexMarketMainPage;

import static steps.BaseSteps.driver;

public class MarketMainPageSteps {
    YandexMarketMainPage marketMainPage = new YandexMarketMainPage(driver);


    public void stepSelectTypeOfSearch(String type) {
        marketMainPage.selectTypeMenu(type);
    }


}
