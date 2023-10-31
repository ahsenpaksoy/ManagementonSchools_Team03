package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.StudentPage;
import utilities.Driver;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertTrue;


public class US16_StepDef {
    StudentPage studentManagementPage = new StudentPage();

    @And("Contact Get All secenegini tiklar")
    public void contactGetAllSeceneginiTiklar() {
        StudentPage.studentContact.click();
    }

    @And("Name,Email,Date,Subject,Message bölümlerinin göründügünü dogrular.")
    public void nameEmailDateSubjectMessageBolumlerininGurundugunuDogrular() {

        List<WebElement> studentMessageBilgileri = StudentPage.studentMessageBilgileri;
        for (WebElement w:studentMessageBilgileri) {
            assertTrue(studentMessageBilgileri.get(0).isDisplayed());
        }

    }

    @And("Silme butonunun göründügünü dogrular")
    public void silmeButonununGorundugunuDogrular() {
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
}
