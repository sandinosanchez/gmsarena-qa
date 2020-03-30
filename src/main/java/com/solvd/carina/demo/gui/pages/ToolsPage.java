package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ToolsPage extends MenuPage {

    @FindBy(xpath = "//h3[text()='Compare']")
    private ExtendedWebElement compareTitle;

    public ToolsPage(WebDriver driver) {
        super(driver);
    }

    public String getCompareTitle() {
        return compareTitle.getText();
    }
}
