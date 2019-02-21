package co.com.retotres.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import java.util.List;
import org.openqa.selenium.WebDriver;
import co.com.retotres.screenplay.model.DatosAdministracionHospitales;
import co.com.retotres.screenplay.questions.DatosPacienteGuardados;
import co.com.retotres.screenplay.tasks.Abrir;
import co.com.retotres.screenplay.tasks.AgregarPaciente;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RegistrarPacienteStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor carlos = Actor.named("Carlos");
	
	@Before
	public void configuracionInicial() {
		carlos.can(BrowseTheWeb.with(hisBrowser));
	}
	
	
	@Dado("^que Carlos necesita registrar un nuevo Paciente$")
	public void queCarlosNecesitaRegistrarUnNuevoPaciente() throws Exception {
		carlos.wasAbleTo(Abrir.AlSitio());
	}


	@Cuando("^el realiza el registro del paciente en el aplicativo de Administración de Hospitales$")
	public void elRealizaElRegistroDelPacienteEnElAplicativoDeAdministraciónDeHospitales(List<DatosAdministracionHospitales> registroPaciente) throws Exception {
		carlos.attemptsTo(AgregarPaciente.Correctamente(registroPaciente));
	}

	@Entonces("^el verifica en pantalla que el paciente es creado con el mensaje (.*)$")
	public void elVerificaEnPantallaQueElPacienteEsCreadoConElMensajeDatosGuardadosCorrectamente(String mensaje) throws Exception {
		carlos.should(seeThat(DatosPacienteGuardados.Correctamente(), equalTo(mensaje)));
	}

}
