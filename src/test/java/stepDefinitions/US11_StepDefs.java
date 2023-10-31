package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.LessonPage;
import pages.ViceDeanPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US11_StepDefs {
    ViceDeanPage viceDeanPage = new ViceDeanPage();
    LessonPage viceDean = new LessonPage();
    Actions actions = new Actions(Driver.getDriver());


    @And("kullanici sayfayi kaydirir")
    public void kullaniciSayfayiKaydirir() {
        ReusableMethods.scroll(viceDeanPage.lessonProgramListTable);
        //  actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
    }

    @And("kullanici Lesson görebilmelidir.")
    public void kullaniciLessonDayGorebilmelidir() {
        System.out.println(viceDean.dersIsmiGorunur.getText());
        assertTrue(viceDean.dersIsmiGorunur.isDisplayed());
    }

    @And("kullanici Day görebilmelidir.")
    public void kullaniciDayGorebilmelidir() {
        System.out.println(viceDean.dayGorunur.getText());
        assertTrue(viceDean.dayGorunur.isDisplayed());
    }

    @And("kullanici Start Time görebilmelidir.")
    public void kullaniciStartTimeGorebilmelidir() {
        System.out.println(viceDean.startTimeGorunur.getText());
        assertTrue(viceDean.startTimeGorunur.isDisplayed());
    }

    @And("kullanici Stop Time görebilmelidir.")
    public void kullaniciStopTimeGorebilmelidir() {
        System.out.println(viceDean.stopTimeGorunur.getText());
        assertTrue(viceDean.stopTimeGorunur.isDisplayed());
    }


    @Given("kullanici managementonschools.com sayfasina gider")
    public void kullaniciManagementonschoolsComSayfasinaGider() {

    }

    @When("Kullanici Login Butonuna tıklar")
    public void kullaniciLoginButonunaTiklar() {

    }

    @Then("kullanici User Name boxa tıklar")
    public void kullaniciUserNameBoxaTiklar() {

    }

    @And("kullanici Password boxa tıklar")
    public void kullaniciPasswordBoxaTiklar() {

    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int arg0) {

    }

    @And("kullanıcı Login butonuna tıklar")
    public void kullaniciLoginButonunaTıklar() {

    }

    @And("kullanıcı Lesson Program sekmesini bulur")
    public void kullaniciLessonProgramSekmesiniBulur() {

    }

    @Given("Send query to get lessonprogram by id {string} US{int}")
    public void sendQueryToGetLessonprogramByIdUS(String arg0, int arg1) {

    }

    @Then("body should be like: id={string} day={string} start_time={string} stop_time={string} education_term_id={string} US{int}")
    public void bodyShouldBeLikeIdDayStart_timeStop_timeEducation_term_idUS(String arg0, String arg1, String arg2, String arg3, String arg4, int arg5) {

    }

    @And("Kullanici Updade yapabilmelidir")
    public void kullaniciUpdadeYapabilmelidir() {

    }

    @And("Kullanici Lesson Program listesinden olusturulan dersi silebilmelidir")
    public void kullaniciLessonProgramListesindenOlusturulanDersiSilebilmelidir() {

    }

    @Given("vice dean sends getAll request for lesson program")
    public void viceDeanSendsGetAllRequestForLessonProgram() {

    }

    @Then("vice dean gets the lesson program and assert")
    public void viceDeanGetsTheLessonProgramAndAssert() {

    }

    @Given("vice dean sends put request for lesson program")
    public void viceDeanSendsPutRequestForLessonProgram() {

    }

    @Then("vice dean update the lesson program and assert")
    public void viceDeanUpdateTheLessonProgramAndAssert() {

    }

    @Given("vice dean sends delete request for lesson program")
    public void viceDeanSendsDeleteRequestForLessonProgram() {

    }

    @Then("vice dean delete the lesson program from id and assert")
    public void viceDeanDeleteTheLessonProgramFromIdAndAssert() {

    }

    @Given("User navigates to the homepage")
    public void userNavigatesToTheHomepage() {

    }

    @When("Clicks on the Login button")
    public void clicksOnTheLoginButton() {

    }

    @And("Enters their username")
    public void entersTheirUsername() {

    }

    @And("Enters their password")
    public void entersTheirPassword() {

    }

    @And("Clicks on the Login")
    public void clicksOnTheLogin() {

    }

    @And("Clicks on the Lesson program tab")
    public void clicksOnTheLessonProgramTab() {

    }

    @Then("Sees the Lesson column under the Lesson Program List heading")
    public void seesTheLessonColumnUnderTheLessonProgramListHeading() {

    }

    @Then("Sees the Day column")
    public void seesTheDayColumn() {

    }

    @Then("Sees the Start time column")
    public void seesTheStartTimeColumn() {

    }

    @Then("Sees the Stop time button")
    public void seesTheStopTimeButton() {

    }

    @And("Sign out")
    public void signOut() {

    }
}
