package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CoveragePage extends MenuPage {

    @FindBy(xpath = "//select[@name='selCountries']")
    private ExtendedWebElement selectCountries;

    public CoveragePage(WebDriver driver) {
        super(driver);
    }
}
