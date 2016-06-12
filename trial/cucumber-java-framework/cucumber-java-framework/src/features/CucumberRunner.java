package features;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@Cucumber.Options(
		features ={"src/features/"},
		tags={"@wip"},
		format = {"pretty", "html:targets/cucumber-html-report"})
public class CucumberRunner {

}