package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="menu-item-40")
    public WebElement shopLink;

    @FindBy(xpath = "//*[@class='woocommerce-LoopProduct-link']")
    public List<WebElement> tumNewArrivals;


    @FindBy(xpath = "//*[@id='menu-item-40']")
    public WebElement shopButon;
    //@FindBy(xpath = "//*[.='Shop']") public WebElement shopButon;
    @FindBy(xpath = "//*[.='Home']")
    public WebElement homeButon;

    @FindBy(xpath = "(//*[@class='n2-ow'])[2]")
    public WebElement sagTus;

    @FindBy(xpath = "//*[@data-id='36']")
    public WebElement kayanResim1;

    @FindBy(xpath = "//*[@data-id='34']")
    public WebElement kayanResim2;

    @FindBy(xpath = "//*[@data-id='35']")
    public WebElement kayanResim3;

    @FindBy(xpath = "(//*[@class='woocommerce-LoopProduct-link'])[3]")
    public WebElement sabitResim3;

    @FindBy(xpath = "//*[@class='cartcontents']")
    public WebElement urunSepeti;

    @FindBy(xpath = "//*[@title='Mastering JavaScript']")
    public WebElement gelenUcuncuResim;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sepeteEkle;
    @FindBy(xpath = "//*[@class='button wc-forward']")
    public WebElement sepetiGöster;
    @FindBy(xpath = "//*[@class='attachment-shop_single size-shop_single wp-post-image']")
    public WebElement eklenenSiparis;
    @FindBy(xpath = "//div[@style='cursor: pointer;']")
    public WebElement alort1;
    @FindBy(id="dismiss-button")
    public WebElement alort2;


    @FindBy(xpath = "//*[.='Reviews (0)']")
    public WebElement reviewsButon;
    @FindBy(xpath = "//*[.='Description']")
    public WebElement descrıptıonButon;
    @FindBy(xpath = "//*[@id='tab-description']")
    public WebElement urunDescrıptıon;



    @FindBy(xpath = "//*[@id=comment")
    public WebElement urundegerlendirmesi;

    @FindBy(xpath = "//*[@class='star-3']")
    public WebElement star;

    @FindBy(xpath = "//*[@id=author")
    public WebElement isim;
    @FindBy(xpath = "//*[@id=email")
    public WebElement email;
    @FindBy(xpath = "//*[@id=wp-comment-cookies-consent")
    public WebElement tikla;
    @FindBy(xpath = "//*[@id=submit")
    public WebElement submit;
    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[1]")
    public WebElement urunFiyati;

    @FindBy(id="dismiss-button")
    public WebElement ilkReklam;

    @FindBy(id="dismiss-button")
    public WebElement ikinciReklam;

    @FindBy(xpath="//input[@type='number']")
    public WebElement Quantity;

    @FindBy(xpath="//input[@name='update_cart']")
    public WebElement sepetiGuncelle;

    @FindBy(xpath="//a[@class='checkout-button button alt wc-forward']")
    public WebElement checkout;
    @FindBy(xpath="//tr[@class='cart-subtotal']")
    public WebElement subtotal;
    @FindBy(linkText="(//span[text()='350.00'])[3]")
    public WebElement subtotalDeger;
    @FindBy(xpath="//tr[@class='order-total']")
    public WebElement total;
    @FindBy(linkText="//span[text()='357.00']")
    public WebElement totalDeger;
    @FindBy(linkText="//span[text()='7.00']")
    public WebElement taxDeger;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement kitapSayisi;

    @FindBy(xpath = "//*[@id='reply-title']")
    public WebElement urunİncelemesi;

    @FindBy(xpath = "//*[@class='cartcontents']")
    public WebElement sepetim;


    @FindBy(xpath = "//*[@data-product_id='165']")
    public WebElement urunIptal;
    @FindBy(xpath = "(//*[@style='vertical-align: inherit;'])[21]")
    public WebElement urunkaldirildi;



    @FindBy(xpath = "//div[@class='wc-proceed-to-checkout']")
    public WebElement urunCıkıs;


    @FindBy(xpath = "//*[@data-product_id='165']")
    public WebElement kitapEkle;

    @FindBy(xpath = "//*[@id='coupon_code']")
    public WebElement kuponKodu;
    @FindBy(xpath = "(//*[@class='button'])[1]")
    public WebElement kuponOnay;
    @FindBy(xpath = "//*[@class='woocommerce-message']")
    public WebElement kuponBasarıMesajı;
    @FindBy(xpath = "//*[@data-title='Coupon: krishnasakinala']")
    public WebElement kuponİndirimi;

}


