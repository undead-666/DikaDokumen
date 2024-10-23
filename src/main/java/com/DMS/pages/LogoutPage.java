package com.DMS.pages;

import com.DMS.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    public static WebDriver driver;

    public LogoutPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[normalize-space()='Logout']")
    WebElement btnLogout;

    //resultLogout
    @FindBy(xpath = "//b[normalize-space()='DIKA | DOKUMEN']")
    WebElement resultLogout;


    public void clickLogout(){this.btnLogout.click();}
    public String getResultLogout(){
        return this.resultLogout.getText();
    }
}
