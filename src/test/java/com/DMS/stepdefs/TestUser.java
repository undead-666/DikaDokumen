package com.DMS.stepdefs;

import com.DMS.hooks.Hooks;
import com.DMS.pages.UserPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestUser {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static UserPage userPage = new UserPage();

    public TestUser(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("click data master6")
    public void click_data_master6(){
        Hooks.delay(1);
        userPage.clickddDataMaster();
        extentTest.log(LogStatus.PASS,"click data master");
    }
    @When("click user")
    public void click_template(){
        Hooks.delay(1);
        userPage.clickUser();
        extentTest.log(LogStatus.PASS,"click user");
    }
    @Then("validate view page user")
    public void validate_view_page_user(){
        Hooks.delay(1);
        Assert.assertEquals(userPage.getResultVPUser(),"Data User");
        extentTest.log(LogStatus.PASS,"view page template");
    }

    //Input data
    @Given("click input data user")
    public void click_input_data_user() {
        Hooks.delay(1);
        userPage.clickInputdata();
        extentTest.log(LogStatus.PASS,"click input data user");
    }
    @When("input nik")
    public void input_nama_nik() {
        Hooks.delay(1);
        userPage.setNik("1234567890");
        extentTest.log(LogStatus.PASS,"input nik user");
    }
    @When("input namaU")
    public void input_nama_namaU() {
        Hooks.delay(1);
        userPage.setNama("videographer");
        extentTest.log(LogStatus.PASS,"input nama user");
    }
    @When("set dd departemenU")
    public void click_dd_departemenU(){
        Hooks.delay(1);
        userPage.getSetddDepartemen();
        extentTest.log(LogStatus.PASS,"set dd departemen");
    }
    @When("set dd tingkat akses")
    public void click_dd_tingkat_akses(){
        Hooks.delay(1);
        userPage.getSetddTingkatAkses();
        extentTest.log(LogStatus.PASS,"set dd tingkat akses");
    }
    @When("input email")
    public void input_email() {
       Hooks.delay(1);
       userPage.setEmail("videographer@gmail.com");
       extentTest.log(LogStatus.PASS,"input email");
    }
    @When("input usernameU")
    public void input_usernameU() {
        Hooks.delay(1);
        userPage.setUsername("videographer");
        extentTest.log(LogStatus.PASS,"input username");
    }
    @When("input passwordU")
    public void input_passwordU() {
        Hooks.delay(1);
        userPage.setPasswoed("videographer");
        extentTest.log(LogStatus.PASS,"input password");
    }
    @When("input CpasswordU")
    public void input_CpasswordU() {
        Hooks.delay(1);
        userPage.setCPassword("videographer");
        extentTest.log(LogStatus.PASS,"input konfirm password");
    }
    @When("set dd tipe akses")
    public void click_dd_tipe_akses(){
        Hooks.delay(1);
        userPage.getSetddTipeAkses();
        extentTest.log(LogStatus.PASS,"set dd tipe akses");
    }
    @When("click simpan user")
    public void click_simpan_user() {
        Hooks.delay(1);
        userPage.clickSimpan();
        extentTest.log(LogStatus.PASS,"click simpan user");
    }
    @Then("validate input data user")
    public void validate_input_data_user() {
        Assert.assertEquals(userPage.getREsultInputData(), "Data berhasil disimpan");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS,"data berhasil disimpan");
    }

    //Next Page
    @Given("click next user")
    public void click_next(){
        Hooks.delay(1);
        userPage.clickNextPage();
        extentTest.log(LogStatus.PASS,"click next");
    }
    @Then("validate next page user")
    public void validate_next_page_user(){
        Hooks.delay(1);
        Assert.assertEquals(userPage.getResultNextPage(),"11");
        extentTest.log(LogStatus.PASS,"berhasil next page");
    }

    //Previous Page
    @Given("click previous user")
    public void click_previous_user(){
        Hooks.delay(1);
        userPage.clickPreviousPage();
        extentTest.log(LogStatus.PASS,"click previous");
    }
    @Then("validate previous page user")
    public void validate_previous_page_user(){
        Hooks.delay(1);
        Assert.assertEquals(userPage.getResultPreviousPage(),"1");
        extentTest.log(LogStatus.PASS,"berhasil previous page");
    }

    //Search
    @Given("input keywoad user")
    public void input_keywoard_user(){
        Hooks.delay(1);
        userPage.setFieldSearch("videographer");
        extentTest.log(LogStatus.PASS,"input keyword");
    }
    @When("click search user")
    public void click_search_user(){
        Hooks.delay(1);
        userPage.clickSearch();
        extentTest.log(LogStatus.PASS,"click search user");
    }
    @Then("validate search user")
    public void validate_search_user(){
        Hooks.delay(1);
        Assert.assertEquals(userPage.getResultSearch(),"videographer");
        extentTest.log(LogStatus.PASS,"berhasil mencari data");
    }

    //Edit
    @Given("click edit user")
    public void click_edit_user(){
        Hooks.delay(1);
        userPage.clickEdit();
        extentTest.log(LogStatus.PASS,"click edit");
    }
    @When("input Enik")
    public void input_Enik(){
        Hooks.delay(1);
        userPage.setENik("12345678901");
        extentTest.log(LogStatus.PASS,"input Enik");
    }
    @When("input Enama")
    public void input_Enama(){
        Hooks.delay(1);
        userPage.setENama("videographer");
        extentTest.log(LogStatus.PASS,"input Enama");
    }
    @When("set ddE departemenU")
    public void click_ddE_departemenU(){
        Hooks.delay(1);
        userPage.getSetddEDepartemen();
        extentTest.log(LogStatus.PASS,"set dd departemen");
    }
    @When("set ddE tingkat aksesU")
    public void click_ddE_tingkat_aksesU(){
        Hooks.delay(1);
        userPage.getSetddETingkatAkses();
        extentTest.log(LogStatus.PASS,"set dd tingkat akses");
    }
    @When("input Eusername")
    public void input_Eusername(){
        Hooks.delay(1);
        userPage.setEUsername("videographer1");
        extentTest.log(LogStatus.PASS,"input EUsername");
    }
    @When("input Eemail")
    public void input_Eemail(){
        Hooks.delay(1);
        userPage.setEEmail("videographer@gmail.com");
        extentTest.log(LogStatus.PASS,"input EEmail");
    }
    @When("set ddE status")
    public void click_ddE_status(){
        Hooks.delay(1);
        userPage.getSetddEStatus();
        extentTest.log(LogStatus.PASS,"set dd Estatus");
    }
    @When("click simpan Euser")
    public void click_simpan_Euser(){
        Hooks.delay(1);
        userPage.clickSimpanE();
        extentTest.log(LogStatus.PASS,"click simpan edit");
    }
    @When("validate edit user")
    public void validate_edit_user(){
        Hooks.delay(1);
        Assert.assertEquals(userPage.getResultEditData(), "Data berhasil diubah");
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS,"data berhasil diubah");

    }
}
