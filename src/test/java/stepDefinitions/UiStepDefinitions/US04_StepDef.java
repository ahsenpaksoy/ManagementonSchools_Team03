package stepDefinitions.UiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DeanPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class US04_StepDef {
    HomePage homePage =new HomePage();
    DeanPage deanPage =new DeanPage();
    Faker faker=new Faker();

    String nameEsi = faker.name().firstName();
    String surnameEsi = faker.name().lastName();
    String phoneNummerEsi = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);
    String ssnEsi = faker.number().numberBetween(100, 899) + "-"+faker.number().numberBetween(10, 99)+"-" + faker.number().numberBetween(1000, 9999);
    String birthPlaceEsi = faker.address().city();
    Date dateEsi = faker.date().birthday(25, 60);
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    String dateOfBirthEsi = format.format(dateEsi);
    String userNameEsi = nameEsi + surnameEsi;

    String passwordEsi=faker.internet().password()+"Aa2";


    @Given("Kullanici Login butonuna basar Esi")
    public void kullaniciLoginButonunaBasar() {
      homePage.loginButonu.click();
    }

    @Then("Username ve password kutularını doldurarak enter tuşuna basar Esi")
    public void usernameVePasswordKutularınıDoldurarakEnterTuşunaBasar() {
        String username =ConfigReader.getProperty("adminNameEsi");
        String password = ConfigReader.getProperty("passwordEsi");
        homePage.loginUsernameBox.sendKeys(username, Keys.TAB,password,Keys.TAB,Keys.ENTER);
    }

    @Then("Açılan sayfadan menu tusuna basar Esi")
    public void açılanSayfadanMenuTusunaBasar() {
        homePage.menu.click();
    }

    @Then("Dashboard kısmından Dean Management seçilir Esi")
    public void dashboardKısmındanDeanManagementSeçilir() {
        deanPage.deanManagementEsi.click();
        ReusableMethods.bekle(1);

    }

    @Given("Kullanıcı Managementonschools adresine gider Esi")
    public void kullanıcıManagementonschoolsAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));
        ReusableMethods.bekle(1);
    }


    @Given("Admin add Dean bolumundeki name kismina bir veri girer Esi")
    public void adminAddDeanBolumundekiNameKisminaBirVeriGirer() {
        deanPage.deanNameEsi.sendKeys(nameEsi);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki surname kismina bir verir girer Esi")
    public void adminAddDeanBolumundekiSurnameKisminaBirVerirGirer() {
        deanPage.deanSurnameEsi.sendKeys(surnameEsi);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki birth place kismina bir verir girer Esi")
    public void adminAddDeanBolumundekiBirthPlaceKisminaBirVerirGirer() {
        deanPage.deanBirthPlaceEsi.sendKeys(birthPlaceEsi);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi")
    public void adminAddDeanBolumundekiGenderKismindaCinsiyetiBelirler() {
        deanPage.deanGenderMaleEsi.click();
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi")
    public void adminAddDeanBolumundekiDateOfBirthKisminaBirVerirGirer() {
        deanPage.deanBirthdayEsi.sendKeys(dateOfBirthEsi);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki phone kismina bir verir girer Esi")
    public void adminAddDeanBolumundekiPhoneKisminaBirVerirGirer() {
        deanPage.deanPhoneNumberEsi.sendKeys(phoneNummerEsi);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki Ssn kismina bir verir girer Esi")
    public void adminAddDeanBolumundekiSsnKisminaBirVerirGirer() {
        deanPage.deanSsnNumberEsi.sendKeys(ssnEsi);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki username kismina bir verir girer Esi")
    public void adminAddDeanBolumundekiUsernameKisminaBirVerirGirer() {
        deanPage.deanUserNameEsi.sendKeys(userNameEsi);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki password kismina bir verir girer Esi")
    public void adminAddDeanBolumundekiPasswordKisminaBirVerirGirer() {
        deanPage.deanPasswordEsi.sendKeys(passwordEsi);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki submit butonuna tıklar Esi")
    public void adminAddDeanBolumundekiSubmitButonunaTıklar() {
        deanPage.deanSubmitButonuEsi.click();
        ReusableMethods.bekle(1);

    }

    @Then("Dean eklenebildigini dogrula Esi")
    public void deanEklenebildiginiDogrula() {

        Assert.assertTrue(deanPage.deanSavedEsi.getText().contains("Saved"));
    }

    @Then("sayfayi kapatir Esi")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Given("Admin add Dean bolumundeki name kismini bos birakir Esi")
    public void adminAddDeanBolumundekiNameKisminiBosBirakirEsi() {
        deanPage.deanNameEsi.sendKeys("");
    }


    @Then("Admin add Dean bolumundeki name kutusunun altinda required yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiNameKutusununAltindaRequiredYazisininGeldiginiDogrularEsi() {
       Assert.assertTrue(deanPage.nameRequiredEsi.getText().contains("Required"));
    }

    @Then("Admin add Dean bolumundeki Surname kutusunun altinda required yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiSurnameKutusununAltindaRequiredYazisininGeldiginiDogrularEsi() {
        Assert.assertTrue(deanPage.surnameRequiredEsi.getText().contains("Required"));
    }

    @Then("Admin add Dean bolumundeki surname kismini bos birakir Esi")
    public void adminAddDeanBolumundekiSurnameKisminiBosBirakirEsi() {
        deanPage.deanSurnameEsi.sendKeys("");
    }

    @Then("Admin add Dean bolumundeki birth place kismini bos birakir Esi")
    public void adminAddDeanBolumundekiBirthPlaceKisminiBosBirakirEsi() {
        deanPage.deanBirthPlaceEsi.sendKeys("");
    }

    @Then("Admin add Dean bolumundeki birth place kutusunun altinda required yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiBirthPlaceKutusununAltindaRequiredYazisininGeldiginiDogrularEsi() {
        Assert.assertTrue(deanPage.birthplaceRequiredEsi.getText().contains("Required"));

    }

    @Then("Admin add Dean bolumundeki gender kisminda cinsiyeti bos birakir Esi")
    public void adminAddDeanBolumundekiGenderKismindaCinsiyetiBosBirakirEsi() {

    }


    @Then("invalid value uyarisi alindigini dogrula Esi")
    public void invalidValueUyarisiAlindiginiDogrulaEsi() {
        Assert.assertTrue(deanPage.deanSavedEsi.getText().contains("invalid"));
    }

    @Then("Admin add Dean bolumundeki Date of Birth kismini bos birakir Esi")
    public void adminAddDeanBolumundekiDateOfBirthKisminiBosBirakirEsi() {

    }

    @Then("Admin add Dean bolumundeki date of birth kutusunun altinda required yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiDateOfBirthKutusununAltindaRequiredYazisininGeldiginiDogrularEsi() {
        Assert.assertTrue(deanPage.dateofbirthRequiredEsi.getText().contains("Required"));
    }

    @Then("Admin add Dean bolumundeki Date of Birth kismina gelecekten bir tarih girilir Esi")
    public void adminAddDeanBolumundekiDateOfBirthKisminaGelecektenBirTarihGirilirEsi() {
        deanPage.deanBirthdayEsi.sendKeys(ConfigReader.getProperty("deangelecekTarihEsi"));
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki gecmis bir tarih olmali uyari yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiGecmisBirTarihOlmaliUyariYazisininGeldiginiDogrularEsi() {
        Assert.assertTrue(deanPage.deanSavedEsi.getText().contains("geçmiş bir tarih olmalı"));
    }

    @Then("Admin add Dean bolumundeki phone kismini bos birakir Esi")
    public void adminAddDeanBolumundekiPhoneKisminiBosBirakirEsi() {

    }


    @Then("Admin add Dean bolumundeki phone kutusunun altinda required yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiPhoneKutusununAltindaRequiredYazisininGeldiginiDogrularEsi() {
        Assert.assertTrue(deanPage.phoneRequiredEsi.getText().contains("Required"));
    }

    @Then("Admin add Dean bolumundeki Ssn kismini bos birakir Esi")
    public void adminAddDeanBolumundekiSsnKisminiBosBirakirEsi() {

    }

    @Then("Admin add Dean bolumundeki ssn kutusunun altinda required yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiSsnKutusununAltindaRequiredYazisininGeldiginiDogrularEsi() {
        Assert.assertTrue(deanPage.ssnRequiredEsi.getText().contains("Required"));
    }

    @Then("Admin add Dean bolumundeki Ssn kismina gecersiz formatta veri girer Esi")
    public void adminAddDeanBolumundekiSsnKisminaGecersizFormattaVeriGirerEsi() {
        deanPage.deanSsnNumberEsi.sendKeys(ConfigReader.getProperty("ssnTiresizEsi"));
    }




    @Then("Sistemden Please enter a valid SSN number yazisinin geldigini dogrula Esi")
    public void sistemdenPleaseEnterAValidSSNNumberYazisininGeldiginiDogrulaEsi() {
        Assert.assertTrue(deanPage.deanSavedEsi.getText().contains("Please"));
    }

    @Then("Admin add Dean bolumundeki Ssn kismina dokuz rakamdan daha az rakamli bir veri girer Esi")
    public void adminAddDeanBolumundekiSsnKisminaDokuzRakamdanDahaAzRakamliBirVeriGirerEsi() {
        deanPage.deanSsnNumberEsi.sendKeys(ConfigReader.getProperty("ssnSekizRakamEsi"));
    }


    @Then("Sistemden {string} yazisinin geldigini dogrula Esi")
    public void sistemdenYazisininGeldiginiDogrulaEsi(String text) {
        Assert.assertTrue(deanPage.ssnRequiredEsi.getText().contains(text));
    }

    @Then("Admin add Dean bolumundeki Ssn kismina dokuz rakamdan daha fazla rakam ile bir veri girer Esi")
    public void adminAddDeanBolumundekiSsnKisminaDokuzRakamdanDahaFazlaRakamIleBirVeriGirerEsi() {
        deanPage.deanSsnNumberEsi.sendKeys(ConfigReader.getProperty("ssnOnRakamEsi"));
    }

    @Then("Admin add Dean bolumundeki username kismina bos birakir Esi")
    public void adminAddDeanBolumundekiUsernameKisminaBosBirakirEsi() {

    }

    @Then("Admin add Dean bolumundeki username kutusunun altinda required yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiUsernameKutusununAltindaRequiredYazisininGeldiginiDogrularEsi() {
        Assert.assertTrue(deanPage.usernameRequiredEsi.getText().contains("Required"));
    }

    @Then("Admin add Dean bolumundeki password kismini bos birakir Esi")
    public void adminAddDeanBolumundekiPasswordKisminiBosBirakirEsi() {

    }

    @Then("Admin add Dean bolumundeki password kutusunun altinda Enter your password yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiPasswordKutusununAltindaEnterYourPasswordYazisininGeldiginiDogrularEsi() {
        Assert.assertTrue(deanPage.passwordEnterEsi.getText().contains("Enter your password"));
    }


    @Then("Admin add Dean bolumundeki password kismina sekiz karakterden az bir veri girer Esi")
    public void adminAddDeanBolumundekiPasswordKisminaSekizKarakterdenAzBirVeriGirerEsi() {
        deanPage.deanPasswordEsi.sendKeys(ConfigReader.getProperty("passwordYediEsi"));
    }

    @Then("Admin add Dean bolumundeki password kutusunun altinda {string} yazisinin geldigini dogrular Esi")
    public void adminAddDeanBolumundekiPasswordKutusununAltindaYazisininGeldiginiDogrularEsi(String text) {
        Assert.assertTrue(deanPage.passwordEnterEsi.getText().contains(text));
    }

    @Then("Admin add Dean bolumundeki password kismina buyuk harf icermeyen bir veri girer Esi")
    public void adminAddDeanBolumundekiPasswordKisminaBuyukHarfIcermeyenBirVeriGirerEsi() {
        deanPage.deanPasswordEsi.sendKeys(ConfigReader.getProperty("passwordBYokEsi"));
    }

    @Then("Admin add Dean bolumundeki password kismina kucuk harf icermeyen bir veri girer Esi")
    public void adminAddDeanBolumundekiPasswordKisminaKucukHarfIcermeyenBirVeriGirerEsi() {
        deanPage.deanPasswordEsi.sendKeys(ConfigReader.getProperty("passwordkYokEsi"));

    }

    @Then("Admin add Dean bolumundeki password kismina rakam icermeyen bir veri girer Esi")
    public void adminAddDeanBolumundekiPasswordKisminaRakamIcermeyenBirVeriGirerEsi() {
        deanPage.deanPasswordEsi.sendKeys(ConfigReader.getProperty("passwordRYokEsi"));
    }
}
