package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\lenovo\\eclipse-workspace\\CucumberConcepts\\"
		+ "src\\main\\java\\com\\feature\\Nykaa.feature",
		glue = "com.stepdefinition",
		tags = "@atest or @btest or @dtest or @etest or @ftest or @gtest",
		plugin = {"html:target/nykaa.html"} )
public class TestNykaa {

}
