package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="src/test/java/feature",
				 glue="steps",  //Include the package name of the step definitions class
				 monochrome=true,//To remove the unwanted characters in the console
				 tags= {"@functional","@regression"},
				 plugin= {"pretty","html:reports"},
				 snippets=SnippetType.CAMELCASE)//To get the step defintion in lower camel case
public class RunLogin extends AbstractTestNGCucumberTests {

}
