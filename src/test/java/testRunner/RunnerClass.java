package testRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "C:\\Users\\KaruppuSamy\\eclipse-workspace\\SeleniumLearning\\Feature",
		glue={"cucumber"},
		//tags="",
		plugin= {
				"rerun:target/failed_test.txt"
		}
		
		
		)

public class RunnerClass {

}
