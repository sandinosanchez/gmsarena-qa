package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VideoPage extends AbstractPage {

    @FindBy(xpath = "//h1[contains(@class, 'article-info-name')]")
    private ExtendedWebElement title;

    @FindBy(xpath = "//div[@id='review-body']//iframe")
    private List<ExtendedWebElement> videos;

    public VideoPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return title.getText();
    }

    public int getVideosSize() {
        return videos.size();
    }
}
