package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.swing.plaf.PanelUI;

public class LessonPage {
    public LessonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }










    //Saadet 20-100
    public @FindBy(xpath = "(//*[@class='nav-link'])[9]")
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

    /*@FindBy(xpath = "(//div)[95]")
    public WebElement submitButonY;*/
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
    @FindBy(xpath = " //*[@class=' css-9jq23d']")
    public WebElement topologyDisplayY;
    @FindBy(xpath = "//*[@class='table-responsive']")
    public WebElement lessonDisplayY;
    @FindBy(xpath = "(//div)[182]")
    public WebElement lastLineY;
    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']")
    public WebElement addedTeacherY;
    @FindBy(xpath = "(//*[@class='col'])[15]")
    public WebElement chooseTeacherY;
    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click']")
    public WebElement timeUyariY;
    @FindBy(xpath = "(//*[@class='form-check-input'])[48]")
    public WebElement chooseButtonY;
    @FindBy(xpath = "(//*[@class='form-check-input'])[150]")
    public WebElement lastChooseLessonButtonY;
    @FindBy(xpath = "//*[@class=' mb-3 mt-4 col']")
    public WebElement submitButtonSonY;



































































































  //Mustafa 201-300








}
