package gov.healthcare.tests;

import gov.healthcare.pages.MainPage;
import gov.healthcare.utilities.Driver;
import gov.healthcare.utilities.Utils;
import gov.healthcare.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import static gov.healthcare.utilities.ConfigurationReader.getProperty;
import static gov.healthcare.utilities.Driver.getDriver;

public abstract class TestBase {

    //protected WebDriver driver;
    public static MainPage mainPage;

    @BeforeMethod
    public void setupMethod(){

        getDriver().get(getProperty("env"));
        mainPage = new MainPage();

    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

}
