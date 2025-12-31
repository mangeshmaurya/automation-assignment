package com.ui.tests;
 import com.constant.Browser;
 import com.ui.pages.HomePage;
 import com.ui.pages.LoginPage;
 import com.utility.BrowserUtility;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.chrome.ChromeDriver;

 import static com.constant.Browser.CHROME;

public class LoginTest {

    public static void main(String[] args){

        System.out.println("Test");
        //WebDriver driver = new ChromeDriver();
//        HomePage homePage = new HomePage(CHROME);
//        //LoginPage loginPage = homePage.goToLoginPage();
//        //String userName = loginPage.doLoginWith("pagox18485@haotuwu.com","Welcome123").getUserName();
//        String userName = homePage.goToLoginPage().doLoginWith("pagox18485@haotuwu.com","Welcome123").getUserName();
//        System.out.println(userName);
//        WebDriver wd = new ChromeDriver(); //browser session created
//        //wd.get("http://www.automationpractice.pl/");
//        BrowserUtility browserUtility = new BrowserUtility(wd);
//        browserUtility.goToWebsite("http://www.automationpractice.pl/");
//        //wd.manage().window().maximize();
//        browserUtility.maximizeWindow();
//
//        By signInLinkedLocator = By.xpath("//a[contains(text(),'Sign in')]");
////        WebElement signInLinkWebElement = wd.findElement(signInLinkedLocator);
////        signInLinkWebElement.click();
//        browserUtility.clickOn(signInLinkedLocator);
//
//        By emailTextBoxLocator = By.id("email");
////        WebElement emailTextBoxWebElement = wd.findElement(emailTextBoxLocator);
////        emailTextBoxWebElement.sendKeys("pagox18485@haotuwu.com");
//        browserUtility.enterText(emailTextBoxLocator,"pagox18485@haotuwu.com");
//
//        By passwordTextBoxLocator = By.id("passwd");
////        WebElement passwordTextBoxWebElement = wd.findElement(passwordTextBoxLocator);
////        passwordTextBoxWebElement.sendKeys("Welcome1234");
//        browserUtility.enterText(passwordTextBoxLocator,"wwwwww");
//
//        By submitLoginLocator = By.id("SubmitLogin");
////        WebElement submitLoginButtonWebElement = wd.findElement(submitLoginLocator);
////        submitLoginButtonWebElement.click();
//        browserUtility.clickOn(submitLoginLocator);

    }
}
