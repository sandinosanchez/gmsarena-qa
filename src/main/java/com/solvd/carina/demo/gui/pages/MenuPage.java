package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class MenuPage extends AbstractPage {

    @FindBy(xpath = "//h1[contains(@class, 'article-info-name')]")
    private ExtendedWebElement title;

    public MenuPage(WebDriver driver) {
        super(driver);
    }

}
