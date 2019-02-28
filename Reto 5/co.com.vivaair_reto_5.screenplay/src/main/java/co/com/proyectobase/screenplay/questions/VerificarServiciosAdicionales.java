package co.com.proyectobase.screenplay.questions;

import static co.com.proyectobase.screenplay.userinterface.PaginaReserva.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarServiciosAdicionales implements Question<String> {

@Override
public String answeredBy(Actor actor) {
	
	return Text.of(SERVICIOS_ADICIONALES).viewedBy(actor).asString().replace("USD", "").replace(" ", "");
	}

public static VerificarServiciosAdicionales es() {
	return new VerificarServiciosAdicionales();
	}
}