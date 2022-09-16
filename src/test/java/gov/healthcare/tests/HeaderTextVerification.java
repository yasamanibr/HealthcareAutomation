package gov.healthcare.tests;

import gov.healthcare.pages.MainPage;
import gov.healthcare.utilities.ConfigurationReader;
import gov.healthcare.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HeaderTextVerification extends TestBase {


    @Test
    public void headerTextVerification_test() {

        mainPage.xButton.click();
        String expectedHeaderText = "Still need health insurance?";
        String actualHeaderText = mainPage.h1_header.getText();
        Assert.assertEquals(expectedHeaderText, actualHeaderText);


    }
}
