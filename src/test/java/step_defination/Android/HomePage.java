package step_defination.Android;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Page;

import java.io.IOException;

public class HomePage extends Page {

    @Given("^\\[Home Page] App should open successfully$")
    public void successInstall() throws IOException, InterruptedException {
        System.out.println("Open vim-stage App");
    }

    @And("^\\[Home Page] User tap on Login Button$")
    public void tapOnLoginButton() throws IOException, InterruptedException {
        getHomePageAndroid().getLoginButtonAndroid().click();
        Thread.sleep(3000);
    }

    @And("^\\[Login Page] User tap on login with my email button$")
    public void tapOnLoginWithEmailButton() throws IOException, InterruptedException {
        getHomePageAndroid().getLoginButtonAndroid().click();
        Thread.sleep(3000);
    }
}