package com.upright.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import java.util.concurrent.TimeUnit;

public class UprightForumSignUpPage1 {

    WebDriver driver;

    @Test // @Test Annotation
    public void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dpate\\OneDrive\\Documents\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();//open the chrome driver
        driver.get("http://uprightforum.tech/registration/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement username = driver.findElement(By.xpath("//input[@name='your-username']"));
        username.sendKeys("Dhartipatel");
        String myUsername = username.getText();//get the text from application.
        SoftAssert obj = new SoftAssert();
        Thread.sleep(1000);

        WebElement firstname = driver.findElement(By.xpath("//input[@name = 'your-first-name']"));
        firstname.sendKeys("Dharti");
        Thread.sleep(1000);

        WebElement lastname = driver.findElement(By.xpath("//input[@name = 'your-last-name']"));
        lastname.sendKeys("Patel");
        Thread.sleep(1000);

        WebElement yourEmail = driver.findElement(By.xpath("//input[@name='your-email']"));
        yourEmail.sendKeys("Dhartidpatel83@yahoo.com");
        Thread.sleep(1000);

        WebElement yourPassword = driver.findElement(By.xpath("//input[@name='your-password']"));
        yourPassword.sendKeys("Upright123!");
        Thread.sleep(1000);

        WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@name='your-confirm-password']"));
        ConfirmPassword.sendKeys("Upright123!");
        Thread.sleep(1000);

        WebElement role = driver.findElement(By.xpath("//select[@name='your-role']"));
        role.sendKeys("Student");
        Thread.sleep(1000);

        WebElement element1 = driver.findElement(By.xpath("//select[@name = 'your-country']"));
        Select select1 = new Select(element1);
        select1.selectByVisibleText("United States");

        Thread.sleep(1000);
        WebElement submit = driver.findElement(By.xpath("//button[@type = 'submit']"));
        submit.click();
        Thread.sleep(1000);



        obj.assertAll();
        Thread.sleep(1000);
    }
@Test
public void handlingAlert() throws InterruptedException {
     Thread.sleep(1000);
    String alertText = driver.switchTo().alert().getText();
    // Assert.assertEquals(alertText,"username is already exist");
    if (alertText.equalsIgnoreCase("Username is already exist")){
        System.out.println("Attempting to create duplicate account");
    }
    System.out.println(alertText);

    driver.switchTo().alert().accept(); // it will click ok or yes
    //  driver.switchTo().alert().dismiss(); // it will click NO or now now or igonore
    //   driver.switchTo().alert().sendKeys("hello");


    }

}
