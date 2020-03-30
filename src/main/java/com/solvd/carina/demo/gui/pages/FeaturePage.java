package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FeaturePage extends AbstractPage {

    @FindBy(xpath = "//h1[contains(@class, 'article-info-name')]")
    private ExtendedWebElement tittle;

    @FindBy(xpath = )

    public FeaturePage(WebDriver driver) {
        super(driver);
    }
}
