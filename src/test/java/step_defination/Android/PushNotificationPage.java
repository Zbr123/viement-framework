package step_defination.Android;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Page;

public class PushNotificationPage extends Page {

    @Given("^\\[Push Notification Page] User tap on continue Button$")
    public void tapOnContinueButton()  {
        //getPushNotificationPage().getContinueButton().click();
    }

}