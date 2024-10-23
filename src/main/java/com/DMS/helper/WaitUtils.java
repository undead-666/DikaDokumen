package com.DMS.helper;

import com.DMS.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
    private static WebDriver driver;

    public WaitUtils(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void waitUntilElement(WebElement xpath) {
        try {
            WebElement element = new WebDriverWait(driver, 60).until(
                    ExpectedConditions.visibilityOf(xpath)
            );
        } catch (Exception e) {
            System.out.println("Element not found or not visible within 30 seconds: " + e.getMessage());
        }
    }
}
