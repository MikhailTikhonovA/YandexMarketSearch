package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.Set;

import static steps.BaseSteps.getWait;
import static steps.BaseSteps.getDriver;

public class YandexMainPage {
    @FindBy(xpath = "//div[@class='home-tabs3__list']")
    WebElement mainMenu;


    public YandexMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void selectTypeMenu(String menu) {
        if (mainMenu.findElement(By.xpath(".//a[contains(text(),'" + menu + "')]")).isDisplayed()){
            mainMenu.findElement(By.xpath(".//a[contains(text(),'" + menu + "')]")).click();
        }else if (mainMenu.findElement(By.xpath(".//div[contains(text(),'" + menu + "')]]")).isDisplayed()){
            mainMenu.findElement(By.xpath(".//div[contains(text(),'" + menu + "')]]")).click();
        }
    }

    public void changeFocusOnOpenPage(){
        String currentHandle = getDriver().getWindowHandle();
        getWait().until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> allHandles = getDriver().getWindowHandles();
        for (String handle : allHandles) {
            if (!handle.equals(currentHandle)) getDriver().switchTo().window(handle);
        }
    }


}
