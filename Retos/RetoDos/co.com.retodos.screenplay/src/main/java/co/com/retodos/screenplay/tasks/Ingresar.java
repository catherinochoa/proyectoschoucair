package co.com.retodos.screenplay.tasks;

import co.com.retodos.screenplay.userinterface.OrangePaginaInicioSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class Ingresar implements Task {

	private OrangePaginaInicioSesion orangeHRM;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(orangeHRM));
		actor.attemptsTo(Enter.theValue("Admin").into(OrangePaginaInicioSesion.CAMPO_USUARIO));
		actor.attemptsTo(Enter.theValue("@NF8KRpfj4").into(OrangePaginaInicioSesion.CAMPO_CONTRASENA));
		actor.attemptsTo(Click.on(OrangePaginaInicioSesion.BOTON_LOGIN));
				
	}
	
	public static Ingresar EnLaPagina() {		
		return Tasks.instrumented(Ingresar.class);
	}
	

}
