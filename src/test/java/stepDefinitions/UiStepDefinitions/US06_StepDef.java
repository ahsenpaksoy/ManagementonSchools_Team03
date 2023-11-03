package stepDefinitions.UiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthFieldIntegrator;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AdminPage;
import pages.DeanPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class US06_StepDef {
    HomePage homePage = new HomePage();
    DeanPage deanPage = new DeanPage();
    AdminPage adminPage=new AdminPage();
    Faker faker = new Faker();
    public String nameKI = faker.name().firstName();
    public String surnameKI = faker.name().lastName();
    public String phoneNummerKI = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);
    public String ssnKI = faker.number().numberBetween(100, 999) + "-52-" + faker.number().numberBetween(1000, 9999);
    public String birthPlaceKI = faker.address().city();

   // Date dateKI = faker.date().birthday(18, 50);
   // SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    String dateOfBirthKI = "18/02/1995";
    String userNameKI = nameKI + surnameKI;
    String passwordKI = "Aa245214";


    @Given("Kullanıcı Managementonschools adresine giderKI")
    public void kullanıcıManagementonschoolsAdresineGiderKI() {
        Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));
    }

    @Then("Kullanici Login butonuna basarKI")
    public void kullaniciLoginButonunaBasarKI() {
        homePage.loginButonu.click();
    }

    @And("Kullanici username ve password girerKI")
    public void kullaniciUsernameVePasswordGirerKI() {
        homePage.loginUsernameBox.sendKeys(ConfigReader.getProperty("deanKenan"),
                Keys.TAB, ConfigReader.getProperty("kenanPas"), Keys.TAB, Keys.ENTER);
    }
    @And("Kullanici Login oldugunu dogrularKI")
    public void kullaniciLoginOldugunuDogrularKI() {
        Assert.assertTrue(homePage.menu.isDisplayed());
    }
    @Then("Sayfa basliginin {string} oldugu dogrulanirKI")
    public void sayfaBasligininOlduguDogrulanirKI(String vdm) {
        Assert.assertTrue(deanPage.viceDeanTitleKI.getText().contains(vdm));

    }
    @Given("Name, Surname, Birth Place, Date Of Birth, Phone Number, SSN, UserName, Password butonuna veri girKI")
    public void nameSurnameBirthPlaceDateOfBirthPhoneNumberDateOfBirthSSNUserNamePasswordButonunaVeriGirKI() {
        deanPage.deanNameKI.sendKeys(nameKI);
        deanPage.deanSurnameKI.sendKeys(surnameKI);
        deanPage.deanBirthPlaceKI.sendKeys(birthPlaceKI);
        deanPage.deanBirthDayKI.sendKeys(dateOfBirthKI);
        deanPage.deanPhoneNummerKI.sendKeys(phoneNummerKI);
        deanPage.deanSSNKI.sendKeys(ssnKI);
        deanPage.deanUserNameKI.sendKeys(userNameKI);
        deanPage.deanPassordKI.sendKeys(passwordKI);
    }

    @Then("Gender cinsiyet seçimi yapılırKI")
    public void genderCinsiyetSeçimiYapılırKI() {
        deanPage.genderSecimKI.click();
    }

    @Then("Submit butonuna tiklanirKI")
    public void submitButonunaTiklanirKI() {
        deanPage.submitButonKI.click();
        ReusableMethods.bekle(2);
    }


    @Then("Vice Dean islemi basariyla tamamlanirKI")
    public void kayitIslemiBasariylaTamamlanirKI() {
        Assert.assertTrue(deanPage.viceDeanSavedYaziKI.getText().contains("Vice dean Saved"));
    }


    @Given("Surname, Birth Place, Date Of Birth, Phone Number, SSN, UserName, Password butonuna veri girKI")
    public void surnameBirthPlaceDateOfBirthPhoneNumberSSNUserNamePasswordButonunaVeriGirKI() {
      //  deanPage.deanNameKI.sendKeys(nameKI);
        deanPage.deanSurnameKI.sendKeys(surnameKI);
        deanPage.deanBirthPlaceKI.sendKeys(birthPlaceKI);
        deanPage.deanBirthDayKI.sendKeys(dateOfBirthKI);
        deanPage.deanPhoneNummerKI.sendKeys(phoneNummerKI);
        deanPage.deanSSNKI.sendKeys(ssnKI);
        deanPage.deanUserNameKI.sendKeys(userNameKI);
        deanPage.deanPassordKI.sendKeys(passwordKI);
    }
    @Given("Name, Birth Place, Date Of Birth, Phone Number, SSN, UserName, Password butonuna veri girKI")
    public void nameBirthPlaceDateOfBirthPhoneNumberSSNUserNamePasswordButonunaVeriGirKI() {
        deanPage.deanNameKI.sendKeys(nameKI);
       // deanPage.deanSurnameKI.sendKeys(surnameKI);
        deanPage.deanBirthPlaceKI.sendKeys(birthPlaceKI);
        deanPage.deanBirthDayKI.sendKeys(dateOfBirthKI);
        deanPage.deanPhoneNummerKI.sendKeys(phoneNummerKI);
        deanPage.deanSSNKI.sendKeys(ssnKI);
        deanPage.deanUserNameKI.sendKeys(userNameKI);
        deanPage.deanPassordKI.sendKeys(passwordKI);
    }
    @Given("Name, Surname, Date Of Birth, Phone Number, SSN, UserName, Password butonuna veri girKI")
    public void nameSurnameDateOfBirthPhoneNumberSSNUserNamePasswordButonunaVeriGirKI() {
        deanPage.deanNameKI.sendKeys(nameKI);
        deanPage.deanSurnameKI.sendKeys(surnameKI);
       // deanPage.deanBirthPlaceKI.sendKeys(birthPlaceKI);
        deanPage.deanBirthDayKI.sendKeys(dateOfBirthKI);
        deanPage.deanPhoneNummerKI.sendKeys(phoneNummerKI);
        deanPage.deanSSNKI.sendKeys(ssnKI);
        deanPage.deanUserNameKI.sendKeys(userNameKI);
        deanPage.deanPassordKI.sendKeys(passwordKI);
    }

    @Given("Name, Surname, Birth Place, Phone Number, SSN, UserName, Password butonuna veri girKI")
    public void nameSurnameBirthPlacePhoneNumberSSNUserNamePasswordButonunaVeriGirKI() {
        deanPage.deanNameKI.sendKeys(nameKI);
        deanPage.deanSurnameKI.sendKeys(surnameKI);
        deanPage.deanBirthPlaceKI.sendKeys(birthPlaceKI);
      //  deanPage.deanBirthDayKI.sendKeys(dateOfBirthKI);
        deanPage.deanPhoneNummerKI.sendKeys(phoneNummerKI);
        deanPage.deanSSNKI.sendKeys(ssnKI);
        deanPage.deanUserNameKI.sendKeys(userNameKI);
        deanPage.deanPassordKI.sendKeys(passwordKI);
    }

    @Given("Name, Surname, Birth Place, Date Of Birth, SSN, UserName, Password butonuna veri girKI")
    public void nameSurnameBirthPlaceDateOfBirthSSNUserNamePasswordButonunaVeriGirKI() {
        deanPage.deanNameKI.sendKeys(nameKI);
        deanPage.deanSurnameKI.sendKeys(surnameKI);
        deanPage.deanBirthPlaceKI.sendKeys(birthPlaceKI);
        deanPage.deanBirthDayKI.sendKeys(dateOfBirthKI);
       // deanPage.deanPhoneNummerKI.sendKeys(phoneNummerKI);
        deanPage.deanSSNKI.sendKeys(ssnKI);
        deanPage.deanUserNameKI.sendKeys(userNameKI);
        deanPage.deanPassordKI.sendKeys(passwordKI);
    }

    @Given("Name, Surname, Birth Place, Date Of Birth, Phone Number, UserName, Password butonuna veri girKI")
    public void nameSurnameBirthPlaceDateOfBirthPhoneNumberUserNamePasswordButonunaVeriGirKI() {
        deanPage.deanNameKI.sendKeys(nameKI);
        deanPage.deanSurnameKI.sendKeys(surnameKI);
        deanPage.deanBirthPlaceKI.sendKeys(birthPlaceKI);
        deanPage.deanBirthDayKI.sendKeys(dateOfBirthKI);
        deanPage.deanPhoneNummerKI.sendKeys(phoneNummerKI);
        //deanPage.deanSSNKI.sendKeys(ssnKI);
        deanPage.deanUserNameKI.sendKeys(userNameKI);
        deanPage.deanPassordKI.sendKeys(passwordKI);
    }

    @Given("Name, Surname, Birth Place, Date Of Birth, Phone Number, SSN, Password butonuna veri girKI")
    public void nameSurnameBirthPlaceDateOfBirthPhoneNumberSSNPasswordButonunaVeriGirKI() {
        deanPage.deanNameKI.sendKeys(nameKI);
        deanPage.deanSurnameKI.sendKeys(surnameKI);
        deanPage.deanBirthPlaceKI.sendKeys(birthPlaceKI);
        deanPage.deanBirthDayKI.sendKeys(dateOfBirthKI);
        deanPage.deanPhoneNummerKI.sendKeys(phoneNummerKI);
        deanPage.deanSSNKI.sendKeys(ssnKI);
        //deanPage.deanUserNameKI.sendKeys(userNameKI);
        deanPage.deanPassordKI.sendKeys(passwordKI);
    }

    @Given("Name, Surname, Birth Place, Date Of Birth, Phone Number, SSN, UserName butonuna veri girKI")
    public void nameSurnameBirthPlaceDateOfBirthPhoneNumberSSNUserNameButonunaVeriGirKI() {
        deanPage.deanNameKI.sendKeys(nameKI);
        deanPage.deanSurnameKI.sendKeys(surnameKI);
        deanPage.deanBirthPlaceKI.sendKeys(birthPlaceKI);
        deanPage.deanBirthDayKI.sendKeys(dateOfBirthKI);
        deanPage.deanPhoneNummerKI.sendKeys(phoneNummerKI);
        deanPage.deanSSNKI.sendKeys(ssnKI);
        deanPage.deanUserNameKI.sendKeys(userNameKI);
        //deanPage.deanPassordKI.sendKeys(passwordKI);
    }

    @Then("Gender cinsiyet seçimi bos birakilirKI")
    public void genderCinsiyetSeçimiBosBirakilirKI() {
        Assert.assertTrue(adminPage.genderSelectedKI.isEnabled());

    }

    @And("{string} yazisi gorunerek kayit islemi yapilamaz")
    public void yazisiGorunerekKayitIslemiYapilamaz(String required) {
        Assert.assertTrue(ReusableMethods.invalidSA(required));
    }
    @And("{int} saniye beklerKI")
    public void saniyeBeklerKI(int arg0) {
        ReusableMethods.bekle(2);
    }

    @And("Sayfa kapanirKI")
    public void sayfaKapanirKI() {
        Driver.closeDriver();
    }

}
