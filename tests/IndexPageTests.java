package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class IndexPageTests extends BaseTest {


    @Test
    public void verifyThatClickingOnElementsCardOpensElementsPage() {
        getIndexPage().open();
        scrollDownToTheBottomOfThePage();
        clickOnElement(getIndexPage().getElementsCard());
        assertThatCurentUrlContainsText("/elements");
    }

    @Test
    public void verifyThatClickingOnFormsCardOpensFormsPage() {
        getIndexPage().open();
        scrollDownALittle();
        clickOnElement(getIndexPage().getFormsCard());
        assertThatCurentUrlContainsText("/forms");
    }

    @Test
    public void verifyThatClickingOnAlertsFrameAndWindowsCardOpensAlertsFrameAndWindowsPage() {
        getIndexPage().open();
        scrollDownALittle();
        clickOnElement(getIndexPage().getAlertsFrameAndWindowsCard());
        assertThatCurentUrlContainsText("alertsWindows");
    }

    @Test
    public void verifyThatClickingOnWidtgetsCardOpensWidgetsPage() {
        getIndexPage().open();
        scrollDownALittle();
        clickOnElement(getIndexPage().getWidgetsCard());
        assertThatCurentUrlContainsText("/widgets");
    }

    @Test
    public void verifyThatClickingOnInteractionsCardOpensInteractionsPage() {
        getIndexPage().open();
        scrollDownToTheBottomOfThePage();
        clickOnElement(getIndexPage().getInteractionsCard());
        assertThatCurentUrlContainsText("/interaction");
    }

    @Test
    public void verifyThatClickingOnBookStoreApplicatonCardOpensBookStoreApplicationPage() {
        getIndexPage().open();
        scrollDownToTheBottomOfThePage();
        clickOnElement(getIndexPage().getBookStoreApplication());
        assertThatCurentUrlContainsText("/books");
    }

    @Test
    public void verifyThatElementsAndFormsCardsAreNotOverLapping() {
        getIndexPage().open();
        scrollDownALittle();
        Assert.assertFalse(areElementsOverlapping(getIndexPage().getElementsCard(), getIndexPage().getFormsCard()));
    }
}


