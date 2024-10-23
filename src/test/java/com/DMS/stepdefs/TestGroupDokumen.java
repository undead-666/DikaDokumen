package com.DMS.stepdefs;

import com.DMS.hooks.Hooks;
import com.DMS.pages.GroupDokumenPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestGroupDokumen {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static GroupDokumenPage groupDokumenPage = new GroupDokumenPage();

    public TestGroupDokumen(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //View Page
    @Given("click data master1")
    public void click_data_master1() {
        Hooks.delay(1);
        groupDokumenPage.clickddDataMaster();
        extentTest.log(LogStatus.PASS,"click data master");
    }
    @When("click group dokumen")
    public void click_group_dokumen() {
        Hooks.delay(1);
        groupDokumenPage.clickDepartemen();
        extentTest.log(LogStatus.PASS,"click group dokumen");
    }

    @Then("validate page GD")
    public void validate_page_gd() {
        Hooks.delay(1);
        Assert.assertEquals(groupDokumenPage.getResultVPGroupDokumen(),"Group Documents");
    }

    //Input Data GD
    @Given("click input data1")
    public void click_input_data1() {
        Hooks.delay(1);
        groupDokumenPage.clickInputData();
        extentTest.log(LogStatus.PASS,"click input data");
    }

    @When("input kode")
    public void input_kode() {
        Hooks.delay(1);
        groupDokumenPage.setInputKode("magang");
        extentTest.log(LogStatus.PASS,"input kode");
    }

    @When("input nama")
    public void input_nama() {
        Hooks.delay(1);
        groupDokumenPage.setInputNama("magang");
        extentTest.log(LogStatus.PASS,"input nama");
    }

    @When("input retensi")
    public void input_retensi() {
        Hooks.delay(1);
        groupDokumenPage.setInputRetensi("21");
        extentTest.log(LogStatus.PASS,"input retensi");
    }

    @When("click simpan1")
    public void click_simpan1() {
        Hooks.delay(1);
        groupDokumenPage.clickSimpanGD();
        extentTest.log(LogStatus.PASS,"click simpan");
    }

    @Then("validate input data GD")
    public void validate_input_data_gd() {
        Hooks.delay(1);
        Assert.assertEquals(groupDokumenPage.getResultInputGD(),"Group Documents");
    }

    //Next Page
    @Given("click next page GD")
    public void click_next_page_gd() {
        Hooks.delay(1);
        groupDokumenPage.clickNextPage();
        extentTest.log(LogStatus.PASS,"click next page");
    }

    @Then("validate next page GD")
    public void validate_next_page_gd() {
        Hooks.delay(1);
        Assert.assertEquals(groupDokumenPage.getResultNextPage(),"11");
        extentTest.log(LogStatus.PASS,"validate next page");
    }

    @Given("click previous page GD")
    public void click_previous_page_gd() {
        Hooks.delay(1);
        groupDokumenPage.clickPreviousPage();
        extentTest.log(LogStatus.PASS,"click previous page");
    }

    @Then("validate previous page GD")
    public void validate_previous_page_gd() {
        Hooks.delay(1);
        Assert.assertEquals(groupDokumenPage.getResultPreviousPage(),"1");
        extentTest.log(LogStatus.PASS,"validate previous page");
    }

    @Given("input keywoad GD")
    public void input_keywoad_gd() {
        Hooks.delay(1);
        groupDokumenPage.setFieldSearch("aku");
        extentTest.log(LogStatus.PASS,"input keyword");
    }

    @When("click search GD")
    public void click_search_gd() {
        Hooks.delay(1);
        groupDokumenPage.clickSearch();
        extentTest.log(LogStatus.PASS,"click search");
    }

    @Then("validate search GD")
    public void validate_search_gd() {
        Hooks.delay(1);
        Assert.assertEquals(groupDokumenPage.getREsultSearch(),"aku");
        extentTest.log(LogStatus.PASS,"validate search");
    }

    //Edit
    @Given("click edit GD")
    public void click_edit_gd() {
        Hooks.delay(1);
        groupDokumenPage.clickEdit();
        extentTest.log(LogStatus.PASS,"click edit");
    }

    @When("edit kode")
    public void edit_kode() {
        Hooks.delay(1);
        groupDokumenPage.setEditKode("270820");
        extentTest.log(LogStatus.PASS,"edit kode");
    }

    @When("edit nama")
    public void edit_nama() {
        Hooks.delay(1);
        groupDokumenPage.setEditNama("kerja");
        extentTest.log(LogStatus.PASS,"edit nama");
    }

    @When("edit retensi")
    public void edit_retensi() {
        Hooks.delay(1);
        groupDokumenPage.setEditRetensi("27");
        extentTest.log(LogStatus.PASS,"edit retensi");
    }

    @When("click simpan2")
    public void click_simpan2(){
        Hooks.delay(1);
        groupDokumenPage.clickSimpanE();
        extentTest.log(LogStatus.PASS,"click simpan edit");
    }

    @Then("validate edit GD")
    public void validate_edit_gd() {
        Hooks.delay(1);
        Assert.assertEquals(groupDokumenPage.getResultEditGD(),"Data berhasil disimpan");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS,"validate edit GD");
    }
}
