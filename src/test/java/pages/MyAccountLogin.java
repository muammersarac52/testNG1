package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MyAccountLogin {
    public MyAccountLogin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='My Account']")
    public WebElement myAccount;
    @FindBy(id="username")
    public WebElement userName;
    @FindBy(id = "Password ")
    public WebElement loginPassword ;
    @FindBy(name = "login")
    public WebElement login;
    @FindBy(id="reg_email")
    public WebElement reg_email;

    @FindBy(id="reg_password")
    public WebElement registerPassword;

    @FindBy(name="register")
    public WebElement register;

    @FindBy(xpath="//*[text()='Sign out']")
    public WebElement singOutYazisi;

}
