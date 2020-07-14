package steps;

import pages.YandexMainPage;

import static steps.BaseSteps.driver;

public class MainMenuSteps {
    YandexMainPage mainPage = new YandexMainPage(driver);

    public void stepSelectTypeOfMainMenu(String type) {
        mainPage.selectTypeMenu(type);
    }

    public void stepChangMainTab(){
        mainPage.changeFocusOnOpenPage();
    }

}
