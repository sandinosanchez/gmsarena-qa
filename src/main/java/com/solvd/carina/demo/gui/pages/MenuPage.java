package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.gui.components.TopMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class MenuPage extends AbstractPage {

    @FindBy(css = ".wrapper.clearfix")
    private TopMenu topMenu;

    @FindBy(xpath = "//h1[contains(@class, 'article-info-name')]")
    private ExtendedWebElement title;

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public TopMenu getTopMenu() {
        return topMenu;
    }

    public boolean isPageOpened(String url, String title) {
        boolean urlConfirmation = driver
                .getCurrentUrl()
                .equalsIgnoreCase(url);
        boolean itemConfirmation = this.title
                .getText()
                .equalsIgnoreCase(title);
        return urlConfirmation && itemConfirmation && isUniqueElementPresent();
    }

    public abstract boolean isUniqueElementPresent();

}
