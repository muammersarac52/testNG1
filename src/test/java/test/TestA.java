package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyAccountPage;
import pages.ShopPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.io.IOException;

public class TestA {
    HomePage homePage;
    Actions actions;
    MyAccountPage myAccountPage;
    ShopPage shopPage;

    @Test
    public void AlertClick() {

        try {
            Driver.getDriver().get(ConfigReader.getProperty("automationtesting_url"));
            homePage.shopButon.click();
            ReusableMethods.waitFor(2);

            JSUtils.scrollIntoViewJS(homePage.alort1);
            JSUtils.clickElementByJS(homePage.alort1);

        } catch (Exception e) {

        }
        try {
            JSUtils.scrollIntoViewJS(homePage.alort2);
            JSUtils.clickElementByJS(homePage.alort2);

        } catch (Exception e) {
        }
    }

    @Test
    public void Test1() {
        homePage = new HomePage();
        //1) Tarayıcıyı açın
        //2) "http://practice.automationtesting.in/" URL'sini girin
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //3) Mağaza Menüsüne tıklayın
        homePage.shopButon.click();
        ReusableMethods.waitFor(10);
        //4) Şimdi Ana menü düğmesine tıklayın
        homePage.homeButon.click();
        ReusableMethods.waitFor(2);
        //5) Ana sayfada yalnızca Üç Kaydırıcı olup olmadığını test edin
        Assert.assertTrue(homePage.kayanResim1.isDisplayed());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim2.isEnabled());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim3.isEnabled());
        ReusableMethods.waitFor(2);
        homePage.sagTus.click();
        //ReusableMethods.waitFor(2);
        //6) Ana sayfa yalnızca üç kaydırıcı içermelidir
        Assert.assertEquals(homePage.tumNewArrivals.size(), 3);
