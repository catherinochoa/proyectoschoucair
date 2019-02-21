package co.com.retounotips.screenplay.tasks;

import java.util.List;

import co.com.retounotips.screenplay.interactions.SeleccionarLista;
import co.com.retounotips.screenplay.model.RegistroAutomationDemoSite;
import co.com.retounotips.screenplay.userinterface.AutomationHomePage;
import co.com.retounotips.screenplay.userinterface.AutomationRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;

public class Diligenciar implements Task {
	
	private List<RegistroAutomationDemoSite> listaDatos;
			
	public Diligenciar(List<RegistroAutomationDemoSite> listaDatos) {
		super();
		this.listaDatos = listaDatos;
	}

	@Override
	public <T extends Actor> void performAs(T carlos) {
		
		
		carlos.attemptsTo(Click.on(AutomationHomePage.BOTON_REGISTRO),
				Enter.theValue(listaDatos.get(0).getNombre()).into(AutomationRegisterPage.CAMPO_NOMBRE));
		carlos.attemptsTo(Enter.theValue(listaDatos.get(0).getApellido()).into(AutomationRegisterPage.CAMPO_APELLIDO));
		carlos.attemptsTo(Enter.theValue(listaDatos.get(0).getDireccion()).into(AutomationRegisterPage.CAMPO_DIRECCION));
		carlos.attemptsTo(Enter.theValue(listaDatos.get(0).getCorreo()).into(AutomationRegisterPage.CAMPO_CORREO));
		carlos.attemptsTo(Enter.theValue(listaDatos.get(0).getCelular()).into(AutomationRegisterPage.CAMPO_TELEFONO));
		
		carlos.attemptsTo(Check.whether(listaDatos.get(0).getGenero().trim().equals("Male"))
				.andIfSo(Click.on(AutomationRegisterPage.OPCION_GENERO_MASCULINO))
				.otherwise(Click.on(AutomationRegisterPage.OPCION_GENERO_FEMENINO))				
				);
		
		if (listaDatos.get(0).getActividades().trim().equals("Cricket")) {
			carlos.attemptsTo(Click.on(AutomationRegisterPage.CHECKBOX_HOBBIES_CRICKET));
		}else 
			if(listaDatos.get(0).getActividades().trim().equals("Movies")) {
				carlos.attemptsTo(Click.on(AutomationRegisterPage.CHECKBOX_HOBBIES_MOVIES));
			}else
			{
				carlos.attemptsTo(Click.on(AutomationRegisterPage.CHECKBOX_HOBBIES_HOCKEY));
			}
				
		carlos.attemptsTo(Click.on(AutomationRegisterPage.CAMPO_IDIOMAS));
		carlos.attemptsTo(SeleccionarLista.Desde(AutomationRegisterPage.LISTA_DE_IDIOMAS, listaDatos.get(0).getIdiomas().trim()));
		carlos.attemptsTo(Click.on(AutomationRegisterPage.AREA_DE_TRABAJO));
		
		carlos.attemptsTo(SelectFromOptions.byVisibleText(listaDatos.get(0).getHabilidades()).from(AutomationRegisterPage.LISTA_DE_HABILIDADES));
		carlos.attemptsTo(SelectFromOptions.byVisibleText(listaDatos.get(0).getPais()).from(AutomationRegisterPage.LISTA_DE_PAISES));
		carlos.attemptsTo(SelectFromOptions.byVisibleText(listaDatos.get(0).getSeleccionar_pais()).from(AutomationRegisterPage.SELECCIONAR_PAIS));
		carlos.attemptsTo(SelectFromOptions.byVisibleText(listaDatos.get(0).getAno_cumpleanos()).from(AutomationRegisterPage.LISTA_DE_ANOS));
		carlos.attemptsTo(SelectFromOptions.byVisibleText(listaDatos.get(0).getMes_cumpleanos()).from(AutomationRegisterPage.LISTA_DE_MESES));
		carlos.attemptsTo(SelectFromOptions.byVisibleText(listaDatos.get(0).getDia_cumpleanos()).from(AutomationRegisterPage.LISTA_DE_DIAS));
		
		carlos.attemptsTo(Enter.theValue(listaDatos.get(0).getContrasena()).into(AutomationRegisterPage.CAMPO_CONTRASENA));
		carlos.attemptsTo(Enter.theValue(listaDatos.get(0).getConfirmar_contrasena()).into(AutomationRegisterPage.CAMPO_CONFIRMAR_CONTRASENA));
		
		carlos.attemptsTo(Click.on(AutomationRegisterPage.BOTON_REGISTRO));
		
	}

	public static Diligenciar ElFormularioDeRegistro(List<RegistroAutomationDemoSite> registroAutomationDemo) {
		return Tasks.instrumented(Diligenciar.class, registroAutomationDemo);
	}

}
