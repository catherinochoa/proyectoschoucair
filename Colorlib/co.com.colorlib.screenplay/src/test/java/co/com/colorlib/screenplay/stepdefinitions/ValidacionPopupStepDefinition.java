package co.com.colorlib.screenplay.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import java.util.List;
import co.com.colorlib.screenplay.model.Datos;
import co.com.colorlib.screenplay.tasks.Abrir;
import co.com.colorlib.screenplay.tasks.Acceder;
import co.com.colorlib.screenplay.tasks.Ingresar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class ValidacionPopupStepDefinition {
	
	@Dado("^que (.*) ingresa al sitio web de colorlib$")
	public void queCarlosSeIngresaAlSitioWebColorlib(String carlos) {
		theActorCalled(carlos).wasAbleTo(Abrir.Pagina());
	}


	@Dado("^ingresa sus datos de acceso$")
	public void ingresaSusDatosDeAcceso(List<Datos> datos) {
		theActorInTheSpotlight().attemptsTo(Acceder.AlSitio(datos));
	}

	@Cuando("^ingresa a la opción Forms Validation$")
	public void diligenciaFormularioPopupValidation()  {
		theActorInTheSpotlight().attemptsTo(Ingresar.AFormsValidation());
	}

	@Entonces("^Verifica ingreso exitoso$")
	public void verificaIngresoExitoso()  {
	    
	}


}
