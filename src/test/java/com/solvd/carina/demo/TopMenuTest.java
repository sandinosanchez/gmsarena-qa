package com.solvd.carina.demo;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.carina.demo.gui.pages.*;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TopMenuTest extends AbstractTest {


//    @Test
//    public void testClickHomePage() {
//        HomePage hp = new HomePage(getDriver());
//        assertTrue(hp.isPageOpened());
//    }

    @Test
    public void testClickContactPage() {
        HomePage hp = new HomePage(getDriver());
        hp.open();
        assertTrue(hp.isPageOpened());

        ContactPage cp = hp.getTopMenu().clickContact();
        assertTrue(cp.isPageOpened("https://www.gsmarena.com/contact.php3", "Contact us"), "Glossary page not loaded");
//        assertTrue(cp.isUniqueElementPresent(), "Contact page not loaded");
    }

    @Test
    public void testClickGlossaryPage() {
        HomePage hp = new HomePage(getDriver());
        hp.open();
        assertTrue(hp.isPageOpened());

        GlossaryPage glossaryPage = hp.getTopMenu().clickGlossary();
        assertTrue(glossaryPage.isPageOpened("https://www.gsmarena.com/glossary.php3", "Mobile terms glossary"), "Glossary page not loaded");
//        assertTrue(glossaryPage.isUniqueElementPresent(), "Glossary page not loaded");
    }

    @Test
    public void testClickPhoneFinderPage() {
        HomePage hp = new HomePage(getDriver());
        hp.open();
        assertTrue(hp.isPageOpened());

        PhoneFinderPage phoneFinderPage = hp.getTopMenu().clickPhoneFinder();
        assertTrue(phoneFinderPage.isPageOpened("https://www.gsmarena.com/search.php3?", "Phone finder"), "Phone Finder page not loaded");
//        assertTrue(phoneFinderPage.isUniqueElementPresent(), "Phone Finder page not loaded");
    }

    @Test
    public void testClickToolsPage() {
        HomePage hp = new HomePage(getDriver());
        hp.open();
        assertTrue(hp.isPageOpened());

        ToolsPage toolsPage = hp.getTopMenu().clickTools();
        assertTrue(toolsPage.isPageOpened("https://www.gsmarena.com/tools.php3", "GSMArena Tools & Features"), "Tools page not loaded");
//        assertTrue(toolsPage.isUniqueElementPresent(), "Tools Finder page not loaded");
    }

    @Test
    public void testClickFeaturePage() {
        HomePage hp = new HomePage(getDriver());
        hp.open();
        assertTrue(hp.isPageOpened());

        FeaturePage featurePage = hp.getTopMenu().clickFeature();
        assertTrue(featurePage.isPageOpened("https://www.gsmarena.com/news.php3?sTag=Featured", "Articles tagged \"Featured\""), "Features page not loaded");
//        assertTrue(featurePage.isUniqueElementPresent(), "Features page not loaded");
    }

    @Test
    public void testClickVideoPage() {
        HomePage hp = new HomePage(getDriver());
        hp.open();
        assertTrue(hp.isPageOpened());

        VideoPage videoPage = hp.getTopMenu().clickVideo();
        assertTrue(videoPage.isPageOpened("https://www.gsmarena.com/videos.php3", "Videos"), "Videos page not loaded");
//        assertTrue(toolsPage.isUniqueElementPresent(), "Videos page not loaded");
    }

    @Test
    public void testClickReviewPage() {
        HomePage hp = new HomePage(getDriver());
        hp.open();
        assertTrue(hp.isPageOpened());

        ReviewPage reviewPage = hp.getTopMenu().clickReview();
        assertTrue(reviewPage.isPageOpened("https://www.gsmarena.com/reviews.php3", "Reviews"), "Reviews page not loaded");
//        assertTrue(toolsPage.isUniqueElementPresent(), "Reviews page not loaded");
    }


    @Test
    public void testClickNewsPage() {
        HomePage hp = new HomePage(getDriver());
        hp.open();
        assertTrue(hp.isPageOpened());

        NewsPage newsPage = hp.getTopMenu().clickNews();
        assertTrue(newsPage.isPageOpened("https://www.gsmarena.com/news.php3", "News"), "News page not loaded");
//        assertTrue(toolsPage.isUniqueElementPresent(), "News page not loaded");
    }

    @Test
    public void testClickCoveragePage() {
        HomePage hp = new HomePage(getDriver());
        hp.open();
        assertTrue(hp.isPageOpened());

        CoveragePage coveragePage = hp.getTopMenu().clickCoverage();
        assertTrue(coveragePage.isPageOpened("https://www.gsmarena.com/network-bands.php3", "Network coverage"), "Coverage page not loaded");
//        assertTrue(toolsPage.isUniqueElementPresent(), "Coverage page not loaded");
    }

}
