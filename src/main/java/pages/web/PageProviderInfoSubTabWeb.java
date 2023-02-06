package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageProviderInfoSubTabWeb {

    private String providerInfoSubTabCss = "#tab-1";
    private String doctor1HeadingCss = "form>div:nth-child(1) h4";
    private String doctor1PracticeNameXpath= "/html/body/div[1]/div[1]/div/div[2]/div/div/div[4]/div/form/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div/input";
    private String doctor1FirstNameXpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[4]/div/form/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/input";
    private String doctor1LastNameXpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[4]/div/form/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/input";
    private String doctor1SpecialtyDropdownXpath = "//*[@id=\"mui-component-select-doctor[0].[speciality]\"]";
    private String doctor1SelectChiropractorCss = "ul li:nth-child(7)";
    private String doctor1ContactPhoneXpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[4]/div/form/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div[5]/div/div/input";
    private String doctor1EmailAddressXpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[4]/div/form/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div[6]/div/div/div/input";
    private String addDoctorButtonCss = "form > div:nth-child(1) button";
    private String doctor2HeadingCss = "form>div:nth-child(2) h4";

    public PageProviderInfoSubTabWeb(Page page) {
    }
    public WebElement getProviderInfoSubTab() {
        { return WebConnector.driver.findElement(By.cssSelector(providerInfoSubTabCss));}
    }
    public WebElement getDoctor1Heading() {
        { return WebConnector.driver.findElement(By.cssSelector(doctor1HeadingCss));}
    }
    public WebElement getDoctor1PracticeName() {
        { return WebConnector.driver.findElement(By.xpath(doctor1PracticeNameXpath));}
    }
    public WebElement getDoctor1FirstName() {
        { return WebConnector.driver.findElement(By.xpath(doctor1FirstNameXpath));}
    }
    public WebElement getDoctor1LastName() {
        { return WebConnector.driver.findElement(By.xpath(doctor1LastNameXpath));}
    }
    public WebElement getDoctor1SpecialtyDropdown() {
        { return WebConnector.driver.findElement(By.xpath(doctor1SpecialtyDropdownXpath));}
    }
    public WebElement getDoctor1SelectChiropractor() {
        { return WebConnector.driver.findElement(By.cssSelector(doctor1SelectChiropractorCss));}
    }
    public WebElement getDoctor1ContactPhone() {
        { return WebConnector.driver.findElement(By.xpath(doctor1ContactPhoneXpath));}
    }
    public WebElement getDoctor1EmailAddress() {
        { return WebConnector.driver.findElement(By.xpath(doctor1EmailAddressXpath));}
    }
    public WebElement getAddDoctorButton() {
        { return WebConnector.driver.findElement(By.cssSelector(addDoctorButtonCss));}
    }
    public WebElement getDoctor2Heading() {
        { return WebConnector.driver.findElement(By.cssSelector(doctor2HeadingCss));}
    }
}
