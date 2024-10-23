package com.DMS.stepdefs;

import com.DMS.hooks.Hooks;
import com.DMS.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.DMS.utils.Constants;

public class TestLogin {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static LoginPage loginPage = new LoginPage();

    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Login failed wrong usernmae
    @Given("access url")
    public void access_url(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "Akses Url");
    }
    @When("input wrong username")
    public void input_wrong_username(){
        Hooks.delay(1);
        loginPage.setFieldUsername("aku");
        extentTest.log(LogStatus.PASS, "input wrong username");
    }
    @When("input password")
    public void input_password(){
        Hooks.delay(1);
        loginPage.setFieldPassword("a");
        extentTest.log(LogStatus.PASS, "input password");
    }
    @When("click login")
    public void click_login() {
        Hooks.delay(1);
        loginPage.clickLogin();
        extentTest.log(LogStatus.PASS, "Click login button");
    }
    @Then("validate wrong username")
    public void validate_wrong_username() {
        Hooks.delay(1);
        Assert.assertEquals(loginPage.getResultFailed(), "×\n" +
                "Wrong username or password!");
        extentTest.log(LogStatus.PASS, "Failed Login");
    }

    //Login Failed wrong password
    @Given("input username")
    public void input_username(){
        Hooks.delay(1);
        loginPage.setFieldUsername("admimdika3");
        extentTest.log(LogStatus.PASS, "input username");
    }
    @When("input wrong password")
    public void input_wrong_password(){
        Hooks.delay(1);
        loginPage.setFieldPassword("aku");
        extentTest.log(LogStatus.PASS, "input wrong password");
    }
    @When("click login1")
    public void click_login1() {
        Hooks.delay(1);
        loginPage.clickLogin();
        extentTest.log(LogStatus.PASS, "Click login");
    }
    @Then("validate wrong password")
    public void validate_wrong_password() {
        Hooks.delay(1);
        Assert.assertEquals(loginPage.getResultFailed(), "×\n" +
                "Wrong username or password!");
        extentTest.log(LogStatus.PASS, "Failed Login");
    }

    //Valid Login
    @Given("input username1")
    public void input_username1(){
        Hooks.delay(1);
        loginPage.setFieldUsername("admindika3");
        extentTest.log(LogStatus.PASS, "input username");
    }
    @When("input password1")
    public void input_password1(){
        Hooks.delay(1);
        loginPage.setFieldPassword("a");
        extentTest.log(LogStatus.PASS, "input password");
    }
    @When("click login2")
    public void click_login2() {
        Hooks.delay(1);
        loginPage.clickLogin();
        extentTest.log(LogStatus.PASS, "Click login button");
    }
    @Then("validate valid login")
    public void validate_valid_login() {
        Hooks.delay(1);
        Assert.assertEquals(loginPage.getResultValid(), "Home");
        extentTest.log(LogStatus.PASS, "Valid Login");
    }
}
