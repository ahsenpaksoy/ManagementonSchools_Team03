package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LessonPage;
import utilities.Driver;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertTrue;


public class US16_StepDef {
    LessonPage lessonPage = new LessonPage();

    @And("Contact Get All secenegini tiklar")
    public void contactGetAllSeceneginiTiklar() {
        LessonPage.studentContact.click();
    }

    @And("Name,Email,Date,Subject,Message bölümlerinin göründügünü dogrular.")
    public void nameEmailDateSubjectMessageBölümlerininGöründügünüDogrular() {

        List<WebElement> studentMessageBilgileri = studentManagementPage.studentMessageBilgileri;
        for (WebElement w:studentMessageBilgileri) {
            assertTrue(studentMessageBilgileri.get(0).isDisplayed());
        }

    }

    @And("Silme butonunun göründügünü dogrular")
    public void silmeButonununGöründügünüDogrular() {
        try {

            WebElement silmeButonu = Driver.getDriver().findElement(By.id("silmeButonu"));


            Assert.fail("Element mevcut, beklenmiyordu.");

        } catch (NoSuchElementException e) {


            System.out.println("Silme butonunu bulunmuyor.");
        }
    }

    @And("Vice Dean mesajlarin silinebildigini dogrular")
    public void viceDeanMesajlarinSilinebildiginiDogrular() {
        try {

            WebElement silmeButonu = Driver.getDriver().findElement(By.id("silmeButonu"));


            Assert.fail("Element mevcut, beklenmiyordu.");

        } catch (NoSuchElementException e) {


            System.out.println("Silme butonunu bulunmuyor.");
        }
    }

    @Given("Kullanici ana sayfaya gider.")
    public void kullaniciAnaSayfayaGider() {
        
    }

    @When("Kullanici Vice Dean hesabi ile giris yapar.")
    public void kullaniciViceDeanHesabiIleGirisYapar() {
        
    }

    @And("Kullanici Menu ye  tiklar.")
    public void kullaniciMenuYeTiklar() {
        
    }

    @Then("Kullanici  acilan pencereden Contact Get All yazisina  tiklar.")
    public void kullaniciAcilanPenceredenContactGetAllYazisinaTiklar() {
        
    }

    @And("Kullanici Name altinda gönderici isimlerini gordugunu dogrular.")
    public void kullaniciNameAltindaGöndericiIsimleriniGordugunuDogrular() {
        
    }

    @And("Kullanici Email altinda gönderici Email adreslerini gordugunu dogrular.")
    public void kullaniciEmailAltindaGöndericiEmailAdresleriniGordugunuDogrular() {
        
    }

    @And("Kullanici Date altinda mesaj tarihlerini gordugunu dogrular.")
    public void kullaniciDateAltindaMesajTarihleriniGordugunuDogrular() {
        
    }

    @And("Kullanici Subject altindaki bilgileri gordugunu dogrular.")
    public void kullaniciSubjectAltindakiBilgileriGordugunuDogrular() {
        
    }

    @And("Kullanici Message altindaki mesajlari gordugunu dogrular.")
    public void kullaniciMessageAltindakiMesajlariGordugunuDogrular() {
        
    }

    @And("Kullanici sayfa kapatir.")
    public void kullaniciSayfaKapatir() {
        
    }

    @And("Kullanici silme buton  gordugunu dogrular.")
    public void kullaniciSilmeButonGordugunuDogrular() {
        
    }

    @And("Kullanici silme butona tiklar")
    public void kullaniciSilmeButonaTiklar() {
    }

    @Given("Mesaj eklemek icin Post request hazirligi yapilir")
    public void mesajEklemekIcinPostRequestHazirligiYapilir() {
        
    }

    @And("Gonderilecek mesaj bilgileri hazirlanir")
    public void gonderilecekMesajBilgileriHazirlanir() {
        
    }

    @When("Mesaj eklemek icin Post request gonderilir")
    public void mesajEklemekIcinPostRequestGonderilir() {
        
    }

    @Then("Mesaj bolumlerini dogrulama: name={string}, email={string}, subject={string}, message={string}, date={string}")
    public void mesajBolumleriniDogrulamaNameEmailSubjectMessageDate(String arg0, String arg1, String arg2, String arg3, String arg4) {
    }

    @Given("Vice Dean, {string} sayfasina gider")
    public void viceDeanSayfasinaGider(String arg0) {
        
    }

    @When("Login butonuna tiklar")
    public void loginButonunaTiklar() {
        
    }

    @Then("Menü butonuna tiklar")
    public void menüButonunaTiklar() {
        
    }

    @And("Olusturulan mesaj bilgilerini görüntüler.")
    public void olusturulanMesajBilgileriniGörüntüler() {
        
    }

    @Given("Kayitli mesaj email ile sorgulanir")
    public void kayitliMesajEmailIleSorgulanir() {
        
    }

    @Then("Mesaj bilgileri dogrulanir DB")
    public void mesajBilgileriDogrulanirDB() {
        
    }

    @Given("user on homepoge")
    public void userOnHomepoge() {
        
    }

    @Then("user click on logibutton")
    public void userClickOnLogibutton() {
        
    }

    @And("user login with valid username")
    public void userLoginWithValidUsername() {
        
    }

    @And("user login with valid password")
    public void userLoginWithValidPassword() {
        
    }

    @And("user clicks on loginbutton")
    public void userClicksOnLoginbutton() {
        
    }

    @Given("user clicks menu button")
    public void userClicksMenuButton() {
        
    }

    @Then("user clicks contact get all button")
    public void userClicksContactGetAllButton() {
        
    }

    @Then("dean verifies contact messages {string} , {string}, {string}, {string}, {string} visibility")
    public void deanVerifiesContactMessagesVisibility(String arg0, String arg1, String arg2, String arg3, String arg4) {
        
    }

    @And("close the website")
    public void closeTheWebsite() {
    }
}


