package co.com.retounotips.screenplay.tasks;

import java.util.List;

import co.com.retounotips.screenplay.interactions.Esperar_5;
import co.com.retounotips.screenplay.interactions.SeleccionarLista;
import co.com.retounotips.screenplay.interactions.SeleccionarMenor;
import co.com.retounotips.screenplay.model.DatosReserva;
import co.com.retounotips.screenplay.userinterface.VivaAirPaginaPrincipal;
import co.com.retounotips.screenplay.userinterface.VivaAirPaginaReserva;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class Diligenciar implements Task {
	
	private List<DatosReserva> listaDatos;
			
	public Diligenciar(List<DatosReserva> listaDatos) {
		super();
		this.listaDatos = listaDatos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
		actor.attemptsTo(Scroll.to(VivaAirPaginaPrincipal.BOTON_RESERVAR),
				Click.on(VivaAirPaginaPrincipal.SELECCIONAR_ORIGEN),				
				SeleccionarLista.Desde(VivaAirPaginaPrincipal.LISTA_CIUDAD_ORIGEN, listaDatos.get(0).getOrigen().trim()),
				Enter.theValue(listaDatos.get(0).getFecha_ida()).into(VivaAirPaginaPrincipal.FECHA_IDA),
				Click.on(VivaAirPaginaPrincipal.SELECCIONAR_DESTINO),				
				SeleccionarLista.Desde(VivaAirPaginaPrincipal.LISTA_CIUDAD_DESTINO, listaDatos.get(0).getDestino().trim()),
				Enter.theValue(listaDatos.get(0).getFecha_regreso()).into(VivaAirPaginaPrincipal.FECHA_REGRESO),
				Click.on(VivaAirPaginaPrincipal.SELECCIONAR_ADULTOS),
				SeleccionarLista.Desde(VivaAirPaginaPrincipal.CANTIDAD_ADULTOS, listaDatos.get(0).getAdultos().trim()),
				Click.on(VivaAirPaginaPrincipal.SELECCIONAR_NINOS),
				SeleccionarLista.Desde(VivaAirPaginaPrincipal.CANTIDAD_NINOS, listaDatos.get(0).getNinos().trim()),
				Click.on(VivaAirPaginaPrincipal.SELECCIONAR_INFANTES),
				SeleccionarLista.Desde(VivaAirPaginaPrincipal.CANTIDAD_INFANTES, listaDatos.get(0).getInfantes().trim()),
				Click.on(VivaAirPaginaPrincipal.PRECIOS_MES),
				Click.on(VivaAirPaginaPrincipal.SELECCIONAR_MONEDA),
				SeleccionarLista.Desde(VivaAirPaginaPrincipal.TIPO_MONEDA, listaDatos.get(0).getMoneda().trim()),
				Click.on(VivaAirPaginaPrincipal.BOTON_RESERVAR),
				
				SeleccionarMenor.tarifa(VivaAirPaginaReserva.CALENDARIO_IDA),
				SeleccionarMenor.tarifa(VivaAirPaginaReserva.CALENDARIO_REGRESO),
				Click.on(VivaAirPaginaReserva.BOTON_CONTINUAR),	Esperar_5.aMoment(),
				Click.on(VivaAirPaginaReserva.SELECCIONAR_BASIC_IDA),
				Click.on(VivaAirPaginaReserva.SELECCIONAR_BASIC_REGRESO),
				Esperar_5.aMoment(), Click.on(VivaAirPaginaReserva.BOTON_ACEPTO));
		
	}

	public static Diligenciar Reserva(List<DatosReserva> datos) {
		return Tasks.instrumented(Diligenciar.class, datos);
	}

}



/*actor.attemptsTo(Check.whether(listaDatos.get(0).getPrecios_mes().trim().equals("Precios del mes"))
		.andIfSo(Click.on(VivaAirPaginaPrincipal.PRECIOS_MES))
		.otherwise(Click.on(VivaAirPaginaPrincipal.FECHAS_EXACTAS))				
		);
*/

		
/*carlos.attemptsTo(Click.on(AutomationRegisterPage.CAMPO_IDIOMAS));
carlos.attemptsTo(SeleccionarLista.Desde(AutomationRegisterPage.LISTA_DE_IDIOMAS, listaDatos.get(0).getIdiomas().trim()));
carlos.attemptsTo(Click.on(AutomationRegisterPage.AREA_DE_TRABAJO));

//actor.attemptsTo(WaitUntil.the(OrangePaginaAsistenteParaAgregarEmpleados.FORMULARIO_DETALLE_OTROS_EMPLEOS, isVisible()).forNoMoreThan(20).seconds());

carlos.attemptsTo(SelectFromOptions.byVisibleText(listaDatos.get(0).getHabilidades()).from(AutomationRegisterPage.LISTA_DE_HABILIDADES));
carlos.attemptsTo(SelectFromOptions.byVisibleText(listaDatos.get(0).getPais()).from(AutomationRegisterPage.LISTA_DE_PAISES));
carlos.attemptsTo(SelectFromOptions.byVisibleText(listaDatos.get(0).getSeleccionar_pais()).from(AutomationRegisterPage.SELECCIONAR_PAIS));
carlos.attemptsTo(SelectFromOptions.byVisibleText(listaDatos.get(0).getAno_cumpleanos()).from(AutomationRegisterPage.LISTA_DE_ANOS));
carlos.attemptsTo(SelectFromOptions.byVisibleText(listaDatos.get(0).getMes_cumpleanos()).from(AutomationRegisterPage.LISTA_DE_MESES));
carlos.attemptsTo(SelectFromOptions.byVisibleText(listaDatos.get(0).getDia_cumpleanos()).from(AutomationRegisterPage.LISTA_DE_DIAS));


carlos.attemptsTo(Click.on(AutomationRegisterPage.BOTON_REGISTRO));*/
