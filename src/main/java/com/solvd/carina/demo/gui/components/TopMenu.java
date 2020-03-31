package com.solvd.carina.demo.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carina.demo.gui.pages.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

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

    @FindBy(xpath = "//button[@role='button']")
    private ExtendedWebElement subMenuButton;

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

    // //div[contains(@class, 'phone-results')]//li[not(contains(@class, 'permanent'))]//a

    public HomePage logout() {
        return null;
    }

    public ResultPage search(String model) {
        LOGGER.info("Searching for " + model + "...");
        inputSearch.type(model);
        inputSearch.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[contains(@class, 'makers')]//a")).click();
        return new ResultPage(driver);
    }

    public ContactPage clickContact() {
        LOGGER.info("Clicking Contact page...");
        subMenuButton.click();
        contactLink.click();
        return new ContactPage(driver);
    }

    public CoveragePage clickCoverage() {
        LOGGER.info("Clicking Coverage page...");
        subMenuButton.click();
        coverageLink.click();
        return new CoveragePage(driver);
    }

    public GlossaryPage clickGlossary() {
        LOGGER.info("Clicking Glossary page...");
        subMenuButton.click();
        glossaryLink.click();
        return new GlossaryPage(driver);
    }

    public HomePage clickHome() {
        LOGGER.info("Clicking Home page...");
        subMenuButton.click();
        homeLink.click();
        return new HomePage(driver);
    }

    public ReviewPage clickReview() {
        LOGGER.info("Clicking Review page...");
        subMenuButton.click();
        reviewLink.click();
        return new ReviewPage(driver);
    }

    public PhoneFinderPage clickPhoneFinder() {
        LOGGER.info("Clicking Phone Finder page...");
        subMenuButton.click();
        phoneFinderLink.click();
        return new PhoneFinderPage(driver);
    }

    public NewsPage clickNews() {
        LOGGER.info("Clicking News page...");
        subMenuButton.click();
        newsLink.click();
        return new NewsPage(driver);
    }

    public ToolsPage clickTools() {
        LOGGER.info("Clicking Tools page...");
        subMenuButton.click();
        toolsLink.click();
        return new ToolsPage(driver);
    }

    public VideoPage clickVideo() {
        LOGGER.info("Clicking Video page...");
        subMenuButton.click();
        videoLink.click();
        return new VideoPage(driver);
    }

    public FeaturePage clickFeature() {
        LOGGER.info("Clicking Feature page...");
        subMenuButton.click();
        featuredLink.click();
        return new FeaturePage(driver);
    }

}
