package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.LessonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US09_StepDef {
    HomePage homePage = new HomePage();
    LessonPage lessonPage = new LessonPage();
    @Given("kullanici ManagementSchools sayfasina giderSo")
    public void kullaniciManagementSchoolsSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));
    }
    @And("kullanici {int} saniye beklerSo")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @Given("Login butonuna tiklarSo")
    public void loginIleGirisYapilir() {
        homePage.loginButonu.click();

    }
    @Then("Vice Dean olarak giris yaparSo")
    public void viceDeanOlarakGirisYaparso() {
        homePage.loginUsernameBox.sendKeys("Sare", Keys.TAB, "ViceDean171+", Keys.TAB, Keys.ENTER);
    }

    @And("Menü alanina tiklarSo")
    public void menüAlaninaTiklar() {
        homePage.menu.click();
    }

    @And("Cikan seceneklerden LessonManagement tiklanirSo")
    public void cikanSeceneklerdenLessonManagementTiklanir() {

        lessonPage.LessonManagementButonuSo.click();
        ReusableMethods.bekle(2);
    }

    @And("Acilan Sayfada Lesson alanina tiklanirSo")
    public void acilanSayfadaLessonAlaninaTiklanir() {
        ReusableMethods.scrollHome();
        ReusableMethods.bekle(5);
        lessonPage.LessonButonuSo.click();
        ReusableMethods.bekle(2);
    }


    @And("Kullanici ders listesini\\(LessonName,Compulsory,CreditScore) gordugunu dogrularSo")
    public void kullaniciDersListesiniLessonNameCompulsoryCreditScoreGordugunuDogrularSo() {
        Assert.assertTrue(lessonPage.lessonList.isDisplayed());
    }

    @And("kullanici sayfayi kapatirSo")
    public void kullaniciSayfayiKapatirSo() {
        Driver.closeDriver();
    }

    @And("kullanici ders listesinde ders silebilmeliSo")
    public void kullaniciDersListesindeDersSilebilmeliSo() {
        ReusableMethods.scroll(lessonPage.eklenenSonDers);
        lessonPage.lessonDelete.click();


    }

    @And("kullanici ders listesinde guncellemeler yapabilmeliSo")
    public void kullaniciDersListesindeGuncellemelerYapabilmeliSo() {
    }
}

  //ReusableMethods.scroll(lessonPage.dersListesiIlerlemeButonuSo);
  //        ReusableMethods.bekle(2);
  //        lessonPage.dersListesiIlerlemeButonuSo.click();
  //        ReusableMethods.bekle(2);
