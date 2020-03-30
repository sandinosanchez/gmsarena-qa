package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PhoneFinderPage extends MenuPage {

    @FindBy(xpath = "//h3[text()='General']")
    private ExtendedWebElement brandSearchTitle;

    public PhoneFinderPage(WebDriver driver) {
        super(driver);
    }

    public String getBrandSearchTitle() {
        return brandSearchTitle.getText();
    }
}
