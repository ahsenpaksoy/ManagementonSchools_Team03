package stepDefinitions.UiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.TeacherPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US20_StepDef {

    HomePage homePage=new HomePage();
    TeacherPage teacherPage= new TeacherPage();
    Actions actions = new Actions(Driver.getDriver());

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("kullanici sayfada meet list bolumune gider")
    public void kullaniciSayfadaMeetListBolumuneGider() {
        js.executeScript("arguments[0].scrollIntoView();" , teacherPage.meetListVerifyEp);
        assertTrue(teacherPage.meetListVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("kullanici students bilgisinin gorundugunu dogrular")
    public void kullaniciStudentsBilgisininGorundugunuDogrular() {
        assertTrue(teacherPage.stundentsBilgisiVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("kullanici date bilgisinin gorundugunu dogrular")
    public void kullaniciDateBilgisininGorundugunuDogrular() {
        assertTrue(teacherPage.dateBilgisiVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("kullanici start time bilgisinin gorundugunu dogrular")
    public void kullaniciStartTimeBilgisininGorundugunuDogrular() {
        assertTrue(teacherPage.startTimeBilgisiVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("kullanici stop time bilgisinin gorundugunu dogrular")
    public void kullaniciStopTimeBilgisininGorundugunuDogrular() {
        assertTrue(teacherPage.stopTimeBilgisiVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("kullanici description bilgisinin gorundugunu dogrular")
    public void kullaniciDescriptionBilgisininGorundugunuDogrular() {
        assertTrue(teacherPage.descriptionBilgisiVerifyEp.isDisplayed());
        ReusableMethods.bekle(2);
    }
}
