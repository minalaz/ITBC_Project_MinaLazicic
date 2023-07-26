package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStoreApplicationPage extends BasePage {
    private WebElement bookElement1;
    private WebElement loginBtn;
    private WebElement userNameValue;


    public BookStoreApplicationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getBookElement1() {
        this.bookElement1 = getDriver().findElement(By.cssSelector("#see-book-Git\\ Pocket\\ Guide > a"));
        return this.bookElement1;
    }

    public WebElement getLoginBtn() {
        this.loginBtn = getDriver().findElement(By.id("login"));
        return this.loginBtn;
    }

    public WebElement getUserNameValue() {
        this.userNameValue = getDriver().findElement(By.id("userName-value"));
        return this.userNameValue;
    }


    public BookStoreApplicationPage open() {
        getDriver().get("https://demoqa.com/books");
        return this;
    }

}
