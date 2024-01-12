package com.upright.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class MacysSignUpPage1 {

    WebDriver driver;
    @Test
    public void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dpate\\OneDrive\\Documents\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.macys.com/account/createaccount");
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement Firstname = driver.findElement(By.xpath("//input[@name='ca-profile-firstname']"));
        Firstname.sendKeys("Dharti");
        SoftAssert obj = new SoftAssert();
        Thread.sleep(1000);

        WebElement Lastname = driver.findElement(By.xpath("//input[@name='ca-profile-lastname']"));
        Lastname.sendKeys("Patel");
        Thread.sleep(1000);

        WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
        Email.sendKeys("Dhartidpatel83@yahoo.com");
        Thread.sleep(1000);

        WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
        Password.sendKeys("Lovemacy123$");
        Thread.sleep(1000);

        WebElement BirthMonth = driver.findElement(By.xpath("//select[@name='ca-profile-birth-month']"));
        BirthMonth.sendKeys("October");
        Thread.sleep(1000);

        WebElement Birthday = driver.findElement(By.xpath("//select[@name='ca-profile-birth-day']"));
        Birthday.sendKeys("13");
        Thread.sleep(1000);

        WebElement Profile = driver.findElement(By.xpath("//button[@id = 'ca-profile-submit']"));

     obj.assertAll();
    }
}