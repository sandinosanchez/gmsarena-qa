package com.solvd.carina.demo;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.carina.demo.gui.pages.HomePage;
import com.solvd.carina.demo.gui.pages.RegistrationPage;
import org.testng.annotations.Test;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

public class RegistrationTest extends AbstractTest {

    @Test
    public void signUpTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        assertTrue(homePage.isPageOpened(), "Home page is not opened");

        RegistrationPage signUpPage = homePage.signUp();
        assertTrue(signUpPage.isPageOpened(), "Sign up page is not opened");

        signUpPage.register("sandino", "osososososos@gmail.com", "1234");

    }
}
