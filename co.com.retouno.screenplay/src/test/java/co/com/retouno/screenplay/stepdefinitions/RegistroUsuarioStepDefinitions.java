package co.com.retouno.screenplay.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.retouno.screenplay.tasks.Abrir;
import co.com.retouno.screenplay.tasks.Diligenciar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RegistroUsuarioStepDefinitions {

	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor carlos = Actor.named("Carlos");
	
	@Before
	public void configuracionInicial() {
		carlos.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Dado("^que Carlos quiere acceder a la Web Automation Demo Site$")
	public void queCarlosQuiereAccederALaWebAutomationDemoSite() throws Exception {
	    carlos.wasAbleTo(Abrir.LaPaginaAutomation());
	}


	@Cuando("^el realiza el registro en la página$")
	public void elRealizaElRegistroEnLaPágina() throws Exception {
	    carlos.attemptsTo(Diligenciar.ElFormularioDeRegistro());
	}

	@Entonces("^el verifica que se carga la pantalla con texto Double Click on Edit Icon to EDIT the Table Row$")
	public void elVerificaQueSeCargaLaPantallaConTextoDoubleClickOnEditIconToEDITTheTableRow() throws Exception {
	    
	}
}
