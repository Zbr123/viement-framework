package step_defination.web;
import io.cucumber.java.en.When;
import pages.Page;

public class LoginPage extends Page {
    @When("^\\[Web Login Page\\] User enters email address (.*)$")
    public void enterEmailAddress(String email) {
        getLoginPage().getEmail().sendKeys(email);
    }

    @When("\\[Web Login Page\\] User enters password (.*)$")
    public void enterPassword(String password) {
        getLoginPage().getPassword().sendKeys(password);
    }

    @When("[Web Login Page] User click on login button")
    public void clickOnLoginButton() throws InterruptedException {
        getLoginPage().getLoginButton().click();
        Thread.sleep(3000);
    }
}
