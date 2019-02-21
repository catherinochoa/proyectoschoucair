package co.com.retounotips.screenplay.tasks;

import co.com.retounotips.screenplay.userinterface.AutomationHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
	
	private AutomationHomePage automationDemoSite;


	@Override
	public <T extends Actor> void performAs(T carlos) {
		carlos.attemptsTo(Open.browserOn(automationDemoSite));
		
	}

	public static Abrir LaPaginaAutomation() {
		return Tasks.instrumented(Abrir.class);
	}

}
