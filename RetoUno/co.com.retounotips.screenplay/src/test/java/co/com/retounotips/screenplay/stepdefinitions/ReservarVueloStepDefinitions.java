package co.com.retounotips.screenplay.stepdefinitions;

import java.util.List;
import org.openqa.selenium.WebDriver;
import co.com.retounotips.screenplay.model.DatosReserva;
import co.com.retounotips.screenplay.tasks.Abrir;
import co.com.retounotips.screenplay.tasks.Diligenciar;
import co.com.retounotips.screenplay.tasks.IngresarDatos;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ReservarVueloStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor actor = Actor.named("usuario");
	
	@Before
	public void configuracionInicial() {
		actor.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Dado("^que un usuario quiere realizar una compra de tiquetes$")
	public void queUnUsuarioQuiereRealizarUnaCompraDeTiquetes() throws Exception {
		actor.wasAbleTo(Abrir.LaPagina());
	}


	@Cuando("^él ingresa la información en la reserva$")
	public void élIngresaLaInformaciónEnLaReserva(List<DatosReserva> datos) throws Exception {
		actor.attemptsTo(Diligenciar.Reserva(datos));
	}

	@Cuando("^ingresa los datos de las personas que viajan con él$")
	public void ingresaLosDatosDeLasPersonasQueViajanConÉl(List<DatosReserva> datos_acompanantes) throws Exception {
		actor.attemptsTo(IngresarDatos.Acompanantes(datos_acompanantes));
	}
	
	@Entonces("^él verifica que no se generen (.*)$")
	public void élVerificaQueNoSeGenerenServiciosAdicionalesUSD(String texto) throws Exception {
		// actor.should(seeThat(LosServiciosAdicionales.Son(), equalTo(texto)));
	}

}
