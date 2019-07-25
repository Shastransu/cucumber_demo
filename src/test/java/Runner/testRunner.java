package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(monochrome=true,features="feature\\tag_demo.feature",glue= {"testmeapp"},tags= {"@SmokeTest","@RegressionTest"})
//@CucumberOptions(monochrome=true,features="feature\\tag_demo.feature",tags= {"@SmokeTest"})
@CucumberOptions(monochrome=true,features="feature\\tag_demo.feature",tags= {"@SmokeTest","~@Sanity"})

public class testRunner {

}
