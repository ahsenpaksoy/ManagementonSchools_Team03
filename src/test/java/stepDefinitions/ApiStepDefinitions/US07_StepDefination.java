package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;

public class US07_StepDefination {
    @Given("Get request ile tum mesajlari al")
    public void getRequestIleTumMesajlariAl() {
        //https://managementonschools.com/app/contactMessages/getAll
        spec.pathParams("first","contactMessages","second","getAll").
                queryParams("size",1000);
       Response response= given(spec).get("{first}/{second}");
       response.prettyPrint();


    }

    @Then("bodyi dogrula: name={string}, email={string}, subject={string}, message={string}, date={string}")
    public void bodyiDogrulaNameEmailSubjectMessageDate(String arg0, String arg1, String arg2, String arg3, String arg4) {
    }
}
