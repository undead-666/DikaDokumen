package com.DMS.stepdefs;

import com.DMS.hooks.Hooks;
import com.DMS.pages.DepartemenPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestDepartemen {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static DepartemenPage departemenPage = new DepartemenPage();

    public TestDepartemen(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("click data master")
    public void click_data_master(){
        Hooks.delay(1);
        departemenPage.clickddDataMaster();
        extentTest.log(LogStatus.PASS,"click data master");
    }
    @When("click departemen")
    public void click_departemen(){
        Hooks.delay(1);
        departemenPage.clickDepartemen();
        extentTest.log(LogStatus.PASS,"click departemen");
    }
    @Then("validate view page departemen")
    public void validate_view_page_departemen(){
        Hooks.delay(1);
        Assert.assertEquals(departemenPage.getResultVPDepartemen(),"Data Departemen");
        extentTest.log(LogStatus.PASS,"view page departemen");
    }

    //Input data
    @Given("click input data")
    public void click_input_data() {
        Hooks.delay(1);
        departemenPage.clickInputdata();
        extentTest.log(LogStatus.PASS,"click input data");
    }

    @When("input data")
    public void input_data() {
       Hooks.delay(1);
       departemenPage.setInputdata("malang");
       extentTest.log(LogStatus.PASS,"input departemen");
    }

    @When("click simpan")
    public void click_simpan() {
        Hooks.delay(1);
        departemenPage.clickSimpan();
        extentTest.log(LogStatus.PASS,"click simpan");
    }

    @Then("validate input data")
    public void validate_input_data() {
        Assert.assertEquals(departemenPage.getREsultInputData(), "Data berhasil disimpan");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS,"data berhasil diinput");
    }

    //Next Page
    @Given("click next")
    public void click_next(){
        Hooks.delay(1);
        departemenPage.clickNextPage();
        extentTest.log(LogStatus.PASS,"click next");
    }
    @Then("validate next page")
    public void validate_next_page(){
        Hooks.delay(1);
        Assert.assertEquals(departemenPage.getResultNextPage(),"11");
        extentTest.log(LogStatus.PASS,"berhasil next page");
    }

    //Previous Page
    @Given("click previous")
    public void click_previous(){
        Hooks.delay(1);
        departemenPage.clickPreviousPage();
        extentTest.log(LogStatus.PASS,"click previous");
    }
    @Then("validate previous page")
    public void validate_previous_page(){
        Hooks.delay(1);
        Assert.assertEquals(departemenPage.getResultPreviousPage(),"1");
        extentTest.log(LogStatus.PASS,"berhasil previous page");
    }

    //Search
    @Given("input keywoad")
    public void input_keywoard(){
        Hooks.delay(1);
        departemenPage.setFieldSearch("malang");
        extentTest.log(LogStatus.PASS,"input keyword");
    }
    @When("click search")
    public void click_search(){
        Hooks.delay(1);
        departemenPage.clickSearch();
        extentTest.log(LogStatus.PASS,"click search");
    }
    @Then("validate search")
    public void validate_search(){
        Hooks.delay(1);
        Assert.assertEquals(departemenPage.getResultSearch(),"malang");
        extentTest.log(LogStatus.PASS,"berhasil mencari data");
    }

    //Edit
    @Given("click edit")
    public void click_edit(){
        Hooks.delay(1);
        departemenPage.clickEdit();
        extentTest.log(LogStatus.PASS,"click edit");
    }
    @When("input dataE")
    public void input_dataE(){
        Hooks.delay(1);
        departemenPage.setInputEdit("malang");
        extentTest.log(LogStatus.PASS,"input edit");
    }
    @When("click simpanE")
    public void click_simpanE(){
        Hooks.delay(1);
        departemenPage.clickSimpanE();
        extentTest.log(LogStatus.PASS,"click simpan edit");
    }
    @When("validate edit")
    public void validate_edit(){
        Hooks.delay(1);
        Assert.assertEquals(departemenPage.getResultEditData(), "Data berhasil diubah");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS,"data berhasil diubah");

    }
}
