package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageKatzADLWeb {

    public PageKatzADLWeb(Page page){
    }

    public WebElement getKatzADLHeadings(String headingsLocatorString){
        return WebConnector.driver.findElement(By.xpath(String.format("//span[contains(., '%s')]", headingsLocatorString)));
    }
    public WebElement getKatzADLOptionsRadioButtons(String radioButtonsLocatorString){
        return WebConnector.driver.findElement(By.cssSelector(String.format("span[datatestid='%s']", radioButtonsLocatorString)));
    }
    public WebElement getKatzADLButtons(String buttonsLocatorString){
        return WebConnector.driver.findElement(By.xpath(String.format("//button[contains(., '%s')]", buttonsLocatorString)));
    }
    public WebElement getKatzADLSuccessAlert(String successAlertLocatorString){
        return WebConnector.driver.findElement(By.xpath(String.format("//h3[contains(., '%s')]", successAlertLocatorString)));
    }
}