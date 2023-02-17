package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShopPage {
    public ShopPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[.='Home']")
    public WebElement home;

    @FindBy(xpath = "//*[@class='woocommerce-LoopProduct-link']")
    public WebElement kitaplar;

}
