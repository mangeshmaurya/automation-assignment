package com.ui.pages;

import com.constant.Browser;
import com.constant.Env;
import com.ui.pojo.JSONUtility;
import com.utility.BrowserUtility;
import com.utility.ProprtiesUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.constant.Env.QA;


public class HomePage extends BrowserUtility {

   private static final By SIGN_IN_LINK_LOCATOR = By.xpath("//a[contains(text(),'Sign in')]");

    public HomePage(Browser browserName) {
        super(browserName);
        //goToWebsite(ProprtiesUtil.readProperty(Env.QA,"URL"));
        goToWebsite(JSONUtility.readJSON(Env.QA));
    }

    public LoginPage goToLoginPage(){
       clickOn(SIGN_IN_LINK_LOCATOR);
       LoginPage loginPage = new LoginPage(getDriver());
       return loginPage;
   }

}
