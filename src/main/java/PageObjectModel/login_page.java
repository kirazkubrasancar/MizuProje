package PageObjectModel;

import Utility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page extends AbstractClass {
    WebDriver driver;

    public login_page() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "EmailLogin")
    private WebElement emailtext;

    public void typeEmail() {
        sendKeysFunction(emailtext, "kirazkubrasancar@gmail.com");
    }

    @FindBy(id = "Password")
    private WebElement passwordtext;


    public void typePassword() {
        sendKeysFunction(passwordtext, "kirazkubrasancar1");
    }

    public void typePasswordWrong() {
        sendKeysFunction(passwordtext, "kubrasancarwrong");
    }

    @FindBy(className = "login__btn")
    private WebElement clickButton;


    public void clickButtonSign() {
        clickFunction(clickButton);
    }

    @FindBy(className = "js-forgot-password")
    private WebElement clickHref;

    public void forgot_password_öğesine_tıklarsam() {
        clickFunction(clickHref);
    }

    @FindBy(className = "user-process-hover")
    private WebElement userMenu;
    @FindBy(className = "user-menu__items--login")
    private WebElement menuContainer;

    public void login_verify_et() {
        Assertion(userMenu, menuContainer, "My Account");
    }

    @FindBy(className = "modal-body")
    private WebElement modal;

    public void wrong_verify_et() {
        Assertion(modal, modal, "E-mail address or password is incorrect. Please check your information and try again.");
    }

    @FindBy(className = "form-password-recovery__btn")
    private WebElement sendButton;

    @FindBy(className = "form-password-recovery")
    private WebElement forgotContainer;

    public void forgot_verify_et() {
        Assertion(sendButton, forgotContainer, "Send");
    }
}
