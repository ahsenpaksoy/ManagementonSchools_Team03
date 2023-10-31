package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.US16_Pojo.MessagePojo_US16;
import pojos.US16_Pojo.ResponsePojo_US16;
import utilities.ConfigReader;

import static baseUrl.ManagementOnSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;

public class US16_StepDef {
    public static MessagePojo_US16 expectedData;
    Response response;
    public static ResponsePojo_US16 actualData;
    @Given("Mesaj eklemek icin Post request hazirligi yapilir")
    public void mesajEklemekIcinPostRequestHazirligiYapilir() {
        //https://managementonschools.com/app/contactMessages/save
        //Set the Url
        spec.pathParams("first","contactMessages","second","save");
    }

    @And("Gonderilecek mesaj bilgileri hazirlanir")
    public void gonderilecekMesajBilgileriHazirlanir() {
        //Set the expected data
        expectedData = new MessagePojo_US16("merhaba@gmail.com", "Yardimci olur musunuz?", "StudentTeam04", "Yardim");

    }

    @When("Mesaj eklemek icin Post request gonderilir")
    public void mesajEklemekIcinPostRequestGonderilir() {
        //Send the request and get the response
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        actualData = response.as(ResponsePojo_US16.class);
    }

    @Then("Mesaj bolumlerini dogrulama: name={string}, email={string}, subject={string}, message={string}, date={string}")
    public void mesajBolumleriniDogrulamaNameEmailSubjectMessageDate(String str1, String str2, String str3, String str4, String str5) {
        assertEquals(ConfigReader.getProperty(str1),actualData.getObject().getName());
        assertEquals(ConfigReader.getProperty(str2),actualData.getObject().getEmail());
        assertEquals(ConfigReader.getProperty(str3),actualData.getObject().getSubject());
        assertEquals(ConfigReader.getProperty(str4),actualData.getObject().getMessage());
        assertEquals(ConfigReader.getProperty(str5),actualData.getObject().getDate());
    }
}
