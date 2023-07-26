package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTests extends BaseTest {
    @Test
    public void verifyThatAfterEnteringDataAllDataOutputIsDisplayedBelowTextboxForm() {
        getTextBox().open();
        enterDataToInputField(getTextBox().getUsernameField(), getFakeName());
        enterDataToInputField(getTextBox().getEmailField(), getFakeUserName());
        enterDataToInputField(getTextBox().getCurrentAdressField(), getFakeAddress());
        enterDataToInputField(getTextBox().getPermanentAdressField(), getFakeAddress());
        scrollDownALittle();
        clickOnElement(getTextBox().getSubmitBtn());
        assertVisibilityOfElement(getTextBox().getAllData());
    }

    @Test
    public void verifyThatAfterEnteringDataAllDataOutputContainsAllEnteredData() {
        getTextBox().open();
        enterDataToInputField(getTextBox().getUsernameField(), getFakeName());
        enterDataToInputField(getTextBox().getEmailField(),getFakeUserName() );
        enterDataToInputField(getTextBox().getCurrentAdressField(), getFakeAddress());
        enterDataToInputField(getTextBox().getPermanentAdressField(), getFakeAddress());
        scrollDownALittle();
        clickOnElement(getTextBox().getSubmitBtn());
        scrollDownALittle();
        Assert.assertTrue(getTextBox().getNameOutput().getText().contains(getFakeName()));
        Assert.assertTrue(getTextBox().getEmailOutput().getText().contains(getFakeUserName()));
        Assert.assertTrue(getTextBox().getCurrentAddressOutput().getText().contains(getFakeAddress()));
        Assert.assertTrue(getTextBox().getPermanentAddressOutput().getText().contains(getFakeAddress()));
    }
}
