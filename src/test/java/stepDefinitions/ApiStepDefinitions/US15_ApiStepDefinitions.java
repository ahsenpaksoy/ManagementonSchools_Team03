package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.studentInfoManagement.ResponsePojo;
import pojos.studentInfoManagement.StudentPostPojo;
import utilities.ConfigReader;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US15_ApiStepDefinitions {
    StudentPostPojo payload;
    Response response;
    ResponsePojo actualData;
    @Given("Stdudent olusturmak icin URL duzenlenir_DR")
    public void stdudentOlusturmakIcinURLDuzenlenir_DR() {
        setup(ConfigReader.getProperty("userName_DB"), ConfigReader.getProperty("password_DB"));
        spec.pathParams("first", "students", "second", "save");
    }

    @And("Stdudent olusturmak icin payload duzenlenir_DR")
    public void stdudentOlusturmakIcinPayloadDuzenlenir_DR() {
         payload = new StudentPostPojo(2179, "2002-09-09", "Balkan","balkan@gmail.com", "Ali","FEMALE","Ayse","Durdu","Balkan@2002","989-321-7654", "564-67-8967","Kaya","durdukaya");
    }

    @When("Stdudent olusturmak icin POST Request gonderili_DR")
    public void stdudentOlusturmakIcinPOSTRequestGonderili_DR() {
    response =  given(spec).body(payload).when().post("{first}/{first}");
    actualData = response.as(ResponsePojo.class);
    }
    @Then("Status kodun {int} oldugu dogrulanir_DR")
    public void statusKodunOlduguDogrulanir_DR(int statuscode) {
        assertEquals(statuscode, response.statusCode());
    }

    @And("Stdudent olusturma icin gelen Response body dogrulanir_DR")
    public void stdudentOlusturmaIcinGelenResponseBodyDogrulanir_DR() {
        assertEquals(payload.getAdvisorTeacherId(), actualData.getObject().getAdvisorTeacherId());
        assertEquals(payload.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(payload.getEmail(), actualData.getObject().getEmail());
        assertEquals(payload.getFatherName(), actualData.getObject().getFatherName());
        assertEquals(payload.getGender(), actualData.getObject().getGender());
        assertEquals(payload.getMotherName(), actualData.getObject().getMotherName());
        assertEquals(payload.getName(), actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(), actualData.getObject().getSsn());
        assertEquals(payload.getSurname(), actualData.getObject().getSurname());
        assertEquals(payload.getUsername(), actualData.getObject().getUsername());
    }
}
