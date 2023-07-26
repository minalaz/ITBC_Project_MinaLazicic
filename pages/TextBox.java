package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox extends BasePage{
    private WebElement usernameField;
    private WebElement emailField;
    private WebElement currentAdressField;
    private WebElement permanentAdressField;
    private WebElement submitBtn;
    private WebElement allData;
    private WebElement nameOutput;
    private WebElement emailOutput;
    private WebElement currentAddressOutput;
    private WebElement permanentAddressOutput;

    public TextBox(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getUsernameField(){
        this.usernameField = getDriver().findElement(By.id("userName"));
        return this.usernameField;
    }
    public WebElement getEmailField(){
        this.emailField = getDriver().findElement(By.id("userEmail"));
        return this.emailField;
    }
    public WebElement getCurrentAdressField(){
        this.currentAdressField = getDriver().findElement(By.id("currentAddress"));
        return this.currentAdressField;
    }
    public WebElement getPermanentAdressField(){
        this.permanentAdressField = getDriver().findElement(By.id("permanentAddress"));
        return this.permanentAdressField;
    }
    public WebElement getSubmitBtn(){
        this.submitBtn = getDriver().findElement(By.id("submit"));
        return this.submitBtn;
    }
    public WebElement getAllData(){
        this.allData = getDriver().findElement(By.xpath("//div[@class = 'border col-md-12 col-sm-12']"));
        return this.allData;
    }
    public WebElement getNameOutput(){
        this.nameOutput = getDriver().findElement(By.id("name"));
        return this.nameOutput;
    }
    public WebElement getEmailOutput(){
        this.emailOutput = getDriver().findElement(By.id("email"));
        return this.emailOutput;
    }
    public WebElement getCurrentAddressOutput(){
        this.currentAddressOutput = getDriver().findElement(By.xpath("//p[@id='currentAddress']"));
        return this.currentAddressOutput;
    }
    public WebElement getPermanentAddressOutput(){
        this.permanentAddressOutput = getDriver().findElement(By.xpath("//p[@id='permanentAddress']"));
        return this.permanentAddressOutput;
    }
    public TextBox open(){
        getDriver().get("https://demoqa.com/text-box");
        return this;
    }
}
