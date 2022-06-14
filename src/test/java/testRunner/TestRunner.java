package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue={"stepdefinitions"},
monochrome = true,
plugin={"pretty","html:taget/HtmlReports.html","json:target/JSONReports/reports.json","junit:target/JUnitReports/report.xml"})



public class TestRunner {

}
