package TestingProject_03;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase_05 extends BaseDriver {
    @Test
    public void Test5(){

        driver.get("https://shopdemo.e-junkie.com/");

        WebElement contacUs= driver.findElement(By.xpath("//a[@class='contact']"));
        contacUs.click();

        MyFunc.Bekle(1);
        WebElement name= driver.findElement(By.xpath("//input[@id='sender_name']"));
        name.sendKeys("seyma");
        MyFunc.Bekle(1);
        WebElement eMail = driver.findElement(By.xpath("//input[@id='sender_email']"));
        eMail.sendKeys("TechnoStudy@gmail.com");
        MyFunc.Bekle(1);
        WebElement subject = driver.findElement(By.xpath("//input[@id='sender_subject']"));
        subject.sendKeys("kitap");
        MyFunc.Bekle(1);
        WebElement mesaj = driver.findElement(By.xpath("//textarea[@id='sender_message']"));
        mesaj.sendKeys("mesaj");




        MyFunc.Bekle(3);



        WebElement SenMessage = driver.findElement(By.id("send_message_button"));
        SenMessage.click();

        MyFunc.Bekle(2);
        driver.switchTo().alert().accept();
    }
    }
