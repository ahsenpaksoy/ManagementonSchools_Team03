package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojos.lessonManagement.ResponsePojoYD;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;

public class US10_StepDefinition {
    @Given("{string} ile giris yapilir YD")
    public void ile_giris_yapilir_yd(String string) {
      setup("Bella", "Batch171");
    }
    @Given("Kayitli Vıce Dean icin URL duzenlenir YD")
    public void kayitli_vıce_dean_icin_url_duzenlenir_yd() {
        //https://managementonschools.com/app/lessonPrograms/save
        spec.pathParams("first", "lessonPrograms","second","save");
    }
    @Then("Kayitli Vice Dean icin payload duzenlenir")
    public void kayitliViceDeanIcinPayloadDuzenlenir() {
        ResponsePojoYD payload = new ResponsePojoYD("FRIDAY",17 ,1869,);
        /*{
  "day": "MONDAY",
  "educationTermId": 0,
  "lessonIdList": [
    0
  ],
  "startTime": "HH:mm",
  "stopTime": "HH:mm"}*/


    }
    @When("Kayitli Vıce Dean icin GET Request gonderilir ve response alinir YD")
    public void kayitli_vıce_dean_icin_get_request_gonderilir_ve_response_alinir_yd() {


    }
    @Then("Kayitli Vice Dean icin gelen response dogrulanir YD")
    public void kayitliViceDeanIcinGelenResponseDogrulanirYD() {

    }
    @Then("GetAll icin Status kodun {int} oldugu dogrulanir YD")
    public void get_all_icin_status_kodun_oldugu_dogrulanir_yd(Integer int1) {

    }



}
