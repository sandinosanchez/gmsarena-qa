package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReviewPage extends MenuPage {

    @FindBy(xpath = "//div[contains(@class, 'floating-title')]//a")
    private List<ExtendedWebElement> reviews;

    public ReviewPage(WebDriver driver) {
        super(driver);
    }

    public int getReviewsSize() {
        return reviews.size();
    }
}
