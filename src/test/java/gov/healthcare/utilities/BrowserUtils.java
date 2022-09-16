package gov.healthcare.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserUtils {

    public static void verifyTitle(WebDriver driver , String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);



    }

}
