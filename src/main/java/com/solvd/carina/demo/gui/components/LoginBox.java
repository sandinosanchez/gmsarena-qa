package com.solvd.carina.demo.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carina.demo.gui.pages.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginBox extends AbstractUIObject {
    private static final Logger LOGGER = Logger.getLogger(LoginBox.class);

    @FindBy(name = "sEmail")
    private ExtendedWebElement email;

    @FindBy(name = "sPassword")
    private ExtendedWebElement password;

    @FindBy(id = "nick-submit")
    private ExtendedWebElement submitLogin;

    public LoginBox(WebDriver driver) {
        super(driver);
    }

    public HomePage login(String email, String password) {
        LOGGER.info("Submitting login with email " + email);
        this.email.type(email);
        this.password.type(password);
        this.submitLogin.click();
        return new HomePage(driver);
    }
}
