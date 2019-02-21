package co.com.proyectobase.screenplay.tasks;

import static co.com.proyectobase.screenplay.userinterface.PaginaReserva.*;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import co.com.proyectobase.screenplay.interactions.SeleccionarLista;
import co.com.proyectobase.screenplay.interactions.Wait_3;
import co.com.proyectobase.screenplay.model.Data;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.type.Type;

public class IngresarDatosSolicitados implements Task {

	private List<Data>data;
    public IngresarDatosSolicitados(List<Data> data) {
                   this.data = data;
    }
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
		
		actor.attemptsTo(Enter.theValue(data.get(0).getNombreAdulto1()).into(NOMBRE_ADULTO_1),
						 Enter.theValue(data.get(0).getApellidoAdulto1()).into(APELLIDO_ADULTO_1),
						 Click.on(GENERO_ADULTO_1),
						 SeleccionarLista.Desde(LISTA, data.get(0).getGeneroAdulto1().trim()),
						 Enter.theValue(data.get(0).getDocumentoAdulto1()).into(DOCUMENTO_ADULTO_1),
						 Enter.theValue(data.get(0).getCorreo()).into(CORREO),
						 Enter.theValue(data.get(0).getConfCorreo()).into(CONFIRMAR_CORREO),
						 Enter.theValue(data.get(0).getCelular()).into(CELULAR),
						 
						 Enter.theValue(data.get(0).getNombreAdulto2()).into(NOMBRE_ADULTO_2),
						 Enter.theValue(data.get(0).getApellidoAdulto2()).into(APELLIDO_ADULTO_2),
						 Click.on(GENERO_ADULTO_2),
						 SeleccionarLista.Desde(LISTA, data.get(0).getGeneroAdulto2().trim()),
						 Enter.theValue(data.get(0).getDocumentoAdulto2()).into(DOCUMENTO_ADULTO_2),
		
						 Enter.theValue(data.get(0).getNombreNino()).into(NOMBRE_NINO),
						 Enter.theValue(data.get(0).getApellidoNino()).into(APELLIDO_NINO),
						 Type.theValue(data.get(0).getFechaNino()).into(FECHA_NINO),
						 Click.on(GENERO_NINO),
						 SeleccionarLista.Desde(LISTA, data.get(0).getGeneroNino().trim()),
						 Enter.theValue(data.get(0).getDocumentoNino()).into(DOCUMENTO_NINO),
		
						 Enter.theValue(data.get(0).getNombreInfante()).into(NOMBRE_INFANTE),
						 Enter.theValue(data.get(0).getApellidoInfante()).into(APELLIDO_INFANTE),
						 Type.theValue(data.get(0).getFechaInfante()).into(FECHA_INFANTE),
						 Click.on(VIAJANDO_CON),
						 SeleccionarLista.Desde(LISTA, data.get(0).getViajandoCon().trim()),
		
						 Click.on(BOTON_CONTINUAR_2),
						 Wait_3.aMoment(),
		
		//Cabina
						 Scroll.to(CABINA_ADULTO_1),
						 Click.on(CABINA_ADULTO_1),
						 SeleccionarLista.Desde(LISTA, data.get(0).getNoGracias().trim()),
						 Click.on(CABINA_ADULTO_2),
						 SeleccionarLista.Desde(LISTA, data.get(0).getNoGracias().trim()),
						 Click.on(CABINA_NINO),
						 SeleccionarLista.Desde(LISTA, data.get(0).getNoGracias().trim()),
		
		//Bodega
						 Scroll.to(EQUIPAJE_ADICIONAL1_ADULTO_1),
						 Click.on(EQUIPAJE_ADICIONAL1_ADULTO_1),
						 SeleccionarLista.Desde(LISTA, data.get(0).getNoGracias().trim()),
						 Click.on(EQUIPAJE_ADICIONAL1_ADULTO_2),
						 SeleccionarLista.Desde(LISTA, data.get(0).getNoGracias().trim()),
						 Click.on(EQUIPAJE_ADICIONAL1_NINO),
						 SeleccionarLista.Desde(LISTA, data.get(0).getNoGracias().trim()),
		
		//Check-in
						 Scroll.to(CHECKIN_ADULTO_1),
						 Click.on(CHECKIN_ADULTO_1),
						 SeleccionarLista.Desde(LISTA, data.get(0).getNoGracias().trim()),
						 Click.on(CHECKIN_ADULTO_2),
						 SeleccionarLista.Desde(LISTA, data.get(0).getNoGracias().trim()),
						 Click.on(CHECKIN_NINO),
						 SeleccionarLista.Desde(LISTA, data.get(0).getNoGracias().trim()),
		
		//Fila rapida
						 Scroll.to(FILA_RAPIDA),
						 Click.on(FILA_RAPIDA),
						 SeleccionarLista.Desde(LISTA, data.get(0).getNoGracias().trim()),
		
		//Cancela tranquilo
						 Scroll.to(CANCELA));
		if (driver.findElements(By.xpath("//span[@id='select2-chosen-122'][contains (text(),'No gracias.')]")) == null) {
			actor.attemptsTo(Click.on(CANCELA),
							 SeleccionarLista.Desde(LISTA, data.get(0).getNoGracias().trim()));
		}
		
		//Equipaje especial
	
		actor.attemptsTo(Scroll.to(EQUIPAJE_ESPECIAL_ADULTO_1));
		if (driver.findElements(By.xpath("//span[@id='select2-chosen-124'][contains (text(),'No gracias.')]")) == null) {
				actor.attemptsTo(Click.on(EQUIPAJE_ESPECIAL_ADULTO_1),
							     SeleccionarLista.Desde(LISTA, data.get(0).getNoGracias().trim()));
		}
		if (driver.findElements(By.xpath("//span[@id='select2-chosen-130'][contains (text(),'No gracias.')]")) == null) {
			actor.attemptsTo(Click.on(EQUIPAJE_ESPECIAL_ADULTO_2),
						     SeleccionarLista.Desde(LISTA, data.get(0).getNoGracias().trim()));
		}
		if (driver.findElements(By.xpath("//span[@id='select2-chosen-136'][contains (text(),'No gracias.')]")) == null) {
			actor.attemptsTo(Click.on(EQUIPAJE_ESPECIAL_NINO),
							 SeleccionarLista.Desde(LISTA, data.get(0).getNoGracias().trim()));
		}
		
		//Seguro de viaje
		actor.attemptsTo(Scroll.to(SEGURO_VIAJE),
						 Click.on(SEGURO_VIAJE),
		
						 Click.on(BOTON_CONTINUAR_3),
						 Wait_3.aMoment(),
		
						 Click.on(BOTON_NO_SELECCIONAR_ASIENTO),
						 Wait_3.aMoment(),
		
						 Scroll.to(SERVICIOS_ADICIONALES));
	}
	
	public static IngresarDatosSolicitados EnLaPaginaReserva(List<Data> data) {
		return instrumented(IngresarDatosSolicitados.class, data);
		}
}
