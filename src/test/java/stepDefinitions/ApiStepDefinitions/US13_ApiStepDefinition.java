package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;

public class US13_ApiStepDefinition {



    @Given("Teacher olusturmak icin URL duzenlenirSA")
    public void teacherOlusturmakIcinURLDuzenlenirSA() {
        setup(ConfigReader.getProperty("ViceDeanUserName"),ConfigReader.getProperty("ViceDeanPassword"));
        spec.pathParams("first","teachers","second","save");
    }

    @And("Teacher olusturmak icin payload duzenlenirSA")
    public void teacherOlusturmakIcinPayloadDuzenlenirSA() {

    }

    @When("Teacher olusturmak icin POST Request gonderilirSA")
    public void teacherOlusturmakIcinPOSTRequestGonderilirSA() {
    }
    @Then("Status kodun {int} oldugu dogrulur")
    public void statusKodunOlduguDogrulur(int arg0) {
    }

    @Then("Status kodun {int} oldugu dogrulanirSA")
    public void statusKodunOlduguDogrulanirSA(int arg0) {
    }

    @And("Teacher olusturma icin gelen Response body dogrulanirSA")
    public void teacherOlusturmaIcinGelenResponseBodyDogrulanirSA() {
    }

    @Given("Teacher Delete icin URL duzenlenir")
    public void teacherDeleteIcinURLDuzenlenir() {
    }

    @When("Teacher Delete icin DELETE Request gonderilir ve Response alinir")
    public void teacherDeleteIcinDELETERequestGonderilirVeResponseAlinir() {
    }
}
