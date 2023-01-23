package step_defination.web;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class LoginPage extends Page {
    @When("^\\[Web Login Page\\] User enters email address (.*)$")
    public void enterEmailAddress(String email) {
        getPageLoginWeb().getEmail().sendKeys(email);
    }

    @When("\\[Web Login Page\\] User enters password (.*)$")
    public void enterPassword(String password) {
        getPageLoginWeb().getPassword().sendKeys(password);
    }

    @When("[Web Login Page] User clicks on login button")
    public void clickOnLoginButton() {
        getPageLoginWeb().getLoginButton().click();
    }
    @When("[Web Login Page] User clicks on forgot your password")
    public void clickOnForgotPassword() {
        getPageLoginWeb().getForgotPassword().click();
    }


}
