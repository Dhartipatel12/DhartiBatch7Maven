package com.upright.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dhartis_Page2 {

    WebDriver driver;
    WebElement travel;

    @Test// @Test Annotation -- Replace Main method
    public void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dpate\\OneDrive\\Documents\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://dhartipatel.click.s3-website.us-east-2.amazonaws.com/");
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Thread.sleep(1000);

        // Verify that "My Profile" text is there in the page or not.
        SoftAssert obj = new SoftAssert();
        WebElement profileText = driver.findElement(By.xpath("//h3[text()=' My Profile ']"));
        try {
            boolean profileTextisdisplayedorNot = profileText.isDisplayed();
            if (profileTextisdisplayedorNot == true) {
                String myprofiletext = profileText.getText();
                obj.assertEquals(myprofiletext, "My Profile");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        Thread.sleep(1000);

        //selecting travelling

        try {

            travel = driver.findElement(By.xpath("//input[@value='Travelling']"));


        } catch (NoSuchElementException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally"); //always run
        }
//        boolean travellistSelectedOrNot = travel.isSelected();
//       System.out.println(travellistSelectedOrNot);
//        if (travellistSelectedOrNot == false) {
//            travel.click();
//    }

  List<WebElement> reading = driver.findElements(By.xpath("//input[@name='Hobbies']"));
  reading.get(0).click();
  reading.get(1).click();
  reading.get(2).click();
  //reading.click();


    }
}

