package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FHCLoginPage {
    public FHCLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
@FindBy(xpath="//input[@id='UserName']")
    public WebElement userName;

    @FindBy(xpath="//input[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement signInButton;





}
