package com.upright.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Dhartis_page1 {

    WebDriver driver;

    @Test// @Test Annotation -- Replace Main method
    public void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dpate\\OneDrive\\Documents\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://dhartipatel.click.s3-website.us-east-2.amazonaws.com/");
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Thread.sleep(1000);

        // Verify that "My Profile" text is there in the page or not.
         WebElement profileText = driver.findElement(By.xpath("//h3[text()=' My Profile ']"));
         String myprofileText = profileText.getText();//get the text from application.
         SoftAssert obj = new SoftAssert();
         obj.assertEquals(myprofileText, "My Profile");
         Thread.sleep(1000);

        WebElement ProjectManagementToolTxt = driver.findElement(By.xpath("//input[@ id = 'Project Management and Bug tracking Tool']"));
        ProjectManagementToolTxt.sendKeys("Jira");
        Thread.sleep(1000);

        WebElement Documentationtool = driver.findElement(By.xpath("//input[@ id = 'Documentation tool']"));
        Documentationtool.sendKeys("Confluence");
        Thread.sleep(1000);

        WebElement ObjectOrientedProgrammingtool = driver.findElement(By.xpath("//input[@ id = 'Object Oriented Programming Tool']"));
        ObjectOrientedProgrammingtool.sendKeys("Java");
        Thread.sleep(1000);

        WebElement Automationtool = driver.findElement(By.xpath("//input[@ id = 'Automation Testing Tool']"));
        Automationtool.sendKeys("Selenium");
        Thread.sleep(1000);

        WebElement APITestingTool = driver.findElement(By.xpath("//input[@ id = 'API Testing Tool']"));
        APITestingTool.sendKeys("Postman");
        Thread.sleep(1000);

        WebElement BackendTool = driver.findElement(By.xpath("//input[@ id = 'Backend Tool']"));
        BackendTool.sendKeys("MySQL");
        Thread.sleep(1000);

        WebElement MobileTestingTool = driver.findElement(By.xpath("//input[@ id = 'Mobile Testing Tool']"));
        MobileTestingTool.sendKeys("Appium");
        Thread.sleep(1000);

        WebElement Hobby = driver.findElement(By.xpath("//input[@ id = 'Gardening']"));
        Hobby.click();

        Thread.sleep(1000);

        WebElement Hobbies = driver.findElement(By.xpath("//label[text()='Travelling']"));
        Hobbies.click();
        Thread.sleep(1000);

        WebElement favoriteHobby = driver.findElement(By.xpath("//input[@ id = 'Watching Movies']"));
        favoriteHobby.click();
        Thread.sleep(1000);

        WebElement Gender = driver.findElement(By.xpath("//input[@ id = 'Female']"));
        Gender.click();
        Thread.sleep(1000);

        WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
        facebook.click();
        Thread.sleep(1000);

        driver.navigate().back();
        WebElement LinkedInlink = driver.findElement(By.xpath("//a[text()='LinkedIn']"));
        LinkedInlink.click();
        Thread.sleep(5000);

        obj.assertAll();
    }
}
