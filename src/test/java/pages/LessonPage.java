package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.swing.plaf.PanelUI;
import java.util.List;

public class LessonPage {
    public LessonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }










    //Saadet 20-100
    public @FindBy(xpath = "(//*[@class='nav-link'])[8]")
    WebElement LessonManagementButonuSo;

    public @FindBy(xpath = "//*[@id='controlled-tab-example-tab-lessonsList']")
    WebElement LessonButonuSo;
    public @FindBy(xpath = "//*[@id='lessonName']")
    WebElement LessonNameKutusuSo;
    public @FindBy(xpath = "//*[@type='checkbox']")
    WebElement CompulsoryKutusuSo;
    public @FindBy(xpath = "//*[@id='creditScore']")
    WebElement CreditScoreKutusuSo;
    public @FindBy(xpath = "(//button[@type='button'])[9]")
    WebElement SubmitButonuSo;
    public @FindBy(xpath = "(//*[@aria-hidden='true'])[8]")
    WebElement dersListesiIlerlemeButonuSo;
    @FindBy(xpath = "//th[text()=‘Lesson Name’]")
    public List<WebElement> tumLessonNames;

    @FindBy(xpath = "(//tbody[@class='table-group-divider'])[2]/tr/td[2]")
    public List<WebElement> tumCompulsoriealanlari;

    @FindBy(xpath = "(//tbody[@class='table-group-divider'])[2]/tr/td[3]")
    public List<WebElement> tumCreditScorealanlari;
    @FindBy(xpath = "(//table)[2]")
    public WebElement lessonList;
    @FindBy(xpath = "(//*[@class='fa-solid fa-trash'])[10]")
    public WebElement lessonDelete;

     @FindBy(xpath = " (//tbody[@class='table-group-divider'])[2]//tr[last()]")
    public WebElement eklenenSonDers;



















































































    //Yasemin 101-200
    @FindBy(xpath = "(//*[@class='nav-link'])[8]")
    public WebElement lessonManagementY;
    @FindBy(xpath = "//*[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement lessonProgramY;
    @FindBy(xpath = "//*[@class=' css-19bb58m']")
    public WebElement selectLessonY;
    @FindBy(xpath = "//*[@id='educationTermId']")
    public WebElement educationTermY;
    @FindBy(xpath = "//*[@id='day']")
    public WebElement chooseDayY;
    @FindBy(xpath = "//*[@id='startTime']")
    public WebElement startTimeY;
    @FindBy(xpath = "//*[@id='stopTime']")
    public WebElement stopTimeY;
    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[3]")
    public WebElement buttonSubmitY;
    @FindBy(xpath = "//*[@id='teacherId']")
    public WebElement teacherY;
    @FindBy(css = "div[class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement createdLessonProgY;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement alertEduTermY;
    @FindBy(xpath = "(//div)[136]")
    public WebElement lessonNotEmptyY;
    @FindBy(xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement alertDayY;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement errorTimeY;





































































































  //Mustafa 201-300








}
