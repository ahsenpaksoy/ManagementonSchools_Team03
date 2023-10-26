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
















































































    //Yasemin 101-200
    @FindBy(xpath = "//*[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement lessonProgramY;
    @FindBy(xpath = "//*[@class=' css-19bb58m']")
    public WebElement selectLessonY;
    @FindBy(xpath = "//*[@id='educationTermId']")
    public WebElement educationTermY;
    @FindBy(xpath = "[id='day']")
    public WebElement chooseDayY;
    @FindBy(xpath = "[id='startTime']")
    public WebElement startTimeY;
    @FindBy(xpath = "[id='stopTime']")
    public WebElement stopTimeY;
    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[1]")
    public WebElement buttonSubmitY;
    @FindBy(xpath = "//*[@id='teacherId']")
    public WebElement teacherY;
    @FindBy(css = "(//div)[134]")
    public WebElement createdLessonProgY;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement alertEduTermY;
    @FindBy(xpath = "(//div)[136]")
    public WebElement lessonNotEmptyY;
    @FindBy(xpath = "//*[@id='87']")
    public WebElement alertDayY;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement errorTimeY;





































































































  //Mustafa 201-300








}
