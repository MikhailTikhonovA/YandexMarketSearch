package steps;

import pages.YandexMarketCategoryPage;

import static steps.BaseSteps.driver;

public class MarketCategorySteps {
    YandexMarketCategoryPage yandexMarketCategoryPage = new YandexMarketCategoryPage(driver);

    public void stepSelectAllFilters() {
        yandexMarketCategoryPage.pushButtonAllFilters();
    }

    public void stepCheckNumberOfElementsOnPage(int num) {
        yandexMarketCategoryPage.countAllElementsOnPage(num);
    }


    public void stepSaveElement(int num) {
        yandexMarketCategoryPage.saveTitleAndElementNumElementOfList(num);
    }

    public void stepSearchItemByNumberInList(int num) {
        yandexMarketCategoryPage.searchItemByName(num);
    }


}
