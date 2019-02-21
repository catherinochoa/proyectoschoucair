package co.com.proyectobase.screenplay.tasks;

import static co.com.proyectobase.screenplay.userinterface.PaginaReserva.*;
import co.com.proyectobase.screenplay.interactions.SeleccionarMenorTarifaVueloDia;
import co.com.proyectobase.screenplay.interactions.SeleccionarMenorTarifaVueloHora;
import co.com.proyectobase.screenplay.interactions.Wait_3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.*;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarTarifaVuelo implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(SeleccionarMenorTarifaVueloDia.Desde(TARIFA_MAS_BAJA_DIA),
						 Click.on(BOTON_CONTINUAR_1),
						 Wait_3.aMoment(),
						 SeleccionarMenorTarifaVueloHora.Desde(TARIFA_MAS_BAJA_HORA),
						 Wait_3.aMoment(),
						 Click.on(BOTON_ACEPTAR));
	}
	
	public static SeleccionarTarifaVuelo EnLaPaginaReserva() {
		return instrumented(SeleccionarTarifaVuelo.class);
	}
}
