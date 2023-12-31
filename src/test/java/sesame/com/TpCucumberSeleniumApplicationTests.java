package sesame.com;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//strict = true
		features = {"src/test/resources"},
		glue = {"sesame.com"},
		plugin = {"json:target/cucumber.json"}
		)
public class TpCucumberSeleniumApplicationTests {
	
}
