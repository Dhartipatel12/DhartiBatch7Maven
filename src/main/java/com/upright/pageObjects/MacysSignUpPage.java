package com.upright.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MacysSignUpPage {

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
        WebElement firstname= driver.findElement(By.name("ca-profile-firstname"));
        firstname.sendKeys("Dharti");
        Thread.sleep(1000);
        WebElement lastname = driver.findElement(By.id("ca-profile-lastname"));
        lastname.sendKeys("Patel");
        Thread.sleep(1000);
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("Dhartidpatel83@yahoo.com");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("ca-profile-password"));
        password.sendKeys("Lovemacy123$");
        Thread.sleep(1000);
        WebElement birthmonth = driver.findElement(By.id("ca-profile-birth-month"));
        birthmonth.sendKeys("October");
        Thread.sleep(1000);
        WebElement birthday = driver.findElement(By.id("ca-profile-birth-day"));
        birthday.sendKeys("13");
        Thread.sleep(1000);
        WebElement profilesubmit = driver.findElement(By.id("ca-profile-submit"));
        profilesubmit.sendKeys("Create Account");

        driver.close();




    }















}
