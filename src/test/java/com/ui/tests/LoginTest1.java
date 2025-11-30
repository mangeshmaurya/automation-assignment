package com.ui.tests;

import com.ui.dataProvider.User;
import com.ui.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.constant.Browser.CHROME;

public class LoginTest1 {

    HomePage homePage;

    @BeforeMethod(description = "load home page")
    public void setup(){
        homePage = new HomePage(CHROME);
    }

    @Test(description = "Verifies with valid user", groups = {"e2e","sanity"}, dataProviderClass = com.ui.dataProvider.LoginDataProvider.class,dataProvider = "LoginTestDataProvider")
    public void loginTest(User user){
        String userName = homePage.goToLoginPage().doLoginWith(user.getEmailAddress(),user.getPassword()).getUserName();
        Assert.assertEquals(userName,"Champak Demo");
        System.out.println(userName);
    }

    @Test(description = "Drag and Drop", priority=1)
    public void dragDrop(){
        driver.get("https://demo.guru99.com/test/drag_drop.html");

        //Element which needs to drag.
        WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));

        //Element on which need to drop.
        WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));

        //Using Action class for drag and drop.
        Actions act=new Actions(driver);

        //Dragged and dropped.
        act.dragAndDrop(From, To).build().perform();
    }
}
