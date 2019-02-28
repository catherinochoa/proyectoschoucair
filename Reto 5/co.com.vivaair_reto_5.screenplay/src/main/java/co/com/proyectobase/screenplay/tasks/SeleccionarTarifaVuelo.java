package co.com.proyectobase.screenplay.tasks;

import static co.com.proyectobase.screenplay.userinterface.PaginaReserva.*;
import co.com.proyectobase.screenplay.interactions.SeleccionarMenorTarifaVueloDia;
import co.com.proyectobase.screenplay.interactions.SeleccionarMenorTarifaVueloHora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SeleccionarTarifaVuelo implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(WaitUntil.the(TARIFA_MAS_BAJA_DIA, isVisible()).forNoMoreThan(10).seconds(),
						 SeleccionarMenorTarifaVueloDia.Desde(TARIFA_MAS_BAJA_DIA),
						 Click.on(BOTON_CONTINUAR_1),
						 WaitUntil.the(TARIFA_MAS_BAJA_HORA, isVisible()).forNoMoreThan(10).seconds(),
						 SeleccionarMenorTarifaVueloHora.Desde(TARIFA_MAS_BAJA_HORA),
						 WaitUntil.the(BOTON_ACEPTAR, isVisible()).forNoMoreThan(10).seconds(),
						 Click.on(BOTON_ACEPTAR));
	}
	
	public static SeleccionarTarifaVuelo EnLaPaginaReserva() {
		return instrumented(SeleccionarTarifaVuelo.class);
	}
}
