package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends BasePage {
    private WebElement elementsCard;
    private WebElement formsCard;
    private WebElement alertsFrameAndWindowsCard;
    private WebElement widgetsCard;
    private WebElement interactionsCard;

    private WebElement bookStoreApplication;


    public IndexPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public WebElement getElementsCard() {
        this.elementsCard = getDriver().findElement(By.xpath("//h5[contains (text (), 'Elements')]"));
        return this.elementsCard;
    }

    public WebElement getFormsCard() {
        this.formsCard = getDriver().findElement(By.xpath("//h5[contains (text (), 'Form')]"));
        return this.formsCard;
    }

    public WebElement getAlertsFrameAndWindowsCard() {
        this.alertsFrameAndWindowsCard = getDriver().findElement(By.xpath("//h5[contains (text (), 'Alerts, Frame & Windows')]"));
        return this.alertsFrameAndWindowsCard;
    }

    public WebElement getWidgetsCard() {
        this.widgetsCard = getDriver().findElement(By.xpath("//h5[contains(text(), 'Widgets')]"));
        return this.widgetsCard;
    }

    public WebElement getInteractionsCard() {
        this.interactionsCard = getDriver().findElement(By.xpath("//h5[contains(text(), 'Interactions')]"));
        return this.interactionsCard;
    }

    public WebElement getBookStoreApplication() {
        this.bookStoreApplication = getDriver().findElement(By.xpath("//h5[contains (text (), 'Book Store Application')]"));
        return this.bookStoreApplication;
    }

    public IndexPage open() {
        getDriver().get("https://demoqa.com/");
        return this;
    }
}
