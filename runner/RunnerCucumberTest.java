package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefs.ProjectSpecificMethods;


public class RunnerCucumberTest {

@CucumberOptions(features="src/test/java/features/EditLead.feature",
	     glue="StepDefs",
         monochrome= true,
         publish=true)
public class RunCucumberTests extends ProjectSpecificMethods{
         
	}

}
