package co.com.retodos.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/registro_empleado.feature",
		tags= "@reto2",
		glue="co.com.retodos.screenplay.stepdefinitions",
		snippets=SnippetType.CAMELCASE		)
public class RunnerTags {

}
