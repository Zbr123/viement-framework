package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageLawtonBrodyADLWeb {

    public PageLawtonBrodyADLWeb(Page page){
    }

    public WebElement getLawtonBrodyADLsubtabHeadings(String lawtonBrodyADLsubtabHeadingLocatorString){
        return WebConnector.driver.findElement(By.xpath(String.format("//span[contains(., '%s')]", lawtonBrodyADLsubtabHeadingLocatorString)));
    }
    public WebElement getLawtonBrodyADLOptionsRadioButtons(String radioButtonOption) {
        return WebConnector.driver.findElement(By.cssSelector(String.format("span[datatestid='%s']", radioButtonOption)));
    }
//        public WebElement getLawtonBrodyADLOptionsRadioButtons(){
//            return WebConnector.driver.findElement(By.cssSelector("[data-testid='Answers telephone but does not dial.undefined']"));
//    }
    public WebElement getLawtonBrodyADLButtons(String buttonLocatorString){
        return WebConnector.driver.findElement(By.xpath(String.format("//button[contains(., '%s')]", buttonLocatorString)));
    }
    public WebElement getLawtonBrodyADLSuccessAlerts(String successAlertsLocatorString){
        return WebConnector.driver.findElement(By.xpath(String.format("//h3[contains(., '%s')]", successAlertsLocatorString)));
    }
}