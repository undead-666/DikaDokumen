package com.DMS.pages;

import com.DMS.drivers.DriverSingleton;
import com.DMS.helper.Dropdown;
import com.DMS.helper.WaitUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class EksternalDokumenPage {
    public static WebDriver driver;
    public static Dropdown dropdown = new Dropdown();
    public static Faker faker = new Faker();
    public static WaitUtils waitUtils = new WaitUtils();


    public EksternalDokumenPage() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //vIew Page Dokumen Eksternal
    @FindBy(xpath = "//span[normalize-space()='Eksternal Dokumen']")
    WebElement btnDokumenEksternal;
    @FindBy(xpath = "//h1[normalize-space()='Dokumen Eksternal']")
    WebElement resultDokumenEksternal;

    //Input Data
    @FindBy(xpath = "//button[normalize-space()='Input Data']")
    WebElement btnInputData;
    @FindBy(xpath = "//input[@id='namaklien']")
    WebElement fieldNamaClient;
    @FindBy(xpath = "//select[@id='jenis_kerjasama']")
    WebElement ddJenisKerjasama;
    @FindBy(xpath = "//input[@id='nama_project']")
    WebElement fieldNamaProject;
    @FindBy(xpath = "//select[@id='template']")
    WebElement ddJenisDokumen;
    @FindBy(xpath = "//input[@id='nodok']")
    WebElement fieldNoDokumen;
    @FindBy(xpath = "//input[@id='nadoc']")
    WebElement fieldNamaDokumen;
    @FindBy(xpath = "//input[@id='tgl_terbit']")
    WebElement TglMulai;
    @FindBy(xpath = "//input[@id='masa']")
    WebElement TglBerakhir;
    @FindBy(xpath = "//input[@id='tgl_reminder']")
    WebElement TglReminder;
    @FindBy(xpath = "//input[@id='tim']")
    WebElement fieldTimTerkait;
    @FindBy(xpath = "//input[@id='file']")
    WebElement Upload;
    @FindBy(xpath = "//select[@id='share']")
    WebElement ddShare;
    @FindBy(xpath = "//select[@id='status']")
    WebElement ddStatus;
    @FindBy(xpath = "//button[@id='singlebutton']")
    WebElement btnSimpan;
    @FindBy(xpath = "//b[normalize-space()='Data berhasil di saved!']")
    WebElement resultInputData;

    //Search
    @FindBy(xpath = "//input[@id='nodokext']")
    WebElement fieldSearchNoDok;
    @FindBy(xpath = "//input[@id='nama']")
    WebElement fieldSearchNaDok;
    @FindBy(xpath = "//input[@id='nama_klien']")
    WebElement fieldSearchNamaClient;
    @FindBy(xpath = "//select[@id='dept_id']")
    WebElement ddSDokDep;
    @FindBy(xpath = "//select[@id='file_exist']")
    WebElement ddKetFile;
    @FindBy(xpath = "//button[@id='btnFilter']")
    WebElement btnSearch;

    // View
    @FindBy(xpath = "//tbody/tr[1]/td[10]/a[1]/span[1]")
    WebElement btnView;
    @FindBy(xpath = "//h3[normalize-space()='View Data']")
    WebElement resultView;

    //Edit data
    @FindBy(xpath = "//tbody/tr[1]/td[10]/a[2]/span[1]")
    WebElement btnEdit;
    @FindBy(xpath = "//input[@id='namaklien']")
    WebElement EfieldNamaKlien;
    @FindBy(xpath = "//select[@id='jenis_kerjasama']")
    WebElement EddJenisKerjasama;
    @FindBy(xpath = "//input[@id='nama_project']")
    WebElement EfieldNamaProject;
    @FindBy(xpath = "//input[@id='nadoc']")
    WebElement EfieldNaDok;
    @FindBy(xpath = "//input[@id='tgl_terbit']")
    WebElement setETglMulai;
    @FindBy(xpath = "//input[@id='masa']")
    WebElement setETglBerakhir;
    @FindBy(xpath = "//input[@id='tgl_reminder']")
    WebElement setETglReminder;
    @FindBy(xpath = "//input[@id='tim']")
    WebElement EfieldTimTerkait;
    @FindBy(xpath = "//select[@id='share']")
    WebElement EddShare;
    @FindBy(xpath = "//select[@id='status']")
    WebElement EddStatus;
    @FindBy(xpath = "//button[@id='singlebutton']")
    WebElement btnSimpanE;
    @FindBy(xpath = "//b[normalize-space()='Data berhasil di update!']")
    WebElement resultEditData;


    //Result Search
    @FindBy(xpath = "//td[normalize-space()='270820']")
    WebElement resultSearchNoDok;
    @FindBy(xpath = "//td[normalize-space()='videographer']")
    WebElement resultNaDok;
    @FindBy(xpath = "//td[normalize-space()='videographer']")
    WebElement resultSearchNamaClient;
    @FindBy(xpath = "//td[normalize-space()='1']")
    WebElement resultDdDep;
    @FindBy(xpath = "//td[normalize-space()='1']")
    WebElement resultDdKetFile;

    //send selected email
    @FindBy(xpath = "//button[normalize-space()='Send Selected Email']")
    WebElement btnSendSelectedEmail;

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


    //Page Dokumen Internal
    public void clickBtnEksternalDokumen() {
        this.btnDokumenEksternal.click();
    }

    public String getresultEksternalDokumen() {
        return this.resultDokumenEksternal.getText();
    }

    //Input Data
    public void clickInputData() {
        this.btnInputData.click();
    }
    public void setFieldNamaClient(String namaClient){
        this.fieldNamaClient.clear();
        this.fieldNamaClient.sendKeys(namaClient);
    }

    public void setDdJenisKerjasama() {
        dropdown.setSelectByIndex(1, ddJenisKerjasama);
    }
    public void setFieldNamaProject(String namaProject){
        this.fieldNamaProject.clear();
        this.fieldNamaProject.sendKeys(namaProject);
    }

    public void setDdJenisDokumen() {
        dropdown.setSelectByIndex(1, ddJenisDokumen);
    }

    public void setFieldNoDokumen(String noDokumen) {
        this.fieldNoDokumen.clear();
        this.fieldNoDokumen.sendKeys(noDokumen);
    }

    public void setFieldNamaDokumen(String namaDokumen) {
        this.fieldNamaDokumen.clear();
        this.fieldNamaDokumen.sendKeys(namaDokumen);
    }

    public void setTglMulai() {
        waitUtils.waitUntilElement(TglMulai);
        Date today = new Date();

        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");

        String formmatdate = dateformat.format(today);

        this.TglMulai.sendKeys(formmatdate);
    }

    public void setTglBerakhir() {
        Calendar calendar = Calendar.getInstance();
        Date startDate = calendar.getTime(); // Tanggal hari ini

        // Menambah 3 hari ke tanggal saat ini untuk end date
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        Date endDate = calendar.getTime(); // 3 hari ke depan sebagai end date

        // Menghasilkan tanggal acak antara start date dan end date
        long randomTime = ThreadLocalRandom.current().nextLong(startDate.getTime(), endDate.getTime());
        Date randomDate = new Date(randomTime);

        // Membuat objek SimpleDateFormat untuk format tanggal
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Mengkonversi tanggal acak ke format yang diinginkan
        String formattedDate = dateFormat.format(randomDate);

        // Mengisi field dengan tanggal yang dihasilkan
        this.TglBerakhir.sendKeys(formattedDate);
    }
    public void setTglReminder() {
        Calendar calendar = Calendar.getInstance();
        Date startDate = calendar.getTime(); // Tanggal hari ini

        // Menambah 3 hari ke tanggal saat ini untuk end date
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        Date endDate = calendar.getTime(); // 3 hari ke depan sebagai end date

        // Menghasilkan tanggal acak antara start date dan end date
        long randomTime = ThreadLocalRandom.current().nextLong(startDate.getTime(), endDate.getTime());
        Date randomDate = new Date(randomTime);

        // Membuat objek SimpleDateFormat untuk format tanggal
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Mengkonversi tanggal acak ke format yang diinginkan
        String formattedDate = dateFormat.format(randomDate);

        // Mengisi field dengan tanggal yang dihasilkan
        this.TglReminder.sendKeys(formattedDate + Keys.ESCAPE);
//        driver.findElement(By.id("element_id")).sendKeys(Keys.RETURN);
    }

    public void setFieldTimTerkait(String timTerkait) {
        this.fieldTimTerkait.clear();
        this.fieldTimTerkait.sendKeys(timTerkait);
    }

    public void setUpload() {
        String contentRootPath = System.getProperty("user.dir");
        String filePath = Paths.get(contentRootPath, "src", "main", "resources", "testAset", "Testing.pdf").toString();
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = '';", Upload); // yg terakhir untuk nama path dan awal sebelum koma untuk clear data berbentuk file
        this.Upload.sendKeys(filePath);
    }

    public void setShare() {
        dropdown.setSelectByIndex(0, ddShare);
    }

    public void setStatus() {
        dropdown.setSelectByIndex(1, ddStatus);
    }

    public void clickSimpan1() {
        this.btnSimpan.click();
    }

    public String getResultInputData() {
        return this.resultInputData.getText();
    }

    //Search
    public void setFieldSearchNoDok(String searchNoDok) {
        this.fieldSearchNoDok.clear();
        this.fieldSearchNoDok.sendKeys(searchNoDok);
    }

    public void setFieldSearchNaDok(String searchNaDok) {
        this.fieldSearchNoDok.clear();
        this.fieldSearchNaDok.clear();
        this.fieldSearchNaDok.sendKeys(searchNaDok);
    }
    public  void setFieldSearchNamaClient(String searchNamaClient){
        this.fieldSearchNaDok.clear();
        this.fieldSearchNamaClient.clear();
        this.fieldSearchNamaClient.sendKeys(searchNamaClient);
    }

    public void setSDdDepartemen() {
        this.fieldSearchNaDok.clear();
        dropdown.setSelectByIndex(15, ddSDokDep);
    }

    public void setSDdKetFile() {
        dropdown.setSelectByIndex(0, ddKetFile);
    }

    public void clickSearch() {
        this.btnSearch.click();
    }

    //Result Search
    public String resultSNoDok() {
        return this.resultSearchNoDok.getText();
    }

    public String resultSNaDok() {
        return this.resultNaDok.getText();
    }
    public String resultSearchNamaClient(){
        return this.resultSearchNamaClient.getText();
    }
    public String resultSDdDep(){
        return this.resultDdDep.getText();
    }
    public String resultSDdKetDok(){
        return this.resultDdKetFile.getText();
    }

    // View
    public void clickView(){this.btnView.click();}
    public String getResultView(){
        return this.resultView.getText();
    }

    //Edit Data
    public void clickEditData() {
        this.btnDokumenEksternal.click();
        this.btnDokumenEksternal.click();
        this.btnEdit.click();
    }
    public void setEfieldNamaKlien(String namaKlien) {
        this.EfieldNamaKlien.clear();
        this.EfieldNamaKlien.sendKeys(namaKlien);
    }
    public void setEddJenisKerjasama() {
        dropdown.setSelectByIndex(8, EddJenisKerjasama);
    }
    public void setEfieldNamaProject(String namaProject) {
        this.EfieldNamaProject.clear();
        this.EfieldNamaProject.sendKeys(namaProject);
    }

    public void setEfieldNaDok(String Enadok) {
        this.EfieldNaDok.clear();
        this.EfieldNaDok.sendKeys(Enadok);
    }

    public void getSetETglMulai() {
        waitUtils.waitUntilElement(setETglMulai);
        Date today = new Date();

        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");

        String formmatdate = dateformat.format(today);

        this.setETglMulai.sendKeys(formmatdate);
    }

    public void getSetETglBerakhir() {
        Calendar calendar = Calendar.getInstance();
        Date startDate = calendar.getTime(); // Tanggal hari ini

        // Menambah 3 hari ke tanggal saat ini untuk end date
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        Date endDate = calendar.getTime(); // 3 hari ke depan sebagai end date

        // Menghasilkan tanggal acak antara start date dan end date
        long randomTime = ThreadLocalRandom.current().nextLong(startDate.getTime(), endDate.getTime());
        Date randomDate = new Date(randomTime);

        // Membuat objek SimpleDateFormat untuk format tanggal
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Mengkonversi tanggal acak ke format yang diinginkan
        String formattedDate = dateFormat.format(randomDate);

        // Mengisi field dengan tanggal yang dihasilkan
        this.setETglBerakhir.sendKeys(formattedDate);
    }

    public void getSetETglReminder() {
        Calendar calendar = Calendar.getInstance();
        Date startDate = calendar.getTime(); // Tanggal hari ini

        // Menambah 3 hari ke tanggal saat ini untuk end date
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        Date endDate = calendar.getTime(); // 3 hari ke depan sebagai end date

        // Menghasilkan tanggal acak antara start date dan end date
        long randomTime = ThreadLocalRandom.current().nextLong(startDate.getTime(), endDate.getTime());
        Date randomDate = new Date(randomTime);

        // Membuat objek SimpleDateFormat untuk format tanggal
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Mengkonversi tanggal acak ke format yang diinginkan
        String formattedDate = dateFormat.format(randomDate);

        // Mengisi field dengan tanggal yang dihasilkan
        this.setETglReminder.sendKeys(formattedDate + Keys.ESCAPE);
//        driver.findElement(By.id("element_id")).sendKeys(Keys.RETURN);
    }

    public void setEfieldTimTerkait(String timTerkait) {
        this.EfieldTimTerkait.clear();
        this.EfieldTimTerkait.sendKeys(timTerkait);
    }

    public void setEddShare() {
        dropdown.setSelectByIndex(1, EddShare);
    }

    public void setEddStatus() {
        dropdown.setSelectByIndex(1, EddStatus);
    }

    public void clickSimpanEdit() {
        this.btnSimpanE.click();
    }

    public String getResultEditDataED() {
        return this.resultEditData.getText();
    }

    // Send Selected Email
    public void clickSendSelectedEmail(){this.btnSendSelectedEmail.click();}
    public String getResultSendSelectedEmail(){
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


}



