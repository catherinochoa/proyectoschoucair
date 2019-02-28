package co.com.colorlib.screenplay.tasks;

import co.com.colorlib.screenplay.userinterface.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

	private PaginaPrincipal colorlib;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(colorlib));
		
	}
	
	public static Abrir Pagina() {
		return Tasks.instrumented(Abrir.class);
	}
}
