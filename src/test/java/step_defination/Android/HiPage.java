package step_defination.Android;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.Page;

import java.io.IOException;


public class HiPage extends Page {

    @When("^\\[Hi Page] User enter the company code (.*)")
    public void thisTestFuntion(String companyCode) throws InterruptedException {
//        Thread.sleep(3000);
        //getHiPageAndroid().getCompanyCode().sendKeys(companyCode);
    }

}