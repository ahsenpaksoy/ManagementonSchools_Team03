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
    WebElement loginButonu;

    @FindBy (xpath = "//*[@id='username']")
    WebElement loginUsernameBox;

    @FindBy (xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    WebElement menu;
}
