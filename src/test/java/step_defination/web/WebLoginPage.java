package step_defination.web;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebLoginPage extends Page {
    @When("^\\[Web Login Page\\] User enters email address (.*)$")
    public void enterEmailAddress(String email) {
        getPageLoginWeb().getEmail().sendKeys(email);
    }

    @When("\\[Web Login Page\\] User enters password (.*)$")
    public void enterPassword(String password) throws InterruptedException {
        Thread.sleep(1000);
        getPageLoginWeb().getPassword().sendKeys(password);
    }

    @When("[Web Login Page] User clicks on login button")
    public void clickOnLoginButton() throws InterruptedException {
        Thread.sleep(1000);
        getPageLoginWeb().getLoginButton().click();
    }
    @When("[Web Login Page] User clicks on forgot your password")
    public void clickOnForgotPassword() throws InterruptedException {
        Thread.sleep(1000);
        getPageLoginWeb().getForgotPassword().click();
    }
    @Then("^\\[Web Login Page] User should see user logged out success alert$")
    public void userSeesUserLoggedOutSuccessAlert()throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(getPageLoginWeb().getUserLoggedOutSuccessAlert().isDisplayed());
    }


}
