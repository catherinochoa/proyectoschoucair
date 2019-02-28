package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.*;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

	private PaginaPrincipal paginaPrincipal;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(paginaPrincipal));
	}

public static Abrir LaPaginaVivaAir() {
	return instrumented(Abrir.class);
	}
}
