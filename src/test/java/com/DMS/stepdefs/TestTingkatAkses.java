package com.DMS.stepdefs;

import com.DMS.hooks.Hooks;
import com.DMS.pages.TingkatAksesPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTingkatAkses {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static TingkatAksesPage tingkatAksesPage = new TingkatAksesPage();

    public TestTingkatAkses(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("click data master5")
    public void click_data_master5(){
        Hooks.delay(1);
        tingkatAksesPage.clickddDataMaster();
        extentTest.log(LogStatus.PASS,"click data master");
    }
    @When("click tingkat akses")
    public void click_tingkat_akses(){
        Hooks.delay(1);
        tingkatAksesPage.clickTingkatAkses();
        extentTest.log(LogStatus.PASS,"click tingkat akses");
    }
    @Then("validate view page tingkat akses")
    public void validate_view_page_tingkat_akses(){
        Hooks.delay(1);
        Assert.assertEquals(tingkatAksesPage.getResultVPTingkatAkses(),"Data Tingkat Akses");
        extentTest.log(LogStatus.PASS,"view page tingkat akses");
    }

    //Input data
    @Given("click input data tingkat akses")
    public void click_input_data_tingkat_akses() {
        Hooks.delay(1);
        tingkatAksesPage.clickInputdata();
        extentTest.log(LogStatus.PASS,"click input data tingkat akses");
    }
    @When("set dd departemen1")
    public void click_dd_departemen1(){
        Hooks.delay(1);
        tingkatAksesPage.getSetddDepartemen();
        extentTest.log(LogStatus.PASS,"set dd departemen");
    }
    @When("input nama tingkat akses")
    public void input_nama_tingkat_akses() {
       Hooks.delay(1);
       tingkatAksesPage.setNamaTingkatAkses("videographer");
       extentTest.log(LogStatus.PASS,"input nama tingkat akses");
    }
    @When("click simpan tingkat akses")
    public void click_simpan_tingkat_akses() {
        Hooks.delay(1);
        tingkatAksesPage.clickSimpan();
        extentTest.log(LogStatus.PASS,"click simpan tingkat akses");
    }

    @Then("validate input data tingkat akses")
    public void validate_input_data_tingkat_akses() {
        Assert.assertEquals(tingkatAksesPage.getREsultInputData(), "Data berhasil disimpan");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS,"data berhasil disimpan");
    }

    //Next Page
    @Given("click next tingkat akses")
    public void click_next_tingkat_akses(){
        Hooks.delay(1);
        tingkatAksesPage.clickNextPage();
        extentTest.log(LogStatus.PASS,"click next");
    }
    @Then("validate next page tingkat akses")
    public void validate_next_page_tingkat_akses(){
        Hooks.delay(1);
        Assert.assertEquals(tingkatAksesPage.getResultNextPage(),"11");
        extentTest.log(LogStatus.PASS,"berhasil next page");
    }

    //Previous Page
    @Given("click previous tingkat akses")
    public void click_previous_tingkat_akses(){
        Hooks.delay(1);
        tingkatAksesPage.clickPreviousPage();
        extentTest.log(LogStatus.PASS,"click previous");
    }
    @Then("validate previous page tingkat akses")
    public void validate_previous_page_tingkat_akses(){
        Hooks.delay(1);
        Assert.assertEquals(tingkatAksesPage.getResultPreviousPage(),"1");
        extentTest.log(LogStatus.PASS,"berhasil previous page");
    }

    //Search
    @Given("input keywoad tingkat akses")
    public void input_keywoard_tingkat_akses(){
        Hooks.delay(1);
        tingkatAksesPage.setFieldSearch("videographer");
        extentTest.log(LogStatus.PASS,"input keyword");
    }
    @When("click search tingkat akses")
    public void click_search_tingkat_akses(){
        Hooks.delay(1);
        tingkatAksesPage.clickSearch();
        extentTest.log(LogStatus.PASS,"click search tingkat_akses");
    }
    @Then("validate search tingkat akses")
    public void validate_search_tingkat_akses(){
        Hooks.delay(1);
        Assert.assertEquals(tingkatAksesPage.getResultSearch(),"videographer");
        extentTest.log(LogStatus.PASS,"berhasil mencari data");
    }

    //Edit
    @Given("click edit tingkat akses")
    public void click_edit_tingkat_akses(){
        Hooks.delay(1);
        tingkatAksesPage.clickEdit();
        extentTest.log(LogStatus.PASS,"click edit");
    }
    @When("set ddE departemen TA")
    public void click_ddE_departemen_TA(){
        Hooks.delay(1);
        tingkatAksesPage.getSetddEDepartemen();
        extentTest.log(LogStatus.PASS,"set dd departemen");
    }
    @When("input Enama TA")
    public void input_Enama_TA(){
        Hooks.delay(1);
        tingkatAksesPage.setENama("videographer");
        extentTest.log(LogStatus.PASS,"input Enama TA");
    }
    @When("click simpan ETA")
    public void click_simpan_ETA(){
        Hooks.delay(1);
        tingkatAksesPage.clickSimpanE();
        extentTest.log(LogStatus.PASS,"click simpan edit");
    }
    @When("validate edit tingkat akses")
    public void validate_edit_tingkat_akses(){
        Hooks.delay(1);
        Assert.assertEquals(tingkatAksesPage.getResultEditData(), "Data Berhasil diubah");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS,"Data berhasil diubah");

    }
}
