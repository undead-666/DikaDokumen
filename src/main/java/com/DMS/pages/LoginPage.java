package com.DMS.pages;

import com.DMS.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;

    public LoginPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='username']")
    WebElement fieldUsername;
    @FindBy(xpath = "//input[@id='password']")
    WebElement fieldPassword;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;

    //result
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissable']")
    WebElement resultFailed;
    @FindBy(xpath = "//h1[normalize-space()='Home']")
    WebElement resultValid;

    //
    public void setFieldUsername(String username){
        this.fieldUsername.clear();
        this.fieldUsername.sendKeys(username);
    }
    public void setFieldPassword(String password){
        this.fieldPassword.clear();
        this.fieldPassword.sendKeys(password);
    }
    public void clickLogin(){this.btnLogin.click();}
    public String getResultFailed(){
        return this.resultFailed.getText();
    }
    public String getResultValid(){
        return this.resultValid.getText();
    }
}
