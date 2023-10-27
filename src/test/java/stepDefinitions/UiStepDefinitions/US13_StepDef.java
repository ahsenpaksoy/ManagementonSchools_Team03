package stepDefinitions.UiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.print.attribute.standard.RequestingUserName;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class US13_StepDef {
    TeacherPage teacherPage = new TeacherPage();
    Faker faker = new Faker();
    public String name = faker.name().firstName();
    public String surname = faker.name().lastName();
    public String phoneNumber = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);
    public String ssn = faker.number().numberBetween(100, 999) + "-77-" + faker.number().numberBetween(1000, 9999);
    String birthPlace = faker.address().city();
    String email = faker.internet().emailAddress();
    String userName = name + surname;
    String password = faker.internet().password(8, 13, true, false, true);
    Date dof = faker.date().birthday(25, 80);

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
        teacherPage.nameSA.sendKeys(name, Keys.TAB,
                surname, Keys.TAB,
                birthPlace, Keys.TAB,
                email, Keys.TAB,
                phoneNumber, Keys.TAB,
                Keys.TAB, Keys.TAB, Keys.TAB,
                dateOfBirth, Keys.TAB, Keys.TAB,
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
        System.out.println(teacherPage.onaySA.getText());
        Assert.assertTrue(teacherPage.onaySA.isDisplayed());
        ReusableMethods.bekle(3);
    }

    @And("sayfayi kapatirSA")
    public void sayfayiKapatirSA() {
        ReusableMethods.bekle(1);
        Driver.closeDriver();
        ReusableMethods.bekle(1);
    }

    @Then("Name bos birakilir ,Surname ,Birth Place ,E-mail ,Phone Number ,Date of Birth ,SSN ,User Name,Password girilirSA")
    public void nameBosBirakilirSurnameBirthPlaceEMailPhoneNumberDateOfBirthSSNUserNamePasswordGirilirSA() {
        teacherPage.nameSA.sendKeys(
                Keys.TAB,
                surname, Keys.TAB,
                birthPlace, Keys.TAB,
                email, Keys.TAB,
                phoneNumber, Keys.TAB,
                Keys.TAB, Keys.TAB, Keys.TAB,
                dateOfBirth, Keys.TAB, Keys.TAB,
                ssn, Keys.TAB,
                userName, Keys.TAB,
                password);
    }


    @Then("Surname bos birakilir , Name,Birth Place,E-mail,Phone Number,Date of Birth,SSN,User Name,Password girilirSA")
    public void surnameBosBirakilirNameBirthPlaceEMailPhoneNumberDateOfBirthSSNUserNamePasswordGirilirSA() {
        teacherPage.nameSA.sendKeys(
                name, Keys.TAB,
                Keys.TAB,
                birthPlace, Keys.TAB,
                email, Keys.TAB,
                phoneNumber, Keys.TAB,
                Keys.TAB, Keys.TAB, Keys.TAB,
                dateOfBirth, Keys.TAB, Keys.TAB,
                ssn, Keys.TAB,
                userName, Keys.TAB,
                password);
    }

    @Then("Birth Place bos birakilir , Name,Surname,E-mail,Phone Number,Date of Birth,SSN,User Name,Password girilirSA")
    public void birthPlaceBosBirakilirNameSurnameEMailPhoneNumberDateOfBirthSSNUserNamePasswordGirilirSA() {
        teacherPage.nameSA.sendKeys(
                name, Keys.TAB,
                surname, Keys.TAB,
                Keys.TAB,
                email, Keys.TAB,
                phoneNumber, Keys.TAB,
                Keys.TAB, Keys.TAB, Keys.TAB,
                dateOfBirth, Keys.TAB, Keys.TAB,
                ssn, Keys.TAB,
                userName, Keys.TAB,
                password);
    }

    @Then("E-mail bos birakilir , Name,Surname,Birth Place,Phone Number,Date of Birth,SSN,User Name,Password girilirSA")
    public void eMailBosBirakilirNameSurnameBirthPlacePhoneNumberDateOfBirthSSNUserNamePasswordGirilirSA() {
        teacherPage.nameSA.sendKeys(
                name, Keys.TAB,
                surname, Keys.TAB,
                birthPlace, Keys.TAB,
                Keys.TAB,
                phoneNumber, Keys.TAB,
                Keys.TAB, Keys.TAB, Keys.TAB,
                dateOfBirth, Keys.TAB, Keys.TAB,
                ssn, Keys.TAB,
                userName, Keys.TAB,
                password);
    }


    @Then("Phone Number bos birakilir , Name,Surname,Birth Place,E-mail,Date of Birth,SSN,User Name,Password girilirSA")
    public void phoneNumberBosBirakilirNameSurnameBirthPlaceEMailDateOfBirthSSNUserNamePasswordGirilirSA() {
        teacherPage.nameSA.sendKeys(
                name, Keys.TAB,
                surname, Keys.TAB,
                birthPlace, Keys.TAB,
                email, Keys.TAB,
                Keys.TAB,
                Keys.TAB, Keys.TAB, Keys.TAB,
                dateOfBirth, Keys.TAB, Keys.TAB,
                ssn, Keys.TAB,
                userName, Keys.TAB,
                password);
    }

    @Then("Date of Birth bos birakilir, Name,Surname,Birth Place,E-mail,Phone Number,SSN,User Name,Password girilirSA")
    public void dateOfBirthBosBirakilirNameSurnameBirthPlaceEMailPhoneNumberSSNUserNamePasswordGirilirSA() {
        teacherPage.nameSA.sendKeys(
                name, Keys.TAB,
                surname, Keys.TAB,
                birthPlace, Keys.TAB,
                email, Keys.TAB,
                phoneNumber, Keys.TAB,
                Keys.TAB, Keys.TAB, Keys.TAB,
                Keys.TAB, Keys.TAB,
                ssn, Keys.TAB,
                userName, Keys.TAB,
                password);
    }

    @Then("SSN bos birakilir, Name,Surname,Birth Place,E-mail,Phone Number,Date of Birth,User Name,Password girilirSA")
    public void ssnBosBirakilirNameSurnameBirthPlaceEMailPhoneNumberDateOfBirthUserNamePasswordGirilirSA() {
        teacherPage.nameSA.sendKeys(
                name, Keys.TAB,
                surname, Keys.TAB,
                birthPlace, Keys.TAB,
                email, Keys.TAB,
                phoneNumber, Keys.TAB,
                Keys.TAB, Keys.TAB, Keys.TAB,
                dateOfBirth, Keys.TAB, Keys.TAB,
                Keys.TAB,
                userName, Keys.TAB,
                password);
    }

    @Then("User Name bos birakilir, Name,Surname,Birth Place,E-mail,Phone Number,Date of Birth,SSN,Password girilirSA")
    public void userNameBosBirakilirNameSurnameBirthPlaceEMailPhoneNumberDateOfBirthSSNPasswordGirilirSA() {
        teacherPage.nameSA.sendKeys(
                name, Keys.TAB,
                surname, Keys.TAB,
                birthPlace, Keys.TAB,
                email, Keys.TAB,
                phoneNumber, Keys.TAB,
                Keys.TAB, Keys.TAB, Keys.TAB,
                dateOfBirth, Keys.TAB, Keys.TAB,
                ssn, Keys.TAB,
                Keys.TAB,
                password);
    }

    @Then("Password bos birakilir, Name,Surname,Birth Place,E-mail,Phone Number,Date of Birth,SSN,User Name girilirSA")
    public void passwordBosBirakilirNameSurnameBirthPlaceEMailPhoneNumberDateOfBirthSSNUserNameGirilirSA() {
        teacherPage.nameSA.sendKeys(
                name, Keys.TAB,
                surname, Keys.TAB,
                birthPlace, Keys.TAB,
                email, Keys.TAB,
                phoneNumber, Keys.TAB,
                Keys.TAB, Keys.TAB, Keys.TAB,
                dateOfBirth, Keys.TAB, Keys.TAB,
                ssn, Keys.TAB,
                userName, Keys.TAB
        );
    }


    @And("{string} yazisi gorulerek Teacher olusmadigi dogrulanirSA")
    public void yazisiGorulerekTeacherOlusmadigiDogrulanirSA(String invalidMessage) {
        Assert.assertTrue(ReusableMethods.invalidSA(invalidMessage));
    }


    @And("3. ve 5. rakamdan sonra '-' içermeyen bir SSN girilir")
    public void veRakamdanSonraIçermeyenBirSSNGirilir() {
        teacherPage.ssnSA.sendKeys(ssn.replace("-",""));

    }


    @And("{int} rakamdan olusan bir SSN girilir")
    public void rakamdanOlusanBirSSNGirilir(int num) {
        if (num>9){
        teacherPage.ssnSA.sendKeys(ssn,"2");}
        else if (num<9) {
        teacherPage.ssnSA.sendKeys(ssn.replace(ssn.subSequence(0,1),""));
        }

    }

    @And("7 karakterden olusan bir password girilir")
    public void karakterdenOlusanBirPasswordGirilir() {
        teacherPage.passwordSA.sendKeys("Aa12345");
    }

    @And("{string} icermeyen bir password girilir")
    public void icermeyenBirPasswordGirilir(String kosul) {
        switch (kosul){
            case "Buyuk harf":
                teacherPage.passwordSA.sendKeys(faker.internet().password(8,13,false,false,true));
                break;
            case "Kucuk harf":
                teacherPage.passwordSA.sendKeys(faker.internet().password(8,13,true,false,true).toLowerCase());
                break;
            case "Rakam":
                teacherPage.passwordSA.sendKeys(faker.internet().password(8,13,true,false,false));
                break;
        }
    }

    @And("Teacher olusmadigi dogrulanirSA")
    public void teacherOlusmadigiDogrulanirSA() {
        Assert.assertTrue(teacherPage.onaySA.isDisplayed());
    }
}



