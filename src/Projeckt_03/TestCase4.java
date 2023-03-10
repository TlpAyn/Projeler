package Projeckt_03;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestCase4 extends BaseDriver {
//
//    Test Case: 4
//            ➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
//            ➢ E-book add to cart butonuna tıklatınız.
//            ➢ Pay using debit card a tıklatınız.
//            ➢ Email, confirm Email, name, telefon, company, Card number(“4242 4242 4242 4242” ) giriniz,
//    expdate, cvc kodu bilgilerini doldurunuz
//➢ Pay butonuna tıklayınız
//➢ “Your order is confirmed. Thank you!” mesajının görüldüğünü doğrulayınız

    @Test
    public void Test4(){

        driver.get("https://shopdemo.e-junkie.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement Ebook = driver.findElement(By.linkText("Ebook"));
        Ebook.click();

        WebElement Addtocart = driver.findElement(By.xpath("//button[@class='view_product']"));
        Addtocart.click();

        WebElement iframe= driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframe);

        MyFunc.Bekle(1);

        WebElement Debit = driver.findElement(By.xpath("//button[@class='Payment-Button CC']"));
        Debit.click();


          WebElement palceholder = driver.findElement(By.xpath("//input[@placeholder='Email']")) ;
          palceholder.sendKeys("ttt@ddd.com");

        WebElement confirm = driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")) ;
        confirm.sendKeys("ttt@ddd.com");

        WebElement name = driver.findElement(By.xpath("(//input[@placeholder='Name On Card'])[1]")) ;
        name.sendKeys("hamdiBank");

        WebElement phone = driver.findElement(By.xpath("(//input[@placeholder='Optional'])[1]")) ;
        phone.sendKeys("0123456");

        MyFunc.Bekle(1);
        WebElement company = driver.findElement(By.xpath(" //input[@autocomplete='company']")) ;
        company.sendKeys("Akfinans");
        MyFunc.Bekle(1);


        WebElement iframeChild= driver.findElement(By.name("__privateStripeFrame2236"));
        driver.switchTo().frame(iframeChild);


        WebElement KarnNo  = driver.findElement(By.xpath("//input[@placeholder='Kartennummer']")) ;
        KarnNo.sendKeys("4242 6464 7575 6464 6777");

        MyFunc.Bekle(1);
        WebElement date  = driver.findElement(By.xpath("//input[@placeholder='MM/JJ']")) ;
        date.sendKeys("1223");

        MyFunc.Bekle(1);

        WebElement CVC  = driver.findElement(By.xpath("//input[@placeholder='Prüfziffer']")) ;
        CVC.sendKeys("000");











    }

}
