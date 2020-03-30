package com.solvd.carina.demo.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carina.demo.gui.pages.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TopMenu extends AbstractUIObject {
    private static final Logger LOGGER = Logger.getLogger(TopMenu.class);

    @FindBy(xpath = "//input[@name='sSearch']")
    private ExtendedWebElement inputSearch;

    @FindBy(xpath = "//a[@id='login-active']")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "//a[contains(@class, 'signup-icon')]")
    private ExtendedWebElement logoutButton;

    @FindBy(css = ".signup-icon")
    private ExtendedWebElement signUpLink;

    @FindBy(xpath = "//ul//a[text()='Home']")
    private ExtendedWebElement homeLink;

    @FindBy(xpath = "//ul//a[text()='News']")
    private ExtendedWebElement newsLink;

    @FindBy(xpath = "//ul//a[text()='Reviews']")
    private ExtendedWebElement reviewLink;

    @FindBy(xpath = "//ul//a[text()='Videos']")
    private ExtendedWebElement videoLink;

    @FindBy(xpath = "//ul//a[text()='Featured']")
    private ExtendedWebElement featuredLink;

    @FindBy(xpath = "//ul//a[text()='Phone Finder']")
    private ExtendedWebElement phoneFinderLink;

    @FindBy(xpath = "//ul//a[text()='Tools']")
    private ExtendedWebElement toolsLink;

    @FindBy(xpath = "//ul//a[text()='Glossary']")
    private ExtendedWebElement glossaryLink;

    @FindBy(xpath = "//ul//a[text()='Coverage']")
    private ExtendedWebElement coverageLink;

    @FindBy(xpath = "//ul//a[text()='Contact']")
    private ExtendedWebElement contactLink;

    public TopMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public SignUpPage clickSignUp() {
        LOGGER.info("Clicking sign up button...");
        signUpLink.click();
        return new SignUpPage(driver);
    }

    public HomePage clickLogin(String email, String password) {
        LOGGER.info("Clicking login button...");
        loginButton.click();
        return new LoginBox(driver).login(email, password);
    }

    public HomePage logout() {
        return null;
    }

    public void search(String parameter) {

    }

    public ContactPage clickContact() {
        return new ContactPage(driver);
    }

    public CoveragePage clickCoverage() {
        return new CoveragePage(driver);
    }

    public GlossaryPage clickGlossary() {
        return new GlossaryPage(driver);
    }

    public HomePage clickHome() {
        return new HomePage(driver);
    }

    public ReviewPage clickReview() {
        return new ReviewPage(driver);
    }

    public PhoneFinderPage clickPhoneFinder() {
        return new PhoneFinderPage(driver);
    }

    public NewsPage clickNews() {
        return new NewsPage(driver);
    }

    public ToolsPage clickTools() {
        return new ToolsPage(driver);
    }

    public VideoPage clickVideo() {
        return new VideoPage(driver);
    }

    public FeaturePage clickFeature() {
        return new FeaturePage(driver);
    }

}
