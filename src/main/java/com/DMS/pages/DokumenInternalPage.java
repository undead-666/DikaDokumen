package com.DMS.pages;

import com.DMS.drivers.DriverSingleton;
import com.DMS.helper.Dropdown;
import com.DMS.helper.WaitUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class DokumenInternalPage {
    public static WebDriver driver;
    public static Dropdown dropdown = new Dropdown();
    public static Faker faker = new Faker();
    public static WaitUtils waitUtils = new WaitUtils();


    public DokumenInternalPage() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //vIew Page Departemen
    @FindBy(xpath = "//span[normalize-space()='Internal Dokumen']")
    WebElement btnDokumenInternal;
    @FindBy(xpath = "//h1[normalize-space()='Dokumen Internal']")
    WebElement resultDokumenInternal;

    //Input Data
    @FindBy(xpath = "//button[normalize-space()='Input Data']")
    WebElement btnInputData;
    @FindBy(xpath = "//select[@id='template']")
    WebElement ddTemplateInternal;
    @FindBy(xpath = "//select[@id='group']")
    WebElement ddGroupDokumen;
    @FindBy(xpath = "//input[@id='no_dok']")
    WebElement fieldNoDok;
    @FindBy(xpath = "//input[@id='nama_dok']")
    WebElement fieldNamaDok;
    @FindBy(xpath = "//textarea[@id='deskripsi']")
    WebElement fieldDeskripsi;
    @FindBy(xpath = "//input[@id='tgl_terbit']")
    WebElement TglMulai;
    @FindBy(xpath = "//input[@id='masa']")
    WebElement TglBerakhir;
    @FindBy(xpath = "//input[@id='owner']")
    WebElement fieldOwner;
    @FindBy(xpath = "//input[@id='tgl_dok']")
    WebElement TglDok;
    @FindBy(xpath = "//select[@id='lokasi']")
    WebElement ddLokasi;
    @FindBy(xpath = "//input[@id='tgl_reminder']")
    WebElement TglReminder;
    @FindBy(xpath = "//select[@id='media']")
    WebElement ddMedia;
    @FindBy(xpath = "//input[@id='jumlah']")
    WebElement fieldJumlah;
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
    @FindBy(xpath = "//input[@id='nodokint']")
    WebElement fieldSearchNoDok;
    @FindBy(xpath = "//input[@id='nama']")
    WebElement fieldNaDok;
    @FindBy(xpath = "//select[@id='dept_id']")
    WebElement ddSDokDep;
    @FindBy(xpath = "//select[@id='file_exist']")
    WebElement ddKetFile;
    @FindBy(xpath = "//button[@id='btnFilter']")
    WebElement btnSearch;

    // View
    @FindBy(xpath = "//tbody/tr[1]/td[12]/a[1]/span[1]")
    WebElement btnView;
    @FindBy(xpath = "//h3[normalize-space()='View Data']")
    WebElement resultView;

    //Edit data
    @FindBy(xpath = "//tbody/tr[1]/td[12]/a[2]/span[1]")
    WebElement btnEdit;
    @FindBy(xpath = "//input[@id='no_dok']")
    WebElement EfieldNoDok;
    @FindBy(xpath = "//input[@id='nama_dok']")
    WebElement EfieldNaDok;
    @FindBy(xpath = "//textarea[@id='deskripsi']")
    WebElement EdesDok;
    @FindBy(xpath = "//input[@id='tgl_terbit']")
    WebElement setETglMulai;
    @FindBy(xpath = "//input[@id='masa']")
    WebElement setETglBerakhir;
    @FindBy(xpath = "//input[@id='owner']")
    WebElement EfieldOwner;
    @FindBy(xpath = "//input[@id='tgl_dok']")
    WebElement setETglDok;
    @FindBy(xpath = "//select[@id='lokasi']")
    WebElement setEddLokasi;
    @FindBy(xpath = "//input[@id='tgl_reminder']")
    WebElement setETglReminder;
    @FindBy(xpath = "//select[@id='media']")
    WebElement setEddMedia;
    @FindBy(xpath = "//input[@id='jumlah']")
    WebElement EfieldJumlah;
    @FindBy(xpath = "//select[@id='share']")
    WebElement seEddShare;
    @FindBy(xpath = "//select[@id='status']")
    WebElement setEddStatus;
    @FindBy(xpath = "//button[@id='singlebutton']")
    WebElement btnSimpanE;
    @FindBy(xpath = "//b[normalize-space()='Data berhasil di update!']")
    WebElement resultEditData;


    //Result Search
    @FindBy(xpath = "//td[normalize-space()='131199']")
    WebElement resultSearchNoDok;
    @FindBy(xpath = "//td[normalize-space()='videographer']")
    WebElement resultNaDok;
    @FindBy(xpath = "//td[normalize-space()='IT Programmer']")
    WebElement resultDdDep;
    @FindBy(xpath = "//td[normalize-space()='1']")
    WebElement resultDdKetFile;

    //Page Dokumen Internal
    public void clickBtnInternalDokumen() {
        this.btnDokumenInternal.click();
    }

    public String getresultInternalDokumen() {
        return this.resultDokumenInternal.getText();
    }

    //Input Data
    public void clickInputData() {
        this.btnInputData.click();
    }

    public void setDdTemplateInternal() {
        dropdown.setSelectByIndex(4, ddTemplateInternal);
    }

    public void setDdGroupDokumen() {
        dropdown.setSelectByIndex(2, ddGroupDokumen);
    }

    public void setNomorDok(String nodok) {
        this.fieldNoDok.clear();
        this.fieldNoDok.sendKeys(nodok);
    }

    public void setNamaDok(String nadok) {
        this.fieldNamaDok.clear();
        this.fieldNamaDok.sendKeys(nadok);
    }

    public void setDeskripsiDok(String desdok) {
        this.fieldDeskripsi.clear();
        this.fieldDeskripsi.sendKeys(desdok);
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

    public void setOwner(String owner) {
        this.fieldOwner.clear();
        this.fieldOwner.sendKeys(owner);
    }

    public void setTglDok() {
        // Menghasilkan tanggal acak menggunakan Faker
        Calendar start = Calendar.getInstance();
        start.set(2020, Calendar.JANUARY, 1); // Mulai dari 1 Januari 2020
        Date startDate = start.getTime();
        Date endDate = new Date(); // Tanggal saat ini
        Date randomDate = faker.date().between(startDate, endDate);

        // Membuat objek SimpleDateFormat untuk format tanggal
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Mengkonversi tanggal acak ke format yang diinginkan
        String formattedDate = dateFormat.format(randomDate);

        this.TglDok.sendKeys(formattedDate);
    }

    public void setDdLokasi() {
        dropdown.setSelectByIndex(3, ddLokasi);
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

    public void setDdMedia() {
        dropdown.setSelectByIndex(4, ddMedia);
    }

    public void setJumlah(String jumlah) {
        this.fieldJumlah.clear();
        this.fieldJumlah.sendKeys(jumlah);
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
    public void setSearchNoDok(String SNoDok) {
        this.fieldSearchNoDok.clear();
        this.fieldSearchNoDok.sendKeys(SNoDok);
    }

    public void setSearchNaDok(String SNaDok) {
        this.fieldSearchNoDok.clear();
        this.fieldNaDok.clear();
        this.fieldNaDok.sendKeys(SNaDok);
    }

    public void setSDdDepartemen() {
        this.fieldNaDok.clear();
        dropdown.setSelectByIndex(15, ddSDokDep);
    }

    public void setSDdKetFile() {
        dropdown.setSelectByIndex(1, ddKetFile);
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
        this.btnDokumenInternal.click();
        this.btnEdit.click();
    }
    public void setENomorDok(String Enodok) {
        this.EfieldNoDok.clear();
        this.EfieldNoDok.sendKeys(Enodok);
    }

    public void setENamaDok(String Enadok) {
        this.EfieldNaDok.clear();
        this.EfieldNaDok.sendKeys(Enadok);
    }

    public void setEDeskripsiDok(String Edesdok) {
        this.EdesDok.clear();
        this.EdesDok.sendKeys(Edesdok);
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

    public void setEOwner(String Eowner) {
        this.EfieldOwner.clear();
        this.EfieldOwner.sendKeys(Eowner);
    }

    public void getSetETglDok() {
        // Menghasilkan tanggal acak menggunakan Faker
        Calendar start = Calendar.getInstance();
        start.set(2020, Calendar.JANUARY, 1); // Mulai dari 1 Januari 2020
        Date startDate = start.getTime();
        Date endDate = new Date(); // Tanggal saat ini
        Date randomDate = faker.date().between(startDate, endDate);

        // Membuat objek SimpleDateFormat untuk format tanggal
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Mengkonversi tanggal acak ke format yang diinginkan
        String formattedDate = dateFormat.format(randomDate);

        this.setETglDok.sendKeys(formattedDate);
    }

    public void setEDdLokasi() {
        dropdown.setSelectByIndex(3, setEddLokasi);
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

    public void setEDdMedia() {
        dropdown.setSelectByIndex(4, setEddMedia);
    }

    public void setEfieldJumlah(String Ejumlah) {
        this.EfieldJumlah.clear();
        this.EfieldJumlah.sendKeys(Ejumlah);
    }

    public void getSetEShare() {
        dropdown.setSelectByIndex(0, seEddShare);
    }

    public void getSetEStatus() {
        dropdown.setSelectByIndex(1, setEddStatus);
    }

    public void clickESimpan1() {
        this.btnSimpanE.click();
    }

    public String getResultEditDataDI() {
        return this.resultEditData.getText();
    }


}



