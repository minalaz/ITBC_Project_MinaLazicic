package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;


public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private IndexPage indexPage;
    private TextBox textBox;
    private CheckBox checkBox;
    private RadioButtons radioButtons;
    private ModalDialogs modalDialogs;
    private Menu menu;
    private Droppable droppable;
    private BookStoreApplicationPage bookStoreApplicationPage;
    private LoginForm loginForm;
    private JavascriptExecutor javascriptExecutor;
    private Actions actions;
    private Faker faker;
    private String validUserName;
    private String invalidUserName;
    private String validPassword;
    private String invalidPassword;
    private String fakeName;
    private String fakeUserName;
    private String fakeAddress;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Users//minad//Downloads//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        indexPage = new IndexPage(driver, wait);
        textBox = new TextBox(driver, wait);
        checkBox = new CheckBox(driver, wait);
        radioButtons = new RadioButtons(driver, wait);
        modalDialogs = new ModalDialogs(driver, wait);
        menu = new Menu(driver, wait);
        droppable = new Droppable(driver, wait);
        bookStoreApplicationPage = new BookStoreApplicationPage(driver, wait);
        loginForm = new LoginForm(driver, wait);
        javascriptExecutor = (JavascriptExecutor) driver;
        actions = new Actions(driver);
        faker = new Faker();
        validUserName = "sardinamore3@gmail.com";//testing registered user
        validPassword = "Sardinamore3!";//testing registered user
        invalidUserName = "xxxx";
        invalidPassword = "xxxx";
        fakeName = faker.name().fullName();
        fakeUserName = faker.internet().emailAddress();
        fakeAddress = faker.address().fullAddress();
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public WebDriverWait getWait() {
        return this.wait;
    }

    public IndexPage getIndexPage() {
        return this.indexPage;
    }

    public TextBox getTextBox() {
        return this.textBox;
    }

    public CheckBox getCheckBox() {
        return this.checkBox;
    }

    public RadioButtons getRadioButtons() {
        return this.radioButtons;
    }

    public ModalDialogs getModalDialogs() {
        return this.modalDialogs;
    }


    public Menu getMenu() {
        return this.menu;
    }

    public Droppable getDroppable() {
        return this.droppable;
    }

    public BookStoreApplicationPage getBookStoreApplicationPage() {
        return this.bookStoreApplicationPage;
    }

    public LoginForm getLoginForm() {
        return this.loginForm;
    }


    public String getValidUserName() {
        return this.validUserName;
    }

    public String getValidPassword() {
        return this.validPassword;
    }

    public String getInvalidUserName() {
        return this.invalidUserName;
    }

    public String getFakeName(){return this.fakeName;}
    public String getFakeUserName(){return this.fakeUserName;}
    public String getFakeAddress(){return this.fakeAddress;}


    @BeforeMethod
    public void beforeEachTest() {
        driver.manage().window().maximize();
    }

    @AfterClass
    public void cleanUp() {
        driver.close();
    }

    public void scrollDownALittle() {
        javascriptExecutor.executeScript("window.scrollTo(0, 500)");
    }

    public void scrollDownToTheBottomOfThePage() {
        javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    public void assertThatCurentUrlContainsText(String text) {
        Assert.assertTrue(getDriver().getCurrentUrl().contains(text));
    }

    public void assertVisibilityOfElement(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
    }


    public void hoverOnElement(WebElement element) {

        actions.moveToElement(element).perform();
    }

    public void enterDataToInputField(WebElement element, String text) {
        element.sendKeys(text);
    }


    public void assertElementIsSelected(WebElement element) {
        Assert.assertTrue(element.isSelected());

    }

    public void dragAndDrop(WebElement e1, WebElement e2) {
        actions.dragAndDrop(e1, e2).perform();
    }

    public boolean areElementsOverlapping(WebElement element1, WebElement element2) {
        Rectangle r1 = element1.getRect();
        Point topRight1 = r1.getPoint().moveBy(r1.getWidth(), 0);
        Point bottomLeft1 = r1.getPoint().moveBy(0, r1.getHeight());

        Rectangle r2 = element2.getRect();
        Point topRight2 = r2.getPoint().moveBy(r2.getWidth(), 0);
        Point bottomLeft2 = r2.getPoint().moveBy(0, r2.getHeight());

        if (topRight1.getY() > bottomLeft2.getY()
                || bottomLeft1.getY() < topRight2.getY()) {
            return false;
        }
        if (topRight1.getX() < bottomLeft2.getX()
                || bottomLeft1.getX() > topRight2.getX()) {
            return false;
        }
        return true;
    }


}


