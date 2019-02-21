package co.com.retounotips.screenplay.questions;

import co.com.retounotips.screenplay.userinterface.VivaAirPaginaReserva;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LosServiciosAdicionales implements Question<String> {

	public static LosServiciosAdicionales Son() {
		
		return new LosServiciosAdicionales();
	}
	
	@Override
	public String answeredBy(Actor carlos) {
		return Text.of(VivaAirPaginaReserva.TABLA_CALENDARIO_TARIFAS).viewedBy(carlos).asString();
		
	}

}
