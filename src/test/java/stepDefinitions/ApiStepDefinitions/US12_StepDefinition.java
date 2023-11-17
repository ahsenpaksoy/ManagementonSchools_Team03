package stepDefinitions.ApiStepDefinitions;

/*import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojos.viceDeanManagement.US12.ResponsePojoYD;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US12_StepDefinition {
    ResponsePojoYD response;

    @Given("Vice Dean ders atamak icin Post Request hazirlanir YD")
    public void vice_dean_ders_atamak_icin_post_request_hazirlanir_YD() {
        //https://managementonschools.com/app/teachers/chooseLesson
//spec.pathParams("first", "teachers", "second", "chooseLesson");
    }
    @Then("Gonderilecek data bilgileri hazirlanir")
    public void gonderilecek_data_bilgileri_hazirlanir() {
        List<String> lessonProgramId = new ArrayList<>();
        lessonProgramId.add("997");
        //expectedData = new ViceLessonProgramPojo(lessonProgramId, "1142");
    }
    @When("Teacher a ders atamak icin Post Request gonderilir")
    public void teacher_a_ders_atamak_icin_post_request_gonderilir() {
      //  response = given(spec).body(expectedData).post("{first}/{second}");
      //  response.prettyPrint();
    }
    @Then("\"Vicedean gelen body i dogrular")
    public void vicedean_gelen_body_i_dogrular() {
      //  actualData = response.as(VicedeanResponsePojo.class);
       // userId =  actualData.getObject().getUserId();
       // System.out.println("userId = " + userId);
       assertEquals(userId, actualData.getObject().getUserId());
        assertEquals(200, response.statusCode());
        assertEquals("heidenreich.info", actualData.getObject().getUsername());
        assertEquals("Kim", actualData.getObject().getName());
        assertEquals("Will", actualData.getObject().getSurname());
        assertEquals("Lesson added to Teacher", actualData.getMessage());
        assertEquals("CREATED", actualData.getHttpStatus());


    }
    @Given("Vicedean ders dogrulamak icin Get islemi yapar")
    public void vicedean_ders_dogrulamak_icin_get_islemi_yapar() {
        //https://managementonschools.com/app/teachers/getSavedTeacherById/37
        spec.pathParams("first", "teachers", "second", "getSavedTeacherById", "third", userId);

    }
    @Then("Vicedean ders dogrulamak icin Get Request gonderir")
    public void vicedean_ders_dogrulamak_icin_get_request_gonderir() {
        public void vicedean_ders_dogrulamak_icin_get_request_gonderir() {
            response1 = given(spec).get("{first}/{second}/{third}");
            response1.prettyPrint();

    }
    @Then("Viceden gelen get bodysini dogrular")
    public void viceden_gelen_get_bodysini_dogrular() {
            actualData1 = response1.as(TeacherControlPojo.class);
            assertEquals(200, response1.statusCode());
            assertEquals(userId, actualData1.getObject().getId());
            assertEquals("heidenreich.info", actualData1.getObject().getUsername());
            assertEquals("JOHN", actualData1.getObject().getName());
            assertEquals("Will", actualData1.getObject().getSurname());
            assertEquals(997, actualData1.getObject().getLessonsProgramList().get(0).getId());
            assertEquals("FRIDAY", actualData1.getObject().getLessonsProgramList().get(0).getDay());
            assertEquals(1511, actualData1.getObject().getLessonsProgramList().get(0).getLesson().get(0).getLessonId());
            assertEquals("BahreynDinari", actualData1.getObject().getLessonsProgramList().get(0).getLesson().get(0).getLessonName());
            assertTrue(actualData1.getObject().getLessonsProgramList().get(0).getLesson().get(0).isCompulsory());
            assertEquals("Teacher successfully found", actualData1.getMessage());
            assertEquals("OK", actualData1.getHttpStatus());

        }

    }


} */