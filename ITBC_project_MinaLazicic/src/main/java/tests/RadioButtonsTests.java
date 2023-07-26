package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonsTests extends BaseTest{
    @Test
    public void verifyThatYesRadioButtonIsSelected() {
        getRadioButtons().open();
        clickOnElement(getRadioButtons().getYesRadio());
        assertVisibilityOfElement(getRadioButtons().getYesSelectedMessage());
    }
    @Test
    public void verifyThatImpressiveRadioButtonIsSelected(){
        getRadioButtons().open();
        clickOnElement(getRadioButtons().getImpressiveRadio());
        assertVisibilityOfElement(getRadioButtons().getImpressiveSelectedeMessage());
    }
}
