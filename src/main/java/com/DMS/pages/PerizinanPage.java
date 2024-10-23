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

public class PerizinanPage {
    public static WebDriver driver;
    public static Dropdown dropdown = new Dropdown();
    public static Faker faker = new Faker();
    public static WaitUtils waitUtils = new WaitUtils();


    public PerizinanPage() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //vIew Page Perizinan
    @FindBy(xpath = "//span[normalize-space()='Perizinan']")
    WebElement btnPerizinan;
    @FindBy(xpath = "//h1[normalize-space()='Perizinan']")
    WebElement resultPerizinan;

    //Input Data perizinan
    @FindBy(xpath = "//button[normalize-space()='Input Data']")
    WebElement btnInputData;
    @FindBy(xpath = "//input[@id='noijin']")
    WebElement fieldNoPerizinan;
    @FindBy(xpath = "//input[@id='namaijin']")
    WebElement fieldNamaPerizinan;
    @FindBy(xpath = "//input[@id='tgl_terbit']")
    WebElement TglMulai;
    @FindBy(xpath = "//input[@id='masa']")
    WebElement TglBerakhir;
    @FindBy(xpath = "//input[@id='diterbitkan']")
    WebElement fieldDiterbitkanOleh;
    @FindBy(xpath = "//textarea[@id='deskripsi']")
    WebElement fieldDeskripsi;
    @FindBy(xpath = "//input[@id='owner']")
    WebElement fieldPemilikDokumen;
    @FindBy(xpath = "//input[@id='tgl_reminder']")
    WebElement TglReminder;
    @FindBy(xpath = "//input[@id='file']")
    WebElement Upload;
    @FindBy(xpath = "//select[@id='status']")
    WebElement ddStatus;
    @FindBy(xpath = "//button[@id='singlebutton']")
    WebElement btnSimpan;
    @FindBy(xpath = "//b[normalize-space()='Data berhasil di saved!']")
    WebElement resultInputData;

    //Search
    @FindBy(xpath = "//input[@id='nodokizin']")
    WebElement fieldSearchNoDok;
    @FindBy(xpath = "//input[@id='nama']")
    WebElement fieldSearchNaDok;
    @FindBy(xpath = "//select[@id='dept_id']")
    WebElement ddSDokDep;
    @FindBy(xpath = "//select[@id='file_exist']")
    WebElement ddKetFile;
    @FindBy(xpath = "//button[@id='btnFilter']")
    WebElement btnSearch;

    // View
    @FindBy(xpath = "//tbody/tr[1]/td[8]/a[1]/span[1]")
    WebElement btnView;
    @FindBy(xpath = "//h3[normalize-space()='View Data']")
    WebElement resultView;

    //Edit data
    @FindBy(xpath = "//tbody/tr[1]/td[8]/a[2]/span[1][1]/i[1]")
    WebElement btnEdit;
    @FindBy(xpath = "//input[@id='noijin']")
    WebElement EfieldNoPerizinan;
    @FindBy(xpath = "//input[@id='namaijin']")
    WebElement EfiledNamaPerizinan;
    @FindBy(xpath = "//input[@id='tgl_terbit']")
    WebElement ETglMulai;
    @FindBy(xpath = "//input[@id='masa']")
    WebElement ETglBerakhir;
    @FindBy(xpath = "//input[@id='diterbitkan']")
    WebElement EfieldDiterbitkanOleh;
    @FindBy(xpath = "//textarea[@id='deskripsi']")
    WebElement EfieldDeskripso;
    @FindBy(xpath = "//input[@id='owner']")
    WebElement EfieldPemilikDokumen;
    @FindBy(xpath = "//input[@id='tgl_reminder']")
    WebElement setETglReminder;
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
    @FindBy(xpath = "//td[normalize-space()='1']")
    WebElement resultNextPage;

    //Previous Page
    @FindBy(xpath = "//a[normalize-space()='Previous']")
    WebElement previousPage;
    @FindBy(xpath = "//td[normalize-space()='1']")
    WebElement resultPreviousPage;


    //Page Dokumen Internal
    public void clickBtnperizinan() {
        this.btnPerizinan.click();
    }

