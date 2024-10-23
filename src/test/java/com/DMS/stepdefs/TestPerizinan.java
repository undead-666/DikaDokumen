package com.DMS.stepdefs;

import com.DMS.hooks.Hooks;
import com.DMS.pages.PerizinanPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestPerizinan {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static PerizinanPage perizinanPage = new PerizinanPage();

    public TestPerizinan() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("click perizinan")
    public void click_perizinan() {
        Hooks.delay(1);
        perizinanPage.clickBtnperizinan();
    }

    @Then("validate page perizinan")
    public void validate_page_perizinan() {
        Hooks.delay(1);
        Assert.assertEquals(perizinanPage.getresultPerizinan(), "Perizinan");
        extentTest.log(LogStatus.PASS, "berhasil menampilkan halaman perizinan");

    }

    // Input data
    @Given("click input data perizinan")
    public void click_input_data_perizinan() {
        Hooks.delay(1);
        perizinanPage.clickInputData();
    }

    @When("input no perizinan")
    public void input_no_perizinan() {
        Hooks.delay(1);
        perizinanPage.setFieldNomorPerizinan("270820");
    }

    @When("input nama perizinan")
    public void input_nama_perizinan() {
        Hooks.delay(1);
        perizinanPage.setFieldNamaPerizinan("videographer");
    }


    @When("set tgl mulai perizinan")
    public void set_tgl_mulai_perizinan() {
        Hooks.delay(1);
        perizinanPage.setTglMulai();

    }

    @When("set tgl berakhir perizinan")
    public void set_tgl_berakhir_perizinan() {
        Hooks.delay(1);
        perizinanPage.setTglBerakhir();

    }

    @When("input diterbitkan oleh")
    public void input_diterbitkan_oleh() {
        Hooks.delay(1);
        perizinanPage.setFieldDiterbitkanOleh("videographer");

    }

    @When("input deskripsi perizinan")
    public void input_deskripsi_perizinan() {
        Hooks.delay(1);
        perizinanPage.setFieldDeskripsi("videographer");

    }

    @When("input pemilik dokumen perizinan")
    public void input_pemilik_dokumen_perizinan() {
        Hooks.delay(1);
        perizinanPage.setFieldPemilikDokumen("videographer");

    }


    @When("set tgl reminder perizinan")
    public void set_tgl_reminder_perizinan() {
        Hooks.delay(1);
        perizinanPage.setTglReminder();

    }


    @When("upload file perizinan")
    public void upload_file_perizinan() {
        Hooks.delay(1);
        perizinanPage.setUpload();

    }


    @When("set dd status perizinan")
    public void set_dd_status_perizinan() {
        Hooks.delay(1);
        perizinanPage.setStatus();

    }

    @When("click simpan perizinan")
    public void click_simpan_perizinan() {
        Hooks.delay(1);
        perizinanPage.clickSimpan1();

    }

    @Then("validate input data perizinan")
    public void validate_input_data_perizinan() {
        Hooks.delay(1);
        Assert.assertEquals(perizinanPage.getResultInputData(), "Data berhasil di saved!");
        extentTest.log(LogStatus.PASS, "data berhasil ditambahkan");

    }


    // Search by no dokumen
    @Given("search no perizinan")
    public void search_no_perizinan() {
        Hooks.delay(1);
        perizinanPage.setFieldSearchNoDok("270820");
    }

    @When("click search no perizinan")
    public void click_search_no_perizinan() {
        Hooks.delay(1);
        perizinanPage.clickSearch();
    }

    @Then("validate search no dokumen perizinan")
    public void validate_search_no_dokumen_perizinan() {
        Hooks.delay(1);
        Assert.assertEquals(perizinanPage.resultSNoDok(), "270820");
        extentTest.log(LogStatus.PASS, "berhasil mencari berdasarkan nomor dokumen");
    }


    //search berdasarkan nama dokumen
    @Given("search nama dokumen perizinan")
    public void search_nama_dokumen_perizinan() {
        Hooks.delay(1);
        perizinanPage.setFieldSearchNaDok("videographer");
    }

    @When("click search na dok perizinan")
    public void click_search_na_dok_perizinan() {
        Hooks.delay(1);
        perizinanPage.clickSearch();
    }

    @Then("validate search na dok perizinan")
    public void validate_search_na_dok_perizinan() {
        Hooks.delay(1);
        Assert.assertEquals(perizinanPage.resultSNaDok(), "videographer");
        extentTest.log(LogStatus.PASS, "berhasil mencari berdasarkan nama dokumen");

    }


    //filter departemen ed
    @Given("set dd di departemen perizinan")
    public void set_dd_di_departemen_ed() {
        Hooks.delay(1);
        perizinanPage.setSDdDepartemen();
    }

    @When("click search dd departemen perizinan")
    public void click_search_dd_di_departemen_perizinan() {
        Hooks.delay(1);
        perizinanPage.clickSearch();
    }

    @Then("validate filter departemen perizinan")
    public void validate_filter_departemen_perizinan() {
        Hooks.delay(1);
        Assert.assertEquals(perizinanPage.resultSDdDep(), "1");
        extentTest.log(LogStatus.PASS, "berhasil menampilkan data berdasarkan departemen");
    }

    //Filter berdasarkan ketersediaan file
    @Given("set dd ketfile perizinan")
    public void set_dd_ketfile_perizinan() {
        Hooks.delay(1);
        perizinanPage.setSDdKetFile();
    }

    @When("click search ketfile perizinan")
    public void click_search_ketfile_perizinan() {
        Hooks.delay(1);
        perizinanPage.clickSearch();
    }

    @Then("validate filter ketfile perizinan")
    public void validate_filter_ketfile_perizinan() {
        Hooks.delay(1);
        Assert.assertEquals(perizinanPage.resultSDdKetDok(), "1");
    }

    // View Data
    @Given("click view perizinan")
    public void click_view_perizinan() {
        Hooks.delay(1);
        perizinanPage.clickView();
    }

    @Then("validate view data perizinan")
    public void validate_view_data_perizinan() {
        Hooks.delay(1);
        Assert.assertEquals(perizinanPage.getResultView(), "View Data");
    }


    //Edit eksternal dokumen
    @Given("click edit perizinan")
    public void click_edit_perizinan() {
        Hooks.delay(1);
        perizinanPage.clickEditData();

    }

    @When("input Enomor perizinan")
    public void input_Enomor_perizinan() {
        Hooks.delay(1);
        perizinanPage.setEfieldNoPerizinan("270820");
    }

    @When("input Enama perizinan")
    public void input_Enama_perizinan() {
        Hooks.delay(1);
        perizinanPage.setEfieldNamaPerizinan("videographer");
    }


    @When("set Etgl mulai perizinan")
    public void set_Etgl_mulai_perizinan() {
        Hooks.delay(1);
        perizinanPage.getSetETglMulai();

    }

    @When("set Etgl berakhir perizinan")
    public void set_Etgl_berakhir_perizinan() {
        Hooks.delay(1);
        perizinanPage.getSetETglBerakhir();

    }

    @When("input Editerbitkan oleh")
    public void input_Editerbitkan_oleh() {
        Hooks.delay(1);
        perizinanPage.setEfieldDiterbitkanOleh("videographer");

    }

    @When("input Edeskripsi perizinan")
    public void input_Edeskripsi_perizinan() {
        Hooks.delay(1);
        perizinanPage.setEfieldDeskripso("videographer");

    }

    @When("input Epemilik dokumen perizinan")
    public void input_Epemilik_dokumen_perizinan() {
        Hooks.delay(1);
        perizinanPage.setEfieldPemilikDokumen("videographer");

    }


    @When("set Etgl reminder perizinan")
    public void set_Etgl_reminder_perizinan() {
        Hooks.delay(1);
        perizinanPage.getSetETglReminder();

    }



    @When("set Edd status perizinan")
    public void set_Edd_status_perizinan() {
        Hooks.delay(1);
        perizinanPage.setEddStatus();

    }

    @When("click simpan Eperizinan")
    public void click_simpan_Eperizinan() {
        Hooks.delay(1);
        perizinanPage.clickSimpanEdit();

    }

    @Then("validate edit perizinan")
    public void validate_edit_perizinan() {
        Hooks.delay(1);
        Assert.assertEquals(perizinanPage.getResultEditDataPerizinan(), "Data berhasil di update!");
        extentTest.log(LogStatus.PASS, "data berhasil ditambahkan");

    }


    // Send Selected Email
    @Given("click send selected email perizinan")
    public void click_send_selected_perizinan() {
        Hooks.delay(1);
        perizinanPage.clickSendSelectedEmail();
    }

    @Then("validate send selected email perizinan")
    public void validate_send_selected_perizinan() {
        Hooks.delay(1);
        Assert.assertEquals(perizinanPage.getResultSendSelectedEmail(), "Berhasil mengirim email");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS, "berhasil mengirimkan email");

    }

    //Next Page
    @Given("click next perizinan")
    public void click_next_perizinan() {
        Hooks.delay(1);
        perizinanPage.clickNextPage();

    }

    @Then("validate next page perizinan")
    public void validate_next_page_perizinan() {
        Hooks.delay(1);
        Assert.assertEquals(perizinanPage.getResultNextPage(), "1");
        extentTest.log(LogStatus.PASS, "berhasil next page");
    }

    //Previous Page
    @Given("click previous perizinan")
    public void click_previous_perizinan() {
        Hooks.delay(1);
        perizinanPage.clickPreviousPage();

    }

    @Then("validate previous page perizinan")
    public void validate_previous_page_perizinan() {
        Hooks.delay(1);
        Assert.assertEquals(perizinanPage.getResultPreviousPage(), "1");
        extentTest.log(LogStatus.PASS, "berhasil previous page");
    }


}
