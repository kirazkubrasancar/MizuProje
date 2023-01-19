package stepDefinition;

import Utility.Driver;
import PageObjectModel.login_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class loginSignin {

    private WebDriver driver;
    login_page loginPage = new login_page();

    @Given("Mizu.com sitesine git")
    public void mizu_com_sitesine_git() {


        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mizu.com/en-mx/login");
        System.out.println("siteye gidildi");
    }


    @When("signin butonuna tıkla")
    public void signin_butonuna_tıkla() {
        loginPage.clickButtonSign();

    }

    @When("email gir")
    public void email_gir() {

        loginPage.typeEmail();
    }

    @When("password gir")
    public void password_gir() {

        loginPage.typePassword();
    }

    @Then("login verify et")
    public void login_verify_et() {
        loginPage.login_verify_et();
    }

    @Then("hata mesajı verify et")
    public void wrong_verify_et() {
        loginPage.wrong_verify_et();
    }

    @Then("forgot verify et")
    public void forgot_verify_et() {
        loginPage.forgot_verify_et();
    }

    @When("hatalı password gir")
    public void typePasswordWrong() {
        loginPage.typePasswordWrong();
    }


    @When("forgot password öğesine tıklarsam")
    public void clickHrefForgot() {
        loginPage.forgot_password_öğesine_tıklarsam();
    }
}

