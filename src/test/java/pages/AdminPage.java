package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {
    public AdminPage() {PageFactory.initElements(Driver.getDriver(), this);
    }










    //Ibrahim 20-100















































































    //Kenan 101-200
    @FindBy(xpath = "(//*[@class='fw-bold p-3 card-header'])[1]")
    public WebElement adminBasligi;

    @FindBy(xpath = "//*[@aria-controls='offcanvasNavbar-expand-false']")
    public WebElement adminMenuButonKI;

    @FindBy(xpath = "(//*[@role='button'])[12]")
    public WebElement viceDeanSelectKI;

  @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement viceDeanSavedKI;





}


































