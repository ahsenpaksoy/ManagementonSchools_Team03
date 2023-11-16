package stepDefinitions.ApiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.studentInfoManagement.ObjectPojo;
import pojos.studentInfoManagement.ResponsePojo;
import pojos.studentInfoManagement.StudentPostPojo;
import pojos.teacherManagement.TeacherUpdate.UpdateResponsePojo;
import utilities.ConfigReader;

import java.util.List;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.junit.Assert.assertEquals;

public class US15_ApiStepDefinitions {
    public static StudentPostPojo payload;
    ResponsePojo actualData;
    Response response;

    ObjectPojo object;
    private static int studentId;
    @Given("Stdudent olusturmak icin URL duzenlenir_DR")
    public void stdudentOlusturmakIcinURLDuzenlenir_DR() {
        setup(ConfigReader.getProperty("userName_DB"), ConfigReader.getProperty("password_DB"));
        spec.pathParams("first", "students", "second", "save");
    }

    @And("Stdudent olusturmak icin payload duzenlenir_DR")
    public void stdudentOlusturmakIcinPayloadDuzenlenir_DR() {
         payload = new StudentPostPojo(1339, "2002-09-09", "Balkan","balkan@gmail.com", "Ali","FEMALE","Ayse","Durdu","Balkan@2002","989-321-7654", "564-67-8967","Kaya","durdukaya");
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

    @Given("Kayitli Student bilgisinin ID nosu alinir_DB")//2
    public void kayitliStudentBilgisininIDNosuAlinir_DB() {
        setup(ConfigReader.getProperty("userName_DB"), ConfigReader.getProperty("password_DB"));
        spec.pathParams("first","students", "second","getAll");
        response = given(spec).when().get("{first}/{second}");
        JsonPath json= response.jsonPath();
        List<Integer> studentIdList = json.getList("findAll{it.username=='durdukaya'}id");
        studentId = studentIdList.get(0);
    }
    @And("Student getStudentById icin URL duzenlenir_DB")
    public void studentGetStudentByIdIcinURLDuzenlenir_DB() {
        //https://managementonschools.com/app/students/getStudentById?id=1
        spec.pathParams("first","students", "second","getStudentById")
                .queryParam("id", studentId);
    }
    @And("Student getStudentById icin beklenen veriler duzenlenir_DB")
    public void studentGetStudentByIdIcinBeklenenVerilerDuzenlenir_DB() {
        object = new ObjectPojo(studentId, "durdukaya","564-67-8967", "Durdu","Kaya","2002-09-09","Balkan","989-321-7654","FEMALE","Ayse","Ali",1452,2179, "Merle","Pacocha","linnea.rohan@yahoo.com","balkan@gmail.com", false);
    }

    @When("Student getStudentById icin GET Request gonderilir ve Response alinir_DB")
    public void studentGetStudentByIdIcinGETRequestGonderilirVeResponseAlinir_DB() {
        response = given(spec).when().get("{first}/{students}");
        actualData = response.as(ResponsePojo.class);
    }

    @Then("Student getStudentById icin gelen Response dogrulanir_DB")
    public void studentGetStudentByIdIcinGelenResponseDogrulanir_DB() {
        assertEquals(object.getId(), actualData.getObject().getId());
        assertEquals(object.getUsername(), actualData.getObject().getUsername());
        assertEquals(object.getSsn(), actualData.getObject().getSsn());
        assertEquals(object.getName(), actualData.getObject().getName());
        assertEquals(object.getSurname(), actualData.getObject().getSurname());
        assertEquals(object.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(object.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(object.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(object.getGender(), actualData.getObject().getGender());
        assertEquals(object.getMotherName(), actualData.getObject().getMotherName());
        assertEquals(object.getFatherName(), actualData.getObject().getFatherName());
        assertEquals(object.getStudentNumber(), actualData.getObject().getStudentNumber());
        assertEquals(object.getAdvisorTeacherId(), actualData.getObject().getAdvisorTeacherId());
        assertEquals(object.getAdvisorTeacherName(), actualData.getObject().getAdvisorTeacherName());
        assertEquals(object.getAdvisorTeacherSurname(), actualData.getObject().getAdvisorTeacherSurname());
        assertEquals(object.getAdvisorTeacherEmail(), actualData.getObject().getAdvisorTeacherEmail());
        assertEquals(object.getEmail(), actualData.getObject().getEmail());
        assertEquals(object.isActive(), actualData.getObject().isActive());


    }

    @And("Student update icin URL duzenlenir_DB")
    public void studentUpdateIcinURLDuzenlenir_DB() {
        //https://managementonschools.com/app/students/update/1
        setup(ConfigReader.getProperty("userName_DB"), ConfigReader.getProperty("password_DB"));
        spec.pathParams("first","students", "second","students","third",studentId);
    }

    @And("Student update icin beklenen veriler duzenlenir_DB")
    public void studentUpdateIcinBeklenenVerilerDuzenlenir_DB() {
        payload = new StudentPostPojo(1339, "2002-09-09", "Dubai","balkan@gmail.com", "Ali","FEMALE","Ayse","Durdu","Balkan@2002","989-321-7654", "564-67-8967","Kaya","durdukaya");

    }

    @When("Student update icin PUT Request gonderilir ve Response alinir_DB")
    public void studentUpdateIcinPUTRequestGonderilirVeResponseAlinir_DB() {
        response=given(spec).body(payload).when().put("{first}/{second}/{third}");
        response.prettyPrint();
        actualData =  response.as(ResponsePojo.class);

    }
    @Then("Student uptadete icin gelen Response dogrulanir_DB")
    public void studentUptadeteIcinGelenResponseDogrulanir_DB() {

    }


    @Then("Status kodun {int} oldugu dogrulanir_DB")
    public void statusKodunOlduguDogrulanir_DB(int statusCode) {
            assertEquals(statusCode, response.statusCode());
    }

    @Given("Student Delete icin URL duzenlenir")
    public void studentDeleteIcinURLDuzenlenir() {
    }

    @When("Student Delete icin DELETE Request gonderilir ve Response alinir")
    public void studentDeleteIcinDELETERequestGonderilirVeResponseAlinir() {
    }
}
