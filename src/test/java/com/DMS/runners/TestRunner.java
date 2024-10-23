package com.DMS.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//        features = {"src/main/resources/features/"},
        features = {"src/main/resources/features/01. Login.feature", "src/main/resources/features/12.Perizinan.feature", "src/main/resources/features/20.Logout.feature"},
        glue = {"com.DMS"},
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber-report.json"}
)
public class     TestRunner extends AbstractTestNGCucumberTests {

}

