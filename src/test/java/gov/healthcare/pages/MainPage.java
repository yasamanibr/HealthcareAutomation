package gov.healthcare.pages;

import gov.healthcare.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='hero-content']/h1")
    public static WebElement h1_header;

    @FindBy(xpath = "//*[@id='prefix-overlay-header']/button")
    public static WebElement xButton;








}
