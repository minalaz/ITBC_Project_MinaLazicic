package tests;


import org.testng.annotations.Test;

public class LoginFormTests extends BaseTest {
    @Test
    public void verifyThatEnteringValidCredentialsLogsInCustomer() throws InterruptedException {
        getLoginForm().open();
        enterDataToInputField(getLoginForm().getUserNameField(), getValidUserName());
        enterDataToInputField(getLoginForm().getPasswordField(), getValidPassword());
        scrollDownALittle();
        clickOnElement(getLoginForm().getLoginCustomerBtn());
        Thread.sleep(3000);
        assertVisibilityOfElement(getBookStoreApplicationPage().getUserNameValue());
    }

    @Test
    public void verifyThatClickingOnNewUserBtnOpensUpRegisterForm() {
        getBookStoreApplicationPage().open();
        clickOnElement(getBookStoreApplicationPage().getLoginBtn());
        scrollDownALittle();
        clickOnElement(getLoginForm().getNewUserBtn());
        assertThatCurentUrlContainsText("register");
    }

    @Test
    public void verifyThatEmptyLoginFormDoesntLogInCustomer() {
        getLoginForm().open();
        scrollDownALittle();
        clickOnElement(getLoginForm().getLoginCustomerBtn());
        assertThatCurentUrlContainsText("login");
    }

    @Test
    public void verifyThatEnteringShortInvalidUserNameInUserNameFieldDoesntLogInCustomer() {
        getLoginForm().open();
        enterDataToInputField(getLoginForm().getUserNameField(), getInvalidUserName());
        scrollDownALittle();
        clickOnElement(getLoginForm().getLoginCustomerBtn());
        assertThatCurentUrlContainsText("login");
    }


}