package test;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageUs_03;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class Proje33 {
    HomePageUs_03 homePage;

    Faker faker;
    Actions actions;

    @BeforeMethod
    public void TestCaselogin() {
        Driver.getDriver().get(ConfigReader.getProperty("spending_good_url"));
        homePage = new HomePageUs_03();
        try {
            homePage.signInust.click();
            homePage.signInusername.sendKeys(ConfigReader.getProperty("kullanici_username"));
            homePage.signInpassword.sendKeys(ConfigReader.getProperty("kullanici_password"));
            homePage.signInButton.click();
            Assert.assertTrue(homePage.singoutYazisi.isDisplayed());
        } catch (Exception e) {

        }
        try {
            homePage.singoutButonu.click();
        } catch (Exception e) {
        }
    }


    @Test(priority = 1)
    public void TestCase01() throws InterruptedException {
        TestCaselogin();
        homePage = new HomePageUs_03();
        faker = new Faker();
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        homePage.myAccountAdress.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        homePage.billingadd.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        homePage.billing_addFirstName.clear();
        homePage.billing_addLastName.clear();
        homePage.billing_companyName.clear();

        ReusableMethods.waitFor(5);
        ReusableMethods.billing1();
        ReusableMethods.waitFor(5);
        homePage.bilingAdresStreet.clear();

        homePage.bilingAdresApartman.clear();

        homePage.bilingAdresTownCity.clear();

        ReusableMethods.billing2();
        homePage.bilingAdresZipCode.clear();

        homePage.bilingAdresPhone.clear();

        ReusableMethods.waitFor(3);
        JSUtils.clickElementByJS(homePage.bilingAdresSave);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        Assert.assertTrue(homePage.billing_error.isDisplayed());
    }

    @Test(priority = 2)
    public void TestCase02() throws InterruptedException {
        TestCaselogin();
        homePage = new HomePageUs_03();
        faker = new Faker();
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        homePage.myAccountAdress.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        homePage.billingadd.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        homePage.billing_addFirstName.clear();
        homePage.billing_addFirstName.sendKeys(faker.name().firstName());
        homePage.billing_addLastName.clear();
        homePage.billing_addLastName.sendKeys(faker.name().lastName());
        homePage.billing_companyName.clear();
        homePage.billing_companyName.sendKeys(faker.company().name());
        ReusableMethods.waitFor(5);
        ReusableMethods.billing1();
        ReusableMethods.waitFor(5);
        homePage.bilingAdresStreet.clear();
        homePage.bilingAdresStreet.sendKeys(faker.address().streetAddress());
        homePage.bilingAdresApartman.clear();
        homePage.bilingAdresApartman.sendKeys(faker.address().streetName());
        homePage.bilingAdresTownCity.clear();
        homePage.bilingAdresTownCity.sendKeys(faker.address().streetName());
       ReusableMethods.billing2();
        homePage.bilingAdresZipCode.clear();
        homePage.bilingAdresZipCode.sendKeys(faker.address().zipCode());
        homePage.bilingAdresPhone.clear();
        homePage.bilingAdresPhone.sendKeys("kkkkkkl4lo;", Keys.ENTER);
        ReusableMethods.waitFor(3);
        JSUtils.clickElementByJS(homePage.bilingAdresSave);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        Assert.assertTrue(homePage.billing_error.isDisplayed());

    }

    @Test(priority = 3)
    public void TestCase03() throws InterruptedException {
        TestCaselogin();
        homePage = new HomePageUs_03();
        faker = new Faker();
        actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        homePage.myAccountAdress.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        homePage.billingadd.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        homePage.billing_addFirstName.clear();
        homePage.billing_addFirstName.sendKeys(faker.name().firstName());
        homePage.billing_addLastName.clear();
        homePage.billing_addLastName.sendKeys(faker.name().lastName());
        homePage.billing_companyName.clear();
        homePage.billing_companyName.sendKeys(faker.company().name());
        ReusableMethods.waitFor(5);
        ReusableMethods.billing1();
        ReusableMethods.waitFor(5);
        homePage.bilingAdresStreet.clear();
        homePage.bilingAdresStreet.sendKeys(faker.address().streetAddress());
        homePage.bilingAdresApartman.clear();
        homePage.bilingAdresApartman.sendKeys(faker.address().streetName());
        homePage.bilingAdresTownCity.clear();
        homePage.bilingAdresTownCity.sendKeys("44444444444444");
        ReusableMethods.billing2();
        homePage.bilingAdresZipCode.clear();
        homePage.bilingAdresZipCode.sendKeys(faker.address().zipCode());
        homePage.bilingAdresPhone.clear();
        homePage.bilingAdresPhone.sendKeys("1254578787");
        ReusableMethods.waitFor(3);
        JSUtils.clickElementByJS(homePage.bilingAdresSave);
        Thread.sleep(3000);
        Assert.assertEquals(homePage.billing_errortTown.getText(), "TownCity de sadece rakam olamaz");

    }

    @Test(priority = 4)
    public void testcase04() throws InterruptedException {
        TestCaselogin();
        homePage = new HomePageUs_03();
        faker = new Faker();
        actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        homePage.myAccountAdress.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        homePage.billingadd.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        homePage.billing_addFirstName.clear();
        homePage.billing_addFirstName.sendKeys(faker.name().firstName());
        homePage.billing_addLastName.clear();
        homePage.billing_addLastName.sendKeys(faker.name().lastName());
        homePage.billing_companyName.clear();
        homePage.billing_companyName.sendKeys(faker.company().name());
        ReusableMethods.waitFor(20);
        ReusableMethods.billing1();
        ReusableMethods.waitFor(5);
        homePage.bilingAdresStreet.clear();
        homePage.bilingAdresStreet.sendKeys(faker.address().streetAddress());
        homePage.bilingAdresApartman.clear();
        homePage.bilingAdresApartman.sendKeys(faker.address().streetName());
        homePage.bilingAdresTownCity.clear();
        homePage.bilingAdresTownCity.sendKeys(faker.address().streetName());
        ReusableMethods.waitFor(3);
        ReusableMethods.billing2();
        homePage.bilingAdresZipCode.clear();
        homePage.bilingAdresZipCode.sendKeys(faker.address().zipCode());
        homePage.bilingAdresPhone.clear();
        homePage.bilingAdresPhone.sendKeys("1254578787");
        ReusableMethods.waitFor(3);
        JSUtils.clickElementByJS(homePage.bilingAdresSave);
        Thread.sleep(5000);
        actions.sendKeys(Keys.PAGE_DOWN);
        Assert.assertTrue(homePage.edit_your_billing.isDisplayed());


    }


    public void tearDown() {
        // Driver.closeDriver();
    }
}


