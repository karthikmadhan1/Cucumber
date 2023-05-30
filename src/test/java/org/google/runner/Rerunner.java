package org.google.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target\\failed.txt",glue = "org\\google\\stepDef")
public class Rerunner {

}
