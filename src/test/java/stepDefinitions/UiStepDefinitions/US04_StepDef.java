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

public class US04_StepDef {
    HomePage homePage =new HomePage();
    DeanPage deanPage =new DeanPage();
    Faker faker=new Faker();
    @Given("Kullanici Login butonuna basar")
    public void kullaniciLoginButonunaBasar() {
      homePage.loginButonu.click();
    }

    @Then("Username ve password kutularını doldurarak enter tuşuna basar")
    public void usernameVePasswordKutularınıDoldurarakEnterTuşunaBasar() {
        String username =ConfigReader.getProperty("adminNameEsi");
        String password = ConfigReader.getProperty("passwordEsi");
        homePage.loginUsernameBox.sendKeys(username, Keys.TAB,password,Keys.TAB,Keys.ENTER);
    }

    @Then("Açılan sayfadan menu tusuna basar")
    public void açılanSayfadanMenuTusunaBasar() {
        homePage.menu.click();
    }

    @Then("Dashboard kısmından Dean Management seçilir")
    public void dashboardKısmındanDeanManagementSeçilir() {
        deanPage.deanManagementEsi.click();
        ReusableMethods.bekle(1);

    }

    @Given("Kullanıcı Managementonschools adresine gider")
    public void kullanıcıManagementonschoolsAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));
        ReusableMethods.bekle(1);
    }


    @Given("Admin add Dean bolumundeki name kismina bir veri girer")
    public void adminAddDeanBolumundekiNameKisminaBirVeriGirer() {
        deanPage.deanNameEsi.sendKeys(faker.name().firstName(),Keys.ENTER);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki surname kismina bir verir girer")
    public void adminAddDeanBolumundekiSurnameKisminaBirVerirGirer() {
        deanPage.deanSurnameEsi.sendKeys(faker.name().lastName(),Keys.ENTER);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki birth place kismina bir verir girer")
    public void adminAddDeanBolumundekiBirthPlaceKisminaBirVerirGirer() {
        deanPage.deanBirthPlaceEsi.sendKeys(faker.address().city());
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki gender kisminda cinsiyeti belirler")
    public void adminAddDeanBolumundekiGenderKismindaCinsiyetiBelirler() {
        deanPage.deanGenderMaleEsi.click();
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki Date of Birth kismina bir verir girer")
    public void adminAddDeanBolumundekiDateOfBirthKisminaBirVerirGirer() {
        deanPage.deanBirthdayEsi.sendKeys(ConfigReader.getProperty("deanBirthDayEsi"));
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki phone kismina bir verir girer")
    public void adminAddDeanBolumundekiPhoneKisminaBirVerirGirer() {
        deanPage.deanPhoneNumberEsi.sendKeys(ConfigReader.getProperty("deanPhoneEsi"),Keys.ENTER);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki Ssn kismina bir verir girer")
    public void adminAddDeanBolumundekiSsnKisminaBirVerirGirer() {
        deanPage.deanSsnNumberEsi.sendKeys(ConfigReader.getProperty("deanSsnEsi"));
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki username kismina bir verir girer")
    public void adminAddDeanBolumundekiUsernameKisminaBirVerirGirer() {
        deanPage.deanUserNameEsi.sendKeys(faker.funnyName().name(),Keys.ENTER);
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki password kismina bir verir girer")
    public void adminAddDeanBolumundekiPasswordKisminaBirVerirGirer() {
        deanPage.deanPasswordEsi.sendKeys(ConfigReader.getProperty("passwordEsi"));
        ReusableMethods.bekle(1);
    }

    @Then("Admin add Dean bolumundeki submit butonuna tıklar")
    public void adminAddDeanBolumundekiSubmitButonunaTıklar() {
        deanPage.deanSubmitButonuEsi.click();

    }

    @Then("Dean eklenebildigini dogrula")
    public void deanEklenebildiginiDogrula() {

        Assert.assertTrue(deanPage.deanSavedEsi.getText().contains("Saved"));
    }

    @Then("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
