package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static baseUrl.BaseUrl.spec;

public class US08_StepDefinition {
    @Given("ViceDean Save icin URL duzenlenirSo")
    public void vicedeanSaveIcinURLDuzenlenirSo() {
        //https://managementonschools.com/app/vicedean/getAll
        spec.pathParams("first","vicedean","second","getAll");
    }

    @And("Lesson icin PayLoad duzenlenirSo")
    public void lessonIcinPayLoadDuzenlenirSo() {

    }

    @When("Lesson icin POST Request gonderilir ve Response alinirSo")
    public void lessonIcinPOSTRequestGonderilirVeResponseAlinirSo() {
    }

    @Then("Status kodun {int} oldugu dogrulanirSo")
    public void statusKodunOlduguDogrulanirSo(int arg0) {
    }

    @And("Lesson icin gelen Response body dogrulanirSo")
    public void lessonIcinGelenResponseBodyDogrulanirSo() {
    }
}
