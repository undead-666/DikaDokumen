package com.DMS.stepdefs;

import com.DMS.hooks.Hooks;
import com.DMS.pages.EksternalDokumenPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestEksternalDokumen {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static EksternalDokumenPage eksternalDokumenPage = new EksternalDokumenPage();

    public TestEksternalDokumen() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("click eksternal dokumen")
    public void click_eksternal_dokumen() {
        Hooks.delay(1);
        eksternalDokumenPage.clickBtnEksternalDokumen();
    }

    @Then("validate page eksternal dokumen")
    public void validate_page_eksternal_dokumen() {
        Hooks.delay(1);
        Assert.assertEquals(eksternalDokumenPage.getresultEksternalDokumen(), "Dokumen Eksternal");
        extentTest.log(LogStatus.PASS, "berhasil menampilkan halaman eksternal dokumen");

    }

    // Input data
    @Given("click input data ed")
    public void click_input_data_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.clickInputData();
    }

    @When("input nama klien")
    public void input_nama_klien() {
        Hooks.delay(1);
        eksternalDokumenPage.setFieldNamaClient("videographer");
    }

    @When("set dd jenis kerjasama")
    public void set_dd_jenis_kerjasama() {
        Hooks.delay(1);
        eksternalDokumenPage.setDdJenisKerjasama();
    }

    @When("input nama project")
    public void input_nama_project() {
        Hooks.delay(1);
        eksternalDokumenPage.setFieldNamaProject("videographer");
    }

    @When("set dd jenis dokumen")
    public void set_dd_jenis_dokumen() {
        Hooks.delay(1);
        eksternalDokumenPage.setDdJenisDokumen();
    }

    @When("input no dokumen ed")
    public void input_no_dokumen_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.setFieldNoDokumen("270820");
    }

    @When("input nama dokumen ed")
    public void input_nama_dokumen_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.setFieldNamaDokumen("videographer");
    }

    @When("set tgl mulai ed")
    public void set_tgl_mulai_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.setTglMulai();

    }

    @When("set tgl berakhir ed")
    public void set_tgl_berakhir_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.setTglBerakhir();

    }

    @When("set tgl reminder ed")
    public void set_tgl_reminder_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.setTglReminder();

    }

    @When("input tim terkait")
    public void input_tim_terkait() {
        Hooks.delay(1);
        eksternalDokumenPage.setFieldTimTerkait("videographer");

    }

    @When("upload file ed")
    public void upload_file_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.setUpload();

    }

    @When("set dd share ed")
    public void set_dd_share_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.setShare();

    }

    @When("set dd status ed")
    public void set_dd_status_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.setStatus();

    }

    @When("click simpan ed")
    public void click_simpan_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.clickSimpan1();

    }

    @Then("validate input data ed")
    public void validate_input_data_ed() {
        Hooks.delay(1);
        Assert.assertEquals(eksternalDokumenPage.getResultInputData(), "Data berhasil di saved!");
        extentTest.log(LogStatus.PASS, "data berhasil ditambahkan");

    }


    // Search by no dokumen
    @Given("search no dokumen ed")
    public void search_no_dokumen_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.setFieldSearchNoDok("270820");
    }

    @When("click search no dok ed")
    public void click_search_no_dok_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.clickSearch();
    }

    @Then("validate search no dokumen ed")
    public void validate_search_no_dokumen_ed() {
        Hooks.delay(1);
        Assert.assertEquals(eksternalDokumenPage.resultSNoDok(), "270820");
        extentTest.log(LogStatus.PASS, "berhasil mencari berdasarkan nomor dokumen");
    }


    //search berdasarkan nama dokumen
    @Given("search nama dokumen ed")
    public void search_nama_dokumen_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.setFieldSearchNaDok("videographer");
    }

    @When("click search na dok ed")
    public void click_search_na_dok_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.clickSearch();
    }

    @Then("validate search na dok ed")
    public void validate_search_na_dok_ed() {
        Hooks.delay(1);
        Assert.assertEquals(eksternalDokumenPage.resultSNaDok(), "videographer");
        extentTest.log(LogStatus.PASS, "berhasil mencari berdasarkan nama dokumen");

    }

    // Search berdasarkan
    @Given("input nama klien ed")
    public void input_nama_klien_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.setFieldSearchNamaClient("videographer");
    }

    @When("click search na klien ed")
    public void click_search_na_klien_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.clickSearch();
    }

    @Then("validate search na klien ed")
    public void validate_search_na_klien_ed() {
        Hooks.delay(1);
        Assert.assertEquals(eksternalDokumenPage.resultSearchNamaClient(), "videographer");
        extentTest.log(LogStatus.PASS, "berhasil mencari nama klien");

    }

    //filter departemen ed
    @Given("set dd di departemen ed")
    public void set_dd_di_departemen_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.setSDdDepartemen();
    }

    @When("click search dd di departemen ed")
    public void click_search_dd_di_departemen_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.clickSearch();
    }

    @Then("validate filter departemen ed")
    public void validate_filter_departemen_ed() {
        Hooks.delay(1);
        Assert.assertEquals(eksternalDokumenPage.resultSDdDep(), "1");
        extentTest.log(LogStatus.PASS, "berhasil menampilkan data berdasarkan departemen");
    }

    //Filter berdasarkan ketersediaan file
    @Given("set dd ketfile ed")
    public void set_dd_ketfile_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.setSDdKetFile();
    }

    @When("click search ketfile ed")
    public void click_search_ketfile_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.clickSearch();
    }

    @Then("validate filter ketfile ed")
    public void validate_filter_ketfile_ed() {
        Hooks.delay(1);
        Assert.assertEquals(eksternalDokumenPage.resultSDdKetDok(),"1");
    }

    // View Data
    @Given("click view ed")
    public void click_view_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.clickView();
    }

    @Then("validate view data ed")
    public void validate_view_data_ed() {
        Hooks.delay(1);
        Assert.assertEquals(eksternalDokumenPage.getResultView(),"View Data");
    }


    //Edit eksternal dokumen
    @Given("click edit ed")
    public void click_edit_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.clickEditData();

    }

    @When("input Enama klien")
    public void input_enama_klien() {
        Hooks.delay(1);
        eksternalDokumenPage.setEfieldNamaKlien("videographer");

    }

    @When("set Edd jenis kerjasama")
    public void set_edd_jenis_kerjasama() {
        Hooks.delay(1);
        eksternalDokumenPage.setEddJenisKerjasama();

    }

    @When("input Enama project")
    public void input_enama_project() {
        Hooks.delay(1);
        eksternalDokumenPage.setEfieldNamaProject("videographer");

    }

    @When("input Enama dokumen")
    public void input_enama_dokumen() {
        Hooks.delay(1);
        eksternalDokumenPage.setEfieldNaDok("videographer");

    }

    @When("set Etgl mulai ed")
    public void set_etgl_mulai_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.getSetETglMulai();

    }

    @When("set Etgl berakhir ed")
    public void set_etgl_berakhir_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.getSetETglBerakhir();

    }

    @When("set Etgl reminder ed")
    public void set_etgl_reminder_ed() {
        Hooks.delay(1);
        eksternalDokumenPage.getSetETglReminder();

    }

    @When("input Etim terkait")
    public void input_etim_terkait() {
        Hooks.delay(1);
        eksternalDokumenPage.setEfieldTimTerkait("videographer");

    }

    @When("set Edd share")
    public void set_edd_share() {
        Hooks.delay(1);
        eksternalDokumenPage.setEddShare();

    }

    @When("set Edd status")
    public void set_edd_status() {
        Hooks.delay(1);
        eksternalDokumenPage.setEddStatus();

    }

    @When("click simpan Eed")
    public void click_simpan_eed() {
        Hooks.delay(1);
        eksternalDokumenPage.clickSimpanEdit();

    }

    @Then("validate edit ed")
    public void validate_edit_ed() {
        Hooks.delay(1);
        Assert.assertEquals(eksternalDokumenPage.getResultEditDataED(),"Data berhasil di update!");
        extentTest.log(LogStatus.PASS,"berhasil update data eksternal dokumen");

    }

    // Send Selected Email
    @Given("click send selected email")
    public void click_send_selected_email() {
        Hooks.delay(1);
        eksternalDokumenPage.clickSendSelectedEmail();
    }

    @Then("validate send selected email")
    public void validate_send_selected_email() {
        Hooks.delay(1);
        Assert.assertEquals(eksternalDokumenPage.getResultSendSelectedEmail(),"Berhasil mengirim email");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS,"berhasil mengirimkan email");

    }

    //Next Page
    @Given("click next ed")
    public void click_next_ed(){
        Hooks.delay(1);
        eksternalDokumenPage.clickNextPage();

    }
    @Then("validate next page ed")
    public void validate_next_page_ed(){
        Hooks.delay(1);
        Assert.assertEquals(eksternalDokumenPage.getResultNextPage(),"11");
        extentTest.log(LogStatus.PASS,"berhasil next page");
    }

    //Previous Page
    @Given("click previous ed")
    public void click_previous_ed(){
        Hooks.delay(1);
        eksternalDokumenPage.clickPreviousPage();

    }
    @Then("validate previous page ed")
    public void validate_previous_page_ed(){
        Hooks.delay(1);
        Assert.assertEquals(eksternalDokumenPage.getResultPreviousPage(),"1");
        extentTest.log(LogStatus.PASS,"berhasil previous page");
    }



}
