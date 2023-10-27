package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LessonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class US10_StepDef {
    public static String lessonY1;
    public static String eduTermY;
    public static String dayY;

    LessonPage lessonPage = new LessonPage();
    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }
    @Then("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        homePage.loginButonu.click();
    }
    @Then("kullanici username ve password datalarini girer ve enter'a tiklar")
    public void kullaniciUsernameVePasswordDatalariniGirerVeEnterATiklar() {
        homePage.loginUsernameBox.sendKeys(ConfigReader.getProperty("viceDeanY"), Keys.TAB,
                ConfigReader.getProperty("passwordY"),Keys.TAB, Keys.ENTER);
    }
    @Then("kullanici menu butonuna tiklar")
    public void kullaniciMenuButonunaTiklar() {
        homePage.menu.click();
    }
    @Then("acilan pencereden lesson management'i secer")
    public void acilanPenceredenLessonManagementISecer() {
        ReusableMethods.bekle(2);
        lessonPage.lessonManagementY.click();
    }
    @Given("Lesson Program secenegine tiklar")
    public void lessonProgramSecenegineTiklar() {
        lessonPage.lessonProgramY.click();

    }
    @Then("Select Lessons menusune tiklar")
    public void selectLessonsMenusuneTiklar() {
        lessonPage.selectLessonY.click();
    }
    @Then("Acilan drop down menuden bir ders secer")
    public void acilanDropDownMenudenBirDersSecer() {
        ReusableMethods.bekle(2);
        lessonY1 = "Topology";
        actions.sendKeys(lessonY1);
        actions.sendKeys(Keys.ENTER).perform();
    }
    @Then("Choose Education Term menusune tiklar")
    public void chooseEducationTermMenusuneTiklar() {
        lessonPage.educationTermY.click();
    }
    @Then("Acilan menuden bir donem secer")
    public void acilanMenudenBirDonemSecer() {
        ReusableMethods.bekle(2);
        eduTermY = "FALL_SEMESTER";
        Select select1 = new Select(lessonPage.educationTermY);
        select1.selectByVisibleText(eduTermY);
    }
    @Then("Choose Day menusune tiklar")
    public void chooseDayMenusuneTiklar() {
        lessonPage.chooseDayY.click();
    }
    @Then("Acilan menuden gun secer")
    public void acilanMenudenGunSecer() {
        dayY = "FRIDAY";
        Select select2 = new Select(lessonPage.chooseDayY);
        select2.selectByVisibleText(dayY);
    }

    @Then("Start Time menusune tiklar ve gecerli bir saat girer")
    public void startTimeMenusuneTiklarVeGecerliBirSaatGirer() {
        ReusableMethods.scrollHome();
        ReusableMethods.scrollHome();
        ReusableMethods.bekle(2);
        ReusableMethods.bekle(2);
        lessonPage.startTimeY.click();
        lessonPage.startTimeY.sendKeys("14:00", Keys.ENTER);
    }

    @Then("Stop Time menusune tiklar ve gecerli bir saat girer")
    public void stopTimeMenusuneTiklarVeGecerliBirSaatGirer() {
        ReusableMethods.scroll(lessonPage.stopTimeY);
        lessonPage.stopTimeY.click();
        lessonPage.stopTimeY.sendKeys("15:00", Keys.ENTER);
        ReusableMethods.bekle(2);

    }
    @Then("Submit butonuna tiklar")
    public void submitButonunaTiklar() {
        lessonPage.buttonSubmitY.click();
        ReusableMethods.bekle(2);
    }

    @Then("Lesson Program olusturuldugunu dogrular")
    public void lessonProgramOlusturuldugunuDogrular() {
        Assert.assertTrue(lessonPage.createdLessonProgY.isDisplayed());
    }
    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
    }


    @Then("Stop Time menusune tikla, baslangic saatinde once bir data gir")
    public void stopTimeMenusuneTiklaBaslangicSaatindeOnceBirDataGir() {
        ReusableMethods.bekle(2);
        lessonPage.stopTimeY.click();
        lessonPage.stopTimeY.sendKeys("09:00", Keys.ENTER);

    }

    @Then("Lesson Program olusturulamadigini dogrular")
    public void lessonProgramOlusturulamadiginiDogrular() {
        Assert.assertTrue(lessonPage.errorTimeY.isDisplayed());
    }

    @Then("Education Term secilmedigin icin uyari yazisini gorur")
    public void educationTermSecilmediginIcinUyariYazisiniGorur() {
        Assert.assertTrue(lessonPage.alertEduTermY.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("Ders secilmedigi icin uyari yazisi alir")
    public void dersSecilmedigiIcinUyariYazisiAlir() {
        Assert.assertTrue(lessonPage.selectLessonY.isDisplayed());
    }

    @Then("Gun secilmedigi icin uyari yazisi alir")
    public void gunSecilmedigiIcinUyariYazisiAlir() {
        Assert.assertTrue(lessonPage.alertDayY.isDisplayed());
    }

    @Then("Ders secilebildigini dogrular")
    public void dersSecilebildiginiDogrular() {
        Assert.assertTrue(lessonPage.selectLessonY.getText().contains("Topology"));
    }

    @Then("Donem secilebildigini dogrular")
    public void donemSecilebildiginiDogrular() {
        
    }

    @Then("Baslama ve bitis tarihi secilebilirligini dogrular")
    public void baslamaVeBitisTarihiSecilebilirliginiDogrular() {
        
    }

    @Then("Gun secebildigini dogrular")
    public void gunSecebildiginiDogrular() {
    }
}
