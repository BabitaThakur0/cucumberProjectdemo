package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/features/AmazonPage.feature",glue= {"steps"},
                     tags = "@AmazonPage",
                     plugin = {"html:target/cucumber-reports/cucumber-html-report-AmazonPage.html"})
public class runCuke extends AbstractTestNGCucumberTests{

}
