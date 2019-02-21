package co.com.retotres.screenplay.tasks;

import co.com.retotres.screenplay.userinterface.AdministracionDeHospitalesPaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

	private AdministracionDeHospitalesPaginaPrincipal ingresarAlSitio;

	@Override
	public <T extends Actor> void performAs(T carlos) {
		carlos.attemptsTo(Open.browserOn(ingresarAlSitio));
		
	}
	
	public static Abrir AlSitio() {
		return Tasks.instrumented(Abrir.class);
	}
}
