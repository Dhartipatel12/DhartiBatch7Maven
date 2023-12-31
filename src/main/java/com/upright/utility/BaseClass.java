package com.upright.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class BaseClass {

 WebDriver driver;// interface has many methods / Methods don't have any Body
// Methods
String myBrowser;
    // Initialize the browser
    // different browser has it own driver... chromedriver,firefox driver(gecko driver)
    // IDE driver,Opera driver, Safari driver,edge driver



    public void loadproperties() throws IOException{
        FileInputStream obj = new FileInputStream("C:\\Users\\dpate\\IdeaProjects\\dhartiBatch7\\src\\main\\java\\com\\upright\\utility\\info.properties");

        Properties prop = new Properties();

        prop.load(obj);
        myBrowser = prop.getProperty("browser");
        System.out.println(myBrowser);
    }


    public void launchBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dpate\\OneDrive\\Documents\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\dpate\\OneDrive\\Documents\\GeckoDriver\\geckodriver-v0.33.0-win-aarch64\\geckodriver");
        driver =new ChromeDriver();//Open the Chrome browser

        if (myBrowser.equals("chrome")){
            driver = new ChromeDriver();
        }
        else if (myBrowser.equals("firefox")){
            driver = new FirefoxDriver();
        }
        else {
            System.out.println("Please check your driver");
        }
      //  driver= new FirefoxDriver();

       // driver.get("https://macys.com");// it will wait till the driver gets loaded

      //  driver.navigate().to("https://uprightforum.tech");//it won't wait till the driver gets loaded

        driver.navigate().to("https://s3.us-east-2.amazonaws.com/dhartipatel.click/MyProfile.html");

       Thread.sleep(3000);
        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        String myCurrentURL = driver.getCurrentUrl();
        System.out.println(myCurrentURL);

        String myTitle = driver.getTitle();
        System.out.println(myTitle);


       // driver.manage().window().maximize();

    }

    public static void main(String[] args) throws InterruptedException, IOException {
       BaseClass obj = new BaseClass();
       obj.loadproperties();
       obj.launchBrowser();
    }
}
