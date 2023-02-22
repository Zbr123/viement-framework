package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageWellnessSurveyWeb {

    private String mainWellnessCheckInSurveyHeadingXpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[1]/h3";
    private String wellnessSurveyResetButtonCss = "form div:nth-child(8) button:nth-child(1)";
    private String wellnessSurveySaveButtonCss = "form div:nth-child(8) button:nth-child(2)";
    private String wellnessSurveySubmitButtonCss = "form div:nth-child(8) button:nth-child(3)";
    private String wellnessSurveyLimitReachedPopupCss = "div h2";
    private String wellnessSurveyLimitReachedPopupOkayButtonXpath = "/html/body/div[2]/div[3]/div/div[3]/button";

    public PageWellnessSurveyWeb(Page page) {
    }

    public WebElement getWellnessSurveyPageMainHeading(String wellnessSurveyPageH3HeadingsLocatorString) {
        {
            return WebConnector.driver.findElement(By.xpath(String.format("//h3[contains(., '%s')]", wellnessSurveyPageH3HeadingsLocatorString)));
        }
    }

    public WebElement getWellnessSurveyResetButton() {
        {
            return WebConnector.driver.findElement(By.cssSelector(wellnessSurveyResetButtonCss));
        }
    }

    public WebElement getWellnessSurveySaveButton() {
        {
            return WebConnector.driver.findElement(By.cssSelector(wellnessSurveySaveButtonCss));
        }
    }

    public WebElement getWellnessSurveyLimitReachedAlertPopup() {
        {
            return WebConnector.driver.findElement(By.cssSelector(wellnessSurveyLimitReachedPopupCss));
        }
    }

    public WebElement getWellnessSurveyAlertPopupOkayButton() {
        {
            return WebConnector.driver.findElement(By.xpath(wellnessSurveyLimitReachedPopupOkayButtonXpath));
        }
    }

    public WebElement getWellnessSurveySubmitButton() {
        {
            return WebConnector.driver.findElement(By.cssSelector(wellnessSurveySubmitButtonCss));
        }
    }

    public WebElement getRadioButtonLocator(String ButtonName) {
        {
            return WebConnector.driver.findElement(By.cssSelector(String.format("input[value='%s']",ButtonName)));
        }
    }
}


