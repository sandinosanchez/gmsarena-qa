package com.solvd.carina.demo;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.XlsDataSourceParameters;
import com.solvd.carina.demo.gui.pages.HomePage;
import com.solvd.carina.demo.gui.pages.ResultPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchDevicesTest extends AbstractTest {

    @Test(dataProvider = "SingleDataProvider")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "GSMArena-search", dsUid = "TUID", dsArgs = "device, storage, os, release")
    public void testSuccessfulSearch(String deviceName, String storage, String os, String releaseDate) {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        assertTrue(homePage.isPageOpened(), "Home page not loaded");

        ResultPage resultPage = homePage.getTopMenu().search(deviceName);
        assertTrue(resultPage.compareTitle(deviceName), "Device name not match");
        assertTrue(resultPage.compareOs(os), "Operating system not match");
        assertTrue(resultPage.compareStorage(storage), "Storage not match");
        assertTrue(resultPage.compareReleasedDate(releaseDate), "Released dates not match");
    }
}
