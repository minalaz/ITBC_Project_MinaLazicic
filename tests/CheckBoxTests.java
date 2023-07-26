package tests;


import org.testng.annotations.Test;


public class CheckBoxTests extends BaseTest {
@Test
    public void verifyThatClickingOnHomeCheckBoxSelectsCheckBox(){
    getCheckBox().open();
    clickOnElement(getCheckBox().getHomeCheckBox());
    assertElementIsSelected(getCheckBox().getHomeCheckBoxSelected());
}


}
