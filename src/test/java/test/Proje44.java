package test;


import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.HomePageUs_03;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class Proje44 {
    HomePageUs_03 homePage;
    Faker faker;
    Actions actions;
    JavascriptExecutor js;

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
        actions = new Actions(Driver.getDriver());
        // homePage.singoutButonu.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        homePage.myAccountAdress.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        homePage.shippinggadd.click();

        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        JSUtils.clickElementByJS(homePage.shippinggAdresSave);
        Thread.sleep(3000);

        Assert.assertTrue(homePage.shippingg_error.isDisplayed());

    }

    @Test(priority = 2)
    public void TestCase02() throws InterruptedException {
        TestCaselogin();
        homePage = new HomePageUs_03();
        faker = new Faker();
        actions = new Actions(Driver.getDriver());
        // homePage.singoutButonu.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        homePage.myAccountAdress.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        homePage.shippinggadd.click();
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        homePage.shippingg_addFirstName.sendKeys(faker.name().firstName());
        ReusableMethods.waitFor(2);
        homePage.shippingg_addLastName.sendKeys(faker.name().lastName());
        homePage.shippingg_companyName.sendKeys(faker.company().name());
        ReusableMethods.waitFor(2);
        homePage.shippinggDrobdown1.click();
        ReusableMethods.waitFor(2);
        homePage.shippinggDrobdown2.sendKeys("Albania", Keys.ENTER);
        ReusableMethods.waitFor(3);
        homePage.shippinggAdresStreet.sendKeys(faker.address().streetAddress());
        ReusableMethods.waitFor(3);
        homePage.shippinggAdresApartman.sendKeys(faker.address().streetName());
        ReusableMethods.waitFor(3);
        homePage.shippinggAdresTownCity.sendKeys(faker.address().cityName());
        // actions.sendKeys(Keys.TAB,"ates","44444444").perform();
        ReusableMethods.waitFor(5);
        homePage.shippinggDrobdown3.click();
        ReusableMethods.waitFor(10);
        homePage.shippinggDrobdown4.sendKeys("Fier", Keys.ENTER);
        ReusableMethods.waitFor(5);
        homePage.shippinggAdresZipCode.sendKeys(ConfigReader.getProperty("zipCode"));
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.TAB).perform();
        JSUtils.clickElementByJS(homePage.shippinggAdresSave);

        Assert.assertEquals(homePage.shippingg_error.getText(), "TownCity de sadece rakam olamaz");

    }

    @Test(priority = 3)
    public void TestCase03() throws InterruptedException {
        TestCaselogin();
        homePage = new HomePageUs_03();
        faker = new Faker();
        actions = new Actions(Driver.getDriver());
        // homePage.singoutButonu.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        homePage.myAccountAdress.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        homePage.shippinggadd.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        homePage.shippingg_addFirstName.clear();
        homePage.shippingg_addFirstName.sendKeys(faker.name().firstName());
        homePage.shippingg_addLastName.clear();
        homePage.shippingg_addLastName.sendKeys(faker.name().lastName());
        homePage.shippingg_companyName.clear();
        homePage.shippingg_companyName.sendKeys(faker.company().name());
        homePage.shippinggDrobdown1.click();
        ReusableMethods.waitFor(3);
        homePage.shippinggDrobdown2.sendKeys("Albania", Keys.ENTER);
        ReusableMethods.waitFor(5);
        homePage.shippinggAdresStreet.clear();
        homePage.shippinggAdresStreet.sendKeys(faker.address().streetAddress());
        homePage.shippinggAdresApartman.clear();
        homePage.shippinggAdresApartman.sendKeys(faker.address().streetName());
        homePage.shippinggAdresTownCity.clear();
        homePage.shippinggAdresTownCity.sendKeys(faker.address().cityName());
        ReusableMethods.waitFor(3);
        homePage.shippinggDrobdown33.click();
        ReusableMethods.waitFor(3);
        homePage.shippinggDrobdown4.sendKeys("Fier", Keys.ENTER);
        ReusableMethods.waitFor(5);
        homePage.shippinggAdresZipCode.clear();
        homePage.shippinggAdresZipCode.sendKeys(faker.address().zipCode());
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.TAB).perform();
        JSUtils.clickElementByJS(homePage.shippinggAdresSave);

        Assert.assertTrue(homePage.edit_your_shippingg.isDisplayed());


    }

    @AfterMethod
    public void tearDown() {
        // Driver.closeDriver();
    }
}






















