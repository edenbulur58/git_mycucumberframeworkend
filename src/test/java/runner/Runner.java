package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber",
        //PATH OF THE FEATURES FOLDER
        features="src\\test\\resources\\features",
        //STEP DEFİNİTİONS FOLDER
        glue="stepdefinitions",
        tags="@wip",
        dryRun =false

)


public class Runner {

}