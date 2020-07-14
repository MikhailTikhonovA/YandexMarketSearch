package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static steps.BaseSteps.getDriver;
import static steps.BaseSteps.getWait;

public class YandexMarketCategoryPage {

    String titleByName;
    String titleByNumber;

    List<WebElement> resultCounting;
    List<WebElement> resultList;


    @FindBy(xpath = "//aside[@class='sidebar']")
    WebElement sideBar;


    @FindBy(xpath = "//article[@data-autotest-id='product-snippet']")
    WebElement resultItem;

    @FindBy(xpath = "//div[@class='_2zPWBCw2Ic']")
    WebElement searchTab;


    public YandexMarketCategoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void pushButtonAllFilters() {
        getWait().until(ExpectedConditions.visibilityOf(sideBar.findElement(By.xpath(".//a//span[contains(text(),'Все фильтры')]"))));
        sideBar.findElement(By.xpath(".//a//span[contains(text(),'Все фильтры')]")).click();
    }


    public void countAllElementsOnPage(int count) {
        resultCounting = getDriver().findElements(By.xpath(".//article[@data-autotest-id='product-snippet']"));
        int xpathCount = resultCounting.size();
        Assert.assertEquals(count, xpathCount);
    }

    public void saveTitleAndElementNumElementOfList(int num) {
        resultCounting = getDriver().findElements(By.xpath(".//article[@data-autotest-id='product-snippet']"));
        titleByNumber = resultCounting.get(num).findElement(By.xpath(".//div[1]//h3[@data-zone-name='title']")).getText();
    }


    public void searchItemByName(int num) {
        getWait().until(ExpectedConditions.visibilityOf(searchTab.findElement(By.xpath(".//input[@id='header-search']"))));
        searchTab.findElement(By.xpath(".//input[@id='header-search']")).click();
        searchTab.findElement(By.xpath(".//input[@id='header-search']")).sendKeys(titleByNumber);
        searchTab.findElement(By.xpath(".//button[@class='_1XiEJDPVpk']")).click();
        resultList = getDriver().findElements(By.xpath(".//article[@data-autotest-id='product-snippet']"));
        titleByName = resultList.get(num).findElement(By.xpath(".//div[1]//h3[@data-zone-name='title']")).getText();
        Assert.assertEquals(titleByNumber, titleByName);
    }


}
