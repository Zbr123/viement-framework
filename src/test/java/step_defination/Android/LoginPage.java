package step_defination.Android;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Page;

import java.io.IOException;

public class LoginPage extends Page {

    @When("^\\[Login Page] User enters androidEmail (.*)$")
    public void enterAndroidEmailAddress(String email) throws InterruptedException {
        Thread.sleep(3000);
        getLoginPageAndroid().getEmailAddress().sendKeys(email);
    }

    @And("^\\[Login Page] User enters androidPasswords (.*)$")
    public void enterAndroidPassword(String password)  {
        getLoginPageAndroid().getPassword().sendKeys(password);
    }

    @And("^\\[Login Page] User clicks on Sign In button$")
    public void clickOnSigninButton()  {
        getLoginPageAndroid().getSigninButton().click();
    }

    @And("^\\[Login Page] User clicks on forgot password$")
    public void clickOnForgotPasswordButton()  {
        getLoginPageAndroid().getforgotPasswordButton().click();
    }

    @And("^\\[Login Page] App should open successfully$")
    public void test()  {
        System.out.println("App Open Successfully");
    }
}