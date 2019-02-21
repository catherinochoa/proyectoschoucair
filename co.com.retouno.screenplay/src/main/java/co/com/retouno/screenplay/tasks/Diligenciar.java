package co.com.retouno.screenplay.tasks;

import co.com.retouno.screenplay.userinterface.AutomationHomePage;
import co.com.retouno.screenplay.userinterface.AutomationRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Diligenciar implements Task {
	
	

	@Override
	public <T extends Actor> void performAs(T carlos) {
		
		String genero = "Male";
		
		carlos.attemptsTo(Click.on(AutomationHomePage.BOTON_REGISTRO));
		
		carlos.attemptsTo(Enter.theValue("Carlos").into(AutomationRegisterPage.CAMPO_NOMBRE));
		carlos.attemptsTo(Enter.theValue("Rios").into(AutomationRegisterPage.CAMPO_APELLIDO));
		carlos.attemptsTo(Enter.theValue("Cra 21 # 4-19").into(AutomationRegisterPage.CAMPO_DIRECCION));
		carlos.attemptsTo(Enter.theValue("carlos@gmail.com").into(AutomationRegisterPage.CAMPO_CORREO));
		carlos.attemptsTo(Enter.theValue("3333333").into(AutomationRegisterPage.CAMPO_TELEFONO));
		
		if ( genero == "Male") {
			carlos.attemptsTo(Click.on(AutomationRegisterPage.OPCION_GENERO_MASCULINO));
		}else {
			carlos.attemptsTo(Click.on(AutomationRegisterPage.OPCION_GENERO_FEMENINO));
		}
		
		carlos.attemptsTo(Click.on(AutomationRegisterPage.CHECKBOX_HOBBIES_CRICKET));
		carlos.attemptsTo(Click.on(AutomationRegisterPage.CHECKBOX_HOBBIES_MOVIES));
		carlos.attemptsTo(Click.on(AutomationRegisterPage.CHECKBOX_HOBBIES_HOCKEY));
		
	}


	public static Diligenciar ElFormularioDeRegistro() {		
		return Tasks.instrumented(Diligenciar.class);
	}

	
}
