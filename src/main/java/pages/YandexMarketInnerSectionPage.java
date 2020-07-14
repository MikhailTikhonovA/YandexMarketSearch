package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static steps.BaseSteps.getWait;

public class YandexMarketInnerSectionPage {
    @FindBy(xpath = "//div[@data-tid='cb168a42']")
    WebElement innerMenu;


    public YandexMarketInnerSectionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void selectInnerCategory(String name){
        getWait().until(ExpectedConditions.visibilityOf(innerMenu.findElement(By.xpath(".//li//div//a[contains(text(),'" + name + "')]"))));
        innerMenu.findElement(By.xpath(".//li//div//a[contains(text(),'" + name + "')]")).click();
    }


}