    public String getresultPerizinan() {
        return this.resultPerizinan.getText();
    }

    //Input Data
    public void clickInputData() {
        this.btnInputData.click();
    }

    public void setFieldNomorPerizinan(String nomorPerizinan) {
        this.fieldNoPerizinan.clear();
        this.fieldNoPerizinan.sendKeys(nomorPerizinan);
    }

    public void setFieldNamaPerizinan(String namaPerizinan) {
        this.fieldNamaPerizinan.clear();
        this.fieldNamaPerizinan.sendKeys(namaPerizinan);
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

    public void setFieldDiterbitkanOleh(String diterbitkanOleh) {
        this.fieldDiterbitkanOleh.clear();
        this.fieldDiterbitkanOleh.sendKeys(diterbitkanOleh);
    }

    public void setFieldDeskripsi(String deskripsi) {
        this.fieldDeskripsi.clear();
        this.fieldDeskripsi.sendKeys(deskripsi);
    }

    public void setFieldPemilikDokumen(String pemilikDokumen) {
        this.fieldPemilikDokumen.clear();
        this.fieldPemilikDokumen.sendKeys(pemilikDokumen);
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


    public void setUpload() {
        String contentRootPath = System.getProperty("user.dir");
        String filePath = Paths.get(contentRootPath, "src", "main", "resources", "testAset", "Testing.pdf").toString();
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = '';", Upload); // yg terakhir untuk nama path dan awal sebelum koma untuk clear data berbentuk file
        this.Upload.sendKeys(filePath);
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


    public String resultSDdDep() {
        return this.resultDdDep.getText();
    }

    public String resultSDdKetDok() {
        return this.resultDdKetFile.getText();
    }

    // View
    public void clickView() {
        this.btnView.click();
    }

    public String getResultView() {
        return this.resultView.getText();
    }

    //Edit Data
    public void clickEditData() {
        this.btnPerizinan.click();
        this.btnEdit.click();
    }

    public void setEfieldNoPerizinan(String noPerizinan) {
        this.EfieldNoPerizinan.clear();
        this.EfieldNoPerizinan.sendKeys(noPerizinan);
    }
    public void setEfieldNamaPerizinan(String namaPerizinan) {
        this.EfiledNamaPerizinan.clear();
        this.EfiledNamaPerizinan.sendKeys(namaPerizinan);
    }

    public void getSetETglMulai() {
        waitUtils.waitUntilElement(ETglMulai);
        Date today = new Date();

        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");

        String formmatdate = dateformat.format(today);

        this.ETglMulai.sendKeys(formmatdate);
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
        this.ETglBerakhir.sendKeys(formattedDate);
    }
    public void setEfieldDiterbitkanOleh(String diterbitkanOleh) {
        this.EfieldDiterbitkanOleh.clear();
        this.EfieldDiterbitkanOleh.sendKeys(diterbitkanOleh);
    }
    public void setEfieldDeskripso(String deskripso) {
        this.EfieldDeskripso.clear();
        this.EfieldDeskripso.sendKeys(deskripso);
    }
    public void setEfieldPemilikDokumen(String pemilikDokumen) {
        this.EfieldPemilikDokumen.clear();
        this.EfieldPemilikDokumen.sendKeys(pemilikDokumen);
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

    public void setEddStatus() {
        dropdown.setSelectByIndex(1, EddStatus);
    }

    public void clickSimpanEdit() {
        this.btnSimpanE.click();
    }

    public String getResultEditDataPerizinan() {
        return this.resultEditData.getText();
    }

    // Send Selected Email
    public void clickSendSelectedEmail() {
        this.btnSendSelectedEmail.click();
    }

    public String getResultSendSelectedEmail() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    //Next Page
    public void clickNextPage() {
        this.nextPage.click();
    }

    public String getResultNextPage() {
        return this.resultNextPage.getText();
    }

    //Previous Page
    public void clickPreviousPage() {
        this.previousPage.click();
    }

    public String getResultPreviousPage() {
        return this.resultPreviousPage.getText();
    }


}



