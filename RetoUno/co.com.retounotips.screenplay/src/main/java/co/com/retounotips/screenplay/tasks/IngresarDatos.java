package co.com.retounotips.screenplay.tasks;

import java.util.List;

import co.com.retounotips.screenplay.interactions.Esperar_5;
import co.com.retounotips.screenplay.interactions.SeleccionarLista;
import co.com.retounotips.screenplay.model.DatosReserva;
import co.com.retounotips.screenplay.userinterface.VivaAirInformacionReserva;
import co.com.retounotips.screenplay.userinterface.VivaAirServiciosAdicionales;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class IngresarDatos implements Task{

	private List<DatosReserva> listaDatos;
	
	public IngresarDatos(List<DatosReserva> listaDatos) {
		super();
		this.listaDatos = listaDatos;
	}

	
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Enter.theValue(listaDatos.get(0).getNombres_adulto()).into(VivaAirInformacionReserva.NOMBRES_ADULTO),
				Enter.theValue(listaDatos.get(0).getApellidos_adulto()).into(VivaAirInformacionReserva.APELLIDOS_ADULTO),
				Click.on(VivaAirInformacionReserva.SELECCIONAR_GENERO_ADULTO),
				SeleccionarLista.Desde(VivaAirInformacionReserva.LISTA_GENERO_ADULTO, listaDatos.get(0).getGenero_adulto().trim()),
				Enter.theValue(listaDatos.get(0).getDocumento_adulto()).into(VivaAirInformacionReserva.DOCUMENTO_ADULTO),
				Enter.theValue(listaDatos.get(0).getCorreo()).into(VivaAirInformacionReserva.CORREO_ADULTO),
				Enter.theValue(listaDatos.get(0).getCorreo()).into(VivaAirInformacionReserva.CONFIRMAR_CORREO_ADULTO),
				Enter.theValue(listaDatos.get(0).getCelular()).into(VivaAirInformacionReserva.CELULAR_ADULTO),
				
				Enter.theValue(listaDatos.get(0).getNombres_nino1()).into(VivaAirInformacionReserva.NOMBRES_NINO1),
				Enter.theValue(listaDatos.get(0).getApellidos_nino1()).into(VivaAirInformacionReserva.APELLIDOS_NINO1),	
				Type.theValue(listaDatos.get(0).getFecha_nacimiento_nino1()).into(VivaAirInformacionReserva.FECHA_NACIMIENTO_NINO1),				
				Click.on(VivaAirInformacionReserva.SELECCIONAR_GENERO_NINO1),
				SeleccionarLista.Desde(VivaAirInformacionReserva.LISTA_GENERO_NINO1, listaDatos.get(0).getGenero_nino1().trim()),
				Enter.theValue(listaDatos.get(0).getDocumento_nino1()).into(VivaAirInformacionReserva.DOCUMENTO_NINO1),
			
				Enter.theValue(listaDatos.get(0).getNombres_nino2()).into(VivaAirInformacionReserva.NOMBRES_NINO2),
				Enter.theValue(listaDatos.get(0).getApellidos_nino2()).into(VivaAirInformacionReserva.APELLIDOS_NINO2),	
				Type.theValue(listaDatos.get(0).getFecha_nacimiento_nino2()).into(VivaAirInformacionReserva.FECHA_NACIMIENTO_NINO2),
				Click.on(VivaAirInformacionReserva.SELECCIONAR_GENERO_NINO2),
				SeleccionarLista.Desde(VivaAirInformacionReserva.LISTA_GENERO_NINO2, listaDatos.get(0).getGenero_nino2().trim()),
				Enter.theValue(listaDatos.get(0).getDocumento_nino2()).into(VivaAirInformacionReserva.DOCUMENTO_NINO2),
			
				Enter.theValue(listaDatos.get(0).getNombres_infante()).into(VivaAirInformacionReserva.NOMBRES_INFANTE),
				Enter.theValue(listaDatos.get(0).getApellidos_infante()).into(VivaAirInformacionReserva.APELLIDOS_INFANTE),				
				Type.theValue(listaDatos.get(0).getFecha_nacimiento_infante()).into(VivaAirInformacionReserva.FECHA_NACIMIENTO_INFANTE),
				
				Click.on(VivaAirInformacionReserva.VIAJA_CON),
				SeleccionarLista.Desde(VivaAirInformacionReserva.SELECCIONAR_VIAJA_CON, listaDatos.get(0).getViaja_con().trim()),
				Click.on(VivaAirInformacionReserva.BOTON_CONTINUAR),
				
				Esperar_5.aMoment(),
				Click.on(VivaAirServiciosAdicionales.EQUIPAJE_EN_CABINA1),		
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.SELECCIONAR_EQUIPAJE_EN_CABINA, listaDatos.get(0).getServicios_adicionales().trim())
				
	/*			Click.on(VivaAirServiciosAdicionales.EQUIPAJE_EN_CABINA2),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_EQUIPAJE, listaDatos.get(0).getServicios_adicionales().trim()),
				Click.on(VivaAirServiciosAdicionales.EQUIPAJE_EN_CABINA3),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_EQUIPAJE, listaDatos.get(0).getServicios_adicionales().trim()),
				
				Click.on(VivaAirServiciosAdicionales.EQUIPAJE_EN_BODEGA1),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_EQUIPAJE, listaDatos.get(0).getServicios_adicionales().trim()),
				Click.on(VivaAirServiciosAdicionales.EQUIPAJE_EN_BODEGA2),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_EQUIPAJE, listaDatos.get(0).getServicios_adicionales().trim()),
				Click.on(VivaAirServiciosAdicionales.EQUIPAJE_EN_BODEGA3),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_EQUIPAJE, listaDatos.get(0).getServicios_adicionales().trim()),
				
				Click.on(VivaAirServiciosAdicionales.CHECKIN1),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_EQUIPAJE, listaDatos.get(0).getServicios_adicionales().trim()),
				Click.on(VivaAirServiciosAdicionales.CHECKIN2),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_EQUIPAJE, listaDatos.get(0).getServicios_adicionales().trim()),
				Click.on(VivaAirServiciosAdicionales.CHECKIN3),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_EQUIPAJE, listaDatos.get(0).getServicios_adicionales().trim()),
				
				Click.on(VivaAirServiciosAdicionales.FILA_RAPIDA),
				SeleccionarLista.Desde(VivaAirServiciosAdicionales.LISTA_EQUIPAJE, listaDatos.get(0).getServicios_adicionales().trim())
*/
				
				);
				
		
		
	/*try {
        Thread.sleep(10000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }*/
	
	}

	public static IngresarDatos Acompanantes(List<DatosReserva> datos_acompanantes) {
		return Tasks.instrumented(IngresarDatos.class, datos_acompanantes);
	}

}
