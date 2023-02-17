package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageProviderInfoSubTabWeb {

    private String providerInfoSubTabCss = "#tab-1";
    private String doctor1HeadingCss = "form>div:nth-child(1) h4";
    private String dentist1HeadingCss = "form>div:nth-child(2) h4";
    private String doctor1PracticeNameXpath= "/html/body/div[1]/div[1]/div/div[2]/div/div/div[4]/div/form/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div/input";
    private String doctor1FirstNameXpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[4]/div/form/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/input";
    private String doctor1LastNameXpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[4]/div/form/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/input";
    private String doctor1SpecialtyDropdownXpath = "//*[@id=\"mui-component-select-doctor[0].[speciality]\"]";
    private String doctor1SelectChiropractorCss = "ul li:nth-child(7)";
    private String doctor1ContactPhoneXpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[4]/div/form/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div[5]/div/div/input";
    private String doctor1EmailAddressXpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[4]/div/form/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div[6]/div/div/div/input";
    private String addDoctorButtonCss = "form > div:nth-child(1) button";
    private String doctor2HeadingCss = "form>div:nth-child(2) h4";
    private String dentist1PracticeNameXpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[4]/div/form/div[2]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div/input";
    private String dentist1FirstNameXpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[4]/div/form/div[2]/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/input";
    private String dentistLastNameXpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[4]/div/form/div[2]/div[1]/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/input";
    private String dentist1SpecialtyDropdownXpath = "//*[@id=\"mui-component-select-dentist[0].[speciality]\"]";
    private String dentist1SelectEndodontistCss = "ul li:nth-child(3)";
    private String dentist1ContactPhoneXpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[4]/div/form/div[2]/div[1]/div/div[2]/div/div/div/div/div/div/div[5]/div/div/input";
    private String dentist1EmailAddressXpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[4]/div/form/div[2]/div[1]/div/div[2]/div/div/div/div/div/div/div[6]/div/div/div/input";
    private String addDentistButtonCss = "form > div:nth-child(1) button";
    private String dentist2HeadingCss = "form > div:nth-child(2) h4";
    private String saveButtonCss = "form > div:nth-child(3) > button:nth-child(2)";
    private String providerInfoSavedSuccessfullyAlertXpath = "//*[@id=\"root\"]/div[1]";
    public PageProviderInfoSubTabWeb(Page page) {
    }
    public WebElement getProviderInfoSubTab() {
        { return WebConnector.driver.findElement(By.cssSelector(providerInfoSubTabCss));}
    }
    public WebElement getDoctor1Heading() {
        { return WebConnector.driver.findElement(By.cssSelector(doctor1HeadingCss));}
    }
    public WebElement getDentist1Heading() {
        { return WebConnector.driver.findElement(By.cssSelector(dentist1HeadingCss));}
    }
    public WebElement getDoctor1PracticeName(String doctorPracticeNameLocator) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("input[name='%s']", doctorPracticeNameLocator)));} //doctor[0].[provider_name]
    }
    public WebElement getDoctor1FirstName(String doctorFirstNameLocator) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("input[name='%s']", doctorFirstNameLocator)));}
    }
    public WebElement getDoctor1LastName(String doctorLastNameLocator) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("input[name='%s']", doctorLastNameLocator)));}
    }
    public WebElement getDoctor1SpecialtyDropdown(String doctorSpecialityDropdownLocator) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("//div[contains(@id, 'mui-component-select-doctor[0].[speciality]')]", doctorSpecialityDropdownLocator)));}
    }
    public WebElement getDoctor1SelectSpeciality(String doctorSpeciality) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("li[data-value='%s']", doctorSpeciality)));}
    }
    public WebElement getDoctor1ContactPhone(String doctorContactLocator) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("input[name='%s']", doctorContactLocator)));}
    }
    public WebElement getDoctor1EmailAddress(String doctorEmailAddressLocator) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("input[name='%s']", doctorEmailAddressLocator)));}
    }
    public WebElement getAddDoctorButton(String addDoctor) {
        { return WebConnector.driver.findElement(By.xpath(String.format("//button[contains(.,'%s')", addDoctor)));}
    }
    public WebElement getDoctor2Heading() {
        { return WebConnector.driver.findElement(By.cssSelector(doctor2HeadingCss));}
    }
    public WebElement getDentist1PracticeName(String dentistPracticeNameLocator) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("input[name='%s']", dentistPracticeNameLocator)));}
    }
    public WebElement getDentist1FirstName(String dentistFirstNameLocator) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("input[name='%s']", dentistFirstNameLocator)));}
    }
    public WebElement getDentist1LastName(String dentistLastNameLocator) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("input[name='%s']", dentistLastNameLocator)));}
    }
    public WebElement getDentist1SpecialtyDropdown(String dentistSpecialityDropdownLocator) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("input[name='%s']", dentistSpecialityDropdownLocator)));}
    }
    public WebElement getDentist1Endodontist(String dentistSpeciality) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("li[data-value='%s']", dentistSpeciality)));}
    }
    public WebElement getDentist1ContactPhone(String dentistContactLocator) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("input[name='%s']", dentistContactLocator)));}
    }
    public WebElement getDentist1EmailAddress(String dentistEmailAddressLocator) {
        { return WebConnector.driver.findElement(By.cssSelector(String.format("input[name='%s']", dentistEmailAddressLocator)));}
    }
    public WebElement getAddDentistButton() {
        { return WebConnector.driver.findElement(By.cssSelector(addDentistButtonCss));}
    }
    public WebElement getDentist2Heading() {
        { return WebConnector.driver.findElement(By.cssSelector(dentist2HeadingCss));}
    }
    public WebElement getProviderInfoSaveButton(String providerInfoSaveButton) {
        { return WebConnector.driver.findElement(By.xpath(String.format("//button[contains(., '%s')", providerInfoSaveButton)));}
    }
    public WebElement getSavedSuccessfullyAlert(String providerInfoSavedSuccessfullyAlert) {
        { return WebConnector.driver.findElement(By.xpath(String.format("//div[contains(@class, 'MuiPaper-root')and contains(., '%s')]", providerInfoSavedSuccessfullyAlert)));}
    }
}