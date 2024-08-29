package RunnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src\\test\\resources\\Features\\IMS.feature"},
					glue = {"Steps"},
					dryRun = false,
					monochrome = true,
					plugin = {"pretty", "html:target/htmlreport.html"})

public class TestRunnerIMS extends AbstractTestNGCucumberTests{

}
