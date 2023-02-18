package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageMedicalInfoSubTabWeb {

    private String medicalHistoryHeadingCss = "form>div:nth-child(2) h4";

    public PageMedicalInfoSubTabWeb(Page page) {
    }
    public WebElement getMedicalHistoryHeading() {
        { return WebConnector.driver.findElement(By.cssSelector(medicalHistoryHeadingCss));}
    }
    public WebElement getMedicalInfoDropdowns(String medicalInfoPageDropdowns) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//div[contains(@id, '%s')]", medicalInfoPageDropdowns)));}
    }
    public WebElement getMedicalInfoDropdownOptions(String medicalInfoPageDropdownOptions) {
        {return WebConnector.driver.findElement(By.xpath(String.format("//li[contains(., '%s')]", medicalInfoPageDropdownOptions)));}
    }
}