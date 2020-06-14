package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;
import utilities.Driver;

public class ScenarioOutlineExample_StepDefinition {
    DataTablesPage dataTablesPage=new DataTablesPage();

    @Given("User is on the datatables homepage")
    public void user_is_on_the_datatables_homepage() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @When("User clicks on new")
    public void user_clicks_on_new() {
dataTablesPage.newButton.click();
    }

    @When("User enters first name")
    public void user_enters_first_name() {
dataTablesPage.firstname.sendKeys("Fatih");
    }

    @When("User enters lastname")
    public void user_enters_lastname() {
dataTablesPage.lastName.sendKeys("kılıc");
    }

    @When("User enters position")
    public void user_enters_position() {
dataTablesPage.position.sendKeys("SDET");
    }

    @When("User enters first office")
    public void user_enters_first_office() {
dataTablesPage.office.sendKeys("346");
    }

    @When("User enters first extension")
    public void user_enters_first_extension() {
dataTablesPage.extension.sendKeys("Sivas");
    }
    @When("User enters startdate")
    public void user_enters_startdate() {
dataTablesPage.startDate.sendKeys("2020-07-15");
    }

    @When("User enters salary")
    public void user_enters_salary() {
dataTablesPage.salary.sendKeys("3500");
    }

    @When("clicks create button")
    public void clicks_create_button() {
dataTablesPage.createButton.click();
    }
    @When("user enters firstname to the searchbox")
    public void user_enters_firstname_to_the_searchbox() {
dataTablesPage.search.sendKeys("fatih");


    }

    @Then("verify that user see the first name in the searchbox")
    public void verify_that_user_see_the_first_name_in_the_searchbox() {
        String nameverify=dataTablesPage.nameField.getText();

        Assert.assertTrue(nameverify.contains("Fatih"));


    }
    @When("User enters first name {string}")
    public void user_enters_first_name(String Fatih) {
dataTablesPage.firstname.sendKeys(Fatih);
    }

    @When("User enters lastname {string}")
    public void user_enters_lastname(String Kılıc) {
dataTablesPage.lastName.sendKeys(Kılıc);
    }

    @When("User enters position {string}")
    public void user_enters_position(String QA) {
dataTablesPage.position.sendKeys(QA);
    }

    @When("User enters office {string}")
    public void user_enters_office(String Sivas) {
dataTablesPage.office.sendKeys(Sivas);
    }

    @When("User enters extension {string}")
    public void user_enters_first_extension(String extention) {
dataTablesPage.extension.sendKeys(extention);
    }

    @When("User enters startdate {string}")
    public void user_enters_startdate(String startdate) {
dataTablesPage.startDate.sendKeys(startdate);
    }

    @When("User enters salary {string}")
    public void user_enters_salary(String salary) {
dataTablesPage.salary.sendKeys(salary);
    }

    @When("user enters firstname {string} to the searchbox")
    public void user_enters_firstname_to_the_searchbox(String Fatih) {
dataTablesPage.searchBox.sendKeys(Fatih);
    }

    @Then("verify that user see the first name {string} in the searchbox")
    public void verify_that_user_see_the_first_name_in_the_searchbox(String Fatih) throws InterruptedException {
        Thread.sleep(8000);
        String nameverify=dataTablesPage.nameField.getText();

        Assert.assertTrue(nameverify.contains("ahmet"));
       // Assert.assertTrue(nameverify.contains("john"));
        //Assert.assertTrue(nameverify.contains("smith"));
        Driver.closeDriver();
    }

}
