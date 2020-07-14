package steps;

import cucumber.api.java.en.When;

public class ScenarioSteps {
    MainMenuSteps mainMenuSteps = new MainMenuSteps();
    MarketMainPageSteps marketMainPageSteps = new MarketMainPageSteps();
    MarketInnerPageSteps marketInnerPageSteps = new MarketInnerPageSteps();
    MarketCategorySteps marketCategorySteps = new MarketCategorySteps();
    MarketAllfiltersSetSteps marketAllfiltersSetSteps = new MarketAllfiltersSetSteps();


    @When("^выбран пункт главного меню \"(.*)\"$")
    public void stepSelectTypeOfMainMenu(String menuItem) {
        mainMenuSteps.stepSelectTypeOfMainMenu(menuItem);
        mainMenuSteps.stepChangMainTab();
    }

    @When("^выбран тип продукта \"(.*)\" для поиска$")
    public void stepSelectTypeProduct(String menuItem) {
        marketMainPageSteps.stepSelectTypeOfSearch(menuItem);
    }


    @When("^переход к категории \"(.*)\"$")
    public void stepSelectInnerCategory(String name) {
        marketInnerPageSteps.stepSelectInnerCategory(name);
    }

    @When("^нажать на кнопку Все фильтры$")
    public void stepSelectAllFilters() {
        marketCategorySteps.stepSelectAllFilters();
    }

    @When("^выбрать брэнд товара \"(.*)\"$")
    public void stepSetBrandName(String name) {
        marketAllfiltersSetSteps.setUpBrand(name);
    }

    @When("^установить минимальную цену в \"(.*)\"$")
    public void stepSetMinimumPrice(String minimumPrice) {
        marketAllfiltersSetSteps.setUpMinimumPrice(minimumPrice);
    }

    @When("^нажать на кнопку Показать результаты$")
    public void stepConfirmFilterAndShoItems(){
        marketAllfiltersSetSteps.pushButtonShowAllResults();
    }

    @When("^выведено результатов \"(.*)\"$")
    public void stepPrintResultLenght(int num){
        marketCategorySteps.stepCheckNumberOfElementsOnPage(num);
    }

    @When("^запомнить название \"(.*)\" элемента$")
    public void stepSaveFirstElement(int num){
        marketCategorySteps.stepSaveElement(num);
    }

    @When("^сделать поиск \"(.*)\" элемента$")
    public void stepSearchFirstElement(int num){
        marketCategorySteps.stepSearchItemByNumberInList(num);
    }




}