//public class TestCase01 {
//    AutomationTestingInHomePage automationTestingInHomePage = new AutomationTestingInHomePage();
//​
//    @Test
//    public void test(){
//        //1) Open the browser
//        //2) Enter the URL “http://practice.automationtesting.in/”
//        Driver.getDriver().get(ConfigReader.getProperty("automation_testing_url"));
//        //3) Click on Shop Menu
//         automationTestingInHomePage.shopLink.click();
//         Driver.getDriver().navigate().refresh();
//        ReusableMethods.waitFor(1);
//        automationTestingInHomePage.shopLink.click();
//        //4) Now click on Home menu button
//        automationTestingInHomePage.homeLink.click();
//        //5) Test whether the Home page has Three Sliders only
//        List<WebElement> sliders =  automationTestingInHomePage.sliders;
//        for (WebElement w : sliders){
//            System.out.println(w.getText());
//            Assert.assertTrue(w.isDisplayed());
//        }
//        System.out.println(sliders.size());
//        //6) The Home page must contains only three sliders
//        Assert.assertEquals(sliders.size(),3);
//    }
//}
    }

    @Test
    public void Test2() {
        homePage = new HomePage();
        //1) Tarayıcıyı açın
        //2) "http://practice.automationtesting.in/" URL'sini girin
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //3) Mağaza Menüsüne tıklayın
        homePage.shopButon.click();
        ReusableMethods.waitFor(10);
        //4) Şimdi Ana menü düğmesine tıklayın
        homePage.homeButon.click();
        ReusableMethods.waitFor(2);

    }

    @Test
    public void Test4() throws IOException {
        actions = new Actions(Driver.getDriver());
        homePage = new HomePage();
        //1) Tarayıcıyı açın
        //2) "http://practice.automationtesting.in/" URL'sini girin
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //3) Mağaza Menüsüne tıklayın
        homePage.shopButon.click();
        ReusableMethods.waitFor(10);
        //4) Şimdi Ana menü düğmesine tıklayın
        homePage.homeButon.click();
        ReusableMethods.waitFor(2);
        //5) Ana sayfada yalnızca Üç Kaydırıcı olup olmadığını test edin
        Assert.assertTrue(homePage.kayanResim1.isDisplayed());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim2.isEnabled());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim3.isEnabled());
        ReusableMethods.waitFor(2);
        homePage.sagTus.click();
        //6) Ana sayfa yalnızca üç kaydırıcı içermelidir
        Assert.assertEquals(homePage.tumNewArrivals.size(), 3);
        //7) Şimdi Gelenler bölümündeki resme tıklayın
        homePage.sabitResim3.click();
        ReusableMethods.waitFor(2);
        //8) Kullanıcının o kitabı sepetine ekleyebileceği bir sonraki sayfaya gidip gitmediğini test edin.
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(homePage.sepeteEkle.isDisplayed());
        ReusableMethods.waitFor(3);


        //9) Resim tıklanabilir olmalı ve kullanıcının o kitabı sepetine ekleyebileceği bir sonraki sayfaya gitmelidir.
        // Assert.assertTrue(homePage.eklenenSiparis.isEnabled());
        JSUtils.scrollIntoViewJS(homePage.sepeteEkle);
        JSUtils.clickElementByJS(homePage.sepeteEkle);
        //10) Tıkladığınız kitap için Açıklama sekmesine tıklayın.
        //11) Kullanıcının tıkladığı kitapla ilgili bir açıklama olmalıdır.
        Assert.assertTrue(homePage.urunDescrıptıon.isDisplayed());
        //11) Kullanıcının tıkladığı kitapla ilgili bir İnceleme olmalı
        ReusableMethods.waitFor(3);
        homePage.reviewsButon.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.urunİncelemesi.isDisplayed());
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("Yeni sayfa");


    }

    @Test
    public void Test5() throws IOException {
        actions = new Actions(Driver.getDriver());
        homePage = new HomePage();
        //1) Tarayıcıyı açın
        //2) "http://practice.automationtesting.in/" URL'sini girin
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //3) Mağaza Menüsüne tıklayın
        homePage.shopButon.click();
        ReusableMethods.waitFor(10);
        //4) Şimdi Ana menü düğmesine tıklayın
        homePage.homeButon.click();
        ReusableMethods.waitFor(2);
        //5) Ana sayfada yalnızca Üç Kaydırıcı olup olmadığını test edin
        Assert.assertTrue(homePage.kayanResim1.isDisplayed());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim2.isEnabled());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim3.isEnabled());
        ReusableMethods.waitFor(2);
        homePage.sagTus.click();
        //6) Ana sayfa yalnızca üç kaydırıcı içermelidir
        Assert.assertEquals(homePage.tumNewArrivals.size(), 3);
        //7) Şimdi Gelenler bölümündeki resme tıklayın
        homePage.sabitResim3.click();
        ReusableMethods.waitFor(2);

        //8) Kullanıcının o kitabı sepetine ekleyebileceği bir sonraki sayfaya gidip gitmediğini test edin.

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(homePage.sepeteEkle.isDisplayed());
        ReusableMethods.getScreenshot("sepete eklendi");
        ReusableMethods.waitFor(3);


        //9) Resim tıklanabilir olmalı ve kullanıcının o kitabı sepetine ekleyebileceği bir sonraki sayfaya gitmelidir.
        // Assert.assertTrue(homePage.eklenenSiparis.isEnabled());
        JSUtils.scrollIntoViewJS(homePage.sepeteEkle);
        JSUtils.clickElementByJS(homePage.sepeteEkle);
        //10) Tıkladığınız kitap için Açıklama sekmesine tıklayın.
        //11) Kullanıcının tıkladığı kitapla ilgili bir açıklama olmalıdır.
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        homePage.reviewsButon.click();
        ReusableMethods.waitFor(2);
        homePage.star.click();
        ReusableMethods.waitFor(2);
        homePage.urundegerlendirmesi.sendKeys("urun guzel", Keys.TAB, "muammer", Keys.TAB, "sfihd@gmail.com", Keys.TAB,
                Keys.ENTER, Keys.TAB, Keys.ENTER);


    }

    @Test
    public void Test6() throws IOException {
        actions = new Actions(Driver.getDriver());
        homePage = new HomePage();
        //1) Tarayıcıyı açın
        //2) "http://practice.automationtesting.in/" URL'sini girin
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //3) Mağaza Menüsüne tıklayın
        homePage.shopButon.click();
        ReusableMethods.waitFor(6);
        //4) Şimdi Ana menü düğmesine tıklayın
        homePage.homeButon.click();
        ReusableMethods.waitFor(2);
        //5) Ana sayfada yalnızca Üç Kaydırıcı olup olmadığını test edin
        Assert.assertTrue(homePage.kayanResim1.isDisplayed());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim2.isEnabled());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim3.isEnabled());
        ReusableMethods.waitFor(2);
        homePage.sagTus.click();
        //6) Ana sayfa yalnızca üç kaydırıcı içermelidir
        Assert.assertEquals(homePage.tumNewArrivals.size(), 3);
        //7) Şimdi Gelenler bölümündeki resme tıklayın
        homePage.sabitResim3.click();
        ReusableMethods.getScreenshot("yeni sayfa");
        ReusableMethods.waitFor(2);
        //8) Kullanıcının o kitabı sepetine ekleyebileceği bir sonraki sayfaya gidip gitmediğini test edin.
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(homePage.sepeteEkle.isDisplayed());
        ReusableMethods.waitFor(3);
        JSUtils.scrollIntoViewJS(homePage.sepeteEkle);
        JSUtils.clickElementByJS(homePage.sepeteEkle);
        ReusableMethods.getScreenshot("sepete eklendi");
        assert homePage.urunFiyati.isDisplayed();


        //9) Resim tıklanabilir olmalı ve kullanıcının o kitabı sepetine ekleyebileceği bir sonraki sayfaya gitmelidir.
        // Assert.assertTrue(homePage.eklenenSiparis.isEnabled());


    }

    @Test
    public void Test7() throws IOException {
        actions = new Actions(Driver.getDriver());
        homePage = new HomePage();
        //1) Tarayıcıyı açın
        //2) "http://practice.automationtesting.in/" URL'sini girin
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //3) Mağaza Menüsüne tıklayın
        homePage.shopButon.click();
        ReusableMethods.waitFor(6);
        //4) Şimdi Ana menü düğmesine tıklayın
        homePage.homeButon.click();
        ReusableMethods.waitFor(2);
        //5) Ana sayfada yalnızca Üç Kaydırıcı olup olmadığını test edin
        Assert.assertTrue(homePage.kayanResim1.isDisplayed());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim2.isEnabled());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim3.isEnabled());
        ReusableMethods.waitFor(2);
        homePage.sagTus.click();
        //6) Ana sayfa yalnızca üç kaydırıcı içermelidir
        Assert.assertEquals(homePage.tumNewArrivals.size(), 3);


