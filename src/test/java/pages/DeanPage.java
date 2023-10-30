package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DeanPage {
    public DeanPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }








    //Esra 20-150
    @FindBy (xpath = "(//*[@class='nav-link'])[7]")
    public WebElement deanManagementEsi;
    @FindBy (xpath = "//*[@id='name']")
    public WebElement deanNameEsi;
@FindBy (xpath = "//*[@id='surname']")
    public WebElement deanSurnameEsi;
@FindBy (xpath = "//*[@id='birthPlace']")
    public WebElement deanBirthPlaceEsi;
@FindBy (xpath = "(//*[@class='form-check-input'])[1]")
    public WebElement deanGenderFemale;
@FindBy (xpath = "(//*[@class='form-check-input'])[2]")
    public WebElement deanGenderMaleEsi;
@FindBy (id="birthDay")
    public WebElement deanBirthdayEsi;
@FindBy (id="phoneNumber")
    public WebElement deanPhoneNumberEsi;
@FindBy (id="ssn")
    public WebElement deanSsnNumberEsi;
@FindBy (id="username")
    public WebElement deanUserNameEsi;
@FindBy (id="password")
    public WebElement deanPasswordEsi;
@FindBy (xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement deanSubmitButonuEsi;
@FindBy (xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement deanSavedEsi;
@FindBy (xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement nameRequiredEsi;

@FindBy (xpath = "(//*[@class='invalid-feedback'])[2]")
    public WebElement surnameRequiredEsi;
@FindBy (xpath = "(//*[@class='invalid-feedback'])[3]")
    public WebElement birthplaceRequiredEsi;

@FindBy (xpath = "(//*[@class='invalid-feedback'])[4]")
    public WebElement dateofbirthRequiredEsi;

@FindBy (xpath = "(//*[@class='invalid-feedback'])[5]")
    public WebElement phoneRequiredEsi;
@FindBy (xpath = "(//*[@class='invalid-feedback'])[6]")
    public WebElement ssnRequiredEsi;

@FindBy (xpath = "(//*[@class='invalid-feedback'])[7]")
    public WebElement usernameRequiredEsi;
@FindBy (xpath = "(//*[@class='invalid-feedback'])[8]")
    public WebElement passwordEnterEsi;
@FindBy (xpath = "//tbody[@class='table-group-divider']//tr[last()]//td[1]")
    public WebElement tableSonNames;
@FindBy (xpath = "//tbody[@class='table-group-divider']//tr[last()]//td[2]")
    public WebElement tableSonGender;
@FindBy (xpath = "//tbody[@class='table-group-divider']//tr[last()]//td[3]")
    public WebElement tableSonPhone;
@FindBy (xpath = "//tbody[@class='table-group-divider']//tr[last()]//td[4]")
    public WebElement tableSonSsn;
@FindBy (xpath = "//tbody[@class='table-group-divider']//tr[last()]//td[5]")
    public WebElement tableSonUsernames;
@FindBy (xpath = "//tbody[@class='table-group-divider']//tr[last()]//td[6]")
    public WebElement tableSonEdit;
@FindBy (xpath = "(//*[@class='page-link'])[5]")
    public WebElement tableSonPage;
    @FindBy(xpath="(//*[@id='name'])[2]")
    public WebElement updateNameEsi;
 @FindBy(xpath="(//*[@name='gender'])[3]")
    public WebElement updateGenderEsi;
 @FindBy(xpath="(//*[@name='gender'])[4]")
    public WebElement updateGender2Esi;
 @FindBy(xpath="(//*[@id='password'])[2]")
    public WebElement updatePasswordEsi;
 @FindBy(xpath="(//*[@id='surname'])[2]")
    public WebElement updateSurnameEsi;

 @FindBy(xpath="(//*[@id='birthPlace'])[2]")
    public WebElement updateBirtplaceEsi;

 @FindBy(xpath="(//*[@id='birthDay'])[2]")
    public WebElement updateBirtDayEsi;

 @FindBy(xpath="(//*[@id='phoneNumber'])[2]")
    public WebElement updatePhoneEsi;

 @FindBy(xpath="(//*[@id='ssn'])[2]")
    public WebElement updateSsnEsi;

 @FindBy(xpath="(//*[@id='username'])[2]")
    public WebElement updateUsernameEsi;











































 // Kenan 151-300
 @FindBy (id="name")
    public WebElement deanNameKI;
@FindBy(xpath = "(//*[@name='gender'])[2]")
    public WebElement genderSecimKI;
@FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButonKI;
@FindBy (xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']")
    public WebElement viceDeanSavedKI;






























































}
