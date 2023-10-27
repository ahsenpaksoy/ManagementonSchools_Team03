package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='header_link ms-2']")
    public WebElement loginButonu;

    @FindBy (xpath = "//*[@id='username']")
    public WebElement loginUsernameBox;

    @FindBy (xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menu;





























    //Safiye(50-150)"Contact Us" kismi ile ilgili locateler

    @FindBy(xpath = "//a[text()='Contact']")
    public WebElement contactLinki_SK;

    @FindBy(css = "#name")
    public WebElement yournameKutusu_SK;
    @FindBy(css = "#email")
    public WebElement yourEmailKutusu_SK;

    @FindBy(css = "#subject")
    public WebElement subjectKutusu_SK;

    @FindBy(css = "#message")
    public WebElement messageKutusu_SK;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement yournameKutusuRequired_SK;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement youremailKutusuRequired_SK;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement subjectKutusuRequired_SK;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement messageKutusuRequired_SK;

    @FindBy(xpath = "//button[text()='Send Message']")
    public WebElement sendMessageButton_SK;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement contactMessageCreated_SK;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement pleaseEnterValidEmailYazisi_SK;


}
