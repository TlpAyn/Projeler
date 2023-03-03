package TestingProject_02;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestingProject_02 extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://demowebshop.tricentis.com/");

        WebElement register = driver.findElement(By.linkText("Register"));
        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(register).click().build();
        action.perform();

        WebElement gender = driver.findElement(By.id("gender-male"));
        action = actions.moveToElement(gender).click().build();
        action.perform();

        WebElement name = driver.findElement(By.id("FirstName"));
        action = actions.moveToElement(name).click().sendKeys("Name").build();
        action.perform();

        WebElement lastName = driver.findElement(By.id("LastName"));
        action = actions.moveToElement(lastName).click().sendKeys("Last Name").build();
        action.perform();

        WebElement mail = driver.findElement(By.id("Email"));
        action = actions.moveToElement(mail).click().sendKeys("testing" + ((int) (Math.random() * 10000)) + "@testing.com").build();
        action.perform();

        WebElement password = driver.findElement(By.id("Password"));
        action = actions.moveToElement(password).click().sendKeys("password").build();
        action.perform();

        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        action = actions.moveToElement(confirmPassword).click().sendKeys("password").build();
        action.perform();

        WebElement registerButton = driver.findElement(By.id("register-button"));
        action = actions.moveToElement(registerButton).click().build();
        action.perform();

        WebElement confirmation = driver.findElement(By.className("result"));

        Assert.assertEquals("Your registration completed", confirmation.getText());

        WebElement logout = driver.findElement(By.linkText("Log out"));
        action = actions.moveToElement(logout).click().build();
        action.perform();

    }

    @Test
    public void Test2() {
        driver.get("http://demowebshop.tricentis.com/");

        WebElement register = driver.findElement(By.linkText("Register"));
        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(register).click().build();
        action.perform();

        WebElement gender = driver.findElement(By.id("gender-male"));
        action = actions.moveToElement(gender).click().build();
        action.perform();

        WebElement name = driver.findElement(By.id("FirstName"));
        action = actions.moveToElement(name).click().sendKeys("Name").build();
        action.perform();

        WebElement lastName = driver.findElement(By.id("LastName"));
        action = actions.moveToElement(lastName).click().sendKeys("Last Name").build();
        action.perform();

        WebElement mail = driver.findElement(By.id("Email"));
        action = actions.moveToElement(mail).click().sendKeys("testing8567@testing.com").build();
        action.perform();

        WebElement password = driver.findElement(By.id("Password"));
        action = actions.moveToElement(password).click().sendKeys("password").build();
        action.perform();

        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        action = actions.moveToElement(confirmPassword).click().sendKeys("password").build();
        action.perform();

        WebElement registerButton = driver.findElement(By.id("register-button"));
        action = actions.moveToElement(registerButton).click().build();
        action.perform();

        WebElement confirmation = driver.findElement(By.xpath("//li[text()='The specified email already exists']"));

        Assert.assertEquals("The specified email already exists", confirmation.getText());
    }

    @Test
    public void Test3() {
        driver.get("http://demowebshop.tricentis.com/");

        WebElement login = driver.findElement(By.linkText("Log in"));
        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(login).click().build();
        action.perform();

        WebElement mail = driver.findElement(By.id("Email"));
        action = actions.moveToElement(mail).click().sendKeys("testing8567@testing.com").build();
        action.perform();

        WebElement password = driver.findElement(By.id("Password"));
        action = actions.moveToElement(password).click().sendKeys("password").build();
        action.perform();

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        action = actions.moveToElement(loginButton).click().build();
        action.perform();

        WebElement logout = driver.findElement(By.linkText("Log out"));

        Assert.assertTrue(logout.isDisplayed());

        action = actions.moveToElement(logout).click().build();
        action.perform();
    }

    @Test
    public void Test4() {
        driver.get("http://demowebshop.tricentis.com/");

        WebElement login = driver.findElement(By.linkText("Log in"));
        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(login).click().build();
        action.perform();

        WebElement mail = driver.findElement(By.id("Email"));
        action = actions.moveToElement(mail).click().sendKeys("testing@testing.com").build();
        action.perform();

        WebElement password = driver.findElement(By.id("Password"));
        action = actions.moveToElement(password).click().sendKeys("password" + ((int) (Math.random() * 10000))).build();
        action.perform();

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        action = actions.moveToElement(loginButton).click().build();
        action.perform();

        WebElement confirmation = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));

        Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.", confirmation.getText());
    }

    @Test
    public void Test5() {
        driver.get("http://demowebshop.tricentis.com/");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement login = driver.findElement(By.linkText("Log in"));
        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(login).click().build();
        action.perform();

        WebElement mail = driver.findElement(By.id("Email"));
        action = actions.moveToElement(mail).click().sendKeys("testing8567@testing.com").build();
        action.perform();

        WebElement password = driver.findElement(By.id("Password"));
        action = actions.moveToElement(password).click().sendKeys("password").build();
        action.perform();

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        action = actions.moveToElement(loginButton).click().build();
        action.perform();

        WebElement computers = driver.findElement(By.linkText("COMPUTERS"));
        action = actions.moveToElement(computers).build();
        action.perform();

        WebElement notebooks = driver.findElement(By.linkText("Notebooks"));
        action = actions.moveToElement(notebooks).click().build();
        action.perform();

        WebElement notebook14 = driver.findElement(By.xpath("(//a[@href='/141-inch-laptop'])[2]"));
        action = actions.moveToElement(notebook14).click().build();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='/141-inch-laptop'])[2]")));
        action.perform();

        WebElement laptopAddToCart = driver.findElement(By.id("add-to-cart-button-31"));
        action = actions.moveToElement(laptopAddToCart).click().build();
        action.perform();

        WebElement confirmation = driver.findElement(By.xpath("//p[text()='The product has been added to your ']"));

        Assert.assertTrue(confirmation.getText().contains("The product has been added to your"));

        WebElement shoppingCart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        action = actions.moveToElement(shoppingCart).click().build();
        action.perform();

        WebElement notebook14Control = driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop'])[2]"));

        Assert.assertTrue(notebook14Control.getText().contains("14.1-inch Laptop"));

        WebElement agree = driver.findElement(By.id("termsofservice"));
        action = actions.moveToElement(agree).click().build();
        action.perform();

        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        action = actions.moveToElement(checkoutButton).click().build();
        action.perform();

        WebElement newAdresMenu = driver.findElement(By.id("billing-address-select"));
        Select newAdresSelectMenu = new Select(newAdresMenu);
        newAdresSelectMenu.selectByVisibleText("New Address");

        WebElement countryMenu = driver.findElement(By.name("BillingNewAddress.CountryId"));
        Select countrySelectMenu = new Select(countryMenu);
        countrySelectMenu.selectByValue("77");

        WebElement city = driver.findElement(By.id("BillingNewAddress_City"));
        action=actions.moveToElement(city).click().sendKeys("Ankara").build();
        action.perform();

        WebElement adress1= driver.findElement(By.id("BillingNewAddress_Address1"));
        action = actions.moveToElement(adress1).click().sendKeys("Kavaklıdere").build();
        action.perform();

        WebElement zipCode = driver.findElement(By.name("BillingNewAddress.ZipPostalCode"));
        action=actions.moveToElement(zipCode).click().sendKeys("06000").build();
        action.perform();

        WebElement phoneNum = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        action=actions.moveToElement(phoneNum).click().sendKeys("060123456789").build();
        action.perform();

        WebElement continueButton=driver.findElement(By.xpath("(//input[@title='Continue'])[1]"));
        action=actions.moveToElement(continueButton).click().build();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@title='Continue'])[1]")));
        action.perform();

        WebElement continueButton2=driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
        action=actions.moveToElement(continueButton2).click().build();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='Shipping.save()']")));
        action.perform();

        WebElement continueButton3=driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));
        action=actions.moveToElement(continueButton3).click().build();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='ShippingMethod.save()']")));
        action.perform();

        WebElement continueButton4=driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
        action=actions.moveToElement(continueButton4).click().build();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='PaymentMethod.save()']")));
        action.perform();

        WebElement continueButton5=driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
        action=actions.moveToElement(continueButton5).click().build();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='PaymentInfo.save()']")));
        action.perform();

        WebElement confirmOrder=driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
        action=actions.moveToElement(confirmOrder).click().build();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='ConfirmOrder.save()']")));
        action.perform();

        WebElement lastConfirmation=driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));

        Assert.assertEquals("Your order has been successfully processed!", lastConfirmation.getText());

    }
}
