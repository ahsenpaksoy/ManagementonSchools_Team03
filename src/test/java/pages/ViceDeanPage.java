package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanPage {
    public ViceDeanPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }










    //Kenan 20-100




















































































//Mustafa

    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement lessonProgram;
    @FindBy(id = "react-select-2-input")
    public WebElement chooseLessonsInLessonProgramasViceDean;
    @FindBy(xpath = "//select[@class='mt-5 form-select']")
    public WebElement chooseEducationTermInLessonProgramasViceDean;
    @FindBy(xpath = "(//option[@class='fw-semibold m-2'])[2]")
    public WebElement chooseSPRING_SEMESTERInEducationTermInLessonProgramasViceDean;

    @FindBy(xpath = "//select[@class='mb-3 form-select']")
    public WebElement chooseDayInLessonProgramasViceDean;
    @FindBy(xpath = "//*[text()='MONDAY']")
    public WebElement chooseMondayInLessonProgramasViceDean;
    @FindBy(xpath = "//*[@id='startTime']")
    public WebElement chooseStartTimeInLessonProgramasViceDean;
    @FindBy(xpath = "//*[@id='stopTime']")
    public WebElement chooseStopTimeInLessonProgramasViceDean;
    @FindBy(xpath = "(//*[text()='Submit'])[3]") //(//*[@class='fw-semibold btn btn-primary btn-lg'])[4]
    public WebElement submitButtonAddLessonProgram;


    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover'])[3]")
    public WebElement lessonProgramList;

    @FindBy(css = "#controlled-tab-example-tabpane-lessonProgram > div:nth-child(2) > div:nth-child(2) > div > div > table > tbody")
    public WebElement tableInLessonProgram;
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[2]/div[2]/div/div/table/thead/tr/th[1]")
    public WebElement lessonText;
    @FindBy(xpath = "//*[@class=' css-9jq23d']")
    public WebElement sendedLesson;
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[2]/div[2]/div/div/table/thead/tr/th[2]")
    public WebElement dayText;
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[2]/div[2]/div/div/table/thead/tr/th[3]")
    public WebElement startTimeText;
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[2]/div[2]/div/div/table/thead/tr/th[4]")
    public WebElement stopTimeText;
    @FindBy(xpath = "(//tbody[@class='table-group-divider'])[3]")
    public WebElement lessonProgramListTable;
    @FindBy(xpath = "(//*[@id='lessonProgramId'])[1]")
    public WebElement selectALessonInLessonProgramAssign;


}
