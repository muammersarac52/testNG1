package test;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PageKullanimi {
    @Test
    public void testName() {
        AmazonPage amazonPage = new AmazonPage();
        //amazona gidelim
        Driver.getDriver().get("amazonUrl");
        //iphone aratalım
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
        //sonuc yazısının iphone içerdiğini test edelim
        String actualSonuc = amazonPage.sonucYazisi.getText();
        String arananKelime = "iphone";
        assert actualSonuc.contains(arananKelime);
        Driver.closeDriver();
    }
}

