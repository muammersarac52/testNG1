package test;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePageUs_03;
import pages.MyAccountLogin;
import utilities.ConfigReader;
import utilities.Driver;
@Test
public class TestB {

    Faker faker=new Faker();

    MyAccountLogin myAccountLogin= new MyAccountLogin();


    public void TestCaselogin() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        try {
            myAccountLogin.reg_email.sendKeys(ConfigReader.getProperty("reg_email"));
            myAccountLogin.registerPassword.sendKeys(ConfigReader.getProperty("registerPassword"));
            myAccountLogin.register.click();
            Assert.assertTrue(myAccountLogin.singOutYazisi.isDisplayed());
        } catch (Exception e) {

        }


//        try {
//            myAccountLogin.userName.sendKeys(ConfigReader.getProperty("userName"));
//            myAccountLogin.loginPassword.sendKeys(ConfigReader.getProperty("loginPassword"));
//            myAccountLogin.login.click();
//        } catch (Exception e) {
//
//        }

    }

}
