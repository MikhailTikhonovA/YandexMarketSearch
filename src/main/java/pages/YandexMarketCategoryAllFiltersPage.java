package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static steps.BaseSteps.getWait;

public class YandexMarketCategoryAllFiltersPage {
    @FindBy(xpath = "//div[@class='layout layout_type_search i-bem']")
    WebElement allSettings;

    public YandexMarketCategoryAllFiltersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectManufactureBrand(String name){
        getWait().until(ExpectedConditions.visibilityOf(allSettings.findElement(By.xpath(".//div[@data-filter-id='7893318']//.//label[contains(text(),'" + name + "')]"))));
        allSettings.findElement(By.xpath(".//div[@data-filter-id='7893318']//.//label[contains(text(),'" + name + "')]")).click();
    }

    public void setMinimumPrice(String minimumPrice){
        getWait().until(ExpectedConditions.visibilityOf(allSettings.findElement(By.xpath(".//input[@id='glf-pricefrom-var']"))));
        allSettings.findElement(By.xpath(".//input[@id='glf-pricefrom-var']")).click();
        allSettings.findElement(By.xpath(".//input[@id='glf-pricefrom-var']")).sendKeys(minimumPrice);
    }

    public void pushButtonShowAllItems(){
        getWait().until(ExpectedConditions.visibilityOf(allSettings.findElement(By.xpath(".//a[@class='button button_size_l button_theme_pseudo i-bem button_action_show-filtered n-filter-panel-extend__controll-button_size_big button_js_inited']"))));
        allSettings.findElement(By.xpath(".//a[@class='button button_size_l button_theme_pseudo i-bem button_action_show-filtered n-filter-panel-extend__controll-button_size_big button_js_inited']")).click();
    }

}
