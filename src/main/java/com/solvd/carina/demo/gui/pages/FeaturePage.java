package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FeaturePage extends MenuPage {

    @FindBy(xpath = "//h3[text()='Realme 6 in for review']")
    private ExtendedWebElement reviewTitle;

    public FeaturePage(WebDriver driver) {
        super(driver);
    }

    public String getReviewTitle() {
        return reviewTitle.getText();
    }
}
