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

public class TestCase1 extends BaseDriver {

    @Test
    public  void Test1(){

//
// https://shopdemo.e-junkie.com/ sitesine gidiniz
//➢ E-book add to cart butonuna tıklatınız.
//➢ Add promo code butonuna tıklatıp veri giriniz.
//➢ Apply butonuna tıklayınız.
//➢ Invalid promo code yazısının görüldüğünü doğrulayınız

driver.get("https://shopdemo.e-junkie.com/");

WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

        WebElement Ebook = driver.findElement(By.linkText("Ebook"));
        Ebook.click();

        WebElement Addtocart = driver.findElement(By.xpath("//button[@class='view_product']"));
        Addtocart.click();

        //input[@type='tel']
MyFunc.Bekle(1);

        driver.switchTo().frame(5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add Promo Code']")));


        WebElement Quantity = driver.findElement(By.xpath("//button[text()='Add Promo Code']"));
        Quantity.click();

        WebElement Hole = driver.findElement(By.xpath(" //input[@class='Promo-Code-Value']"));
        Hole.sendKeys("12345");

        WebElement Apply = driver.findElement(By.xpath(" //button[@class='Promo-Apply']"));
        Apply.click();

        WebElement verificationMessage= driver.findElement(By.xpath("//span[text()='Invalid promo code']"));


        Assert.assertTrue(verificationMessage.isDisplayed());







//input[@class='Promo-Code-Value']
        //input[@class='Promo-Code-Value']





     WebElement   AddPromoCode = driver.findElement(By.xpath("//button[@class='Apply-Button Show-Promo-Code-Button']")); //button[@class='Apply-Button Show-Promo-Code-Button']





    }
}