//        //7) Şimdi Gelenler bölümündeki resme tıklayın
//        homePage.sabitResim3.click();
//        ReusableMethods.getScreenshot("yeni sayfa");
//        ReusableMethods.waitFor(2);
//        //8) Kullanıcının o kitabı sepetine ekleyebileceği bir sonraki sayfaya gidip gitmediğini test edin.


        homePage.sabitResim3.click();
        ReusableMethods.getScreenshot("yeni sayfa");
        ReusableMethods.waitFor(2);
        homePage.kitapSayisi.sendKeys("4137");
        homePage.sepeteEkle.click();
        ReusableMethods.getScreenshot("mesaj");

    }

    @Test
    public void Test8() throws IOException {
        actions = new Actions(Driver.getDriver());
        homePage = new HomePage();
        //1) Tarayıcıyı açın
        //2) "http://practice.automationtesting.in/" URL'sini girin
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //3) Mağaza Menüsüne tıklayın
        homePage.shopButon.click();
        ReusableMethods.waitFor(6);
        //4) Şimdi Ana menü düğmesine tıklayın
        homePage.homeButon.click();
        ReusableMethods.waitFor(2);
        //5) Ana sayfada yalnızca Üç Kaydırıcı olup olmadığını test edin
        Assert.assertTrue(homePage.kayanResim1.isDisplayed());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim2.isEnabled());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim3.isEnabled());
        ReusableMethods.waitFor(2);
        homePage.sagTus.click();
        //6) Ana sayfa yalnızca üç kaydırıcı içermelidir
        Assert.assertEquals(homePage.tumNewArrivals.size(), 3);
        //7) Şimdi Gelenler bölümündeki resme tıklayın
        homePage.sabitResim3.click();
        ReusableMethods.getScreenshot("yeni sayfa");
        ReusableMethods.waitFor(2);
        //8) Kullanıcının o kitabı sepetine ekleyebileceği bir sonraki sayfaya gidip gitmediğini test edin.
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(homePage.sepeteEkle.isDisplayed());
        ReusableMethods.waitFor(3);
        JSUtils.scrollIntoViewJS(homePage.sepeteEkle);
        JSUtils.clickElementByJS(homePage.sepeteEkle);
        ReusableMethods.getScreenshot("sepete eklendi");
        assert homePage.urunFiyati.isDisplayed();
        homePage.sepetim.click();
        JSUtils.scrollIntoViewJS(homePage.checkout);
        assert homePage.checkout.isDisplayed();
        ReusableMethods.getScreenshot("checkout");
        homePage.kuponKodu.sendKeys("krishnasakinala");
        homePage.kuponOnay.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertEquals("indirim yapilamadi", "indirim olmasi");


    }

    @Test
    public void Test10() throws IOException {
        actions = new Actions(Driver.getDriver());
        homePage = new HomePage();
        //1) Tarayıcıyı açın
        //2) "http://practice.automationtesting.in/" URL'sini girin
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //3) Mağaza Menüsüne tıklayın
        homePage.shopButon.click();
        ReusableMethods.waitFor(6);
        //4) Şimdi Ana menü düğmesine tıklayın
        homePage.homeButon.click();
        ReusableMethods.waitFor(2);
        //5) Ana sayfada yalnızca Üç Kaydırıcı olup olmadığını test edin
        Assert.assertTrue(homePage.kayanResim1.isDisplayed());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim2.isEnabled());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim3.isEnabled());
        ReusableMethods.waitFor(2);
        homePage.sagTus.click();
        //6) Ana sayfa yalnızca üç kaydırıcı içermelidir
        Assert.assertEquals(homePage.tumNewArrivals.size(), 3);
        //7) Şimdi Gelenler bölümündeki resme tıklayın
        homePage.sabitResim3.click();
        ReusableMethods.getScreenshot("yeni sayfa");
        ReusableMethods.waitFor(2);
        //8) Kullanıcının o kitabı sepetine ekleyebileceği bir sonraki sayfaya gidip gitmediğini test edin.
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(homePage.sepeteEkle.isDisplayed());
        ReusableMethods.waitFor(3);
        JSUtils.scrollIntoViewJS(homePage.sepeteEkle);
        JSUtils.clickElementByJS(homePage.sepeteEkle);
        ReusableMethods.getScreenshot("sepete eklendi");
        assert homePage.urunFiyati.isDisplayed();
        homePage.sepetim.click();
        JSUtils.scrollIntoViewJS(homePage.checkout);
        assert homePage.checkout.isDisplayed();
        ReusableMethods.getScreenshot("checkout");
        homePage.kuponKodu.sendKeys("krishnasakinala");
        homePage.kuponOnay.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertEquals("Kupon 50 rps'> kitap fiyatı için geçerlidir.", "indirim olmasi");


    }

    @Test
    public void Test11() throws IOException {
        actions = new Actions(Driver.getDriver());
        homePage = new HomePage();
        //1) Tarayıcıyı açın
        //2) "http://practice.automationtesting.in/" URL'sini girin
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //3) Mağaza Menüsüne tıklayın
        homePage.shopButon.click();
        ReusableMethods.waitFor(6);
        //4) Şimdi Ana menü düğmesine tıklayın
        homePage.homeButon.click();
        ReusableMethods.waitFor(2);
        //5) Ana sayfada yalnızca Üç Kaydırıcı olup olmadığını test edin
        Assert.assertTrue(homePage.kayanResim1.isDisplayed());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim2.isEnabled());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim3.isEnabled());
        ReusableMethods.waitFor(2);
        homePage.sagTus.click();
        //6) Ana sayfa yalnızca üç kaydırıcı içermelidir
        Assert.assertEquals(homePage.tumNewArrivals.size(), 3);
        //7) Şimdi Gelenler bölümündeki resme tıklayın
        homePage.sabitResim3.click();
        ReusableMethods.getScreenshot("yeni sayfa");
        ReusableMethods.waitFor(2);
        //8) Kullanıcının o kitabı sepetine ekleyebileceği bir sonraki sayfaya gidip gitmediğini test edin.
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(homePage.sepeteEkle.isDisplayed());
        ReusableMethods.waitFor(3);
        JSUtils.scrollIntoViewJS(homePage.sepeteEkle);
        JSUtils.clickElementByJS(homePage.sepeteEkle);
        ReusableMethods.getScreenshot("sepete eklendi");
        assert homePage.urunFiyati.isDisplayed();
        homePage.sepetim.click();
        JSUtils.scrollIntoViewJS(homePage.urunCıkıs);
        JSUtils.clickElementByJS(homePage.urunCıkıs);
        assert homePage.urunIptal.isDisplayed();
        ReusableMethods.getScreenshot("urun iptal");


    }

    @Test(dependsOnMethods = "AlertClick")
    public void Test12() throws IOException {
        actions = new Actions(Driver.getDriver());
        homePage = new HomePage();


        //2) "http://practice.automationtesting.in/" URL'sini girin
//            Driver.getDriver().get(ConfigReader.getProperty("url"));
//
//            //3) Mağaza Menüsüne tıklayın
        homePage.shopButon.click();
        ReusableMethods.waitFor(6);
        //4) Şimdi Ana menü düğmesine tıklayın
        homePage.homeButon.click();
        ReusableMethods.waitFor(2);
        //5) Ana sayfada yalnızca Üç Kaydırıcı olup olmadığını test edin
        Assert.assertTrue(homePage.kayanResim1.isDisplayed());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim2.isEnabled());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim3.isEnabled());
        ReusableMethods.waitFor(2);
        homePage.sagTus.click();
        //6) Ana sayfa yalnızca üç kaydırıcı içermelidir
        Assert.assertEquals(homePage.tumNewArrivals.size(), 3);
        //6) Şimdi Gelenler'deki resme tıklayın
        homePage.sabitResim3.click();
        ReusableMethods.getScreenshot("yeni sayfa");
        ReusableMethods.waitFor(2);
        //7) Kullanıcının bu kitabı sepetine ekleyebileceği bir sonraki sayfaya geçip gitmediğini test edin.

        homePage.sepeteEkle.isDisplayed();

        //9) Bu kitabı sepetinize ekleyen Sepete Ekle düğmesine tıklayın
        homePage.sepeteEkle.click();

        //10) Kullanıcı bu Kitabı Menü öğesinde fiyatla görüntüleyebilir.
        ReusableMethods.verifyElementDisplayed(homePage.urunFiyati);
        //11) Şimdi kontrol sayfasına devam etmek için gezinen Öğe bağlantısına tıklayın.
        homePage.sepetiGöster.click();
        //12) Kitap eklemek veya çıkarmak için Ödeme sayfasında miktar altındaki metin kutusu değerine tıklayın.
        homePage.Quantity.click();
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_UP).perform();
        //13) Şimdi yukarıdaki değişiklikten sonra 'Sepeti Güncelle' düğmesi Tıklanabilir moda dönüşecek.
        homePage.sepetiGuncelle.isEnabled();
        //14) Şimdi bu değişiklikleri yansıtmak için Sepeti Güncelle'ye tıklayın
        homePage.sepetiGuncelle.click();
        // 15) Kullanıcı, ödeme sırasında Sepeti Güncelleme fizibilitesine sahiptir.
        homePage.sepetiGuncelle.isDisplayed();

    }

    @Test(dependsOnMethods = "AlertClick")
    public void Test13() throws IOException {
        actions = new Actions(Driver.getDriver());
        homePage = new HomePage();


        //2) "http://practice.automationtesting.in/" URL'sini girin
//            Driver.getDriver().get(ConfigReader.getProperty("url"));
//
//            //3) Mağaza Menüsüne tıklayın
        homePage.shopButon.click();
        ReusableMethods.waitFor(6);
        Driver.getDriver().navigate().refresh();

        //4) Şimdi Ana menü düğmesine tıklayın
        homePage.homeButon.click();
        ReusableMethods.waitFor(2);
        Driver.getDriver().navigate().refresh();

        //5) Ana sayfada yalnızca Üç Kaydırıcı olup olmadığını test edin
        Assert.assertTrue(homePage.kayanResim1.isDisplayed());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim2.isEnabled());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim3.isEnabled());
        ReusableMethods.waitFor(2);
        homePage.sagTus.click();
        //6) Ana sayfa yalnızca üç kaydırıcı içermelidir
        Assert.assertEquals(homePage.tumNewArrivals.size(), 3);
        //6) Şimdi Gelenler'deki resme tıklayın
        homePage.sabitResim3.click();
        ReusableMethods.getScreenshot("yeni sayfa");
        ReusableMethods.waitFor(2);
        //7) Kullanıcının bu kitabı sepetine ekleyebileceği bir sonraki sayfaya geçip gitmediğini test edin.

        homePage.sepeteEkle.isDisplayed();

        //9) Bu kitabı sepetinize ekleyen Sepete Ekle düğmesine tıklayın
        homePage.sepeteEkle.click();

        //10) Kullanıcı bu Kitabı Menü öğesinde fiyatla görüntüleyebilir.
        ReusableMethods.verifyElementDisplayed(homePage.urunFiyati);
        //11) Şimdi kontrol sayfasına devam etmek için gezinen Öğe bağlantısına tıklayın.
        homePage.sepetiGöster.click();
