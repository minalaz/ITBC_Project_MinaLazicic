package tests;

import org.testng.annotations.Test;

public class MenuTests extends BaseTest {
    @Test
    public void verifyThatWhenHoveredOnMainItem2SubmenuIsDisplayed() {
        getMenu().open();
        hoverOnElement(getMenu().getMainItem2());
        assertVisibilityOfElement(getMenu().getSubItem());
    }

    @Test
    public void verifyThatWhenHoveredOnSubmenuSubSubListIsDisplayed() {
        getMenu().open();
        hoverOnElement(getMenu().getMainItem2());
        hoverOnElement(getMenu().getSubItem());
        assertVisibilityOfElement(getMenu().getSubSubList());
    }
}
