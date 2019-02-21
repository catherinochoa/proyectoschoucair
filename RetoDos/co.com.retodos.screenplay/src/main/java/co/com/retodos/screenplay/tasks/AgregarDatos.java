package co.com.retodos.screenplay.tasks;

import java.util.List;
import co.com.retodos.screenplay.interactions.Esperar_5;
import co.com.retodos.screenplay.model.RegistroEmpleadoOrange;
import co.com.retodos.screenplay.userinterface.OrangeListaEmpleados;
import co.com.retodos.screenplay.userinterface.OrangePaginaAsistenteParaAgregarEmpleados;
import co.com.retodos.screenplay.userinterface.OrangePaginaDetallesPersonales;
import co.com.retodos.screenplay.userinterface.OrangePaginaPrincipal;
import co.com.retodos.screenplay.userinterface.OrangeVentanaAgregarEmpleado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarDatos implements Task {

	private List<RegistroEmpleadoOrange> listaDatos;

	
	public AgregarDatos(List<RegistroEmpleadoOrange> listaDatos) {
		super();
		this.listaDatos = listaDatos;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(OrangePaginaPrincipal.MENU_PIM));
		actor.attemptsTo(Click.on(OrangePaginaPrincipal.OPCION_AGREGAR_EMPLEADO));
		
		actor.attemptsTo(Esperar_5.aMoment());
		
		actor.attemptsTo(Enter.theValue(listaDatos.get(0).getPrimer_nombre()).into(OrangeVentanaAgregarEmpleado.CAMPO_PRIMER_NOMBRE));
		actor.attemptsTo(Enter.theValue(listaDatos.get(0).getSegundo_nombre()).into(OrangeVentanaAgregarEmpleado.CAMPO_SEGUNDO_NOMBRE));
		actor.attemptsTo(Enter.theValue(listaDatos.get(0).getApellido()).into(OrangeVentanaAgregarEmpleado.CAMPO_APELLIDO));
		
		actor.attemptsTo(Click.on(OrangeVentanaAgregarEmpleado.SELECCIONAR_LOCALIDAD));
		actor.attemptsTo(Click.on("//span[contains(text(),'" +listaDatos.get(0).getLocalidad()+ "')]"));
		
		actor.attemptsTo(Click.on(OrangeVentanaAgregarEmpleado.BOTON_SIGUIENTE_AGREGAR_EMPLEADO));
		actor.attemptsTo(WaitUntil.the(OrangePaginaAsistenteParaAgregarEmpleados.FORMULARIO_DATOS_PERSONALES, isVisible()).forNoMoreThan(20).seconds());
		
		actor.attemptsTo(Click.on(OrangePaginaAsistenteParaAgregarEmpleados.BOTON_SIGUIENTE_PASO1));
		actor.attemptsTo(WaitUntil.the(OrangePaginaAsistenteParaAgregarEmpleados.FORMULARIO_DATOS_EMPLEO, isVisible()).forNoMoreThan(20).seconds());
		
		actor.attemptsTo(Click.on(OrangePaginaAsistenteParaAgregarEmpleados.BOTON_SIGUIENTE_PASO2));
		actor.attemptsTo(WaitUntil.the(OrangePaginaAsistenteParaAgregarEmpleados.FORMULARIO_DETALLE_OTROS_EMPLEOS, isVisible()).forNoMoreThan(20).seconds());
		
		actor.attemptsTo(Click.on(OrangePaginaAsistenteParaAgregarEmpleados.SELECCIONAR_REGION));
		actor.attemptsTo(Click.on("//span[contains(text(),'" +listaDatos.get(0).getRegion()+ "')]"));
		
		actor.attemptsTo(Click.on(OrangePaginaAsistenteParaAgregarEmpleados.SELECCIONAR_FTE));
		actor.attemptsTo(Click.on("//span[contains(text(),'" +listaDatos.get(0).getFte()+ "')]"));
		
		actor.attemptsTo(Click.on(OrangePaginaAsistenteParaAgregarEmpleados.SELECCIONAR_DEPARTAMENTO_TEMPORAL));
		actor.attemptsTo(Click.on("//span[contains(text(),'" +listaDatos.get(0).getDepartamento_temporal()+ "')]"));
		
		actor.attemptsTo(Click.on(OrangePaginaAsistenteParaAgregarEmpleados.BOTON_SIGUIENTE_PASO3));
		actor.attemptsTo(WaitUntil.the(OrangePaginaAsistenteParaAgregarEmpleados.FORMULARIO_DETALLES_DE_CONTACTO, isVisible()).forNoMoreThan(20).seconds());
		
		actor.attemptsTo(Click.on(OrangePaginaAsistenteParaAgregarEmpleados.BOTON_SIGUIENTE_PASO4));
		actor.attemptsTo(WaitUntil.the(OrangePaginaAsistenteParaAgregarEmpleados.FORMULARIO_SUPERVISORES, isVisible()).forNoMoreThan(20).seconds());
		
		actor.attemptsTo(Click.on(OrangePaginaAsistenteParaAgregarEmpleados.BOTON_SIGUIENTE_PASO5));
		actor.attemptsTo(WaitUntil.the(OrangePaginaAsistenteParaAgregarEmpleados.FORMULARIO_SUBORDINADOS, isVisible()).forNoMoreThan(20).seconds());
		
		actor.attemptsTo(Click.on(OrangePaginaAsistenteParaAgregarEmpleados.BOTON_GUARDAR));
		actor.attemptsTo(WaitUntil.the(OrangePaginaDetallesPersonales.FORMULARIO_DETALLES_PERSONALES, isVisible()).forNoMoreThan(20).seconds());
		
		actor.attemptsTo(Click.on(OrangePaginaDetallesPersonales.SELECCIONAR_GRUPO_SANGUINEO));
		actor.attemptsTo(Click.on("//span[contains(text(),'" +listaDatos.get(0).getTipo_sangre()+ "')]"));
		
		actor.attemptsTo(Enter.theValue(listaDatos.get(0).getActividades()).into(OrangePaginaDetallesPersonales.CAMPO_ACTIVIDADES));
		actor.attemptsTo(Click.on(OrangePaginaDetallesPersonales.BOTON_GUARDAR));
		actor.attemptsTo(Esperar_5.aMoment());
		
		actor.attemptsTo(Click.on(OrangePaginaPrincipal.OPCION_LISTAR_EMPLEADOS));
		actor.attemptsTo(Click.on(OrangeListaEmpleados.CAMPO_BUSCAR));
		actor.attemptsTo(Enter.theValue(listaDatos.get(0).getNombre_completo()).into(OrangeListaEmpleados.CAMPO_BUSCAR));
		actor.attemptsTo(Click.on(OrangeListaEmpleados.BOTON_BUSCAR));
		
		actor.attemptsTo(Esperar_5.aMoment());
		
	}

	public static AgregarDatos Empleado(List<RegistroEmpleadoOrange> registroEmpleadoOrange) {
		return Tasks.instrumented(AgregarDatos.class, registroEmpleadoOrange);
	}
	
}
