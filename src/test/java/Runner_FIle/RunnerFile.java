package Runner_FIle;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\java\\Feature\\Automation.feature" ,
					glue="com.stepdef",
					plugin = {
							"pretty", "html:report",
							"com.cucumber.listener.ExtentCucumberFormatter:Report/extentReport.html" }

					
					/* 
					plugin = {"html:Reports//LoginReports",
							
							"pretty",
							
							"json:Reports/cucumber.json",
							
							"com.cucumber.listener.ExtentCucumberFormatter:Reports/extent_cucumber_Report.html"
							
							},
					monochrome = true
					*/
					
					)
					//plugin = {"html:Reports//LoginReports",
						//	"pretty",
							//"json:Reports//JsonReport.json",
							//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"}
							//"cucumber-extentsreport:{com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html}"
				//	}
						 

public class RunnerFile {

	
}
