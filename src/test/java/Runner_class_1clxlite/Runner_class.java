package Runner_class_1clxlite;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\Dinesh K\\eclipse-workspace\\1clxlite_version-1\\src\\test\\resources\\Features\\Business_Profile_creation.feature",
glue= "StepDefinition_1clxlite" , 
plugin={"pretty","json:Report/1clxlite.json"
		  ,"html:CucumberReport/1clxlite"
		  ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
publish = true, 
monochrome= true,
dryRun= false
)

public class Runner_class {
	
	//C:\Users\Dinesh K\eclipse-workspace\1clxlite_version-1\src\test\resources\Features

}
