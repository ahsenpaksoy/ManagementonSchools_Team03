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
@FindBy ( xpath = "/html/body/div/div/main/div/div[2]/div/div/div[1]/div[2]")
public WebElement onaySA;


































































    //Emre 101-200























}
