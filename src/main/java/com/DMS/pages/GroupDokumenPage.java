package com.DMS.pages;

import com.DMS.drivers.DriverSingleton;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GroupDokumenPage {
    public static WebDriver driver;

    public GroupDokumenPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    //vIew Page Group Dokumen
    @FindBy(xpath = "//span[normalize-space()='Data Master']")
    WebElement btnddDataMaster;
    @FindBy(xpath = "//a[normalize-space()='Group Dokumen']")
    WebElement btnGroupDokumen;
    @FindBy(xpath = "//h1[normalize-space()='Group Documents']")
    WebElement resultVPGroupDokumen;

    // input data
    @FindBy(xpath = "//button[normalize-space()='Input Data']")
    WebElement btnInputData;
    @FindBy(xpath = "//input[@id='adkode']")
    WebElement fieldKode;
    @FindBy(xpath = "//input[@id='nama']")
    WebElement fieldNama;
    @FindBy(xpath = "//input[@id='retensi']")
    WebElement fieldRetensi;
    @FindBy(xpath = "//button[@id='addkode']")
    WebElement btnSimpanGD;

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
    @FindBy(xpath = "//td[normalize-space()='aku']")
    WebElement resultSearch;

    // Edit
    @FindBy(xpath = "//span[@class='btn btn-xs btn-warning']")
    WebElement btnEdit;
    @FindBy(xpath = "//input[@id='ekode']")
    WebElement fieldEditKode;
    @FindBy(xpath = "//input[@id='enama']")
    WebElement fieldEditNama;
    @FindBy(xpath = "//input[@id='eretensi']")
    WebElement fieldEditRetensi;
    @FindBy(xpath = "//button[@id='edkode']")
    WebElement btnSimpanE;


    //View Page
    public void clickddDataMaster(){this.btnddDataMaster.click();}
    public void clickDepartemen(){this.btnGroupDokumen.click();}
    public String getResultVPGroupDokumen(){
        return this.resultVPGroupDokumen.getText();
    }

    // Add data departemen
    public void clickInputData(){this.btnInputData.click();}
    public void setInputKode(String kode){
        this.fieldKode.clear();
        this.fieldKode.sendKeys(kode);
    }
    public void setInputNama(String nama){
//        this.fieldKode.clear();
        this.fieldNama.sendKeys(nama);
    }
    public void setInputRetensi(String retensi){
        this.fieldRetensi.clear();
        this.fieldRetensi.sendKeys(retensi);
    }
    public void clickSimpanGD(){this.btnSimpanGD.click();}
    public String getResultInputGD(){
        return this.resultVPGroupDokumen.getText();
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
    public String getREsultSearch(){
        return this.resultSearch.getText();
    }

    //Edit
    public void clickEdit(){this.btnEdit.click();}
    public void setEditKode(String kode){
        this.fieldEditKode.clear();
        this.fieldEditKode.sendKeys(kode);
    }
    public void setEditNama(String nama){
        this.fieldEditNama.clear();
        this.fieldEditNama.sendKeys(nama);
    }
    public void setEditRetensi(String retensi){
        this.fieldEditRetensi.clear();
        this.fieldEditRetensi.sendKeys(retensi);
    }
    public void clickSimpanE(){this.btnSimpanE.click();}
    public String getResultEditGD(){
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

}
