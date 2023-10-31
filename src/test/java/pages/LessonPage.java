package pages;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class LessonPage {
    public LessonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }










    //Saadet 20-100
















































































    //Yasemin 101-200



































































































  //Mustafa 201-300

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;

    @FindBy(id = "controlled-tab-example-tab-lessonsList")
    public WebElement lessonsButton;


    @FindBy(id="controlled-tab-example-tab-lessonProgram")
    public WebElement lessonProgramButton;
    @FindBy(xpath = "//*[@class=' css-19bb58m']")
    public WebElement dersAdi;
    @FindBy(id="educationTermId")
    public WebElement donem;
    @FindBy(id="day")
    public WebElement gun;
    @FindBy(id="startTime")
    public WebElement start;
    @FindBy(id="stopTime")
    public WebElement stop;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement vdProgramButton;


    @FindBy(xpath = "//*[@id='controlled-tab-example-tabpane-lessonProgram']/div[2]/div[2]/div/div/table/thead/tr")
    public List<WebElement> lessonProgramListHeader;

/*
    @And("kullanici sayfayi kaydirir")
    public void kullaniciSayfayiKaydirir() {
        ReusableMethods.scroll(viceDean.lessonProgramListTable);
        //  actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
    }

    @And("kullanici Lesson görebilmelidir.")
    public void kullaniciLessonDayGörebilmelidir() {
        System.out.println(viceDean.dersIsmiGorunur.getText());
        assertTrue(viceDean.dersIsmiGorunur.isDisplayed());
    }

    @And("kullanici Day görebilmelidir.")
    public void kullaniciDayGörebilmelidir() {
        System.out.println(viceDean.dayGorunur.getText());
        assertTrue(viceDean.dayGorunur.isDisplayed());
    }

    @And("kullanici Start Time görebilmelidir.")
    public void kullaniciStartTimeGörebilmelidir() {
        System.out.println(viceDean.startTimeGorunur.getText());
        assertTrue(viceDean.startTimeGorunur.isDisplayed());
    }

    @And("kullanici Stop Time görebilmelidir.")
    public void kullaniciStopTimeGörebilmelidir() {
        System.out.println(viceDean.stopTimeGorunur.getText());
        assertTrue(viceDean.stopTimeGorunur.isDisplayed());

 */



    @FindBy(xpath = "(//table)[3]//tr[2]//td[1]")
    public WebElement dersIsmiGorunur;
    @FindBy(xpath = "(//table)[3]//tr[2]//td[2]")
    public WebElement dayGorunur;
    @FindBy(xpath = "(//table)[3]//tr[2]//td[3]")
    public WebElement startTimeGorunur;
    @FindBy(xpath = "(//table)[3]//tr[2]//td[4]")
    public WebElement stopTimeGorunur;
    @FindBy(xpath = "(//table//*[@class='form-check-input'])[2]")
    public WebElement chooseLessonClickBox;


    }

