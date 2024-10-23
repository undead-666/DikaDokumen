package com.DMS.stepdefs;

import com.DMS.hooks.Hooks;
import com.DMS.pages.LogoutPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogout {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static LogoutPage logoutPage = new LogoutPage();

    public TestLogout(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Logout system
    @Given("click logout")
    public void click_logout(){
        Hooks.delay(1);
        logoutPage.clickLogout();
        extentTest.log(LogStatus.PASS, "click logout");
    }
    @Then("validate logout")
    public void validate_logout(){
        Hooks.delay(1);
        Assert.assertEquals(logoutPage.getResultLogout(),"DIKA | DOKUMEN");
        extentTest.log(LogStatus.PASS, "success logout");
    }

}
