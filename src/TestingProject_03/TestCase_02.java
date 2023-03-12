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

public class TestCase_02 extends BaseDriver {
    @Test
    public void Test1() {


//➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
//➢ E-book add to cart butonuna tıklatınız.
//➢ Pay using debit card a tıklatınız.
//➢ Pay butonuna tıklatınız.
//➢ Invalid Email, Invalid Email, invalid billing name mesajlarının görüldüğünü doğrulayınız.


        driver.get("https://shopdemo.e-junkie.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement Ebook = driver.findElement(By.linkText("Ebook"));
        Ebook.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='view_product']")));

        WebElement Addtocart = driver.findElement(By.xpath("//button[@class='view_product']"));
        Addtocart.click();

        WebElement iframe= driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframe);


        MyFunc.Bekle(1);
        WebElement Debit = driver.findElement(By.xpath("//button[@class='Payment-Button CC']"));
        Debit.click();

        WebElement Pay = driver.findElement(By.xpath("//button[@class='Pay-Button']"));
        Pay.click();

        WebElement CikanYazi = driver.findElement(By.xpath("//span[text()='Invalid Email']"));
        System.out.println(CikanYazi.getText());

        MyFunc.Bekle(1);

        Assert.assertTrue(CikanYazi.getText().contains("Invalid Email"));
        Assert.assertTrue(CikanYazi.getText().contains("Invalid Email"));
        Assert.assertTrue(CikanYazi.getText().contains("Invalid Billing Name"));










    }
}
