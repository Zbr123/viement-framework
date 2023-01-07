package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageMainWeb {


    private String Contact_creditbook_CSS = "div > .elementor-hidden-phone.elementor-widget-button > div > div > a" ;
    private String Name_Id = "form-field-name";
    private String Email_Id = "form-field-email";
    private String Phone_Id ="form-field-field_1";
    private String Notes_Id ="form-field-message";

    public PageMainWeb(Page page) {
    }

    public WebElement getContactcreditbook() { return  WebConnector.driver.findElement(By.cssSelector(Contact_creditbook_CSS));
    }

    public WebElement getName() { return  WebConnector.driver.findElement(By.id(Name_Id)); }

    public WebElement getEmail() { return  WebConnector.driver.findElement(By.id(Email_Id)); }

    public WebElement getPhoneNum() { return  WebConnector.driver.findElement(By.id(Phone_Id)); }

    public WebElement getNotes() { return  WebConnector.driver.findElement(By.id(Notes_Id)); }

}
