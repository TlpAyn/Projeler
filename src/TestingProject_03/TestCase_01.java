package Projeckt_03;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestCase_01 extends BaseDriver {

    @Test
    public void Test1() {



// https://shopdemo.e-junkie.com/ sitesine gidiniz
//➢ E-book add to cart butonuna tıklatınız.
//➢ Add promo code butonuna tıklatıp veri giriniz.
//➢ Apply butonuna tıklayınız.
//➢ Invalid promo code yazısının görüldüğünü doğrulayınız



        driver.get("https://shopdemo.e-junkie.com/");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

        WebElement Ebook = driver.findElement(By.linkText("Ebook"));
        Ebook.click();
        WebElement Addtocart = driver.findElement(By.xpath("//button[@class='view_product']"));
        Addtocart.click();

        MyFunc.Bekle(1);

        driver.switchTo().frame(5);
        WebElement addPromoCode= driver.findElement(By.xpath("//button[text()='Add Promo Code']"));
        addPromoCode.click();

        WebElement Hole = driver.findElement(By.xpath(" //input[@class='Promo-Code-Value']"));
        Hole.sendKeys("12345");

        WebElement Apply = driver.findElement(By.xpath(" //button[@class='Promo-Apply']"));
        Apply.click();

        WebElement verificationMessage= driver.findElement(By.xpath("//span[text()='Invalid promo code']"));
MyFunc.Bekle(2);
       Assert.assertTrue(verificationMessage.getText().contains("Invalid"));

       BekleKapat();








    }
}
