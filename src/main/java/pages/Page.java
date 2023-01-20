package pages;

import core.utils.ConfigUtil;
import pages.android.*;
import pages.web.*;

import java.util.Properties;

public class Page {

    public static Properties myProp = ConfigUtil.getConfig("config");
    public static Properties androidconfig = ConfigUtil.getConfig("androidconfig");


//     Web
    private final PageLoginWeb pageLoginWeb = new PageLoginWeb(this);
    protected PageLoginWeb getLoginPage() {
        return pageLoginWeb;
   }

    private final PageAdminWeb getPageAdmin = new PageAdminWeb(this);

    protected PageAdminWeb getPageAdmin() {
        return getPageAdmin;
    }

    private final PageHomeWeb getPageHome = new PageHomeWeb(this);

    protected PageHomeWeb getPageHome() {
        return getPageHome;
    }

    private final PageAddSeniorWeb getPageAddSenior = new PageAddSeniorWeb(this);
    protected PageAddSeniorWeb getPageAddSenior() {
        return getPageAddSenior;
    }


    private final PageForgotPasswordWeb getPageForgotPassword = new PageForgotPasswordWeb(this);
    protected PageForgotPasswordWeb getPageForgotPassword() { return getPageForgotPassword; }

    //Android

    private final LoginPage pageLoginAndroid = new LoginPage(this);
    protected LoginPage getLoginPageAndroid() {return pageLoginAndroid;}

    private final WelcomePage pageWelcomeAndroid = new WelcomePage(this);
    protected WelcomePage getPageWelcomeAndroid() {return pageWelcomeAndroid;}

    private final HomePage pageHomeAndroid = new HomePage(this);
    protected HomePage getPageHomeAndroid() {return pageHomeAndroid;}


}
