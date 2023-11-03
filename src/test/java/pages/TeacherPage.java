package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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



































































































// Ibrahim 201-300
    @FindBy(xpath = "//*[@*='header_link ms-2']")
    public WebElement loginLinki_IO;
    @FindBy(css = "#username")
    public WebElement userNameKutusu_IO;
    @FindBy(css = "#password")
    public WebElement passwordKutusu_IO;
    @FindBy(xpath = "//button[.='Login']")
    public WebElement logonButonu_IO;
    @FindBy(xpath = "//h3[.='Student Info Management']")
    public WebElement studentInfoManagementYazisi_IO;
    @FindBy(css = "#lessonId")
    public WebElement chooseLessonDDM_IO;
    @FindBy(css = "#studentId")
    public WebElement chooseStudentDDM_IO;
    @FindBy(css = "#educationTermId")
    public WebElement chooseEducationTermDDM_IO;
    @FindBy(css = "#absentee")
    public WebElement absenteeKutusu_IO;
    @FindBy(css = "#midtermExam")
    public WebElement midtermExamKutusu_IO;
    @FindBy(css = "#finalExam")
    public WebElement finalExamKutusu_IO;
    @FindBy(css = "#infoNote")
    public WebElement infoNoteKutusu_IO;
    @FindBy(xpath = "(//*[.='Submit'])[3]")
    public WebElement submitButonu_IO;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement absenteeRequiredUyari_IO;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement midtermRequiredUyari_IO;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement finalRequiredUyari_IO;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement infoNoteRequiredUyari_IO;

    @FindBy(xpath = "(//*[.=\"'100.0' değerinden küçük yada eşit olmalı\"])[5]")
    public WebElement yuzdenKucukVeEsitUyariYazisi_IO;

    @FindBy(xpath = "(//*[.=\"'0.0' değerinden büyük yada eşit olmalı\"])[5]")
    public WebElement sifirdanBuyukVeEsitUyariYazisi_IO;

    @FindBy(xpath = "(//*[.='Student Info saved Successfully'])[5]")
    public WebElement studentInfoSavedSuccessfullyYazisi_IO;

    @FindBy(xpath = "(//*[.='Student Info deleted Successfully'])[5]")
    public WebElement studentInfoDeletedSuccessfullyYazisi_IO;

    @FindBy(xpath = "(//tbody//td)[9]")
    public WebElement editButonu_IO;

    @FindBy(xpath = "(//*[@id='absentee'])[2]")
    public WebElement absenteeKutusuUpdate_IO;

    @FindBy(xpath = "(//*[@id='midtermExam'])[2]")
    public WebElement midtermExamKutusuUpdate_IO;

    @FindBy(xpath = "(//*[@id='finalExam'])[2]")
    public WebElement finalExamKutusuUpdate_IO;

    @FindBy(xpath = "(//*[@id='infoNote'])[2]")
    public WebElement infoNoteKutusuUpdate_IO;

    @FindBy(xpath = "(//table//td)[9]")
    public WebElement editButonuInfoList_IO;

    @FindBy(xpath = "//i[@class='fa-solid fa-trash']")
    public WebElement deleteButonuInfoList_IO;

    @FindBy(xpath = "(//div[@role='alert']/*[.='Error: Student Info with lesson name JavaScript already register'])[1]")
    public WebElement dersZatenAtanmis_IO;

    @FindBy(xpath = "//tbody//td[10]")
    public List<WebElement> studentInfoDeleteButtonsList_IO;

    @FindBy(xpath = "(//div[@class='Toastify__toast-body'])[1]")
    public WebElement studentInfoUpdatedSuccesfullyYazisi_IO;

    @FindBy(xpath = "(//*[.='Submit'])[5]")
    public WebElement submitButonuUpdate_IO;






























































































}
