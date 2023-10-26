package stepDefinitions.UiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.DecimalFormat;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class US01_StepDef {

    RegisterPage registerPage=new RegisterPage();
    Faker faker=new Faker();

    @Given("kullanici {string} e gider")
    public void kullaniciEGider(String url) {
        Driver.getDriver().get(url);

    }
    /*@Given("kullanici web sitesine gider")
    public void verilenKullaniciWebSitesineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));
    }*/
    @And("kullanici Register butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {
        registerPage=new RegisterPage();
        ReusableMethods.click(registerPage.registerButton_SK);
    }
    @And("kullanici name alanina isim girer")
    public void kullaniciNameAlaninaIsimGirer() {
        registerPage.nameKutusu_SK.sendKeys(faker.name().firstName());
    }
    @And("kullanici surname alanina soyisim girer")
    public void kullaniciSurnameAlaninaSoyisimGirer() {
        registerPage.surnameKutusu_SK.sendKeys(faker.name().lastName());
    }
    @And("kullanici Birth Place alanina dogum yeri girer")
    public void kullaniciBirthPlaceAlaninaDogumYeriGirer() {
        registerPage.birthPlaceKutusu_SK.sendKeys(faker.country().name());
    }
    @And("kullanici Phone Number alanina telefonnumarasi girer")
    public void kullaniciPhoneNumberAlaninaTelefonnumarasiGirer() {
        registerPage.phoneNumberKutusu_SK.sendKeys(generateFakePhoneNumber());
    }
    @And("kullanici Gender alanindan cinsiyet secer")
    public void kullaniciGenderAlanindanCinsiyetSecer() {
        ReusableMethods.click(registerPage.genderRadioButtun_SK);
    }
    @And("kullanici Birth Date alanina dogum gunu girer")
    public void kullaniciBirthDateAlaninaDogumGunuGirer() {
        registerPage.birthDayKutusu_SK.sendKeys(generateRandomDate());
    }
    @And("kullanici SSN alanina ssn girer")
    public void kullaniciSSNAlaninaSsnGirer() {
        registerPage.ssnKutusu_SK.sendKeys(generateFakeSSN());
    }

    @And("kullanici User Name alanina username girer")
    public void kullaniciUserNameAlaninaUsernameGirer() {
        registerPage.userNameKutusu_SK.sendKeys(faker.name().username());
    }
    @And("kullanici Password alanina password girer")
    public void kullaniciPasswordAlaninaPasswordGirer() {
        registerPage.passwordKutusu_SK.sendKeys("MErlin01");
    }
    @And("kullanici Register dugmesine tiklar")
    public void kullaniciRegisterDugmesineTiklar() {
        ReusableMethods.click(registerPage.registerMaviButton_SK);
        ReusableMethods.bekle(2);
    }
    @And("Kayit islemi basariyla tamamlanir")
    public void kayitIslemiBasariylaTamamlanir() {
        ReusableMethods.visibleWait(registerPage.guestUserRegisterYazisi_SK, 5);
        assertTrue(registerPage.guestUserRegisterYazisi_SK.getText().contains("Guest User registered."));
    }
    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
    }
    @And("Name kutusu bos olunca kayit isleminin tamamlanmadigini dogrular")  //TC02
    public void nameKutusuBosOluncaKayitIslemininTamamlanmadiginiDogrular() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.nameKutusu_SK);
        ReusableMethods.bekle(2);
        assertTrue(registerPage.nameRequried_SK.isDisplayed());
    }
    @And("Surname kutusu bos olunca kayit isleminin tamamlanmadigini dogrular")  //TC03
    public void surnameKutusuBosOluncaKayitIslemininTamamlanmadiginiDogrular() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.surnameKutusu_SK);
        ReusableMethods.bekle(2);
        assertTrue(registerPage.surnameRequried_SK.isDisplayed());
    }
    @And("kullanici Birth Place alanini bos birakir")  //TC04
    public void kullaniciBirthPlaceAlaniniBosBirakir() {

        //bos birakilir
    }
    @And("Birth Place kutusu bos olunca kayit isleminin tamamlanmadigini dogrular")
    public void birthPlaceKutusuBosOluncaKayitIslemininTamamlanmadiginiDogrular() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.birthPlaceKutusu_SK);
        ReusableMethods.bekle(2);
        assertTrue(registerPage.birthplaceRequried_SK.isDisplayed());
    }
    @And("kullanici Phone Number alanini bos birak")     //TC05
    public void kullaniciPhoneNumberAlaniniBosBirak() {
        //bos birakilir
    }
    @And("phone Number kutusu bos olunca kayit isleminin tamamlanmadigini dogrular")
    public void phoneNumberKutusuBosOluncaKayitIslemininTamamlanmadiginiDogrular() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.phoneNumberKutusu_SK);
        assertTrue(registerPage.phoneRequried_SK.isDisplayed());
    }
    @And("kullanici Phone Number alanina patterne uygun olmayan bir numara girer")  //TC06
    public void kullaniciPhoneNumberAlaninaPatterneUygunOlmayanBirNumaraGirer() {

        registerPage.phoneNumberKutusu_SK.sendKeys("123-432-12347");
        ReusableMethods.bekle(2);

    }
    @And("Phone Number alanina patterne uygun olmayan bir numara girildigi icin kayit isleminin tamamlanmadigini dogrular")
    public void phoneNumberAlaninaPatterneUygunOlmayanBirNumaraGirildigiIcinKayitIslemininTamamlanmadiginiDogrular() {
        assertTrue(registerPage.phoneNumberUyari_SK.getText().contains("Please enter valid phone number"));
    }
    @And("kullanici SSN alanina patterne uygun olmayan bir numara girer")  //TC07
    public void kullaniciSSNAlaninaPatterneUygunOlmayanBirNumaraGirer() {
        registerPage.ssnKutusu_SK.sendKeys("123-432-1234");
        ReusableMethods.bekle(2);
    }
    @And("SSN alanina patterne uygun olmayan bir numara girildigi icin kayit isleminin tamamlanmadigini dogrular")
    public void ssnAlaninaPatterneUygunOlmayanBirNumaraGirildigiIcinKayitIslemininTamamlanmadiginiDogrular() {
        assertTrue(registerPage.ssnHataYazisi_SK.isDisplayed());
    }
    @And("kullanici SSN alanini bos birakir")  //TC08
    public void kullaniciSSNAlaniniBosBirakir() {
        //bu alan bos birakilir
    }
    @And("ssn kutusu bos olunca kayit isleminin tamamlanmadigini dogrular")
    public void ssnKutusuBosOluncaKayitIslemininTamamlanmadiginiDogrular() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.ssnKutusu_SK);
        assertTrue(registerPage.ssnRequried_SK.isDisplayed());
    }
    @And("kullanici Birth Date alanini bos birakir")
    public void kullaniciBirthDateAlaniniBosBirakir() {  //TC09
        //alan bos birakilir
    }
    @And("Birth Date alanini bos birakinca kayit olunamadigini dogrular")
    public void birthDateAlaniniBosBirakincaKayitOlunamadiginiDogrular() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.birthDayKutusu_SK);
        assertTrue(registerPage.birthdayRequried_SK.isDisplayed());
    }
    @And("kullanici User Name alanini bos birakir")     //TC19
    public void kullaniciUserNameAlaniniBosBirakir() {
        //bos birakilir
    }
    @And("User Name alani bos birakilarak kayit olunamadigini dogrular")
    public void userNameAlaniBosBirakilarakKayitOlunamadiginiDogrular() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.userNameKutusu_SK);
        assertTrue(registerPage.usernameRequried_SK.isDisplayed());
    }
    @And("kullanici Password alanini bos birakir")    //TC11
    public void kullaniciPasswordAlaniniBosBirakir() {
        //bos birakir
    }
    @And("Password alani bos birakilarak kayit olunamadigini dogrular")
    public void passwordAlaniBosBirakilarakKayitOlunamadiginiDogrular() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.passwordKutusu_SK);
        assertTrue(registerPage.passwordRequried_SK.isDisplayed());
    }
    @And("kullanici Password alanina yedi karakterli bir  {string} girer")  //TC12
    public void kullaniciPasswordAlaninaYediKarakterliBirGirer(String sifre) {
         sifre = rasgeleSifreOlustur(7);
        registerPage.passwordKutusu_SK.sendKeys(sifre);
    }
    @And("Sekiz karakterden daha az karakterli bir sifre ile kayit olunamadigini dogrular")
    public void sekizKarakterdenDahaAzKarakterliBirSifreIleKayitOlunamadiginiDogrular() {
        ReusableMethods.bekle(2);
        //assertTrue(registerPage.passwordRequried_SK.isDisplayed());
        assertTrue(registerPage.passwordRequried_SK.getText().contains("At least 8 characters"));
    }
    @And("kullanici Password alanina sadece rakamlardan olusan bir sifre girer")  //TC13
    public void kullaniciPasswordAlaninaSadeceRakamlardanOlusanBirSifreGirer() {
        ReusableMethods.bekle(2);
        registerPage.passwordKutusu_SK.sendKeys("123456789");
    }
    @And("Kayit isleminin tamamlanmadigini dogrular")
    public void kayitIslemininTamamlanmadiginiDogrular() {
        assertTrue(registerPage.passwordRequried_SK.getText().contains("One lowercase character"));
    }
    @And("kullanici Password alanina sadece kucuk harflerden olusan bir sifre girer")  //TC14
    public void kullaniciPasswordAlaninaSadeceKucukHarflerdenOlusanBirSifreGirer() {
        ReusableMethods.bekle(2);
        registerPage.passwordKutusu_SK.sendKeys("ascdgstejkl");
    }
    @And("kullanici sadece kucuk harflerden olusan bir sifre ile kayit olamaz")
    public void kullaniciSadeceKucukHarflerdenOlusanBirSifreIleKayitOlamaz() {
        assertTrue(registerPage.passwordRequried_SK.getText().contains("One uppercase character"));
    }

    @And("kullanici Password alanina sadece buyuk harflerden olusan bir sifre girer")  //TC15
    public void kullaniciPasswordAlaninaSadeceBuyukHarflerdenOlusanBirSifreGirer() {
        ReusableMethods.bekle(2);
        registerPage.passwordKutusu_SK.sendKeys("ASCDBEJDKFL");
    }
    @And("kullanici sadece buyuk harflerden olusan bir sifre ile kayit olamaz")
    public void kullaniciSadeceBuyukHarflerdenOlusanBirSifreIleKayitOlamaz() {
        assertTrue(registerPage.passwordRequried_SK.getText().contains("One lowercase character"));
    }
    @And("kullanici Password alanina sadece buyuk ve kucuk harflerden olusan bir sifre girer") //TC16
    public void kullaniciPasswordAlaninaSadeceBuyukVeKucukHarflerdenOlusanBirSifreGirer() {
        ReusableMethods.bekle(2);
        registerPage.passwordKutusu_SK.sendKeys("ASCDBEJDKFLacsbdnjdjd");

    }
    @And("kullanici sadece buyuk ve kucuk harflerden olusan bir sifre ile kayit olamaz")
    public void kullaniciSadeceBuyukVeKucukHarflerdenOlusanBirSifreIleKayitOlamaz() {
        assertTrue(registerPage.passwordRequried_SK.getText().contains("One number"));
    }
    @And("kullanici Password alanina sadece rakam ve buyuk harflerden olusan bir sifre girer")  //TC17
    public void kullaniciPasswordAlaninaSadeceRakamVeBuyukHarflerdenOlusanBirSifreGirer() {
        ReusableMethods.bekle(2);
        registerPage.passwordKutusu_SK.sendKeys("ASCDBEJDKFL123456");

    }
    @And("kullanici sadece rakam ve buyuk harflerden olusan bir sifre ile kayit olamaz")
    public void kullaniciSadeceRakamVeBuyukHarflerdenOlusanBirSifreIleKayitOlamaz() {
        ReusableMethods.bekle(2);
        assertTrue(registerPage.passwordRequried_SK.getText().contains("One lowercase character"));

    }
    @And("kullanici SSN alanina kayitli bir ssn girer")  //TC18
    public void kullaniciSSNAlaninaKayitliBirSsnGirer() {
        registerPage.ssnKutusu_SK.sendKeys("321-32-9876");

    }
    @And("Daha once kayitli bir SSN ile kayit olunamadigini dogrular")
    public void dahaOnceKayitliBirSSNIleKayitOlunamadiginiDogrular() {
        assertTrue(registerPage.ssnAlreadyRegisterYazisi_SK.isDisplayed());
    }















    // Belirli bir karakter sayısına sahip rasgele bir şifre oluşturan bir yardımcı method
    public String rasgeleSifreOlustur(int karakterSayisi) {
        String karakterler = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sifre = new StringBuilder();

        for (int i = 0; i < karakterSayisi; i++) {
            int rastgeleIndex = random.nextInt(karakterler.length());
            char rastgeleKarakter = karakterler.charAt(rastgeleIndex);
            sifre.append(rastgeleKarakter);
        }
        return sifre.toString();
    }


    //FAKE phone number method
    public static String generateFakePhoneNumber() {
        Random random = new Random();

        int areaCode = 100 + random.nextInt(900); // 100 ile 999 arasında rastgele bir sayı
        int firstPart = 100 + random.nextInt(900); // 100 ile 999 arasında rastgele bir sayı
        int secondPart = 1000 + random.nextInt(9000); // 1000 ile 9999 arasında rastgele bir sayı

        DecimalFormat decimalFormat = new DecimalFormat("000");
        String formattedAreaCode = decimalFormat.format(areaCode);
        String formattedFirstPart = decimalFormat.format(firstPart);

        return formattedAreaCode + "-" + formattedFirstPart + "-" + secondPart;
    }

    //fake SSN number method
    public static String generateFakeSSN() {
        Random random = new Random();

        int firstPart = 100 + random.nextInt(900); // 100 ile 999 arasında rastgele bir sayı
        int secondPart = 10 + random.nextInt(90); // 10 ile 99 arasında rastgele bir sayı
        int thirdPart = 1000 + random.nextInt(9000); // 1000 ile 9999 arasında rastgele bir sayı

        DecimalFormat decimalFormat = new DecimalFormat("00");
        String formattedFirstPart = decimalFormat.format(firstPart);
        String formattedSecondPart = decimalFormat.format(secondPart);
        DecimalFormat fourthPartFormat = new DecimalFormat("0000");
        String formattedThirdPart = fourthPartFormat.format(thirdPart);

        return formattedFirstPart + "-" + formattedSecondPart + "-" + formattedThirdPart;
    }

    //Fake random birthday

    public static String generateRandomDate() {
        Random random = new Random();

        int day = 1 + random.nextInt(31); // 1 ile 31 arasında rastgele bir gün
        int month = 1 + random.nextInt(12); // 1 ile 12 arasında rastgele bir ay
        int year = 1900 + random.nextInt(123); // 1900 ile 2022 arasında rastgele bir yıl

        return day + "." + month + "." + year;
    }



}
