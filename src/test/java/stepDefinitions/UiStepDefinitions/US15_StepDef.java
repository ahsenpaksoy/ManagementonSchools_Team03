package stepDefinitions.UiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.ViceDeanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;

import static junit.framework.TestCase.assertTrue;

public class US15_StepDef {
    ViceDeanPage viceDeanPage = new ViceDeanPage();
    Faker faker=new Faker();

    String name_DB = faker.name().firstName();
    String surname_DB = faker.name().lastName() ;
    String phoneNumber_DB = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);
    String ssn_DB = faker.number().numberBetween(100, 899) + "-"+faker.number().numberBetween(10, 99)+"-" + faker.number().numberBetween(1000, 9999);
    String birthPlace_DB = faker.address().city();
    String email_DB = faker.internet().emailAddress();
    Date date_DB = faker.date().birthday(18, 60);
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    String dateOfBirth_DB = format.format(date_DB);
    String userName_DB = name_DB + surname_DB;

    String password_DB=faker.internet().password(8,13,true,false,true);

    @Given("kullanici  Managementon Schools sayfasina gider_DB")
    public void kullaniciManagementonSchoolsSayfasinaGider_DB() {
        Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));
        ReusableMethods.bekle(2);
    }

    @Then("kullanici login butonuna tiklar_DB")
    public void kullaniciLoginButonunaTiklar_DB() {
        viceDeanPage.loginButton_DB.click();
        ReusableMethods.bekle(2);
    }

    @Then("kullanici kayitli User Name ve password ile Vise Dean olarak giris yapar_DB")
    public void kullaniciKayitliUserNameVePasswordIleViseDeanOlarakGirisYapar_DB() {
        String username = ConfigReader.getProperty("userName_DB");
        String password = ConfigReader.getProperty("password_DB");
        viceDeanPage.loginUserNameBox_DB.sendKeys(username, Keys.TAB,password,Keys.TAB,Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @Then("kullanici menu butonuna tiklar_DB")
    public void kullaniciMenuButonunaTiklar_DB() {
        viceDeanPage.menuButton_DB.click();
        ReusableMethods.bekle(2);
    }

    @Then("kullanici menu kismindan Student Management i secer_DB")
    public void kullaniciMenuKismindanStudentManagementISecer_DB() {
        viceDeanPage.studentManagement_DB.click();
        ReusableMethods.bekle(2);
    }

    @Given("kullanici Choose Advisor Teacher kismindan {string} secer")
    public void kullaniciChooseAdvisorTeacherKismindanSecer(String teacher) {
        viceDeanPage.chooseTeacher_DB.sendKeys(teacher, Keys.ENTER);
        ReusableMethods.bekle(1);
    }
    @Then("kullanici name alanina isim girer_DB")
    public void kullaniciNameAlaninaIsimGirer_DB() {
        viceDeanPage.nameBox_DB.sendKeys(name_DB);
        ReusableMethods.bekle(1);
    }
    @And("kullanici surname alanina soyisim girer_DB")
    public void kullaniciSurnameAlaninaSoyisimGirer_DB() {
        viceDeanPage.sunameBox_DB.sendKeys(surname_DB);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Birth Place alanina dogum yeri girer_DB")
    public void kullaniciBirthPlaceAlaninaDogumYeriGirer_DB() {
        viceDeanPage.birthPlaceBox_DB.sendKeys(birthPlace_DB);
        ReusableMethods.bekle(1);
    }

    @And("kullanci Email alanina email girer_DB")
    public void kullanciEmailAlaninaEmailGirer_DB() {
        viceDeanPage.emailBox_DB.sendKeys(email_DB);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Phone Number alanina telefonnumarasi girer_DB")
    public void kullaniciPhoneNumberAlaninaTelefonnumarasiGirer_DB() {
        viceDeanPage.phoneNumberBox_DB.sendKeys(phoneNumber_DB);
        ReusableMethods.bekle(1);

    }

    @And("kullanici Gender alanindan {string} secenegini secer_DB")
    public void kullaniciGenderAlanindanSeceneginiSecer_DB(String cinsiyet) {
        String gender = "";
        if (cinsiyet.equalsIgnoreCase("FEMALE")) {
            viceDeanPage.femaleRadioButton_DB.click();
            gender = "FEMALE";
        } else if (cinsiyet.equalsIgnoreCase("MALE")) {
            viceDeanPage.femaleRadioButton_DB.click();
            gender = "MALE";
        } else {
            System.out.println("Hatalı veri girdiniz.");
        }
        ReusableMethods.bekle(1);
    }

    @And("kullanici Birth Date alanina dogum gunu girer_DB")
    public void kullaniciBirthDateAlaninaDogumGunuGirer_DB() {
        viceDeanPage.birthDayBox_DB.sendKeys(dateOfBirth_DB);
        ReusableMethods.bekle(1);
    }

    @And("kullanici SSN alanina ssn girer_DB")
    public void kullaniciSSNAlaninaSsnGirer_DB() {
        viceDeanPage.ssnBox_DB.sendKeys(ssn_DB);
        ReusableMethods.bekle(1);
    }

    @And("kullanici User Name alanina username girer_DB")
    public void kullaniciUserNameAlaninaUsernameGirer_DB() {
        viceDeanPage.usernameBox_DB.sendKeys(userName_DB);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Father Name alanina baba adi girer_DB")
    public void kullaniciFatherNameAlaninaBabaAdiGirer_DB() {
        viceDeanPage.fatherNameBox_DB.sendKeys(name_DB);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Mother Name alanina anne adi girer_DB")
    public void kullaniciMotherNameAlaninaAnneAdiGirer_DB() {
        viceDeanPage.motherNameBox_DB.sendKeys(name_DB);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Password alanina password girer_DB")
    public void kullaniciPasswordAlaninaPasswordGirer_DB() {
        viceDeanPage.passwordBox_DB.sendKeys(password_DB);
        ReusableMethods.bekle(1);
    }

    @And("kullanici Submit dugmesine tiklar_DB")
    public void kullaniciSubmitDugmesineTiklar_DB() {
        viceDeanPage.submitButton_DB.click();
        ReusableMethods.bekle(1);
    }

    @And("kullanici Ogrenci olustugunu dogrular_DB")
    public void kullaniciOgrenciOlustugunuDogrular_DB() {
        Assert.assertTrue(viceDeanPage.studentVerify_DB.getText().contains("Student saved Successfully"));
        ReusableMethods.bekle(1);
    }

    @And("Kullanici sayfayi kapatir_DB")
    public void kullaniciSayfayiKapatir_DB() {
        ReusableMethods.bekle(1);
        Driver.closeDriver();//tc01
    }

    @Then("kullanici name alanini bos birakir_DB")
    public void kullaniciNameAlaniniBosBirakir_DB() {
        viceDeanPage.nameBox_DB.sendKeys("");
    }

    @And("Name kutusu bos olunca ogrencinin olusturulamadigini dogrular_DB")
    public void nameKutusuBosOluncaOgrencininOlusturulamadiginiDogrular_DB() {
        ReusableMethods.bekle(2);
        assertTrue(viceDeanPage.requiredName_DB.isDisplayed());//tc02
    }

    @And("kullanici surname alanini bos birakir_DB")
    public void kullaniciSurnameAlaniniBosBirakir_DB() {
        viceDeanPage.sunameBox_DB.sendKeys("");
        ReusableMethods.bekle(2);
    }

    @And("Surname kutusu bos olunca ogrencinin olusturulamadigini dogrular_DB")
    public void surnameKutusuBosOluncaOgrencininOlusturulamadiginiDogrular_DB() {
        ReusableMethods.bekle(2);
        assertTrue(viceDeanPage.requiredSurname_DB.isDisplayed());//tc03
    }
    @And("kullanici Birth Place alanini bos birakir_DB")
    public void kullaniciBirthPlaceAlaniniBosBirakir_DB() {
        viceDeanPage.birthPlaceBox_DB.sendKeys("");
        ReusableMethods.bekle(2);
    }
    @And("Birth Place kutusu bos olunca ogrencinin olusturulamadigini dogrular_DB")
    public void birthPlaceKutusuBosOluncaOgrencininOlusturulamadiginiDogrular_DB() {
        ReusableMethods.bekle(2);
        assertTrue(viceDeanPage.requiredBirthPlace_DB.isDisplayed());//tc04
    }

    @And("kullanci Email alanini bos birakir_DB")
    public void kullanciEmailAlaniniBosBirakir_DB() {
        viceDeanPage.emailBox_DB.sendKeys("");
        ReusableMethods.bekle(2);
    }
    @And("Email alani bos olunca ogrencinin olusturulamadigini dogrular_DB")
    public void emailAlaniBosOluncaOgrencininOlusturulamadiginiDogrular_DB() {
        ReusableMethods.bekle(2);
        assertTrue(viceDeanPage.requiredEmail_DB.isDisplayed());//tc05
    }

    @And("kullanici Phone Number alaninbos birakir_DB")
    public void kullaniciPhoneNumberAlaninbosBirakir_DB() {
        viceDeanPage.phoneNumberBox_DB.sendKeys("");
        ReusableMethods.bekle(2);
    }

    @And("phone Number kutusu bos olunca ogrencinin olusturulamadigini dogrular_DB")
    public void phoneNumberKutusuBosOluncaOgrencininOlusturulamadiginiDogrular_DB() {
        ReusableMethods.bekle(2);
        assertTrue(viceDeanPage.requiredPhone_DB.isDisplayed());//tc06
    }

    @And("kullanici Gender alaninni bos birakir_DB")
    public void kullaniciGenderAlaninniBosBirakir_DB() {
    }
    @And("Gender kismini bos birakarak ogrenci olusturulamadigini dogrular_DB")
    public void genderKisminiBosBirakarakOgrenciOlusturulamadiginiDogrular_DB() {
        assertTrue(viceDeanPage.assertGender_DB.isDisplayed());//tc07

    }

    @And("kullanici Birth Place alanini bos birakirDB")
    public void kullaniciBirthPlaceAlaniniBosBirakirDB() {
    }
    @And("Birth Date alanıni bos birakarak ogrenci olusturulamadigini dogrular_DB")
    public void birthDateAlanıniBosBirakarakOgrenciOlusturulamadiginiDogrular_DB() {
        ReusableMethods.bekle(2);
        assertTrue(viceDeanPage.requiredBirthPlace_DB.isDisplayed());//tc08
    }
    @And("kullanici SSN alanina patterne uygun olmayan bir numara girer_DB")
    public void kullaniciSSNAlaninaPatterneUygunOlmayanBirNumaraGirer_DB() {
        viceDeanPage.ssnBox_DB.sendKeys("123-432-1234");
        ReusableMethods.bekle(2);
    }
    @And("SSN alanina patterne uygun olmayan bir numara girildigi icin ogrencinin olusturulamadigini dogrular_DB")
    public void ssnAlaninaPatterneUygunOlmayanBirNumaraGirildigiIcinOgrencininOlusturulamadiginiDogrular_DB() {
        assertTrue(viceDeanPage.ssnHataYazisi_DB.isDisplayed());//tc09
    }

    @And("kullanici SSN alanini bos birakir_DB")
    public void kullaniciSSNAlaniniBosBirakir_DB() {
    }
    @And("ssn kutusu bos olunca ogrencinin olusturulamadigini dogrular_DB")
    public void ssnKutusuBosOluncaOgrencininOlusturulamadiginiDogrular_DB() {
        assertTrue(viceDeanPage.requiredSsn_DB.isDisplayed());//tc10
    }

    @And("kullanici User Name alanini bos birakir_DB")
    public void kullaniciUserNameAlaniniBosBirakir_DB() {
    }
    @And("User Name alani bos birakilarak ogrencinin olusturulamadigini dogrular_DB")
    public void userNameAlaniBosBirakilarakOgrencininOlusturulamadiginiDogrular_DB() {
        viceDeanPage.requiredUserName_DB.isDisplayed();//tc11
    }
    @And("kullanici Father Name alanini bos birakir_DB")
    public void kullaniciFatherNameAlaniniBosBirakir_DB() {
    }
    @And("Father Name alani bos birakilarak  ogrencinin olusturulamadigini dogrular_DB")
    public void fatherNameAlaniBosBirakilarakOgrencininOlusturulamadiginiDogrular_DB() {
        viceDeanPage.requiredFatherName_DB.isDisplayed();//tc12
    }
    @And("kullanici Mother Name alanini bos birakir_DB")
    public void kullaniciMotherNameAlaniniBosBirakir_DB() {
    }
    @And("Mother Name alani bos birakilarak ogrencinin olusturulamadigini dogrular_DB")
    public void motherNameAlaniBosBirakilarakOgrencininOlusturulamadiginiDogrular_DB() {
        viceDeanPage.requiredMotherName_DB.isDisplayed();//tc13
    }
    @And("kullanici Password alanini bois birakir_DB")
    public void kullaniciPasswordAlaniniBoisBirakir_DB() {
    }
    @And("Password alani bos birakilarak ogrencinin olusturulamadigini dogrular_DB")
    public void passwordAlaniBosBirakilarakOgrencininOlusturulamadiginiDogrular_DB() {
        viceDeanPage.requiredPassword_DB.isDisplayed();//tc13
    }

    @And("kullanici Password alanina {int} karakterli sifre girer_DB")
    public void kullaniciPasswordAlaninaKarakterliSifreGirer_DB(int arg0) {
    }

    @And("Sekiz karakterden daha az karakterli bir sifre ile ogrencinin olusturulamadigini dogrular_DB")
    public void sekizKarakterdenDahaAzKarakterliBirSifreIleOgrencininOlusturulamadiginiDogrular_DB() {
    }
}
