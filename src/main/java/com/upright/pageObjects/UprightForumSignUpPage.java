package com.upright.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UprightForumSignUpPage {

    WebDriver driver;

@Test // @Test Annotation
    public void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dpate\\OneDrive\\Documents\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();//open the chrome driver
        driver.get("http://uprightforum.tech/registration/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(1000);
/*WebElement for Username,Firstname,lastname,email,password,Confirm Password,
 Select Type,Select Country, Click on Registration */
        WebElement username= driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/form/div/input"));
        username.sendKeys("DhartiPatel");
       // Thread.sleep(1000);
       // WebElement username = driver.findElement(By.xpath("//input[@name='your-username']"));
        Thread.sleep(1000);
        WebElement firstname = driver.findElement(By.name("your-first-name"));
        firstname.sendKeys("Dharti");
        Thread.sleep(1000);
        WebElement lastname  = driver.findElement(By.name("your-last-name"));
        lastname.sendKeys("Patel");
        Thread.sleep(1000);
        WebElement email  = driver.findElement(By.name("your-email"));
        email.sendKeys("dhartidpatel83@yahoo.com");
        Thread.sleep(1000);
        WebElement password  = driver.findElement(By.name("your-password"));
        password.sendKeys("Upright123!");
        Thread.sleep(1000);
        WebElement confirmpassword = driver.findElement(By.name("your-confirm-password"));
        confirmpassword.sendKeys("Upright123!");
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/form/div[7]/select"));
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText("Student");
        Thread.sleep(1000);
       // dropdown.selectByIndex(2);
       // Thread.sleep(1000);
       // dropdown.selectByVisibleText("Employee");
       // Thread.sleep(1000);
        WebElement element1= driver.findElement(By.id("your-country"));
        Select select1 = new Select(element1);
        select1.selectByVisibleText("United States");
        Thread.sleep(1000);
        WebElement register= driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/form/div[9]/button"));
        register.click();
        Thread.sleep(1000);
 // click on button and we get an alert box.
}
@Test
public void handlingAlert(){
  String alertText = driver.switchTo().alert().getText();
   // Assert.assertEquals(alertText,"username is already exist");
    if (alertText.equalsIgnoreCase("Username is already exist")){
        System.out.println("Attempting to create duplicate account");
    }
    driver.switchTo().alert().accept();//It will click ok or yes.
    driver.switchTo().alert().dismiss();//It will click No, Not now or Ignore.
    driver.switchTo().alert().sendKeys("Hello");
    System.out.println(alertText);

  /* How did you handle alert?
     I have to switch to alert, then I use different methods like
     gettext,accept,dismiss,Sendkeys.
   */
}
}