package co.com.retotres.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/gestionar_cita_medica.feature",
		tags= "@escenario3",
		glue="co.com.retotres.screenplay.stepdefinitions",
		snippets=SnippetType.CAMELCASE		)
public class RunnerTags {

}
