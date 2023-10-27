package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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
