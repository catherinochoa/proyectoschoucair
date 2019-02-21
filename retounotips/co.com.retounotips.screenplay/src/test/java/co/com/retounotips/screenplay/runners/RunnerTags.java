package co.com.retounotips.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/registro_usuario.feature",
		tags= "@reto1",
		glue="co.com.retounotips.screenplay.stepdefinitions",
		snippets=SnippetType.CAMELCASE		)
public class RunnerTags {

}
