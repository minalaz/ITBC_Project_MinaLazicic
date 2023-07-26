package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginForm extends BasePage {
    private WebElement userNameField;
    private WebElement passwordField;
    private WebElement loginCustomerBtn;
    private WebElement newUserBtn;

    public LoginForm(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getUserNameField() {
        this.userNameField = getDriver().findElement(By.id("userName"));
        return this.userNameField;
    }

    public WebElement getPasswordField() {
        this.passwordField = getDriver().findElement(By.id("password"));
        return this.passwordField;
    }

    public WebElement getLoginCustomerBtn() {
        this.loginCustomerBtn = getDriver().findElement(By.id("login"));
        return this.loginCustomerBtn;
    }

    public WebElement getNewUserBtn() {
        this.newUserBtn = getDriver().findElement(By.id("newUser"));
        return this.newUserBtn;
    }

    public LoginForm open() {
        getDriver().get("https://demoqa.com/login");
        return this;
    }
}