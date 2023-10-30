package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherPage {
    public TeacherPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }








    //Sena 20-100
@FindBy (xpath = "(//a)[40]")
public WebElement teacherManagementSA;
@FindBy (xpath = "(//input)[1]")
public WebElement chooseLessonsSA;
@FindBy (xpath = "(//input)[2]")
public WebElement nameSA;
@FindBy (xpath = "(//input)[7]")
public WebElement isAdvisorTeacherSA;
@FindBy (xpath = "(//input)[8]")
public WebElement genderFemaleSA;
@FindBy (xpath = "(//button)[7]")
public WebElement submitSA;
@FindBy (xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-center']")
public WebElement onaySA;
@FindBy (xpath = "(//input)[11]")
public WebElement ssnSA;
@FindBy (xpath = "(//input)[13]")
public WebElement passwordSA;






























































//Emre 101-200
@FindBy(xpath = "(//*[@role='button'])[11]")
public WebElement meetManagementButtonEp;
@FindBy(xpath = "//*[@class=' css-19bb58m']")
public WebElement chooseStudentsDdmEp;
@FindBy(xpath = "//*[@id='date']")
public WebElement dateOfMeetBoxEp;
@FindBy(xpath = "//*[@id='startTime']")
public WebElement startTimeBoxEp;
@FindBy(xpath = "//*[@id='stopTime']")
public WebElement stopTimeBoxEp;
@FindBy(xpath = "(//*[@type='text'])[2]")
public WebElement descriptionBoxEp;
@FindBy(xpath = "//*[text()='Submit']")
public WebElement submitButtonEp;
//@FindBy(xpath = "(//*[text()='Meet Saved Successfully'])[1]")
//public WebElement meetSavedVerifyEp;
@FindBy(xpath = "(//div[@class='Toastify__toast-container Toastify__toast-container--top-center']")
public WebElement meetSavedVerify1Ep;
@FindBy(xpath = "(//div[text()='Meet Saved Successfully'])")
public WebElement meetSavedVerifyEp;
@FindBy(xpath = "//*[@class='Toastify__toast-body']")
public WebElement errorTimeEp;



















}
