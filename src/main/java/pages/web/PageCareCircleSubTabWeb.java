package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageCareCircleSubTabWeb {

    public PageCareCircleSubTabWeb(Page page){

    }

    public WebElement getCareCircleHeadings(String careCirclePageHeadings) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//h4[contains(., '%s')]", careCirclePageHeadings)));}
    }
    public WebElement getCareCircleTextboxInputs(String careCircleTextboxInputLocator) {
        {return WebConnector.driver.findElement(By.cssSelector(String.format("input[id='%s']", careCircleTextboxInputLocator)));}
    }
    public WebElement getCareCircleDropdowns(String careCircleDropdownLocator) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//div[contains(@id, '%s')]", careCircleDropdownLocator)));}
    }
    public WebElement getCareCircleDropdownOptions(String careCircleDropdownOptionLocator) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//li[contains(., '%s')]", careCircleDropdownOptionLocator)));}
    }
    public WebElement getSavedSuccessfullyAlert(String medicalInfoSavedSuccessfullyAlert) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//div[contains(@class, '%s')]", medicalInfoSavedSuccessfullyAlert)));}
    }
}