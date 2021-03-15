package com.facebook.tests;

import com.facebook.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

@Listeners(reports.ExtentListener.class)
public class HomePageTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    HomePage homePage  = new HomePage();


    @Test
    public void TC_01_enter_status_in_HomePage(){
        loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
        homePage.enterStatus(prop.getProperty("status"));
        Assert.assertEquals(homePage.getStatus(),prop.getProperty("status"));
    }
}
