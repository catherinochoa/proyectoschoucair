package co.com.colorlib.screenplay.tasks;

import java.util.List;

import co.com.colorlib.screenplay.model.Datos;
import co.com.colorlib.screenplay.userinterface.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Acceder implements Task {
	
private List<Datos> listaDatos;
	
	public Acceder(List<Datos> listaDatos) {
		super();
		this.listaDatos = listaDatos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(listaDatos.get(0).getUsuario()).into(PaginaPrincipal.CAMPO_USUARIO),
						Enter.theValue(listaDatos.get(0).getClave()).into(PaginaPrincipal.CAMPO_CLAVE),
						Click.on(PaginaPrincipal.BOTON_INGRESAR));
		
	}
	
	public static Acceder AlSitio(List<Datos> datos) {		
		return Tasks.instrumented(Acceder.class, datos);
	}

}
