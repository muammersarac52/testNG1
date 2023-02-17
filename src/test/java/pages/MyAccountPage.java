package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyAccountPage {
    public MyAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "reg_email")
    public WebElement email;

    @FindBy(id = "reg_password")
    public WebElement password;

    @FindBy(xpath = "//*[@value='Register']")
    public WebElement registerButton;




}
