//package step_defination.Android;
//
////import core.utils.AndroidCore.AndroidDriverSetup;
////import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.android.nativekey.AndroidKey;
//import io.appium.java_client.android.nativekey.KeyEvent;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import pages.Page;
//
//import java.io.IOException;
//import java.util.List;
//
//public class HomePage extends Page {
//
//    @Given("^\\[Home Page] App should open successfully$")
//    public void successInstall() throws IOException, InterruptedException {
//        System.out.println("Open vimient App");
//        Thread.sleep(3000);
//    }
//
//    @And("^\\[Home Page] User tap on Login Button$")
//    public void tapOnLoginButton() throws IOException, InterruptedException {
//        getHomePageAndroid().getLoginButton().click();
////        Thread.sleep(3000);
//    }
//
//    @And("^\\[Home Page] User tap on Create Account Button$")
//    public void tapOnCreateAccountButton() throws IOException, InterruptedException {
//        getHomePageAndroid().getCreateButton().click();
//
//    }
//
//    @And("^\\[Health Page\\]Click the google fit app again$")
//    public void healthPageClickTheGoogleFitAppAgain() {
//    }
//    @When("^\\[Home Page\\] User tap on next button$")
//    public void homePageUserTapOnNextButton() throws InterruptedException {
//        getHomePageAndroid().getNextButton().click();
//        getBasePage().swipeUp();
//
//    }
//
//    @When("^\\[Home Page\\] User click on next button$")
//    public void clickOnNextButton() throws InterruptedException {
//        getHomePageAndroid().getNextButton().click();
//
//    }
//
//    @And("^\\[Home Page\\] User click on (.*) button$")
//    public void clickOnNext(String Next) {
//        getBasePage().patientlyScroll(Next);
//        getHomePageAndroid().getNextButton().click();
//    }
//
//
//    @When("^\\[Hom Page\\] User tap on Create Account Button$")
//    public void homPageUserTapOnCreateAccountButton() {
//        getHomePageAndroid().getCreateButton().click();
//    }
//}
//
