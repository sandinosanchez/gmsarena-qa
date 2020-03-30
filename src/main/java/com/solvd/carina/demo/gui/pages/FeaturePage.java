package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FeaturePage extends MenuPage {

    @FindBy(xpath = "")
    private List<ExtendedWebElement> features;

    public FeaturePage(WebDriver driver) {
        super(driver);
    }

}
