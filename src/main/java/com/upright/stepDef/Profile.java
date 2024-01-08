package com.upright.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Profile {
    WebDriver driver;
    String myTitle;
    String myUrl;

    @Given("The Profile link is loaded in the browser")
    public void the_profile_link_is_loaded_in_the_browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dpate\\OneDrive\\Documents\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://dhartipatel.click.s3-website.us-east-2.amazonaws.com/");
    }

    @When("user take the capture the title")
    public void user_take_the_capture_the_title() {
        myTitle = driver.getTitle();

    }

    @Then("the title should be something meaningful")
    public void the_title_should_be_something_meaningful() {
        if (myTitle.equalsIgnoreCase("Dhartipatel")) {
            System.out.println("The title is good");
        } else {
            System.out.println("The title is not good");
        }

    Assert.assertEquals(myTitle,"Dhartipatel");
}

    @When("User capture the url")
    public void user_capture_the_url() {
        myUrl = driver.getCurrentUrl();
        System.out.println("The url captured by the Selenium is" + myUrl);
    }

    @Then("the url should be as expected")
    public void the_url_should_be_as_expected() {
     Assert.assertEquals(myUrl,"http://dhartipatel.click/");
    }









}