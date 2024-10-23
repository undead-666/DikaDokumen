package com.DMS.helper;

import com.DMS.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search {
    private static WebDriver driver;

    public Search(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    public void setSelectByIndex(int index, WebElement locator){
        Select search = new Select(locator);
        search.selectByIndex(index);
    }
}
