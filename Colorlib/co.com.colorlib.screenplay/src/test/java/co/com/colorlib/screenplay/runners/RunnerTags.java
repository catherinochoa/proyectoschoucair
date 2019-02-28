package co.com.colorlib.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/validacion_popup.feature",
		tags= "@Regresion",
		glue= {"co.com.colorlib.screenplay.stepdefinitions" , "co.com.colorlib.screenplay.util"},
		snippets=SnippetType.CAMELCASE		)
public class RunnerTags {

}
