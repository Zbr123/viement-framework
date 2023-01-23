package step_defination.Android;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.Page;

public class ForgotPasswordPage extends Page {

    @Given("^\\[Forgot Password Page] User enters androidEmail zubair.alam+56@vimient.com(.*)$")
    public void enterRecoveryAndroidEmailAddress(String recoveryEmail) throws InterruptedException {
        Thread.sleep(3000);
        getAndroidPageForgotPassword().getForgotPasswordButton().sendKeys(recoveryEmail);
    }
}