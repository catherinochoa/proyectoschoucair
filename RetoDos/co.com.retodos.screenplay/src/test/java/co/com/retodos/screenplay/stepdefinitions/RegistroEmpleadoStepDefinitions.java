package co.com.retodos.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;
import org.openqa.selenium.WebDriver;
import co.com.retodos.screenplay.model.RegistroEmpleadoOrange;
import co.com.retodos.screenplay.questions.ElNuevoEmpleado;
import co.com.retodos.screenplay.tasks.AgregarDatos;
import co.com.retodos.screenplay.tasks.Ingresar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RegistroEmpleadoStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor actor = Actor.named("Juan");
	
	@Before
	public void configuracionInicial() {
		actor.can(BrowseTheWeb.with(hisBrowser));
	}
	
	
	@Dado("^que Juan necesita crear un empleado en el OrageHR$")
	public void queJuanNecesitaCrearUnEmpleadoEnElOrageHR() throws Exception {
		actor.wasAbleTo(Ingresar.EnLaPagina());
	}


	@Cuando("^el realiza el ingreso del registro de la aplicación$")
	public void elRealizaElIngresoDelRegistroDeLaAplicación(List<RegistroEmpleadoOrange> registroEmpleadoOrange) throws Exception {
		actor.attemptsTo(AgregarDatos.Empleado(registroEmpleadoOrange));
	}

	@Entonces("^el visualiza el nuevo empleado (.*) en el aplicativo$")
	public void elVisualizaElNuevoEmpleadoEnElAplicativo(String texto) throws Exception {
	    actor.should(seeThat(ElNuevoEmpleado.Es(), equalTo(texto)));
	}

}
