package com.DMS.pages;

import com.DMS.drivers.DriverSingleton;
import com.DMS.helper.Dropdown;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TingkatAksesPage {
    public static WebDriver driver;
    public static Dropdown dropdown = new Dropdown();

    public TingkatAksesPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    //vIew Page Media
    @FindBy(xpath = "//span[normalize-space()='Data Master']")
    WebElement btnddDataMaster;
    @FindBy(xpath = "//a[normalize-space()='Tingkat Akses']")
    WebElement btnTingkatAkses;
    @FindBy(xpath = "//h1[normalize-space()='Data Tingkat Akses']")
    WebElement resultVPTingkatAkses;

    // input data
    @FindBy(xpath = "//button[normalize-space()='Input Data']")
    WebElement btnInputData;
    @FindBy(xpath = "//select[@id='departemen']")
    WebElement setddDepartemen;
    @FindBy(xpath = "//input[@id='nama']")
    WebElement fieldNamaTingkatAkses;
    @FindBy(xpath = "//button[@id='addpenggo']")
    WebElement btnSimpan;

    //Next Page
    @FindBy(xpath = "//a[normalize-space()='Next']")
    WebElement nextPage;
    @FindBy(xpath = "//td[normalize-space()='11']")
    WebElement resultNextPage;

    //Previous Page
    @FindBy(xpath = "//a[normalize-space()='Previous']")
    WebElement previousPage;
    @FindBy(xpath = "//td[normalize-space()='1']")
    WebElement resultPreviousPage;

    //Search
    @FindBy(xpath = "//input[@id='katakunci']")
    WebElement fieldSearch;
    @FindBy(xpath = "//i[@class='glyphicon glyphicon-search']")
    WebElement btnSearch;
    @FindBy(xpath = "//td[normalize-space()='videographer']")
    WebElement resultSearch;

    // Edit
    @FindBy(xpath = "//span[@class='btn btn-xs btn-warning']")
    WebElement btnEdit;
    @FindBy(xpath = "//select[@id='edepartemen']")
    WebElement setddEDepartemen;
    @FindBy(xpath = "//input[@id='enama']")
    WebElement fieldENama;
    @FindBy(xpath = "//button[@id='edtakses']")
    WebElement btnSimpanE;


    //View Page
    public void clickddDataMaster(){this.btnddDataMaster.click();}
    public void clickTingkatAkses(){this.btnTingkatAkses.click();}
    public String getResultVPTingkatAkses(){
        return this.resultVPTingkatAkses.getText();
    }

    // Add data Template
    public void clickInputdata(){this.btnInputData.click();}
    public void getSetddDepartemen(){dropdown.setSelectByIndex(1,setddDepartemen);}
    public void setNamaTingkatAkses(String tingkatAkses){
        this.fieldNamaTingkatAkses.clear();
        this.fieldNamaTingkatAkses.sendKeys(tingkatAkses);
    }
    public void clickSimpan(){this.btnSimpan.click();}
    public String getREsultInputData(){
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    //Next Page
    public void clickNextPage(){this.nextPage.click();}
    public String getResultNextPage(){
        return this.resultNextPage.getText();
    }

    //Previous Page
    public void clickPreviousPage(){this.previousPage.click();}
    public String getResultPreviousPage(){
        return this.resultPreviousPage.getText();
    }

    //Search
    public void setFieldSearch(String search){
        this.fieldSearch.clear();
        this.fieldSearch.sendKeys(search);
    }
    public void clickSearch(){this.btnSearch.click();}
    public String getResultSearch(){
        return this.resultSearch.getText();
    }

    //Edit Template
    public void clickEdit(){this.btnEdit.click();}
    public void getSetddEDepartemen(){dropdown.setSelectByIndex(1,setddEDepartemen);}
    public void setENama(String ENama){
        this.fieldENama.clear();
        this.fieldENama.sendKeys(ENama);
    }
    public void clickSimpanE(){this.btnSimpanE.click();}
    public String getResultEditData(){
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }
}
