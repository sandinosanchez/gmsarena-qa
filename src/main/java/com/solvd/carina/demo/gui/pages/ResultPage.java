package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends AbstractPage {

    @FindBy(xpath = "//h1[contains(@class, 'specs-phone-name-title')]")
    private ExtendedWebElement resultTitle;

    @FindBy(xpath = "//span[@data-spec='storage-hl']")
    private ExtendedWebElement storage;

    @FindBy(xpath = "//span[@data-spec='os-hl']")
    private ExtendedWebElement os;

    @FindBy(xpath = "//span[@data-spec='released-hl']")
    private ExtendedWebElement releasedDate;

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public String getResultTitle() {
        return resultTitle.getText();
    }

    public String getStorage() {
        return storage.getText();
    }

    public String getOs() {
        return os.getText();
    }

    public String getReleasedDate() {
        return releasedDate.getText();
    }

    public boolean compareTitle(String title) {
        return getResultTitle().equalsIgnoreCase(title);
    }

    public boolean compareStorage(String storage) {
        return getStorage().equalsIgnoreCase(storage);
    }

    public boolean compareOs(String os) {
        return getOs().equalsIgnoreCase(os);
    }

    public boolean compareReleasedDate(String date) {
        return getReleasedDate().equalsIgnoreCase(date);
    }
}
