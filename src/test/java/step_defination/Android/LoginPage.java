package step_defination.Android;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Page;

import java.io.IOException;

public class LoginPage extends Page {

    @And("^\\[Login Page] User tap on login with my email button$")
    public void tapOnLoginWithMyEmail()  {
        //getLoginPageAndroid().getLoginWithEmail().click();
    }


    @And("^\\[Login Page] users tap on login with SSO$")
    public void tapOnLoginWithSSO() throws IOException, InterruptedException {
  //      getLoginPageAndroid().getLoginWithSSO().click();
    }

    @And("^\\[Login Page] User enters email address$")
    public void enterEmailAddress() throws IOException, InterruptedException {
     //   getLoginPageAndroid().getEmailField().sendKeys("d@d.com");
    }


    @And("^\\[Login Page] User tap on Login Button$")
    public void tapOnNextButton() throws IOException, InterruptedException {
       // getLoginPageAndroid().getLoginButton().click();
//        Thread.sleep(5000);

    }

    @And("^\\[Login Page\\] User enters email address (.*)$")
    public void loginPageUserEntersEmailAddress(String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //System.out.println("iski esy tesi");
        //System.out.println(Math.random());
        //getLoginPageAndroid().getEmailField().sendKeys(Math.random()+email);
      //  getLoginPageAndroid().getEmailField().sendKeys(email);
    }
}