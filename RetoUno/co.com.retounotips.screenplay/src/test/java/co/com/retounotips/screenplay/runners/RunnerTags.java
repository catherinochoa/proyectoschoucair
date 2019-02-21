package co.com.retounotips.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/reservar_vuelo.feature",
		tags= "@retotecnico",
		glue= "co.com.retounotips.screenplay.stepdefinitions",
		snippets=SnippetType.CAMELCASE		)
public class RunnerTags {

}
