package com.DMS.stepdefs;

import com.DMS.hooks.Hooks;
import com.DMS.pages.TemplatePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTemplate {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static TemplatePage templatePage = new TemplatePage();

    public TestTemplate(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("click data master4")
    public void click_data_master4(){
        Hooks.delay(1);
        templatePage.clickddDataMaster();
        extentTest.log(LogStatus.PASS,"click data master");
    }
    @When("click template")
    public void click_template(){
        Hooks.delay(1);
        templatePage.clickTemplate();
        extentTest.log(LogStatus.PASS,"click template");
    }
    @Then("validate view page template")
    public void validate_view_page_template(){
        Hooks.delay(1);
        Assert.assertEquals(templatePage.getResultVPTemplate(),"Data Template Nomor Surat");
        extentTest.log(LogStatus.PASS,"view page template");
    }

    //Input data
    @Given("click input data template")
    public void click_input_data_template() {
        Hooks.delay(1);
        templatePage.clickInputdata();
        extentTest.log(LogStatus.PASS,"click input data template");
    }
    @When("set dd kategori")
    public void click_dd_kategori(){
        Hooks.delay(1);
        templatePage.getSetddKategori();
        extentTest.log(LogStatus.PASS,"set dd kategori");
    }
    @When("set dd departemen")
    public void click_dd_departemen(){
        Hooks.delay(1);
        templatePage.getSetddDepartemen();
        extentTest.log(LogStatus.PASS,"set dd departemen");
    }
    @When("input nama template")
    public void input_nama_template() {
       Hooks.delay(1);
       templatePage.setNamaTemplate("videographer");
       extentTest.log(LogStatus.PASS,"input nama template");
    }
    @When("input format nomor surat")
    public void input_format_nomor_surat() {
        Hooks.delay(1);
        templatePage.setNomorTemplate("2019");
        extentTest.log(LogStatus.PASS,"input nomor surat");
    }
    @When("click simpan template")
    public void click_simpan_template() {
        Hooks.delay(1);
        templatePage.clickSimpan();
        extentTest.log(LogStatus.PASS,"click simpan template");
    }

    @Then("validate input data template")
    public void validate_input_data_template() {
        Assert.assertEquals(templatePage.getREsultInputData(), "Data berhasil disimpan");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS,"data berhasil disimpan");
    }

    //Next Page
    @Given("click next template")
    public void click_next(){
        Hooks.delay(1);
        templatePage.clickNextPage();
        extentTest.log(LogStatus.PASS,"click next");
    }
    @Then("validate next page template")
    public void validate_next_page_template(){
        Hooks.delay(1);
        Assert.assertEquals(templatePage.getResultNextPage(),"11");
        extentTest.log(LogStatus.PASS,"berhasil next page");
    }

    //Previous Page
    @Given("click previous template")
    public void click_previous_template(){
        Hooks.delay(1);
        templatePage.clickPreviousPage();
        extentTest.log(LogStatus.PASS,"click previous");
    }
    @Then("validate previous page template")
    public void validate_previous_page_template(){
        Hooks.delay(1);
        Assert.assertEquals(templatePage.getResultPreviousPage(),"1");
        extentTest.log(LogStatus.PASS,"berhasil previous page");
    }

    //Search
    @Given("input keywoad template")
    public void input_keywoard_template(){
        Hooks.delay(1);
        templatePage.setFieldSearch("videographer");
        extentTest.log(LogStatus.PASS,"input keyword");
    }
    @When("click search template")
    public void click_search_template(){
        Hooks.delay(1);
        templatePage.clickSearch();
        extentTest.log(LogStatus.PASS,"click search template");
    }
    @Then("validate search template")
    public void validate_search_template(){
        Hooks.delay(1);
        Assert.assertEquals(templatePage.getResultSearch(),"videographer");
        extentTest.log(LogStatus.PASS,"berhasil mencari data");
    }

    //Edit
    @Given("click edit template")
    public void click_edit_media_template(){
        Hooks.delay(1);
        templatePage.clickEdit();
        extentTest.log(LogStatus.PASS,"click edit");
    }
    @When("set ddE kategori")
    public void click_dd_Ekategori(){
        Hooks.delay(1);
        templatePage.getSetddEKategori();
        extentTest.log(LogStatus.PASS,"set dd Ekategori");
    }
    @When("set ddE departemen")
    public void click_ddE_departemen(){
        Hooks.delay(1);
        templatePage.getSetddEDepartemen();
        extentTest.log(LogStatus.PASS,"set dd departemen");
    }
    @When("input Enama template")
    public void input_Enama_template(){
        Hooks.delay(1);
        templatePage.setENama("videographer");
        extentTest.log(LogStatus.PASS,"input Enama template");
    }
    @When("input Enomor surat")
    public void input_Enomor_seurat(){
        Hooks.delay(1);
        templatePage.setENomor("2019");
        extentTest.log(LogStatus.PASS,"input Enomor");
    }
    @When("click simpan Etemplate")
    public void click_simpan_Etemplate(){
        Hooks.delay(1);
        templatePage.clickSimpanE();
        extentTest.log(LogStatus.PASS,"click simpan edit");
    }
    @When("validate edit template")
    public void validate_edit_template(){
        Hooks.delay(1);
        Assert.assertEquals(templatePage.getResultEditData(), "Data berhasil diubah");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS,"data berhasil diubah");

    }
}
