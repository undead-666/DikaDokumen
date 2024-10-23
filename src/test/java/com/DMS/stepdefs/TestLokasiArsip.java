package com.DMS.stepdefs;

import com.DMS.hooks.Hooks;
import com.DMS.pages.LokasiArsipPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLokasiArsip {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static LokasiArsipPage lokasiArsipPage = new LokasiArsipPage();

    public TestLokasiArsip(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("click data master2")
    public void click_data_master2(){
        Hooks.delay(1);
        lokasiArsipPage.clickddDataMaster();
        extentTest.log(LogStatus.PASS,"click data master");
    }
    @When("click lokasi penyimpanan")
    public void click_lokasi_penyimpanan(){
        Hooks.delay(1);
        lokasiArsipPage.clickLokasiArsip();
        extentTest.log(LogStatus.PASS,"click lokasi arsip");
    }
    @Then("validate view page lokasi arsip")
    public void validate_view_page_lokasi_arsip(){
        Hooks.delay(1);
        Assert.assertEquals(lokasiArsipPage.getResultVPLokasiArsip(),"Data Lokasi Arsip");
        extentTest.log(LogStatus.PASS,"view page lokasi arsip");
    }

    //Input data
    @Given("click input data LA")
    public void click_input_data_LA() {
        Hooks.delay(1);
        lokasiArsipPage.clickInputdata();
        extentTest.log(LogStatus.PASS,"click input data LA");
    }

    @When("input data LA")
    public void input_data_LA() {
       Hooks.delay(1);
       lokasiArsipPage.setInputdata("maluku");
       extentTest.log(LogStatus.PASS,"input lokasi arsip");
    }

    @When("click simpan LA")
    public void click_simpan_LA() {
        Hooks.delay(1);
        lokasiArsipPage.clickSimpan();
        extentTest.log(LogStatus.PASS,"click simpan");
    }

    @Then("validate input data LA")
    public void validate_input_data_LA() {
        Assert.assertEquals(lokasiArsipPage.getREsultInputData(), "Data berhasil disimpan");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS,"data berhasil disimpan");
    }

    //Next Page
    @Given("click next LA")
    public void click_next_LA(){
        Hooks.delay(1);
        lokasiArsipPage.clickNextPage();
        extentTest.log(LogStatus.PASS,"click next");
    }
    @Then("validate next page LA")
    public void validate_next_page_LA(){
        Hooks.delay(1);
        Assert.assertEquals(lokasiArsipPage.getResultNextPage(),"11");
        extentTest.log(LogStatus.PASS,"berhasil next page");
    }

    //Previous Page
    @Given("click previous LA")
    public void click_previous_LA(){
        Hooks.delay(1);
        lokasiArsipPage.clickPreviousPage();
        extentTest.log(LogStatus.PASS,"click previous");
    }
    @Then("validate previous page LA")
    public void validate_previous_page_LA(){
        Hooks.delay(1);
        Assert.assertEquals(lokasiArsipPage.getResultPreviousPage(),"1");
        extentTest.log(LogStatus.PASS,"berhasil previous page");
    }

    //Search
    @Given("input keywoad LA")
    public void input_keywoard_LA(){
        Hooks.delay(1);
        lokasiArsipPage.setFieldSearch("dika jakarta");
        extentTest.log(LogStatus.PASS,"input keyword");
    }
    @When("click search LA")
    public void click_search_LA(){
        Hooks.delay(1);
        lokasiArsipPage.clickSearch();
        extentTest.log(LogStatus.PASS,"click search");
    }
    @Then("validate search LA")
    public void validate_search(){
        Hooks.delay(1);
        Assert.assertEquals(lokasiArsipPage.getResultSearch(),"dika jakarta");
        extentTest.log(LogStatus.PASS,"berhasil mencari data");
    }

    //Edit
    @Given("click edit LA")
    public void click_edit_LA(){
        Hooks.delay(1);
        lokasiArsipPage.clickEdit();
        extentTest.log(LogStatus.PASS,"click edit");
    }
    @When("input dataE LA")
    public void input_dataE_LA(){
        Hooks.delay(1);
        lokasiArsipPage.setInputEdit("dika jakarta");
        extentTest.log(LogStatus.PASS,"input edit");
    }
    @When("click simpanE LA")
    public void click_simpanE_LA(){
        Hooks.delay(1);
        lokasiArsipPage.clickSimpanE();
        extentTest.log(LogStatus.PASS,"click simpan edit");
    }
    @When("validate edit LA")
    public void validate_edit_LA(){
        Hooks.delay(1);
        Assert.assertEquals(lokasiArsipPage.getResultEditData(), "Data berhasil diubah");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS,"data berhasil diubah");

    }
}
