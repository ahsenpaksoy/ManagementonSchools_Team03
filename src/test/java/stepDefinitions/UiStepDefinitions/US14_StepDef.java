package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US14_StepDef {
    HomePage homePage=new HomePage();
    TeacherPage teacherPage= new TeacherPage();


    @Given("kullanici Managementon Schools sayfasina giderSA")
    public void kullaniciManagementonSchoolsSayfasinaGiderSA() {
        Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));

    }

    @Then("kullanici anasayfadaki login butonuna tiklarSA")
    public void kullaniciAnasayfadakiLoginButonunaTiklarSA() {
        homePage.loginButonu.click();
    }

    @And("kullanici user name ve password ile login olurSA")
    public void kullaniciUserNameVePasswordIleLoginOlurSA() {
        homePage.loginUsernameBox.sendKeys(ConfigReader.getProperty("ViceDeanSifre"), Keys.TAB, ConfigReader.getProperty("ViceDeanPassword") , Keys.TAB, Keys.ENTER);
    }
    @And("kullanici Login oldugunu dogrularSA")
    public void kullaniciLoginOldugunuDogrularSA() {
        Assert.assertTrue(homePage.menu.isDisplayed());
    }


    @But("Menu butonuta tiklarSA")
    public void menuButonutaTiklarSA() {
        homePage.menu.click();
    }

    @And("Teacher Management sayfasina giderSA")
    public void teacherManagementSayfasinaGiderSA() {
        teacherPage.teacherManagementSA.click();
    }


    @Given("Sayfayi asagi kaydirarak Teacher List gorulur")
    public void sayfayiAsagiKaydirarakTeacherListGorulur() {
        ReusableMethods.scrollEnd();
    }

    @Then("Ogretmenin {string} bilgisi gorulur")
    public void ogretmeninBilgisiGorulur(String arg0) {
    }
}
