package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends MenuPage {

    @FindBy(xpath = "//h3[text()='We do appreciate your feedback']")
    private ExtendedWebElement subTitle;

    public ContactPage(WebDriver driver) {
        super(driver);
        setPageURL("contact.php3");
    }

    @Override
    public boolean isUniqueElementPresent() {
        return subTitle.isElementPresent();
    }

    public String getSubtitleText() {
        return subTitle.getText();
    }

}
