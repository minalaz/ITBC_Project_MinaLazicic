package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Droppable extends BasePage {
    private WebElement simpleBtn;
    private WebElement dragMe;
    private WebElement dropMe;
    private WebElement dropped;


    public Droppable(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getSimpleBtn() {
        this.simpleBtn = getDriver().findElement(By.xpath("//a[contains(text(), 'Simple')]"));
        return this.simpleBtn;
    }

    public WebElement getDragMe() {
        this.dragMe = getDriver().findElement(By.id("draggable"));
        return this.dragMe;
    }

    public WebElement getDropMe() {
        this.dropMe = getDriver().findElement(By.id("droppable"));
        return this.dropMe;
    }

    public WebElement getDropped() {
        this.dropped = getDriver().findElement(By.xpath("//p[contains(text(), 'Dropped')]"));
        return this.dropped;
    }

    public Droppable open() {
        getDriver().get("https://demoqa.com/droppable");
        return this;
    }
}
