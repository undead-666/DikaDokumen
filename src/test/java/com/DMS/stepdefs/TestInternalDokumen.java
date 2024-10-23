package com.DMS.stepdefs;

import com.DMS.hooks.Hooks;
import com.DMS.pages.DokumenInternalPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestInternalDokumen {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static DokumenInternalPage dokumenInternalPage = new DokumenInternalPage();

    public TestInternalDokumen() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("click internal dokumen")
    public void click_internal_dokumen() {
        Hooks.delay(1);
        dokumenInternalPage.clickBtnInternalDokumen();
        extentTest.log(LogStatus.PASS, "click internal dokumen");
    }

    @Then("validate page internal dokumen")
    public void validate_page_internal_dokumen() {
        Hooks.delay(1);
        Assert.assertEquals(dokumenInternalPage.getresultInternalDokumen(), "Dokumen Internal");
    }


    //Input data
    @Given("click input data ID")
    public void click_input_data_id() {
        Hooks.delay(1);
        dokumenInternalPage.clickInputData();
    }

    @When("dd TI")
    public void dd_ti() {
        Hooks.delay(1);
        dokumenInternalPage.setDdTemplateInternal();

    }

    @When("dd GD")
    public void dd_gd() {
        Hooks.delay(1);
        dokumenInternalPage.setDdGroupDokumen();

    }

    @When("input nodok")
    public void input_nodok() {
        Hooks.delay(1);
        dokumenInternalPage.setNomorDok("131199");
    }

    @When("input nadok")
    public void input_nadok() {
        Hooks.delay(1);
        dokumenInternalPage.setNamaDok("videographer");

    }

    @When("input desdok")
    public void input_desdok() {
        Hooks.delay(1);
        dokumenInternalPage.setDeskripsiDok("Deskripsi videographer");

    }

    @When("set tgl mulai")
    public void set_tgl_mulai() {
        Hooks.delay(1);
        dokumenInternalPage.setTglMulai();

    }

    @When("set tgl berakhir")
    public void set_tgl_berakhir() {
        Hooks.delay(1);
        dokumenInternalPage.setTglBerakhir();

    }

    @When("input owner")
    public void input_owner() {
        Hooks.delay(1);
        dokumenInternalPage.setOwner("videographer");

    }

    @When("set tgl dok")
    public void set_tgl_dok() {
        Hooks.delay(1);
        dokumenInternalPage.setTglDok();

    }

    @When("dd LA")
    public void dd_la() {
        Hooks.delay(1);
        dokumenInternalPage.setDdLokasi();

    }

    @When("set tgl reminder")
    public void set_tgl_reminder() {
        Hooks.delay(1);
        dokumenInternalPage.setTglReminder();

    }

    @When("dd JM")
    public void dd_jm() {
        Hooks.delay(1);
        dokumenInternalPage.setDdMedia();

    }

    @When("inout jumlah")
    public void inout_jumlah() {
        Hooks.delay(1);
        dokumenInternalPage.setJumlah("1");

    }

    @When("upload file")
    public void upload_file() {
        Hooks.delay(1);
        dokumenInternalPage.setUpload();

    }

    @When("dd share")
    public void dd_share() {
        Hooks.delay(1);
        dokumenInternalPage.setShare();

    }

    @When("dd status")
    public void dd_status() {
        Hooks.delay(1);
        dokumenInternalPage.setStatus();

    }

    @When("click simpan ID")
    public void click_simpan_id() {
        Hooks.delay(1);
        dokumenInternalPage.clickSimpan1();

    }

    @Then("validate input data DI")
    public void validate_input_data_DI() {
        Hooks.delay(1);
        Assert.assertEquals(dokumenInternalPage.getResultInputData(), "Data berhasil di saved!");
        extentTest.log(LogStatus.PASS, "data berhasil ditambahkan");
    }

    // Search Nomor Dokumen
    @Given("input no dokumen")
    public void input_no_dokumen() {
        Hooks.delay(1);
        dokumenInternalPage.setSearchNoDok("131199");
    }

    @When("click search no dok")
    public void click_search_no_dok() {
        Hooks.delay(1);
        dokumenInternalPage.clickSearch();
    }

    @Then("validate search no dokumen")
    public void validate_search_no_dokumen() {
        Hooks.delay(1);
        Assert.assertEquals(dokumenInternalPage.resultSNoDok(), "131199");
        extentTest.log(LogStatus.PASS, "berhasil search nomor dokumen");
    }

    // Search Nama Dokumen
    @Given("input nama dokumen")
    public void input_nama_dokumen() {
        Hooks.delay(1);
        dokumenInternalPage.setSearchNaDok("videographer");
    }

    @When("click search na dok")
    public void click_search_na_dok() {
        Hooks.delay(1);
        dokumenInternalPage.clickSearch();
    }

    @Then("validate search na dok")
    public void validate_search_na_dok() {
        Hooks.delay(1);
        Assert.assertEquals(dokumenInternalPage.resultSNaDok(), "videographer");
        extentTest.log(LogStatus.PASS, "berhasil search nama dokumen");
    }

    // Filter Departemen
    @Given("set dd di departemen")
    public void set_dd_di_departemen() {
        Hooks.delay(1);
        dokumenInternalPage.setSDdDepartemen();

    }

    @When("click search dd di departemen")
    public void click_search_dd_di_departemen() {
        Hooks.delay(1);
        dokumenInternalPage.clickSearch();
    }

    @Then("validate filter departemen")
    public void validate_filter_departemen() {
        Hooks.delay(1);
        Assert.assertEquals(dokumenInternalPage.resultSDdDep(), "IT Programmer");
        extentTest.log(LogStatus.PASS, "IT Programmer");
    }

    // FIlter Ketersediaan File
    @Given("set dd ketfile")
    public void set_dd_ketfile() {
        Hooks.delay(1);
        dokumenInternalPage.setSDdKetFile();
    }

    @When("click search ketfile")
    public void click_search_ketfile() {
        Hooks.delay(1);
        dokumenInternalPage.clickSearch();
    }

    @Then("validate filter ketfile")
    public void validate_filter_ketfile() {
        Hooks.delay(1);
        Assert.assertEquals(dokumenInternalPage.resultSDdKetDok(), "1");
        extentTest.log(LogStatus.PASS, "berhasil filter ketersediaan file");
    }

    // View data
    @Given("click view")
    public void click_view() {
        Hooks.delay(1);
        dokumenInternalPage.clickView();
    }

    @Then("validate view data DI")
    public void validate_view_data_di() {
        Hooks.delay(1);
        Assert.assertEquals(dokumenInternalPage.getResultView(),"View Data");
        extentTest.log(LogStatus.PASS,"berhasil view data");
    }

    // Edit data
    @Given("click edit di")
    public void click_edit_di() {
        Hooks.delay(1);
        dokumenInternalPage.clickEditData();
    }

    @When("input Enodok")
    public void input_enodok() {
        Hooks.delay(1);
        dokumenInternalPage.setENomorDok("131199");
    }

    @When("input Enadok")
    public void input_enadok() {
        Hooks.delay(1);
        dokumenInternalPage.setENamaDok("videographer");
    }

    @When("input Edesdok")
    public void input_edesdok() {
        Hooks.delay(1);
        dokumenInternalPage.setEDeskripsiDok("Deskripsi videographer");
    }

    @When("set Etgl mulai")
    public void set_etgl_mulai() {
        Hooks.delay(1);
        dokumenInternalPage.getSetETglMulai();

    }

    @When("set Etgl berakhir")
    public void set_etgl_berakhir() {
        Hooks.delay(1);
        dokumenInternalPage.getSetETglBerakhir();

    }

    @When("input Eowner")
    public void input_eowner() {
        Hooks.delay(1);
        dokumenInternalPage.setEOwner("videographer");
    }

    @When("set Etgl dokumen")
    public void set_etgl_dokumen() {
        Hooks.delay(1);
        dokumenInternalPage.getSetETglDok();
    }

    @When("set Elokasi arsip")
    public void set_elokasi_arsip() {
        Hooks.delay(1);
        dokumenInternalPage.setEDdLokasi();

    }

    @When("set Etgl reminder")
    public void set_etgl_reminder() {
        Hooks.delay(1);
        dokumenInternalPage.getSetETglReminder();

    }

    @When("set Ejenis media")
    public void set_ejenis_media() {
        Hooks.delay(1);
        dokumenInternalPage.setEDdMedia();

    }

    @When("input Ejumlah")
    public void input_ejumlah() {
        Hooks.delay(1);
        dokumenInternalPage.setEfieldJumlah("1");

    }

    @When("set Eshare")
    public void set_eshare() {
        Hooks.delay(1);
        dokumenInternalPage.getSetEShare();

    }

    @When("set Estatus")
    public void set_estatus() {
        Hooks.delay(1);
        dokumenInternalPage.getSetEStatus();

    }

    @When("click Esimpan")
    public void click_esimpan() {
        Hooks.delay(1);
        dokumenInternalPage.clickESimpan1();

    }

    @Then("validate edit di")
    public void validate_edit_di() {
        Hooks.delay(1);
        Assert.assertEquals(dokumenInternalPage.getResultEditDataDI(),"Data berhasil di update!");
        extentTest.log(LogStatus.PASS,"berhasil edit data");

    }


}
