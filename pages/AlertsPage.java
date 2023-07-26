package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage extends BasePage {
    WebElement alertButton;
    WebElement timerAlertButton;
    WebElement confirmButton;
    WebElement promptButton;

    public AlertsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getAlertButton() {
        this.alertButton = getDriver().findElement(By.id("alertButton"));
        return this.alertButton;
    }
    public WebElement getTimerAlertButton(){
        this.timerAlertButton = getDriver().findElement(By.id("timerAlertButton"));
        return this.timerAlertButton;
    }
    public WebElement getConfirmButton() {
        this.confirmButton = getDriver().findElement(By.id("confirmButton"));
        return this.confirmButton;
    }
    public WebElement getPromptButton(){
        this.promptButton = getDriver().findElement(By.id("promtButton"));
        return this.promptButton;
    }

    public AlertsPage open() {
        getDriver().get("https://demoqa.com/alerts");
        return this;
    }
}

