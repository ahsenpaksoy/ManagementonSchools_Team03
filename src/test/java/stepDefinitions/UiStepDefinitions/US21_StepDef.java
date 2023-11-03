package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.StudentPage;
import pages.TeacherPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US21_StepDef {

    StudentPage studentPage= new StudentPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("kullanici acilan pencereden choose lesson secer_Ep")
    public void kullaniciAcilanPenceredenChooseLessonSecer_Ep() {
        studentPage.chooseLessontButtonEp.click();
        ReusableMethods.bekle(2);
        ReusableMethods.scrollHome();
        ReusableMethods.bekle(2);
    }

    @Then("Kullanici ders secme kutucugunun tiklanabilirligini dogrular_Ep")
    public void kullaniciDersSecmeKutucugununTiklanabilirliginiDogrular_Ep() {
        assertTrue(studentPage.checkBoxBilgisiVerifyEp.isEnabled());
    }

    @Then("kullanici ders bilgisinin gorunurlugunu dogrular_Ep")
    public void kullaniciDersBilgisininGorunurlugunuDogrular_Ep() {
        assertTrue(studentPage.lessonBilgisiVerifyEp.isEnabled());

    }

    @Then("kullanici teacher bilgisinin gorunurlugunu dogrular_Ep")
    public void kullaniciTeacherBilgisininGorunurlugunuDogrular_Ep() {
        assertTrue(studentPage.teacherBilgisiVerifyEp.isEnabled());

    }

    @And("kullanici day bilgisinin gorunurlugunu dogrular_Ep")
    public void kullaniciDayBilgisininGorunurlugunuDogrular_Ep() {
        assertTrue(studentPage.dayBilgisiVerifyEp.isEnabled());

    }

    @And("kullanici start time bilgisinin gorunurlugunu dogrular_Ep")
    public void kullaniciStartTimeBilgisininGorunurlugunuDogrular_Ep() {
        assertTrue(studentPage.startTimeBilgisiVerifyEp.isEnabled());

    }

    @And("kullanici stop time bilgisinin gorunurlugunu dogrular_Ep")
    public void kullaniciStopTimeBilgisininGorunurlugunuDogrular_Ep() {
        assertTrue(studentPage.stopTimeBilgisiVerifyEp.isEnabled());
        ReusableMethods.bekle(2);
    }
}
