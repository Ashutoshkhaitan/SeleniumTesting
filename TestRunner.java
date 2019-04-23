package com.learning1.cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/functionalTests",glue="com.learning1.stepdefinition",tags="@3"
 )
public class TestRunner {
}


