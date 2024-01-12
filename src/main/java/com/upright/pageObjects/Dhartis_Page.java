package com.upright.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Dhartis_Page {
    WebDriver driver;

@Test// @Test Annotation -- Replace Main method
    public void browser() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\dpate\\OneDrive\\Documents\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://dhartipatel.click.s3-website.us-east-2.amazonaws.com/");
    Thread.sleep(1000);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

    // Inserting Project Management and Bug tracking Tool
     driver.findElement(By.id("Project Management and Bug tracking Tool")).sendKeys("Jira");
     Thread.sleep(1000);
    // Inserting Documentation tool
     WebElement doctool = driver.findElement(By.name("Documentation tool"));
     doctool.sendKeys("Confluence");
     Thread.sleep(1000);
    // Inserting Object Oriented Programming Tool
     driver.findElement(By.id("Object Oriented Programming Tool")).sendKeys("Java");

    Thread.sleep(1000);
    // Inserting Automation Testing Tool
     driver.findElement(By.name("Automation Testing Tool")).sendKeys("Selenium");
    //  Thread.sleep(1000);

    Thread.sleep(1000);
    // Inserting API Testing Tool
    driver.findElement(By.name("API Testing Tool")).sendKeys("Postman");

    Thread.sleep(1000);
    // Inserting Backend Tool
     driver.findElement(By.name("Backend Tool")).sendKeys("MySQL");

    Thread.sleep(1000);
    // Inserting Mobile Testing Tool
    driver.findElement(By.id("Mobile Testing Tool")).sendKeys("Appium");

    Thread.sleep(1000);
    //Selecting Gardening
    driver.findElement(By.xpath("/html/body/doctype/b/input")).click();

    // Selecting  traveling
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/doctype/b/input[2]")).click();

    //Selecting  Watching Movies
    driver.findElement(By.xpath("/html/body/doctype/b/input[3]")).click();

    Thread.sleep(1000);
    // Selecting  Male
     driver.findElement(By.xpath("/html/body/doctype/b/input[4]")).click();
    Thread.sleep(1000);
    // Selecting  Female
     driver.findElement(By.id("female")).click();
     Thread.sleep(1000);
    //  Selecting Facebook
    driver.findElement(By.linkText("Facebook")).click();

    Thread.sleep(1000);
    driver.navigate().back();
    //Selecting LinkedIn
    Thread.sleep(1000);
    driver.findElement(By.linkText("LinkedIn")).click();
    Thread.sleep(5000);


   // driver.close(); /* will close the current window/tab even though it
   //  Open another window/tab. and also won't clear the background process */

    driver.quit(); /* It will close all the tabs/windows opened by selenium.
   // It will close the session. And also it will clear the background process */


}
/* There are two types of Xpath:
  1. Absolute Xpath --It start from the root node.from the html.
     1. Because sometimes developer change the dom(domestic) structure.Maybe he can add
        a new web element in between or delete any tag...that time my absolute xpath won't work.
  2. Relational Xpath -- It start from anywhere in the document and starts with //(double Slash)
     1. Syntax-- // Tagname[@attribute = 'value']

* There are two types of Exceptions:
  1. Implicitly wait -- It will a certain period(seconds) before throwing an exception
     during runtime and applicable to all over the script Wherever the class is extended.
  2. Explicitly wait -- It will wait a certain period(seconds) before throwing an exception
     during runtime is applicable to only a certain element.
*/

}
