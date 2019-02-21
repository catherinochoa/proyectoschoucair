package co.com.retoexito.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Seleccionar implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
	}

	public static Seleccionar TV() {
		return Tasks.instrumented(Seleccionar.class);
	}

}
