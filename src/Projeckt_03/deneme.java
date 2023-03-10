//package Projeckt_03;
//
//import static Utility.BaseDriver.driver;
//
//public class deneme {
//    public void test3(){
//        driver.get("https://shopdemo.e-junkie.com/%22);
//                WebElement ebook= driver.findElement(By.linkText("Ebook"));
//        ebook.click();
//
//        WebElement ebookAddtocard= driver.findElement(By.xpath("//button[@class='view_product']"));
//        ebookAddtocard.click();
//
//        WebElement iframe= driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
//        driver.switchTo().frame(iframe);
//        //Myfunction.Bekle(3);
//        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(90));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='Payment-Button CC']")));
//        WebElement payDebitCard= driver.findElement(By.xpath("//button[@class='Payment-Button CC']"));
//        payDebitCard.click();
//
//        WebElement frameChild= driver.findElement(By.xpath("//iframe[@title='Secure card payment input frame']"));
//        driver.switchTo().frame(frameChild);
//        WebElement cardNumber= driver.findElement(By.cssSelector("[name='cardnumber']"));
//        cardNumber.sendKeys("1111 1111 1111 1111");
//
//        WebDriverWait wait2= new WebDriverWait(driver,Duration.ofSeconds(30));
//        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Your card number is invalid.']")));
//        WebElement errorMessage= driver.findElement(By.xpath("//span[text()='Your card number is invalid.']"));
//        Assert.assertEquals(errorMessage.getText(),"Your card number is invalid.");
//
//        BekleKapat();
//}
