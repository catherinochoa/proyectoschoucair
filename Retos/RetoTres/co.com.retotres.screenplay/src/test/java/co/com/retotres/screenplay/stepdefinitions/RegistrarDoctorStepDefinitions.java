package co.com.retotres.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import java.util.List;
import org.openqa.selenium.WebDriver;
import co.com.retotres.screenplay.model.DatosAdministracionHospitales;
import co.com.retotres.screenplay.questions.DatosDoctorGuardados;
import co.com.retotres.screenplay.tasks.Abrir;
import co.com.retotres.screenplay.tasks.AgregarDoctor;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RegistrarDoctorStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor carlos = Actor.named("Carlos");
	
	@Before
	public void configuracionInicial() {
		carlos.can(BrowseTheWeb.with(hisBrowser));
	}
	
	
	@Dado("^que Carlos necesita registrar un nuevo Doctor$")
	public void queCarlosNecesitaRegistrarUnNuevoDoctor() throws Exception {
		carlos.wasAbleTo(Abrir.AlSitio());
	}


	@Cuando("^el realiza el registro del doctor en el aplicativo de Administración de Hospitales$")
	public void elRealizaElRegistroDelDoctorEnElAplicativoDeAdministraciónDeHospitales(List<DatosAdministracionHospitales> registroDoctor) throws Exception {
		carlos.attemptsTo(AgregarDoctor.Correctamente(registroDoctor));
	}

	@Entonces("^el verifica que se presente en pantalla el mensaje (.*)$")
	public void elVerificaQueSePresenteEnPantallaElMensajeDatosGuardadosCorrectamente(String mensaje) throws Exception {
		carlos.should(seeThat(DatosDoctorGuardados.Correctamente(), equalTo(mensaje)));
	}

}
