package pages;

import core.utils.ConfigUtil;
import pages.android.*;
import pages.web.PageLoginWeb;

import java.util.Properties;

public class Page {

    public static Properties myProp = ConfigUtil.getConfig("config");
    public static Properties androidconfig = ConfigUtil.getConfig("androidconfig");


    // Web
    private final PageLoginWeb pageLoginWeb = new PageLoginWeb(this);
    protected PageLoginWeb getLoginPage() {return pageLoginWeb;}

    //Android
//    private final HomePage pageHomeAndroid = new HomePage(this);
//    protected HomePage getHomePageAndroid() {return pageHomeAndroid;}


//    BasePage basePage = new BasePage(this);
//    protected BasePage getBasePage() { return basePage; }
}
