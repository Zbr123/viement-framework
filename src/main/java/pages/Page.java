package pages;

import core.utils.ConfigUtil;
import pages.android.*;
import pages.web.PageAdminWeb;
import pages.web.PageHomeWeb;
import pages.web.PageLoginWeb;

import java.util.Properties;

public class Page {

    public static Properties myProp = ConfigUtil.getConfig("config");
    public static Properties androidconfig = ConfigUtil.getConfig("androidconfig");


    // Web
    private final PageLoginWeb pageLoginWeb = new PageLoginWeb(this);

    protected PageLoginWeb getLoginPage() {
        return pageLoginWeb;
    }

    private final PageAdminWeb getAdminPage = new PageAdminWeb(this);

    protected PageAdminWeb getAdminPage() {
        return getAdminPage;
    }

    private final PageHomeWeb getHomePage = new PageHomeWeb(this);

    protected PageHomeWeb getHomePage() {
        return getHomePage;
    }
}
