package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends AbstractPage {

    private static final Logger LOGGER = Logger.getLogger(SignUpPage.class);

    @FindBy(xpath = "//input[@id='uname']")
    private ExtendedWebElement nickName;

    @FindBy(xpath = "//form[@name='frmOpin']//input[@id='email']")
    private ExtendedWebElement email;

    @FindBy(xpath = "//form[@name='frmOpin']//input[@id='upass']")
    private ExtendedWebElement password;

    @FindBy(xpath = "//input[@id='iagree1']")
    private ExtendedWebElement checkBoxTerms;

    @FindBy(xpath = "//input[@id='iagree2']")
    private ExtendedWebElement checkBoxTermsAge;

    @FindBy(xpath = "//form[@name='frmOpin']//input[@id='nick-submit']")
    private ExtendedWebElement submitButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void signUp(String nickName, String email, String password) {
        LOGGER.info("Filling sign up form...");
        this.nickName.type(nickName);
        this.email.type(email);
        this.password.type(password);
        this.checkBoxTerms.click();
        this.checkBoxTermsAge.click();
        this.submitButton.click();
    }

    public boolean isNickNameWarningPresent() {
        LOGGER.info("Checking that the duplicate nick name warning is present...");
        return driver.findElement(By.xpath("//div[@id='nick-reason']")).isDisplayed();
    }

    public boolean wasSignUpSuccessful() {
        LOGGER.info("Checking that the sign up was successful...");
        return driver.findElement(By.xpath("//h3[text()='Your account was created. ']")).isDisplayed();
    }

    @Override
    public boolean isPageOpened() {
        boolean urlConfirmation = driver
                .getCurrentUrl()
                .equalsIgnoreCase("https://www.gsmarena.com/register.php3");
        boolean itemConfirmation = driver
                .findElement(By.xpath("//h3[text()='Why register']"))
                .getText()
                .equalsIgnoreCase("Why register");
        return urlConfirmation && itemConfirmation;
    }
}
