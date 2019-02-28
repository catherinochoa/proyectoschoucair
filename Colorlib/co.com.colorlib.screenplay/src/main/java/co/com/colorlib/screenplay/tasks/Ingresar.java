package co.com.colorlib.screenplay.tasks;

import co.com.colorlib.screenplay.userinterface.MenuColorlib;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Ingresar implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(MenuColorlib.MENU_FORMS),
						Click.on(MenuColorlib.OPCION_FORMS_VALIDATION));
		

	}
	
	public static Ingresar AFormsValidation() {		
		return Tasks.instrumented(Ingresar.class);
	}


}
