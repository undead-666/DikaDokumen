package com.DMS.stepdefs;

import com.DMS.hooks.Hooks;
import com.DMS.pages.MediaPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestMedia {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static MediaPage mediaPage = new MediaPage();

    public TestMedia(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("click data master3")
    public void click_data_master3(){
        Hooks.delay(1);
        mediaPage.clickddDataMaster();
        extentTest.log(LogStatus.PASS,"click data master");
    }
    @When("click media")
    public void click_media(){
        Hooks.delay(1);
        mediaPage.clickMedia();
        extentTest.log(LogStatus.PASS,"click media");
    }
    @Then("validate view page media")
    public void validate_view_page_media(){
        Hooks.delay(1);
        Assert.assertEquals(mediaPage.getResultVPMedia(),"Data Media Arsip");
        extentTest.log(LogStatus.PASS,"view page media");
    }

    //Input data
    @Given("click input data media")
    public void click_input_data_media() {
        Hooks.delay(1);
        mediaPage.clickInputdata();
        extentTest.log(LogStatus.PASS,"click input data media");
    }

    @When("input data media")
    public void input_data_media() {
       Hooks.delay(1);
       mediaPage.setInputdata("videographer");
       extentTest.log(LogStatus.PASS,"input media");
    }

    @When("click simpan media")
    public void click_simpan_media() {
        Hooks.delay(1);
        mediaPage.clickSimpan();
        extentTest.log(LogStatus.PASS,"click simpan media");
    }

    @Then("validate input data media")
    public void validate_input_data_media() {
        Assert.assertEquals(mediaPage.getREsultInputData(), "Data berhasil disimpan");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS,"data berhasil disimpan");
    }

    //Next Page
    @Given("click next media")
    public void click_next(){
        Hooks.delay(1);
        mediaPage.clickNextPage();
        extentTest.log(LogStatus.PASS,"click next");
    }
    @Then("validate next page media")
    public void validate_next_page_media(){
        Hooks.delay(1);
        Assert.assertEquals(mediaPage.getResultNextPage(),"11");
        extentTest.log(LogStatus.PASS,"berhasil next page");
    }

    //Previous Page
    @Given("click previous media")
    public void click_previous_media(){
        Hooks.delay(1);
        mediaPage.clickPreviousPage();
        extentTest.log(LogStatus.PASS,"click previous");
    }
    @Then("validate previous page media")
    public void validate_previous_page_media(){
        Hooks.delay(1);
        Assert.assertEquals(mediaPage.getResultPreviousPage(),"1");
        extentTest.log(LogStatus.PASS,"berhasil previous page");
    }

    //Search
    @Given("input keywoad media")
    public void input_keywoard_media(){
        Hooks.delay(1);
        mediaPage.setFieldSearch("testing");
        extentTest.log(LogStatus.PASS,"input keyword");
    }
    @When("click search media")
    public void click_search(){
        Hooks.delay(1);
        mediaPage.clickSearch();
        extentTest.log(LogStatus.PASS,"click search media");
    }
    @Then("validate search media")
    public void validate_search(){
        Hooks.delay(1);
        Assert.assertEquals(mediaPage.getResultSearch(),"testing");
        extentTest.log(LogStatus.PASS,"berhasil mencari data");
    }

    //Edit
    @Given("click edit media")
    public void click_edit_media(){
        Hooks.delay(1);
        mediaPage.clickEdit();
        extentTest.log(LogStatus.PASS,"click edit");
    }
    @When("input dataE media")
    public void input_dataE(){
        Hooks.delay(1);
        mediaPage.setInputEdit("testing");
        extentTest.log(LogStatus.PASS,"input edit");
    }
    @When("click simpanE media")
    public void click_simpanE(){
        Hooks.delay(1);
        mediaPage.clickSimpanE();
        extentTest.log(LogStatus.PASS,"click simpan edit");
    }
    @When("validate edit media")
    public void validate_edit_media(){
        Hooks.delay(1);
        Assert.assertEquals(mediaPage.getResultEditData(), "Data berhasil diubah");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS,"data berhasil diubah");

    }
}
