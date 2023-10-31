package stepDefinitions.ApiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static baseUrl.ManagementOnSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class US11_StepDef {
    Response response;
    int id;


    @Given("vice dean sends getAll request for lesson program")
    public void vice_dean_sends_get_all_request_for_lesson_program() {

        spec.pathParams("first", "lessonPrograms","second","getAll");
        response = given(spec).when().get("/{first}/{second}");
        response.prettyPrint();

    }

    @Then("vice dean gets the lesson program and assert")
    public void vice_dean_gets_the_lesson_program_and_assert() {
        String actualData= response.asString();
        assertTrue(actualData.contains("lessonName"));
        assertTrue(actualData.contains("startTime"));
        assertTrue(actualData.contains("startTime"));
        assertTrue(actualData.contains("day"));
    }

    @Given("vice dean sends put request for lesson program")
    public void vice_dean_sends_put_request_for_lesson_program() {

    }

    @Then("vice dean update the lesson program and assert")
    public void vice_dean_update_the_lesson_program_and_assert() {

    }

    @Given("vice dean sends delete request for lesson program")
    public void vice_dean_sends_delete_request_for_lesson_program() {
        //https://school-management-v1.herokuapp.com/lessonPrograms/delete/1
        id= Faker.instance().number().numberBetween(1,333);
        spec.pathParams("first", "lessonPrograms","second","delete","third",id);
        response = given(spec).when().delete("/{first}/{second}/{third}");
        response.prettyPrint();

    }

    @Then("vice dean delete the lesson program from id and assert")
    public void vice_dean_delete_the_lesson_program_from_id_and_assert() {
//        {
//            "message": "Lesson Program Deleted",
//                "httpStatus": "OK"
//        }
        Map<String,String> expectedData=new HashMap<>();
        expectedData.put("message", "Lesson Program Deleted");
        expectedData.put("httpStatus", "OK");

        Map<String,String> actualData= response.as(HashMap.class);
        assertEquals(expectedData.get("message"),actualData.get("message"));
        assertEquals(expectedData.get("httpStatus"),actualData.get("httpStatus"));

    }

}
