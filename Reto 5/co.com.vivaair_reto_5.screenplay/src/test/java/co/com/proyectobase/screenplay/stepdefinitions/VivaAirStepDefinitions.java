package co.com.proyectobase.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import java.util.List;
import static org.hamcrest.Matchers.*;
import co.com.proyectobase.screenplay.model.Data;
import co.com.proyectobase.screenplay.questions.VerificarServiciosAdicionales;
import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.IngresarDatosSolicitados;
import co.com.proyectobase.screenplay.tasks.ReservarVuelo;
import co.com.proyectobase.screenplay.tasks.SeleccionarTarifaVuelo;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class VivaAirStepDefinitions {
	
	@Dado("^que (.*) desea comprar tiquetes aereos$")
	public void queJuanDeseaComprarTiquetesAereos(String juan) {
		theActorCalled(juan).wasAbleTo(Abrir.LaPaginaVivaAir());
	}

	@Cuando("^el ingresa sus preferencias$")
	public void elIngresaSusPreferencias(List<Data> withdata) {
		theActorInTheSpotlight().wasAbleTo(ReservarVuelo.EnLaPaginaPrincipal(withdata));
	}

	@Cuando("^el escoge los tiquetes de menor precio$")
	public void elEscogeLosTiquetesDeMenorPrecio() {
	   theActorInTheSpotlight().wasAbleTo(SeleccionarTarifaVuelo.EnLaPaginaReserva());
	}

	@Cuando("^ingresa todos los datos solicitados$")
	public void ingresaTodosLosDatosSolicitados(List<Data> withdata) {
	   theActorInTheSpotlight().wasAbleTo(IngresarDatosSolicitados.EnLaPaginaReserva(withdata));
	}

	@Entonces("^verifica que los servicios adicionales no tengan ningun costo$")
	public void verificaQueLosServiciosAdicionalesNoTenganNingunCosto() {
	   theActorInTheSpotlight().should(seeThat(VerificarServiciosAdicionales.es(), equalTo("0.00")));
	}
}
