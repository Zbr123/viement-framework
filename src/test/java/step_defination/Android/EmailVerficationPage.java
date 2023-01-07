package step_defination.Android;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Page;

import java.io.IOException;

public class EmailVerficationPage extends Page {

    @And("^\\[EmailVerificationPage] User tap on Next button$")
    public void getNextButtonEmailVerification() throws IOException, InterruptedException {
        //getEmailVerificationPage().getNextButton().click();
    }
}