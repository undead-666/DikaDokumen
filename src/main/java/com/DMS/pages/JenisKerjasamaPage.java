package com.DMS.pages;

import com.DMS.drivers.DriverSingleton;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JenisKerjasamaPage {
    public static WebDriver driver;

    public JenisKerjasamaPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    //vIew Page Jenis Kerjasama
    @FindBy(xpath = "//span[normalize-space()='Data Master']")
    WebElement btnddDataMaster;
    @FindBy(xpath = "//a[normalize-space()='Jenis Kerjasama']")
    WebElement btnJenisKerjasama;
    @FindBy(xpath = "//h1[normalize-space()='Data Kerjasama']")
    WebElement resultVPJenisKerjasama;

    // input data
    @FindBy(xpath = "//button[normalize-space()='Input Data']")
    WebElement btnInputData;
    @FindBy(xpath = "//form[@id='form']//input[@id='nama']")
    WebElement fieldNamaKerjasama;
    @FindBy(xpath = "//button[@id='adddept']")
    WebElement btnSimpan;

    //Next Page
//    @FindBy(xpath = "//a[normalize-space()='Next']")
//    WebElement nextPage;
//    @FindBy(xpath = "//td[normalize-space()='11']")
//    WebElement resultNextPage;

    //Previous Page
//    @FindBy(xpath = "//a[normalize-space()='Previous']")
//    WebElement previousPage;
//    @FindBy(xpath = "//td[normalize-space()='1']")
//    WebElement resultPreviousPage;

    //Search
    @FindBy(xpath = "//input[@id='katakunci']")
    WebElement fieldSearch;
    @FindBy(xpath = "//i[@class='glyphicon glyphicon-search']")
    WebElement btnSearch;
    @FindBy(xpath = "//td[normalize-space()='videographer']")
    WebElement resultSearch;

    // Edit
//    @FindBy(xpath = "//span[@class='btn btn-xs btn-warning']")
//    WebElement btnEdit;
//    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
//    WebElement fieldEdit;
//    @FindBy(xpath = "//button[@id='eddept']")
//    WebElement btnSimpanE;

    //View Page
    public void clickddDataMaster(){this.btnddDataMaster.click();}
    public void clickJenisKerjasama(){this.btnJenisKerjasama.click();}
    public String getResultVPJenisKerjasama(){
        return this.resultVPJenisKerjasama.getText();
    }

    // Add data jenis kerjasama
    public void clickInputdata(){this.btnInputData.click();}
    public void setInputdata(String inputdata){
        this.fieldNamaKerjasama.clear();
        this.fieldNamaKerjasama.sendKeys(inputdata);
    }
    public void clickSimpan(){this.btnSimpan.click();}
    public String getREsultInputData(){
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    //Next Page
//    public void clickNextPage(){this.nextPage.click();}
//    public String getResultNextPage(){
//        return this.resultNextPage.getText();
//    }

    //Previous Page
//    public void clickPreviousPage(){this.previousPage.click();}
//    public String getResultPreviousPage(){
//        return this.resultPreviousPage.getText();
//    }

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
//    public void clickEdit(){this.btnEdit.click();}
//    public void setInputEdit(String Edit){
//        this.fieldEdit.clear();
//        this.fieldEdit.sendKeys(Edit);
//    }
//    public void clickSimpanE(){this.btnSimpanE.click();}
//    public String getResultEditData(){
//        Alert alert = driver.switchTo().alert();
//        return alert.getText();
//    }
}
