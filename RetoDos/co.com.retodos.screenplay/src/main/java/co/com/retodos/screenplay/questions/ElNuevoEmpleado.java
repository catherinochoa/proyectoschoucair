package co.com.retodos.screenplay.questions;

import co.com.retodos.screenplay.userinterface.OrangeListaEmpleados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElNuevoEmpleado implements Question<String> {


	@Override
	public String answeredBy(Actor actor) {

		return Text.of(OrangeListaEmpleados.ETIQUETA_NOMBRE).viewedBy(actor).asString();
		
	}

	public static ElNuevoEmpleado Es() {
		return new ElNuevoEmpleado();
	}
}
