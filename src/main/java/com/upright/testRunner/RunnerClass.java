package com.upright.testRunner;

import io.cucumber.*;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\dpate\\IdeaProjects\\dhartiBatch7\\src\\main\\java\\com\\upright\\features\\Profile.feature"}, glue={"com.upright.stepDef"},
        plugin = {"pretty", "html:target/cucumber-reports/Cucumber.html"},
        // plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
//        monochrome = true,
        publish =true
)



public class RunnerClass{








}
