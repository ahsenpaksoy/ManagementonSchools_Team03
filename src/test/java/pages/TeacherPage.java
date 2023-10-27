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























}
