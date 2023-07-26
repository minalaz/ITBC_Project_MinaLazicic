package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ModalDialogs extends BasePage {
    private WebElement smallModalBtn;
    private WebElement smallModal;
    private WebElement largeModalBtn;
    private WebElement largeModal;

    public ModalDialogs(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getSmallModalBtn() {
        this.smallModalBtn = getDriver().findElement(By.id("showSmallModal"));
        return this.smallModalBtn;
    }

    public WebElement getSmallModal() {
        this.smallModal = getDriver().findElement(By.xpath("//div[contains (text(), 'Small Modal')]"));
        return this.smallModal;
    }

    public WebElement getLargeModalBtn() {
        this.largeModalBtn = getDriver().findElement(By.id("showLargeModal"));
        return this.largeModalBtn;
    }

    public WebElement getLargeModal() {
        this.largeModal = getDriver().findElement(By.xpath("//div[contains (text(), 'Large Modal')]"));
        return this.largeModal;
    }

    public ModalDialogs open() {
        getDriver().get("https://demoqa.com/modal-dialogs");
        return this;
    }
}
