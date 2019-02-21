package co.com.retouno.screenplay.tasks;

import co.com.retouno.screenplay.tasks.Abrir;
import co.com.retouno.screenplay.userinterface.AutomationHomePage;
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
