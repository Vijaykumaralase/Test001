package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "src/test/java/Features",
   //path of step definition file
   glue = "StepDefinations",monochrome = true
   )

public class TestRunner {

}
