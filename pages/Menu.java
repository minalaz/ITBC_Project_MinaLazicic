package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menu extends BasePage {
    private WebElement mainItem2;
    private WebElement subItem;
    private WebElement subSubList;

    public Menu(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getMainItem2() {
        this.mainItem2 = getDriver().findElement(By.xpath("//a[contains(text(), 'Main Item 2')]"));
        return this.mainItem2;
    }

    public WebElement getSubItem() {
        this.subItem = getDriver().findElement(By.xpath("//a[contains(text(), 'Sub Item')]"));
        return this.subItem;
    }

    public WebElement getSubSubList() {
        this.subSubList = getDriver().findElement(By.xpath("//a[contains(text(), 'SUB SUB LIST')]"));
        return this.subSubList;
    }

    public Menu open() {
        getDriver().get("https://demoqa.com/menu#");
        return this;
    }
}