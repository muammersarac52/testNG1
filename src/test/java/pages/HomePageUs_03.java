package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePageUs_03 {
        public HomePageUs_03() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(name = "login")
        public WebElement signInButton;
        @FindBy(linkText = "Sign In")
        public WebElement signInust;
        @FindBy(id = "username")
        public WebElement signInusername;
        @FindBy(id = "password")
        public WebElement signInpassword;
        @FindBy(linkText = "Sign Out")
        public WebElement singoutYazisi;

        @FindBy(xpath = "//*[@class='icon-box-icon icon-addresses']")
        public WebElement myAccountAdress;


        @FindBy(xpath = "//*[@class='login logout inline-type']")
        public WebElement singoutButonu;
        @FindBy(xpath = ("(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]"))
        public WebElement billingadd;

        @FindBy(xpath = "//a[text()='Log out']")
        public WebElement silmeLogout;





        @FindBy(id = "billing_first_name")
        public WebElement billing_addFirstName;
        @FindBy(id = "billing_last_name")
        public WebElement billing_addLastName;

        @FindBy(name = "billing_company")
        public WebElement billing_companyName;




        @FindBy(xpath="//span[text()='Select a country / region…']")
        public WebElement billingDrobdown1;

        @FindBy(xpath="//span[@title='Albania']")
        public WebElement billingDrobdown11;


        @FindBy(xpath = "//*[@class='select2-search__field']")
        public WebElement billingDrobdown2;

        @FindBy(xpath = "//input[@class='select2-search__field']")
        public WebElement billingDrobdown22;

        @FindBy(id="select2-billing_state-container")
        public WebElement billingDrobdown3;
        @FindBy(xpath="//*[@title='Fier']")
        public WebElement billingDrobdown33;


        @FindBy(xpath = "(//*[@aria-owns='select2-billing_state-results'])[2]")
        public WebElement billingDrobdown4;
        @FindBy(xpath = "//*[@class='select2-search select2-search--dropdown']")
        public WebElement billingDrobdown44;




        @FindBy(id = "billing_address_1")
        public WebElement bilingAdresStreet;
        @FindBy(id = "billing_address_2")
        public WebElement bilingAdresApartman;
        @FindBy(id="billing_city")
        public WebElement bilingAdresTownCity;
        @FindBy(id = "billing_postcode")
        public WebElement bilingAdresZipCode;
        @FindBy(id = "billing_phone")
        public WebElement bilingAdresPhone;
        @FindBy(name = "save_address")
        public WebElement bilingAdresSave;

        @FindBy(id = "select2-billing_country-container")
        public WebElement billing_error;
        @FindBy(xpath = "//*[@class='woocommerce-notices-wrapper']")
        public WebElement billing_errortTown;
        @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
        public WebElement edit_your_billing;





        @FindBy(id ="shipping_first_name")
        public WebElement shippingg_addFirstName;
        @FindBy(id="shipping_last_name")
        public WebElement shippingg_addLastName;

        @FindBy(name="shipping_company")
        public WebElement shippingg_companyName;




        @FindBy(id="select2-shipping_country-container")
        public WebElement shippinggDrobdown1;
        @FindBy(xpath ="//*[@class='select2-search__field']")
        public WebElement shippinggDrobdown2;
        @FindBy(xpath ="//span[text()='Select an option…']")
        public WebElement shippinggDrobdown3;

        @FindBy(id="select2-shipping_state-container")
        public WebElement shippinggDrobdown33;

        @FindBy(xpath="//input[@class='select2-search__field']")
        public WebElement shippinggDrobdown4;


        @FindBy(id="shipping_address_1")
        public WebElement shippinggAdresStreet;
        @FindBy(xpath="//input[@placeholder='Apartment, suite, unit, etc. (optional)']")
        public WebElement shippinggAdresApartman;
        @FindBy(xpath = "//input[@autocomplete='address-level2']")
        public WebElement shippinggAdresTownCity;
        @FindBy(id="shipping_postcode")
        public WebElement shippinggAdresZipCode;

        @FindBy(name="save_address")
        public WebElement shippinggAdresSave;





        @FindBy(xpath = ("(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]"))
        public WebElement shippinggadd;

        @FindBy(xpath = "//*[@class='woocommerce-error']")
        public WebElement shippingg_error;

        @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
        public WebElement edit_your_shippingg;


    }


