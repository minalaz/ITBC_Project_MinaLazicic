package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CheckBox extends BasePage {
    private WebElement homeCheckBox;

    private WebElement homeCheckBoxSelected;

    public CheckBox(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getHomeCheckBox() {
        this.homeCheckBox = getDriver().findElement(By.xpath("//span[@class = 'rct-checkbox']"));
        return this.homeCheckBox;
    }

    public WebElement getHomeCheckBoxSelected() {
        this.homeCheckBoxSelected = getDriver().findElement(By.id("tree-node-home"));
        return this.homeCheckBoxSelected;
    }

    public CheckBox open() {
        getDriver().get("https://demoqa.com/checkbox");
        return this;
    }
}
