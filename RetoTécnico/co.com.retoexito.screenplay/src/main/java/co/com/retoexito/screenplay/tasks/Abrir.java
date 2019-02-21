package co.com.retoexito.screenplay.tasks;

import co.com.retoexito.screenplay.userinterface.ExitoPaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

	private ExitoPaginaPrincipal exito;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(exito));
		
	}
	
	public static Abrir Pagina() {
		return Tasks.instrumented(Abrir.class);
	}

}
