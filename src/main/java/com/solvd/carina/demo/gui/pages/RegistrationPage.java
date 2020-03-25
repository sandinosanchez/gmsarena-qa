package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends AbstractPage {

    @FindBy(xpath = "//input[@id='uname']")
    private ExtendedWebElement nickName;

    @FindBy(xpath = "//form[@name='frmOpin']//input[@id='email']")
    private ExtendedWebElement email;

    @FindBy(xpath = "//input[@id='iagree1']")
    private ExtendedWebElement checkBoxTerms;

    @FindBy(xpath = "//input[@id='iagree2']")
    private ExtendedWebElement checkBoxTermsAge;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }


}
