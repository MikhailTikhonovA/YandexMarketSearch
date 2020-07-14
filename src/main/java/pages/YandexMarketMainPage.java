package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexMarketMainPage {
    @FindBy(xpath = "//div[@class='_381y5orjSo _21NjfY1k45']")
    WebElement fastCatalog;


    public YandexMarketMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectTypeMenu(String menu) {
        fastCatalog.findElement
                (By.xpath(".//a[@class='_3Lwc_UVFq4']//span[contains(text(),'" + menu + "')]")).click();
    }





}
