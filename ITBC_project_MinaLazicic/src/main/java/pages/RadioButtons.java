package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtons extends BasePage {
    private WebElement yesRadio;
    private WebElement impressiveRadio;
    private WebElement yesSelectedMessage;
    private WebElement impressiveSelectedeMessage;

    public RadioButtons(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getYesRadio() {
        this.yesRadio = getDriver().findElement(By.xpath("//label[@for ='yesRadio']"));
        return this.yesRadio;
    }

    public WebElement getImpressiveRadio() {
        this.impressiveRadio = getDriver().findElement(By.xpath("//label[@for ='impressiveRadio']"));
        return this.impressiveRadio;
    }

    public WebElement getYesSelectedMessage() {
        this.yesSelectedMessage = getDriver().findElement(By.xpath("//span[contains (text(), 'Yes')]"));
        return this.yesSelectedMessage;
    }

    public WebElement getImpressiveSelectedeMessage() {
        this.impressiveSelectedeMessage = getDriver().findElement(By.xpath("//span[contains (text(), 'Impressive')]"));
        return this.impressiveSelectedeMessage;
    }

    public RadioButtons open() {
        getDriver().get("https://demoqa.com/radio-button");
        return this;
    }
}
