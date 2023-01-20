package step_defination.web;
import io.cucumber.java.en.When;
import pages.Page;

public class ForgotPasswordPage extends Page {
    @When("^\\[Forgot Password Page\\] User enters recovery email address(.*)$")
    public void enterRecoveryEmailAddress(String recoveryEmail) {
        getPageForgotPassword().getEnterRecoveryEmail().sendKeys(recoveryEmail);
    }

    @When("[Forgot Password Page] User clicks on reset password button")
    public void clickOnResetPasswordButton() {
        getPageForgotPassword().getResetPasswordButton().click();
    }
}
