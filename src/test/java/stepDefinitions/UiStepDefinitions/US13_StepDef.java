package stepDefinitions.UiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import javax.print.attribute.standard.RequestingUserName;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class US13_StepDef {
    TeacherPage teacherPage=new TeacherPage();
    Faker faker=new Faker();
    public String name= faker.name().firstName();
    public String surname= faker.name().lastName();
    public String phoneNumber= faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(1000,9999);
    public String ssn= faker.number().numberBetween(100,999)+"-77-"+faker.number().numberBetween(1000,9999);
    String birthPlace= faker.address().city();
    String email= faker.internet().emailAddress();
    String userName= name+surname;
    String password= faker.internet().password(8,13,true,false,true);
    Date dof= faker.date().birthday(25,80);

    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    String dateOfBirth = format.format(dof);



    @Given("Choose Lessons kismindan ders {string} secilirSA")
    public void chooseLessonsKismindanDersSecilirSA(String ders) {
        teacherPage.chooseLessonsSA.sendKeys(ders, Keys.ENTER);
    }


    @And("is Advisor Teacher secenegi secilirSA")
    public void isAdvisorTeacherSecenegiSecilirSA() {
        teacherPage.isAdvisorTeacherSA.click();

    }

    @Then("Cinsiyet secilirSA")
    public void cinsiyetSecilirSA() {
        teacherPage.genderFemaleSA.click();
    }

    @Then("Name ,Surname ,Birth Place ,E-mail ,Phone Number ,Date of Birth ,SSN ,User Name,Password girilirSA")
    public void nameSurnameBirthPlaceEMailPhoneNumberDateOfBirthSSNUserNamePasswordGirilirSA() {
        System.out.println(dateOfBirth);
        System.out.println(phoneNumber);
        System.out.println(ssn);
        teacherPage.nameSA.sendKeys(name, Keys.TAB,
                surname, Keys.TAB,
                birthPlace, Keys.TAB,
                email, Keys.TAB,
                phoneNumber, Keys.TAB,
                Keys.TAB,Keys.TAB,Keys.TAB,
                dateOfBirth, Keys.TAB,Keys.TAB,
                ssn, Keys.TAB,
                userName, Keys.TAB,
                password);
    }

    @And("Submit butonuna tiklanirSA")
    public void submitButonunaTiklanirSA() {
        teacherPage.submitSA.click();
    }

    @And("Teacher olustugu dogrulanirSA")
    public void teacherOlustuguDogrulanirSA() {
        Assert.assertEquals("Teacher saved successfully",teacherPage.onaySA.getText());
        System.out.println(teacherPage.onaySA.getText());
        ReusableMethods.bekle(3);
    }


    @And("{int} saniye bekle")
    public void saniyeBekle(int saniye) {
        ReusableMethods.bekle(4);
        ReusableMethods.scrollEnd();
    }
}
