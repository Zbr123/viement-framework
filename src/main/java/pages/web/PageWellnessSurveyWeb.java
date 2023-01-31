package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageWellnessSurveyWeb {

    private String mainWellnessCheckInSurveyHeadingXpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[1]/h3";
    private String firstC1RadioButtonXpath = "//*[@id=\"root\"]/div[1]/div/div[2]/form/div[1]/div[2]/div/div[2]/label/span/input";
    private String secondC1RadioButtonXpath = "//*[@id=\"root\"]/div[1]/div/div[2]/form/div[2]/div[2]/div/div[2]/label/span/input";
    private String thirdC1RadioButtonXpath = "//*[@id=\"root\"]/div[1]/div/div[2]/form/div[3]/div[2]/div/div[2]/label/span/input";
    private String fourthC1RadioButtonXpath = "//*[@id=\"root\"]/div[1]/div/div[2]/form/div[4]/div[2]/div/div[2]/label/span/input";
    private String fifthC1RadioButtonXpath = "//*[@id=\"root\"]/div[1]/div/div[2]/form/div[5]/div[2]/div/div[2]/label/span/input";
    private String sixthC1RadioButtonXpath = "//*[@id=\"root\"]/div[1]/div/div[2]/form/div[6]/div[2]/div/div[2]/label/span/input";
    private String seventhC1RadioButtonXpath = "//*[@id=\"root\"]/div[1]/div/div[2]/form/div[7]/div[2]/div/div[2]/label/span/input";
    private String wellnessSurveyResetButtonCss = "form div:nth-child(8) button:nth-child(1)";
    private String wellnessSurveySaveButtonCss = "form div:nth-child(8) button:nth-child(2)";
    private String wellnessSurveySubmitButtonCss = "form div:nth-child(8) button:nth-child(3)";
    private String wellnessSurveyLimitReachedPopupCss = "div h2";
    private String wellnessSurveyLimitReachedPopupOkayButtonXpath = "/html/body/div[2]/div[3]/div/div[3]/button";

    public PageWellnessSurveyWeb(Page page) {
    }
    public WebElement getWellnessSurveyPageMainHeading() {
        { return WebConnector.driver.findElement(By.xpath(mainWellnessCheckInSurveyHeadingXpath));}
    }
    public WebElement getFirstC1RadioButton() {
        { return WebConnector.driver.findElement(By.xpath(firstC1RadioButtonXpath));}
    }
    public WebElement getSecondC1RadioButton() {
        { return WebConnector.driver.findElement(By.xpath(secondC1RadioButtonXpath));}
    }
    public WebElement getThirdC1RadioButton() {
        { return WebConnector.driver.findElement(By.xpath(thirdC1RadioButtonXpath));}
    }
    public WebElement getFourthC1RadioButton() {
        { return WebConnector.driver.findElement(By.xpath(fourthC1RadioButtonXpath));}
    }
    public WebElement getFifthC1RadioButton() {
        { return WebConnector.driver.findElement(By.xpath(fifthC1RadioButtonXpath));}
    }
    public WebElement getSixthC1RadioButton() {
        { return WebConnector.driver.findElement(By.xpath(sixthC1RadioButtonXpath));}
    }
    public WebElement getSeventhC1RadioButton() {
        { return WebConnector.driver.findElement(By.xpath(seventhC1RadioButtonXpath));}
    }
    public WebElement getWellnessSurveyResetButton() {
        { return WebConnector.driver.findElement(By.cssSelector(wellnessSurveyResetButtonCss));}
    }
    public WebElement getWellnessSurveySaveButton() {
        { return WebConnector.driver.findElement(By.cssSelector(wellnessSurveySaveButtonCss));}
    }
    public WebElement getWellnessSurveyLimitReachedAlertPopup() {
        { return WebConnector.driver.findElement(By.cssSelector(wellnessSurveySaveButtonCss));}
    }
    public WebElement getWellnessSurveyAlertPopupOkayButton() {
        { return WebConnector.driver.findElement(By.xpath(wellnessSurveyLimitReachedPopupOkayButtonXpath));}
    }
    public WebElement getWellnessSurveySubmitButton() {
        { return WebConnector.driver.findElement(By.cssSelector(wellnessSurveySubmitButtonCss));}
    }
}
