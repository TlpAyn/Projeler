package TestingProject_03;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestCase_04 extends BaseDriver {

    @Test
    public void Test4() {

        driver.get("https://shopdemo.e-junkie.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement Ebook = driver.findElement(By.linkText("Ebook"));
        Ebook.click();

        WebElement Addtocart = driver.findElement(By.xpath("//button[@class='view_product']"));
        Addtocart.click();

        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframe);

        MyFunc.Bekle(1);

        WebElement Debit = driver.findElement(By.xpath("//button[@class='Payment-Button CC']"));
        Debit.click();


        WebElement palceholder = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        palceholder.sendKeys("ttt@ddd.com");

        WebElement confirm = driver.findElement(By.xpath("//input[@placeholder='Confirm Email']"));
        confirm.sendKeys("ttt@ddd.com");

        WebElement name = driver.findElement(By.xpath("(//input[@placeholder='Name On Card'])[1]"));
        name.sendKeys("hamdiBank");

        WebElement phone = driver.findElement(By.xpath("(//input[@placeholder='Optional'])[1]"));
        phone.sendKeys("0123456");

        MyFunc.Bekle(1);
        WebElement company = driver.findElement(By.xpath(" //input[@autocomplete='company']"));
        company.sendKeys("Akfinans");
        MyFunc.Bekle(1);

        WebElement iframeIKi= driver.findElement(By.xpath("//iframe[@title='Sicherer Eingaberahmen für Kartenzahlungen']"));
        driver.switchTo().frame(iframeIKi);

        WebElement CardBox = driver.findElement(By.xpath("//input[@placeholder='Kartennummer']"));
        CardBox.sendKeys("4242 4242 4242 4242");

        WebElement Date = driver.findElement(By.xpath("//input[@placeholder='MM/JJ']"));
        Date.sendKeys("1223");

        WebElement PrüfBox = driver.findElement(By.xpath("//input[@placeholder='Prüfziffer']"));
        PrüfBox.sendKeys("000");

        driver.switchTo().parentFrame();

MyFunc.Bekle(1);
        WebElement DruckButton = driver.findElement(By.xpath("//button[@class='Pay-Button']"));
        MyFunc.Bekle(1);
        DruckButton.click();

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='your order is confirmed. Thank you!']")));

        MyFunc.Bekle(15);

        WebElement LastText = driver.findElement(By.xpath("//span[@class='green_text_margin']"));

        Assert.assertTrue(LastText.getText().contains("your order is confirmed."));



        //span[text()=' your order is confirmed. Thank you!']











//
//        WebElement iframeChild = driver.findElement(By.name("__privateStripeFrame2236"));
//        driver.switchTo().frame(iframeChild);
//
//        //button[@class='Pay-Button']   pay butonu
//
//        WebElement KarnNo = driver.findElement(By.xpath("//input[@placeholder='Kartennummer']"));
//        KarnNo.sendKeys("4242 6464 7575 6464 6777");
//
//        MyFunc.Bekle(1);
//        WebElement date = driver.findElement(By.xpath("//input[@placeholder='MM/JJ']"));
//        date.sendKeys("1223");
//
//        MyFunc.Bekle(1);
//
//        WebElement CVC = driver.findElement(By.xpath("//input[@placeholder='Prüfziffer']"));
//        CVC.sendKeys("000");
//

    }
}
