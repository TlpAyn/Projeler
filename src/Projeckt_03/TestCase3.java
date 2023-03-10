package Projeckt_03;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestCase3 extends BaseDriver {


//            Test Case:3
//            ➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
//            ➢ E-book add to cart butonuna tıklatınız.
//            ➢ Pay using debit card a tıklatınız.
//            ➢ Card numarasına “1111 1111 1111 1111” giriniz
//            ➢ “Your card number is invalid” mesajının görüldüğünü doğrulayınız.


    @Test
    public void Test1() {



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

MyFunc.Bekle(1);
        WebElement iframe2= driver.findElement(By.xpath("//iframe[@title='Sicherer Eingaberahmen für Kartenzahlungen']"));
        driver.switchTo().frame(iframe2);

        MyFunc.Bekle(1);


        WebElement KartNumaraBoslugu  = driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input"));
        KartNumaraBoslugu.sendKeys("1111 1111 1111 1111");


        //span[text()='Kart numaranız geçersiz.']

        //div[@class='CardNumberField-input-wrapper']//input

//        WebElement Pay = driver.findElement(By.xpath("//button[@class='Pay-Button']"));
//        Pay.click();
//}
}
}
