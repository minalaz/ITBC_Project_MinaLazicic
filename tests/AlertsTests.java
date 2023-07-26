package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTest {
    @AfterMethod
    public void afterEachTest() {
        getDriver().switchTo().alert().dismiss();
    }

    @Test
    public void verifyAlertButton() {
        getAlertsPage().open();
        clickOnElement(getAlertsPage().getAlertButton());
        Assert.assertEquals(getDriver().switchTo().alert().getText(), "You clicked a button");
    }

    @Test
    public void verifyTimerAlertbutton() {
        getAlertsPage().open();
        clickOnElement(getAlertsPage().getTimerAlertButton());
        getWait().until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(getDriver().switchTo().alert().getText(), "This alert appeared after 5 seconds");
    }

    @Test
    public void verifyConfirmButton() {
        getAlertsPage().open();
        clickOnElement(getAlertsPage().getConfirmButton());
        Assert.assertEquals(getDriver().switchTo().alert().getText(), "Do you confirm action?");
    }
    @Test
    public void verifyPromptButton(){
        getAlertsPage().open();
        scrollDownALittle();
        clickOnElement(getAlertsPage().getPromptButton());
        Assert.assertEquals(getDriver().switchTo().alert().getText(), "Please enter your name");
    }

}

