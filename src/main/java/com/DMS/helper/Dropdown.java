package com.DMS.helper;

import com.DMS.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    private static WebDriver driver;

    public Dropdown() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void setSelectByIndex(int index, WebElement locator) {
        Select dropdown = new Select(locator);
        dropdown.selectByIndex(index);
    }
}
