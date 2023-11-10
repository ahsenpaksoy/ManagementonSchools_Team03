package stepDefinitions.ApiStepDefinitions;

import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.ConfigReader;

import java.util.List;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static stepDefinitions.ApiStepDefinitions.US13_ApiStepDefinition.userID;

public class US24_APIStepDefinitions {
    Response response;
    @Given("Admin olarak Teacher olusturmak icin URL duzenlenirSA")
    public void adminOlarakTeacherOlusturmakIcinURLDuzenlenirSA() {
        setup(ConfigReader.getProperty("AdminUserNameSA"),ConfigReader.getProperty("AdminPasswordSA"));
        spec.pathParams("first","teachers","second","save");
    }

    @Given("Admin olarak Kayitli Teacher bilgisinin ID nosu alinirSA")
    public void adminOlarakKayitliTeacherBilgisininIDNosuAlinirSA() {
        setup(ConfigReader.getProperty("AdminUserNameSA"),ConfigReader.getProperty("AdminPasswordSA"));
        spec.pathParams("first","teachers","second","getAll");
        response=given(spec).when().get("{first}/{second}");
        JsonPath json=response.jsonPath();
        List<Integer> userIdList=json.getList("findAll{it.username=='AmanNil'}.userId");
        userID=userIdList.get(0);
        System.out.println(userID);
    }

    @Given("Admin olarak Teacher Delete icin URL duzenlenir")
    public void adminOlarakTeacherDeleteIcinURLDuzenlenir() {
        setup(ConfigReader.getProperty("AdminUserNameSA"),ConfigReader.getProperty("AdminPasswordSA"));
        spec.pathParams("first","teachers","second","delete","third",userID);
    }
}
