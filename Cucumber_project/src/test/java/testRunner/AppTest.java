package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFiles"},monochrome=true,glue= {"stepDefinations"},plugin = {"pretty", "html:target/cucumber-reports"},strict=true)
public class AppTest {

}
