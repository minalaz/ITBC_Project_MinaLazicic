package tests;

import org.testng.annotations.Test;

public class ModalDialogsTests extends BaseTest {
    @Test
    public void verifyThatClickingOnSmallModalBtnOpensUpSmallModal() {
        getModalDialogs().open();
        clickOnElement(getModalDialogs().getSmallModalBtn());
        assertVisibilityOfElement(getModalDialogs().getSmallModal());
    }

    @Test
    public void verifyThatClickingOnLargeModalBtnOpensUpLargeModal() {
        getModalDialogs().open();
        clickOnElement(getModalDialogs().getLargeModalBtn());
        assertVisibilityOfElement(getModalDialogs().getLargeModal());

    }

}
