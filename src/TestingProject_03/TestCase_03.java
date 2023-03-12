package TestingProject_03;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestCase_03 extends BaseDriver {

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


        WebElement iframeIKi= driver.findElement(By.xpath("//iframe[@title='Sicherer Eingaberahmen für Kartenzahlungen']"));
        driver.switchTo().frame(iframeIKi);

        MyFunc.Bekle(1);


        WebElement KartNumaraBoslugu  = driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input"));
        KartNumaraBoslugu.sendKeys("1111 1111 1111 1111");

        MyFunc.Bekle(1);

        driver.switchTo().parentFrame();

        WebElement UngultigYazisi  = driver.findElement(By.xpath("  //span[text()='Ihre Kartennummer ist ungültig.']"));



        Assert.assertEquals(UngultigYazisi.getText(),"Ihre Kartennummer ist ungültig.");


    }
}
