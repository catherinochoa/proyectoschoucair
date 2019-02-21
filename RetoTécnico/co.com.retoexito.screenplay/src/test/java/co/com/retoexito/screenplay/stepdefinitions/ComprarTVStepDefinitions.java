package co.com.retoexito.screenplay.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.retoexito.screenplay.tasks.Abrir;
import co.com.retoexito.screenplay.tasks.Seleccionar;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ComprarTVStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor actor = Actor.named("actor");
	
	@Before
	public void configuracionInicial() {
		actor.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Dado("^que quiero comprar un televisor para ver el mundial de futbol$")
	public void queQuieroComprarUnTelevisorParaVerElMundialDeFutbol() throws Exception {
		actor.wasAbleTo(Abrir.Pagina());
	}


	@Cuando("^ingreso a la página virtual del éxito y selecciono el que más me gusta$")
	public void ingresoALaPáginaVirtualDelÉxitoYSeleccionoElQueMásMeGusta(DataTable arg1) throws Exception {
		actor.attemptsTo(Seleccionar.TV());
	}

	@Entonces("^verfico que haya quedado en el carrito de compras$")
	public void verficoQueHayaQuedadoEnElCarritoDeCompras() throws Exception {
	    
	}


}
