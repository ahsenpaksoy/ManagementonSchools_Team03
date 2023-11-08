package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.viceDeanManagement.ObjectPojo;
import pojos.viceDeanManagement.ResponsePojo;
import pojos.viceDeanManagement.ViceDeanPostPojo;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US06_StepDefinition {
    ViceDeanPostPojo payload;
    Response response;
    ResponsePojo actualData;
    int userId;
    public static ObjectPojo object;
    public static ResponsePojo expectedData;
    @Given("{string} yetkisi ile giris yapildiKI")
    public void yetkisiIleGirisYapildiKI(String authority) {
        setup(ConfigReader.getProperty("deanKenan"),ConfigReader.getProperty("kenanPas"));
        System.out.println(authority+  "ile giris yapildi");
    }

    @And("Vice Dean hesabi olusturmak icin URL duzenlenirKI")
    public void viceDeanHesabiOlusturmakIcinURLDuzenlenirKI() {
        //https://managementonschools.com/app/vicedean/save
        spec.pathParams("first","vicedean","second","save");

    }

    @And("Vice Dean hesabi olusturmak icin payload duzenlenirKI")
    public void viceDeanHesabiOlusturmakIcinPayloadDuzenlenirKI() {
        payload=new ViceDeanPostPojo("1996-02-05","Baku","MALE","Ahmet",
                "Aa349712", "524-965-8570","545-85-9669","Agayev",
                "AhmetBaku");

    }

    @When("Vice Dean hesabi olusturmak icin POST Request gonderilir ve Reponse alinirKI")
    public void viceDeanHesabiOlusturmakIcinPOSTRequestGonderilirVeReponseAlinirKI() {
        response=given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        actualData= response.as(ResponsePojo.class);

    }

    @Then("Status code un {int} oldugu dogrulanirKI")
    public void viceDeanHesabiOlusturmakIcinStatusCodeUnOlduguDogrulanirKI(int statuscode) {
        assertEquals(statuscode,response.statusCode());
    }

    @And("Vice Dean Save icin gelen Response body dogrulanirKI")
    public void viceDeanSaveIcinGelenResponseBodyDogrulanirKI() {
        assertEquals(payload.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(payload.getGender(),actualData.getObject().getGender());
        assertEquals(payload.getName(),actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(), actualData.getObject().getSsn());
        assertEquals(payload.getSurname(), actualData.getObject().getSurname());
        assertEquals(payload.getUsername(), actualData.getObject().getUsername());
    }

    @And("Sayfayi kapatirKI")
    public void sayfayiKapatirKI() {
        Driver.closeDriver();
    }

    @Given("Kayitli Vice Dean hesab bilgisinin ID nosu alinirKI")
    public void kayitliViceDeanHesabBilgisininIDNosuAlinirKI() {
        setup(ConfigReader.getProperty("deanKenan"),ConfigReader.getProperty("kenanPas"));
        //https://managementonschools.com/app/vicedean/getAll
        spec.pathParams("first", "vicedean", "second", "getAll");
        response= given(spec).when().get("{first}/{second}");
        JsonPath json=response.jsonPath();
        List<Integer> userIdList = json.getList("findAll{it.username=='AhmetBaku'}.userId");
        userId=userIdList.get(0);
        System.out.println(userId);
    }

    @And("Vice Dean GetManagerById icin URL duzenlenirKI")
    public void viceDeanGetManagerByIdIcinURLDuzenlenirKI() {
        //https://managementonschools.com/app/vicedean/getViceDeanById/1
        spec.pathParams("first","vicedean","second","getViceDeanById","third",userId);

    }
    @And("Vice Dean GetManagerById icin beklenen veriler duzenlenirKI")
    public void viceDeanGetManagerByIdIcinBeklenenVerilerDuzenlenirKI() {
      object=new ObjectPojo(userId,"AhmetBaku","Ahmet",
                "Agayev","1996-02-05","545-85-9669",
                "Baku", "524-965-8570","MALE");
      expectedData=new ResponsePojo(object,"Vice dean successfully found","OK");
        /*
        {
    "object": {
        "userId": 1973,
        "username": "AhmetBaku",
        "name": "Ahmet",
        "surname": "Agayev",
        "birthDay": "1996-02-05",
        "ssn": "545-85-9669",
        "birthPlace": "Baku",
        "phoneNumber": "524-965-8570",
        "gender": "MALE"
    },
    "message": "Vice dean successfully found",
    "httpStatus": "OK"
}
         */
    }

    @When("Vice Dean GetManagerById icin GET Request gonderilir ve Response alinirKI")
    public void viceDeanGetManagerByIdIcinGETRequestGonderilirVeResponseAlinirKI() {
       response= given(spec).when().get("{first}/{second}/{third}");
       response.prettyPrint();
       actualData=response.as(ResponsePojo.class);

    }

    @And("Vice Dean GetManagerById icin gelen Response body dogrulanirKI")
    public void viceDeanGetManagerByIdIcinGelenResponseBodyDogrulanirKI() {
        assertEquals(object.getUserId(), actualData.getObject().getUserId());
        assertEquals(object.getUsername(), actualData.getObject().getUsername());
        assertEquals(object.getName(), actualData.getObject().getName());
        assertEquals(object.getSurname(), actualData.getObject().getSurname());
        assertEquals(object.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(object.getSsn(), actualData.getObject().getSsn());
        assertEquals(object.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(object.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(object.getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getMessage(), actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(), actualData.getHttpStatus());

    }
}
