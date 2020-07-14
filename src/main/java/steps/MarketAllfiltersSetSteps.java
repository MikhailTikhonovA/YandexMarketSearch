package steps;

import pages.YandexMarketCategoryAllFiltersPage;

import static steps.BaseSteps.driver;

public class MarketAllfiltersSetSteps {
    YandexMarketCategoryAllFiltersPage yandexMarketCategoryAllFiltersPage = new YandexMarketCategoryAllFiltersPage(driver);

    public void setUpBrand(String name){
        yandexMarketCategoryAllFiltersPage.selectManufactureBrand(name);
    }

    public void setUpMinimumPrice(String minimumPrice){
        yandexMarketCategoryAllFiltersPage.setMinimumPrice(minimumPrice);
    }

    public void pushButtonShowAllResults(){
        yandexMarketCategoryAllFiltersPage.pushButtonShowAllItems();
    }
}
