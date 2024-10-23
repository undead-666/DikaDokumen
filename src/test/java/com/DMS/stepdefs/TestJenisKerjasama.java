package com.DMS.stepdefs;

import com.DMS.hooks.Hooks;
import com.DMS.pages.JenisKerjasamaPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestJenisKerjasama {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static JenisKerjasamaPage jenisKerjasamaPage = new JenisKerjasamaPage();

    public TestJenisKerjasama(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("click data master7")
    public void click_data_master7(){
        Hooks.delay(1);
        jenisKerjasamaPage.clickddDataMaster();
        extentTest.log(LogStatus.PASS,"click data master");
    }
    @When("click jenis kerjasama")
    public void click_jenis_kerjasama(){
        Hooks.delay(1);
        jenisKerjasamaPage.clickJenisKerjasama();
        extentTest.log(LogStatus.PASS,"click jenis kerjasama");
    }
    @Then("validate view page jenis kerjasama")
    public void validate_view_page_kerjasama(){
        Hooks.delay(1);
        Assert.assertEquals(jenisKerjasamaPage.getResultVPJenisKerjasama(),"Data Kerjasama");
        extentTest.log(LogStatus.PASS,"view page departemen");
    }

    //Input data
    @Given("click input data kerjasama")
    public void click_input_data_kerjasama() {
        Hooks.delay(1);
        jenisKerjasamaPage.clickInputdata();
        extentTest.log(LogStatus.PASS,"click input data");
    }
    @When("input data kerjasama")
    public void input_data_kerjasama() {
       Hooks.delay(1);
       jenisKerjasamaPage.setInputdata("videographer");
       extentTest.log(LogStatus.PASS,"input jenis kerjasama");
    }

    @When("click simpan kerjasama")
    public void click_simpan_kerjasama() {
        Hooks.delay(1);
        jenisKerjasamaPage.clickSimpan();
        extentTest.log(LogStatus.PASS,"click simpan jenis kerjasama");
    }

    @Then("validate input data kerjasama")
    public void validate_input_data() {
        Assert.assertEquals(jenisKerjasamaPage.getREsultInputData(), "Data berhasil disimpan");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS,"data berhasil diinput");
    }

    //Next Page
//    @Given("click next")
//    public void click_next(){
//        Hooks.delay(1);
//        departemenPage.clickNextPage();
//        extentTest.log(LogStatus.PASS,"click next");
//    }
//    @Then("validate next page")
//    public void validate_next_page(){
//        Hooks.delay(1);
//        Assert.assertEquals(departemenPage.getResultNextPage(),"11");
//        extentTest.log(LogStatus.PASS,"berhasil next page");
//    }
//
//    //Previous Page
//    @Given("click previous")
//    public void click_previous(){
//        Hooks.delay(1);
//        departemenPage.clickPreviousPage();
//        extentTest.log(LogStatus.PASS,"click previous");
//    }
//    @Then("validate previous page")
//    public void validate_previous_page(){
//        Hooks.delay(1);
//        Assert.assertEquals(departemenPage.getResultPreviousPage(),"1");
//        extentTest.log(LogStatus.PASS,"berhasil previous page");
//    }

    //Search
    @Given("input keywoad kerjasama")
    public void input_keywoard_kerjasama(){
        Hooks.delay(1);
        jenisKerjasamaPage.setFieldSearch("videographer");
        extentTest.log(LogStatus.PASS,"input keyword");
    }
    @When("click search kerjasama")
    public void click_search_kerjasama(){
        Hooks.delay(1);
        jenisKerjasamaPage.clickSearch();
        extentTest.log(LogStatus.PASS,"click search");
    }
    @Then("validate search kerjasama")
    public void validate_search(){
        Hooks.delay(1);
        Assert.assertEquals(jenisKerjasamaPage.getResultSearch(),"videographer");
        extentTest.log(LogStatus.PASS,"berhasil mencari data");
    }

    //Edit
//    @Given("click edit")
//    public void click_edit(){
//        Hooks.delay(1);
//        departemenPage.clickEdit();
//        extentTest.log(LogStatus.PASS,"click edit");
//    }
//    @When("input dataE")
//    public void input_dataE(){
//        Hooks.delay(1);
//        departemenPage.setInputEdit("malang");
//        extentTest.log(LogStatus.PASS,"input edit");
//    }
//    @When("click simpanE")
//    public void click_simpanE(){
//        Hooks.delay(1);
//        departemenPage.clickSimpanE();
//        extentTest.log(LogStatus.PASS,"click simpan edit");
//    }
//    @When("validate edit")
//    public void validate_edit(){
//        Hooks.delay(1);
//        Assert.assertEquals(departemenPage.getResultEditData(), "Data berhasil diubah");
//        driver.switchTo().alert().accept();
//        extentTest.log(LogStatus.PASS,"data berhasil diubah");
//
//    }
}
