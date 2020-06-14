package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.FHCLoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FHCLogIn_Steps {
    FHCLoginPage fhcLoginPage=new FHCLoginPage();

    @Given("user is on the fhctriplogin page")
    public void user_is_on_the_fhctriplogin_page() {
        Driver.getDriver().get("http://www.fhctrip.com/Account/Logon");

    }

    @When("enter correct username")
    public void enter_correct_username() {
fhcLoginPage.userName.sendKeys(ConfigurationReader.getProperty("valid_username"));
    }

    @When("enter correct password")
    public void enter_correct_password() {
        fhcLoginPage.password.sendKeys(ConfigurationReader.getProperty("valid_password"));

    }
    @When("click Login button")
    public void click_Login_button() {
fhcLoginPage.signInButton.click();
    }

    @Then("verify the login is successful")
    public void verify_the_login_is_successful() {
        String actual=(Driver.getDriver().findElement(By.xpath("//span[@class='hidden-480']")).getText());
        Assert.assertEquals("ADD USER",actual);
        Driver.closeDriver();
    }
    @When("enter correct username {string}")
    public void enter_correct_username(String string) {
fhcLoginPage.userName.sendKeys(string);

    }

    @When("enter correct password {string}")
    public void enter_correct_password(String string) {
fhcLoginPage.password.sendKeys(string);
    }

}
