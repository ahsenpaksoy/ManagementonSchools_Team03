package stepDefinitions.ApiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.guestUserManagement.Guest_UserPayloadPojo;
import pojos.guestUserManagement.Guest_User_ResponsePojo;
import stepDefinitions.UiStepDefinitions.US01_StepDef;
import stepDefinitions.UiStepDefinitions.US04_StepDef;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US01_StepDefinition {
    Guest_UserPayloadPojo payloadGuestUser;
    Guest_User_ResponsePojo actuelData;
    Response response;
    Faker faker=new Faker();

    public static RequestSpecification spec;   //parametresiz bir setup a ihtiyacim vardi o nedenle yeniden duzenledim

    public static void setup(){
        spec = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app/")
                .setContentType(ContentType.JSON)
                .build();
    }

    @Given("Guest User Save icin URL duzenlenir_SK")
    public void guestUserSaveIcinURLDuzenlenir_SK() {
        //https://managementonschools.com/app/guestUser/register
        setup();
        spec.pathParams("first", "guestUser", "second", "register");

    }
    @And("Guest User Save icin payload duzenlenir_SK")
    public void guestUserSaveIcinPayloadDuzenlenir_SK() {

      payloadGuestUser=new Guest_UserPayloadPojo(US04_StepDef.birthdayEsi,faker.address().city(),
               "MALE",faker.name().firstName(),US01_StepDef.rasgeleSifreOlustur(8),
               US01_StepDef.generateFakePhoneNumber(),
               US01_StepDef.generateFakeSSN(),faker.name().lastName(),faker.name().username());
    }
    @When("Guest User Save icin POST Request gonderilir ve Reponse alinir_SK")
    public void guestUserSaveIcinPOSTRequestGonderilirVeReponseAlinir_SK() {
        response = given(spec).body(payloadGuestUser).when().post("{first}/{second}");
        response.prettyPrint();

        actuelData=response.as(Guest_User_ResponsePojo.class);

    }
    @And("Guest User Save icin gelen Response body dogrulanir_SK")
    public void guestUserSaveIcinGelenResponseBodyDogrulanir_SK() {
        assertEquals(payloadGuestUser.getBirthDay(), actuelData.getObject().getBirthDay());
        assertEquals(payloadGuestUser.getBirthPlace(), actuelData.getObject().getBirthPlace());
        assertEquals(payloadGuestUser.getGender(), actuelData.getObject().getGender());
        assertEquals(payloadGuestUser.getName(), actuelData.getObject().getName());
        assertEquals(payloadGuestUser.getPhoneNumber(), actuelData.getObject().getPhoneNumber());
        assertEquals(payloadGuestUser.getSsn(), actuelData.getObject().getSsn());
        assertEquals(payloadGuestUser.getSurname(), actuelData.getObject().getSurname());
        assertEquals(payloadGuestUser.getUsername(), actuelData.getObject().getUsername());
    }
    @Then("Status kodun {int} oldugu dogrulanir_SK")
    public void statusKodunOlduguDogrulanir_SK(int statuscode) {
        assertEquals(statuscode, response.statusCode());
    }


}
