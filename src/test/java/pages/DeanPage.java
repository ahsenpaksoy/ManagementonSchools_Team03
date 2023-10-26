package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeanPage {
    public DeanPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }










    //Esra 20-100
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






































































































































































}
