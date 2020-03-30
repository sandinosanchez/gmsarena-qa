package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class GlossaryPage extends MenuPage {

    @FindBy(xpath = "//h3[text()='0 - 9']")
    private ExtendedWebElement firstElement;

    public GlossaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isUniqueElementPresent() {
        return firstElement.isElementPresent();
    }

    public String getFirstElementTitle() {
        return firstElement.getText();
    }
}
