package org.google.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features" , glue = "org\\google\\stepDef" ,dryRun = false,monochrome = true,
plugin = {"pretty","html:target\\report.html" , "pretty","json:target\\report.json", "pretty","junit:target\\report.xml" ,
"rerun:target\\failed.txt"}, tags = "@smoke" )
public class TestRunner {

}
