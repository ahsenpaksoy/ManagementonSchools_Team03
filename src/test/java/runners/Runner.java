package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed_scenarios.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },

        monochrome = true,  //raporlarin console da okunakli sekilde cikmasi icin
        features = "./src/test/resources/features/",  //features folder path
        glue = {"stepdefinitions","hooks" },   //step-definitions path
        tags = "@Smoke2" ,// Scenario steps controller
        dryRun = false       // when true -> stepdefinitions

)
public class Runner {


}
