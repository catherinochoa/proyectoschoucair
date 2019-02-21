package co.com.retounotips.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import java.util.List;
import org.openqa.selenium.WebDriver;
import co.com.retounotips.screenplay.model.RegistroAutomationDemoSite;
import co.com.retounotips.screenplay.questions.ElRegistro;
import co.com.retounotips.screenplay.tasks.Abrir;
import co.com.retounotips.screenplay.tasks.Diligenciar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RegistroUsuariosStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor carlos = Actor.named("Carlos");
	
	@Before
	public void configuracionInicial() {
		carlos.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Dado("^que Carlos quiere acceder a Automation Demo Site$")
	public void queCarlosQuiereAccederAAutomationDemoSite() throws Exception {
		carlos.wasAbleTo(Abrir.LaPaginaAutomation());
	}


	@Cuando("^él realiza el registro en la página de sus datos$")
	public void élRealizaElRegistroEnLaPáginaDeSusDatos(List<RegistroAutomationDemoSite> registroAutomationDemo) throws Exception {
		carlos.attemptsTo(Diligenciar.ElFormularioDeRegistro(registroAutomationDemo));
	}

	@Entonces("^él verifica que se carga la pantalla con texto (.*)$")
	public void élVerificaQueSeCargaLaPantallaConTextoDoubleClickOnEditIconToEDITTheTableRow(String texto) throws Exception {
		carlos.should(seeThat(ElRegistro.FueExitoso(), equalTo(texto)));
	}

}
