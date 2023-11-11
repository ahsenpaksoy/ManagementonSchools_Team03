package stepDefinitions.UiStepDefinitions;

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

public class US11_StepDef {
    ViceDeanPage viceDeanPage = new ViceDeanPage();
    LessonPage viceDean = new LessonPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici managementonschools.com sayfasina gider")
    public void kullaniciManagementonschoolsComSayfasinaGider() {
        
    }

    @And("kullanici Password boxa tıklar")
    public void kullaniciPasswordBoxaTiklar() {
        
    }

    @When("Kullanici Login Butonuna tıklar")
    public void kullaniciLoginButonunaTiklar() {
        
    }

    @Then("kullanici User Name boxa tıklar")
    public void kullaniciUserNameBoxaTiklar() {
        
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int arg0) {
        
    }

    @And("kullanıcı Login butonuna tıklar")
    public void kullanciLoginButonunaTiklar() {
        
    }

    @And("kullanıcı Lesson Program sekmesini bulur")
    public void kullaniciLessonProgramSekmesiniBulur() {
        
    }

    @And("kullanici sayfayi kaydirir")
    public void kullaniciSayfayiKaydirir() {
        ReusableMethods.scroll(viceDeanPage.lessonProgramListTable);
        
    }

    @And("kullanici Lesson görebilmelidir.")
    public void kullaniciLessonGorebilmelidir() {
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

    @And("Kullanici Updade yapabilmelidir")
    public void kullaniciUpdadeYapabilmelidir() {
        
    }

    @And("Kullanici Lesson Program listesinden olusturulan dersi silebilmelidir")
    public void kullaniciLessonProgramListesindenOlusturulanDersiSilebilmelidir() {
    }
}
