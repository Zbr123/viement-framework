//package step_defination.web;
//
//import core.utils.AndroidCore.Initializer;
//import core.utils.BrowerConfig.WebConnector;
//import io.appium.java_client.remote.MobileCapabilityType;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.When;
//import pages.Page;
//import java.io.IOException;
//
//import static core.utils.AndroidCore.AndroidDriverSetup.androidDriver;
//import static core.utils.AppiumHook.emulatorRunner.AppiumServerRunner.StartAppiumServer;
//import static core.utils.BrowerConfig.WebConnector.driver;
//import static io.appium.java_client.remote.MobileCapabilityType.APP;
//import static step_defination.Android.AndroidSetup.PORT;
//
//public class MainPage extends Page {
//
////    @Before("@Web")
////    public void startTest() throws Exception {
////        if (myProp.getProperty("platformname").toString().equals("Web")) {
////            WebConnector connector = new WebConnector();
////            driver = connector.openBrowser();
////            driver.get(myProp.getProperty("weburl"));
////            driver.manage().window().maximize();
////        }
////    }
//
//    @Before("@initial")
//    public void startTestAndroid() throws Exception {
//        if (myProp.getProperty("platformname").toString().equals("Android")) {
//            PORT = myProp.getProperty("appiumport");
//            APP = androidconfig.getProperty("androidapk");
//            StartAppiumServer(PORT, APP);
//            androidDriver(PORT, APP);
//        }
//    }
//
//    @After("@Web")
//    public void afterTest() {
//        if (myProp.getProperty("platformname").toString().equals("Web")) {
//            if (driver != null) {
//                driver.quit();
//            }
//        }
//    }
//
//    @After("@final")
//    public void afterTestAndroid() {
//        if (myProp.getProperty("platformname").toString().equals("Android")) {
//            //quitAndroidDriver();
//        }
//    }
//
//    public void iOSDriver() {
//    }
//
//    @When("^\\[Splash screen] Push app in the background")
//    public void putAppInBackground() throws IOException {
//        Initializer.moveAppInBackground(); //moveAppInBackgroundFor10sec
//    }
//
//    @When("[Splash screen] Push {string} app in the foreground")
//    public static void moveAppInForegrounds(String appName) throws InterruptedException {
//    }
//
//    @When("[Main Page] User go the web portal and navigate to the login page")
//    public static void webBrowser() {
//        System.out.println("Vimient Web Page");
//    }
//}
