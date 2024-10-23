package com.DMS.pages;

import com.DMS.drivers.DriverSingleton;
import com.DMS.helper.Dropdown;
import com.DMS.helper.WaitUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
    public static WebDriver driver;
    public static Dropdown dropdown = new Dropdown();
    private static WaitUtils waitUtils = new WaitUtils();

    public UserPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    //vIew Page Media
    @FindBy(xpath = "//span[normalize-space()='Data Master']")
    WebElement btnddDataMaster;
    @FindBy(xpath = "//a[normalize-space()='User']")
    WebElement btnUser;
    @FindBy(xpath = "//h1[normalize-space()='Data User']")
    WebElement resultVPUser;

    // input data
    @FindBy(xpath = "//button[normalize-space()='Input Data']")
    WebElement btnInputData;
    @FindBy(xpath = "//input[@id='nik']")
    WebElement fieldNik;
    @FindBy(xpath = "//input[@id='nama']")
    WebElement fieldNama;
    @FindBy(xpath = "//select[@id='departemen']")
    WebElement setddDepartemen;
    @FindBy(xpath = "//select[@id='tingkat']")
    WebElement setddTingkatAkses;
    @FindBy(xpath = "//input[@id='email']")
    WebElement fieldEmail;
    @FindBy(xpath = "//input[@id='username']")
    WebElement fieldUsername;
    @FindBy(xpath = "//input[@id='password']")
    WebElement fieldPassword;
    @FindBy(xpath = "//input[@id='conf_password']")
    WebElement fieldKonfirmPass;
    @FindBy(xpath = "//select[@id='tipe']")
    WebElement setddType;
    @FindBy(xpath = "//button[@id='addusergo']")
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
    @FindBy(xpath = "//input[@id='enik']")
    WebElement fieldENik;
    @FindBy(xpath = "//input[@id='enama']")
    WebElement fieldENama;
    @FindBy(xpath = "//select[@id='edepartemen']")
    WebElement setEDepartemen;
    @FindBy(xpath = "//select[@id='etingkat']")
    WebElement setETingkatAkses;
    @FindBy(xpath = "//input[@id='eusername']")
    WebElement fieldEUsername;
    @FindBy(xpath = "//input[@id='eemail']")
    WebElement fieldEEmail;
    @FindBy(xpath = "//select[@id='status']")
    WebElement setEStatus;
    @FindBy(xpath = "//button[@id='editmasterusergo']")
    WebElement btnSimpanE;


    //View Page
    public void clickddDataMaster(){this.btnddDataMaster.click();}
    public void clickUser(){this.btnUser.click();}
    public String getResultVPUser(){
        return this.resultVPUser.getText();
    }

    // Add data User
    public void clickInputdata(){this.btnInputData.click();}
    public void setNik(String nik){
        this.fieldNik.clear();
        this.fieldNik.sendKeys(nik);
    }
    public void setNama(String nama){
        this.fieldNama.clear();
        this.fieldNama.sendKeys(nama);
    }
    public void getSetddDepartemen(){dropdown.setSelectByIndex(1,setddDepartemen);}
    public void getSetddTingkatAkses(){dropdown.setSelectByIndex(1,setddTingkatAkses);}
    public void setEmail(String email){
        this.fieldEmail.clear();
        this.fieldEmail.sendKeys(email);
    }
    public void setUsername(String username){
        this.fieldUsername.clear();
        this.fieldUsername.sendKeys(username);
    }
    public void setPasswoed(String password){
        this.fieldPassword.clear();
        this.fieldPassword.sendKeys(password);
    }
    public void setCPassword(String cPassword){
        this.fieldKonfirmPass.clear();
        this.fieldKonfirmPass.sendKeys(cPassword);
    }
    public void getSetddTipeAkses(){dropdown.setSelectByIndex(1,setddType);}
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

    //Edit User
    public void clickEdit(){this.btnEdit.click();}
    public void setENik(String ENik){
        this.fieldENik.clear();
        this.fieldENik.sendKeys(ENik);
    }
    public void setENama(String ENama){
        this.fieldENama.clear();
        this.fieldENama.sendKeys(ENama);
    }
    public void getSetddEDepartemen(){dropdown.setSelectByIndex(0,setEDepartemen);}
    public void getSetddETingkatAkses(){
        waitUtils.waitUntilElement(setETingkatAkses);
    }
    public void setEUsername(String EUsername){
        this.fieldEUsername.clear();
        this.fieldEUsername.sendKeys(EUsername);
    }
    public void setEEmail(String EEmail){
        this.fieldEEmail.clear();
        this.fieldEEmail.sendKeys(EEmail);
    }
    public void getSetddEStatus(){dropdown.setSelectByIndex(1,setEStatus);}
    public void clickSimpanE(){this.btnSimpanE.click();}
    public String getResultEditData(){
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }
}
