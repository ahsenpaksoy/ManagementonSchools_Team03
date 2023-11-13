package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;

public class US15_ApiStepDefinitions {
    @Given("Stdudent olusturmak icin URL duzenlenir_DR")
    public void stdudentOlusturmakIcinURLDuzenlenir_DR() {
        setup(ConfigReader.getProperty("userName_DB"), ConfigReader.getProperty("password_DB"));
        spec.pathParams("first", "students", "second", "save");
    }

    @And("Stdudent olusturmak icin payload duzenlenir_DR")
    public void stdudentOlusturmakIcinPayloadDuzenlenir_DR() {

    }

    @When("Stdudent olusturmak icin POST Request gonderili_DR")
    public void stdudentOlusturmakIcinPOSTRequestGonderili_DR() {
    }

    @Then("Status kodun {int} oldugu dogrulanir_DR")
    public void statusKodunOlduguDogrulanir_DR(int arg0) {
    }

    @And("Stdudent olusturma icin gelen Response body dogrulanir_DR")
    public void stdudentOlusturmaIcinGelenResponseBodyDogrulanir_DR() {
    }
}
