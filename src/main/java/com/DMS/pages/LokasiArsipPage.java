package com.DMS.pages;

import com.DMS.drivers.DriverSingleton;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LokasiArsipPage {
    public static WebDriver driver;

    public LokasiArsipPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    //vIew Page Lokasi Arsip
    @FindBy(xpath = "//span[normalize-space()='Data Master']")
    WebElement btnddDataMaster;
    @FindBy(xpath = "//a[normalize-space()='Lokasi Penyimpanan']")
    WebElement btnLokasiPenyimpanan;
    @FindBy(xpath = "//h1[normalize-space()='Data Lokasi Arsip']")
    WebElement resultVPLokasiArsip;

    // input data
    @FindBy(xpath = "//button[normalize-space()='Input Data']")
    WebElement btnInputData;
    @FindBy(xpath = "//input[@id='nama']")
    WebElement fieldNamaLokasi;
    @FindBy(xpath = "//button[@id='addlokgo']")
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
    @FindBy(xpath = "//input[@name='katakunci']")
    WebElement fieldSearch;
    @FindBy(xpath = "//button[@id='btnFilter']")
    WebElement btnSearch;
    @FindBy(xpath = "//td[normalize-space()='dika jakarta']")
    WebElement resultSearch;

    // Edit
    @FindBy(xpath = "//a[@id='307']//span[@class='btn btn-xs btn-warning'][normalize-space()='Edit']")
    WebElement btnEdit;
    @FindBy(xpath = "//input[@id='enama']")
    WebElement fieldEdit;
    @FindBy(xpath = "//button[@id='edkode']")
    WebElement btnSimpanE;
//    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/span[1]")
//    WebElement resultFailedNull;
//    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/span[1]")
//    WebElement resultFailedChar;

//    @FindBy(xpath = "//form[@id='form']//span[@class='help-block'][normalize-space()='Nama Departemen sudah ada']")
//    WebElement resultFailedsamename;
//    @FindBy(xpath = "//form[@id='form']//span[@class='help-block'][normalize-space()='Nama tidak boleh mengandung Karakter']")
//    WebElement resultFailednocaracter;

    //View Page
    public void clickddDataMaster(){this.btnddDataMaster.click();}
    public void clickLokasiArsip(){this.btnLokasiPenyimpanan.click();}
    public String getResultVPLokasiArsip(){
        return this.resultVPLokasiArsip.getText();
    }

    // Add data Lokasi Arsip
    public void clickInputdata(){this.btnInputData.click();}
    public void setInputdata(String inputdata){
        this.fieldNamaLokasi.clear();
        this.fieldNamaLokasi.sendKeys(inputdata);
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

    //Edit
    public void clickEdit(){this.btnEdit.click();}
    public void setInputEdit(String Edit){
        this.fieldEdit.clear();
        this.fieldEdit.sendKeys(Edit);
    }
    public void clickSimpanE(){this.btnSimpanE.click();}
    public String getResultEditData(){
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }
}
