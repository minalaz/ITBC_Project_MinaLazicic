package tests;


import org.testng.annotations.Test;

public class BookStoreApplicationTests extends BaseTest{
    @Test
    public void verifyThatBookElementIsVisible(){
        getBookStoreApplicationPage().open();
        assertVisibilityOfElement(getBookStoreApplicationPage().getBookElement1());
    }
    @Test
    public void verifyThatClickingOnLoginBtnOpensUpLoginForm(){
        getBookStoreApplicationPage().open();
        clickOnElement(getBookStoreApplicationPage().getLoginBtn());
        assertThatCurentUrlContainsText("/login");
    }


    }


