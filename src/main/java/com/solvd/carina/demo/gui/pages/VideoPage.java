package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VideoPage extends MenuPage {

    @FindBy(xpath = "//div[@id='review-body']//iframe")
    private List<ExtendedWebElement> videos;

    public VideoPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isUniqueElementPresent() {
        return videos.get(0).isElementPresent();
    }

    public int getVideosSize() {
        return videos.size();
    }
}
