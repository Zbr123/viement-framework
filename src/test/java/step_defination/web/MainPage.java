package step_defination.web;

//import core.utils.AndroidCore.AndroidDriverSetup;
import core.utils.AndroidCore.Initializer;
import core.utils.BrowerConfig.WebConnector;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Page;
import java.io.IOException;

import static core.utils.BrowerConfig.WebConnector.driver;

public class MainPage extends Page {

    @Before("@Web")
    public void startTest() throws Exception {
        if (myProp.getProperty("platformname").toString().equals("Web")) {
            WebConnector connector = new WebConnector();
            driver = connector.openBrowser();
            driver.get(myProp.getProperty("weburl"));
            driver.manage().window().maximize();
        }
    }

    @Before("@initial")
    public void startTestAndroid() throws Exception {
        if (myProp.getProperty("platformname").toString().equals("Android")) {
//            PORT = myProp.getProperty("appiumport");
//            APP= androidconfig.getProperty("androidapk");
//            StartAppiumServer(PORT, APP);
//            androidDriver(PORT, APP);
        }
    }

    @Before("@partner")
    public void startTestPartnerApp() throws Exception {
        if (myProp.getProperty("platformname").toString().equals("Android")) {
//            PORT = myProp.getProperty("appiumport");
//            APP = androidconfig.getProperty("partnerapk");
//            StartAppiumServer(PORT, APP);
//            androidDriver(PORT, APP);
        }
    }

    @Before("@multiple-apps")
    public void startTestAndroidMultipleApps() throws Exception {
        if (myProp.getProperty("platformname").toString().equals("Android")) {
//            PORT2 = myProp.getProperty("appiumport2");
//            APP2 = androidconfig.getProperty("partnerapk");
//            StartAppiumServer(PORT2, APP2);
//            androidDriver(PORT2, APP2);
        }
    }


    @After("@Web")
    public void afterTest() {
        if (myProp.getProperty("platformname").toString().equals("Web")) {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    @After("@final")
    public void afterTestAndroid() {
        if (myProp.getProperty("platformname").toString().equals("Android")) {
            //quitAndroidDriver();
        }
    }

    public void iOSDriver() {
    }


    @Given("^\\[Main Page] Navigate to the vimient home page$")
    public void  openWebUrl() {
        String webUrl = myProp.getProperty("weburl");
        //driver.get(webUrl);
        //driver.manage().window().maximize();
    }



    @And("^\\[Main Page] Form fields are filled$")
    public void fillContactForm() throws InterruptedException {
    }

    @When("^\\[Splash screen] Push app in the background")
    public void putAppInBackground() throws IOException {

        Initializer.moveAppInBackground(); //moveAppInBackgroundFor10sec
    }

    @When("[Splash screen] Push {string} app in the foreground")
    public static void moveAppInForegrounds(String appName) throws InterruptedException {
    }

    @When("[Main Page] User goes to the web portal and navigate to the login page")
    public static void webBrowser() {
        System.out.println("Vimient Web Page");
    }
}