//        12) Artık Kullanıcı kitabın Toplam fiyatını Check-out ızgarasında bulabilir.
        homePage.checkout.isEnabled();
//        13) Kullanıcı, çıkış sırasında kitapların toplam fiyatını bulmak için kitapların toplam fiyatını bulma fizibilitesine sahiptir.
        homePage.checkout.isDisplayed();

    }

    @Test(dependsOnMethods = "AlertClick")
    public void Test14() throws IOException {
        actions = new Actions(Driver.getDriver());
        homePage = new HomePage();
        Driver.getDriver().navigate().refresh();


        //2) "http://practice.automationtesting.in/" URL'sini girin
//            Driver.getDriver().get(ConfigReader.getProperty("url"));
//
//            //3) Mağaza Menüsüne tıklayın
        homePage.shopButon.click();
        ReusableMethods.waitFor(6);
        Driver.getDriver().navigate().refresh();
        //4) Şimdi Ana menü düğmesine tıklayın
        homePage.homeButon.click();
        ReusableMethods.waitFor(2);
        //5) Ana sayfada yalnızca Üç Kaydırıcı olup olmadığını test edin
        Assert.assertTrue(homePage.kayanResim1.isDisplayed());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim2.isEnabled());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim3.isEnabled());
        ReusableMethods.waitFor(2);
        homePage.sagTus.click();
        //6) Ana sayfa yalnızca üç kaydırıcı içermelidir
        Assert.assertEquals(homePage.tumNewArrivals.size(), 3);
        //6) Şimdi Gelenler'deki resme tıklayın
        homePage.sabitResim3.click();
        ReusableMethods.getScreenshot("yeni sayfa");
        ReusableMethods.waitFor(2);
        //7) Kullanıcının bu kitabı sepetine ekleyebileceği bir sonraki sayfaya geçip gitmediğini test edin.

        homePage.sepeteEkle.isDisplayed();

        //9) Bu kitabı sepetinize ekleyen Sepete Ekle düğmesine tıklayın
        homePage.sepeteEkle.click();

        //10) Kullanıcı bu Kitabı Menü öğesinde fiyatla görüntüleyebilir.
        ReusableMethods.verifyElementDisplayed(homePage.urunFiyati);
        //11) Şimdi kontrol sayfasına devam etmek için gezinen Öğe bağlantısına tıklayın.
        homePage.sepetiGöster.click();
        //12) Kitap eklemek veya çıkarmak için Ödeme sayfasında miktar altındaki metin kutusu değerine tıklayın.
        homePage.Quantity.click();
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_UP).perform();
        //13) Şimdi yukarıdaki değişiklikten sonra 'Sepeti Güncelle' düğmesi Tıklanabilir moda dönüşecek.
        homePage.sepetiGuncelle.isEnabled();
        //14) Şimdi bu değişiklikleri yansıtmak için Sepeti Güncelle'ye tıklayın
        homePage.sepetiGuncelle.click();
        // 15) Kullanıcı, ödeme sırasında Sepeti Güncelleme fizibilitesine sahiptir.
        homePage.sepetiGuncelle.isDisplayed();
    }

    @Test(dependsOnMethods = "AlertClick")
    public void Test15() throws IOException {
        actions = new Actions(Driver.getDriver());
        homePage = new HomePage();
        Driver.getDriver().navigate().refresh();


        //2) "http://practice.automationtesting.in/" URL'sini girin
//            Driver.getDriver().get(ConfigReader.getProperty("url"));
//
//            //3) Mağaza Menüsüne tıklayın
        homePage.shopButon.click();


        Driver.getDriver().navigate().refresh();

        //4) Şimdi Ana menü düğmesine tıklayın
        homePage.homeButon.click();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(2);

        //5) Ana sayfada yalnızca Üç Kaydırıcı olup olmadığını test edin
        Assert.assertTrue(homePage.kayanResim1.isDisplayed());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim2.isEnabled());
        homePage.sagTus.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.kayanResim3.isEnabled());
        ReusableMethods.waitFor(2);
        homePage.sagTus.click();
        //6) Ana sayfa yalnızca üç kaydırıcı içermelidir
        Assert.assertEquals(homePage.tumNewArrivals.size(), 3);
        //6) Şimdi Gelenler'deki resme tıklayın
        homePage.sabitResim3.click();
        ReusableMethods.getScreenshot("yeni sayfa");
        ReusableMethods.waitFor(2);
        //7) Kullanıcının bu kitabı sepetine ekleyebileceği bir sonraki sayfaya geçip gitmediğini test edin.

        homePage.sepeteEkle.isDisplayed();

        //9) Bu kitabı sepetinize ekleyen Sepete Ekle düğmesine tıklayın
        homePage.sepeteEkle.click();

        //10) Kullanıcı bu Kitabı Menü öğesinde fiyatla görüntüleyebilir.
        ReusableMethods.verifyElementDisplayed(homePage.urunFiyati);
        //11) Şimdi kontrol sayfasına devam etmek için gezinen Öğe bağlantısına tıklayın.
        homePage.sepetiGöster.click();
        //12) Artık kullanıcı toplam ve alt toplam değerlerini Ödeme Sayfasına Devam Et düğmesinin hemen üstünde bulabilir.
        homePage.total.isDisplayed();
        homePage.subtotal.isDisplayed();
        //13) Vergiler alt < için toplam her zaman alt toplamdır
        String totaldeger = homePage.totalDeger.getText();
        totaldeger = totaldeger.replaceAll("\\D", "");
        int totaldegerson = Integer.parseInt(totaldeger);

        String subtotalDeger = homePage.subtotalDeger.getText();
        subtotalDeger = subtotalDeger.replaceAll("\\D", "");
        int subtotalDegerson = Integer.parseInt(subtotalDeger);

        String taxDeger = homePage.taxDeger.getText();
        taxDeger = taxDeger.replaceAll("\\D", "");
        int taxDegerson = Integer.parseInt(taxDeger);
        Assert.assertTrue(totaldegerson == taxDegerson + subtotalDegerson);
        //14) Toplam
        System.out.println("total = " + homePage.total);
    }
}



















