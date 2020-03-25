package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends AbstractPage {

    private static final Logger LOGGER = Logger.getLogger(RegistrationPage.class);

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

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void register(String nickName, String email, String password) {
        LOGGER.info("Writing " + nickName + " to nickname input field...");
        this.nickName.type(nickName);
        LOGGER.info("Writing " + email + " to email field...");
        this.email.type(email);
        LOGGER.info("Writing " + password + "to password input field...");
        this.password.type(password);
        LOGGER.info("Clicking checkbox for personal data...");
        this.checkBoxTerms.click();
        LOGGER.info("Clicking checkbox for age...");
        this.checkBoxTermsAge.click();
    }

    @Override
    public boolean isPageOpened() {
        return getDriver().getCurrentUrl().equalsIgnoreCase("https://www.gsmarena.com/register.php3");
    }

    public String getColorFromElement() {
        return Color.fromString(email.getAttribute("background-color")).asHex();
    }

/*    public boolean checkUiAlerts() {
        String emailBackgroundColor = getColorFromElement(email);
        String passwordBackgroundColor = getColorFromElement(password);
        if (emailBackgroundColor.equals("#fffefe") && passwordBackgroundColor.equals("#fffefe")) {
            if (getDriver().findElement(new By.ByCssSelector(".icon-checkmark")).isDisplayed()) {

            }
        }
    }*/

}
