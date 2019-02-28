package co.com.proyectobase.screenplay.tasks;
import static co.com.proyectobase.screenplay.userinterface.PaginaPrincipal.*;
import java.util.List;
import co.com.proyectobase.screenplay.interactions.SeleccionarLista;
import co.com.proyectobase.screenplay.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;

public class ReservarVuelo implements Task {

	private List<Data>data;
    public ReservarVuelo(List<Data> data) {
                   this.data = data;
    }
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Scroll.to(IDA),
						 Check.whether(data.get(0).getViajeDe().toString().trim().equals("Ida")).
						 	andIfSo(Click.on(IDA)).
						 	otherwise(Click.on(IDA_REGRESO)),
						 Click.on(CIUDAD_ORIGEN),
						 SeleccionarLista.Desde(LISTA, data.get(0).getOrigen().trim()),
						 Enter.theValue(data.get(0).getFechaIda()).into(FECHA_IDA),
						 Click.on(CIUDAD_DESTINO),
						 SeleccionarLista.Desde(LISTA, data.get(0).getDestino().trim()),
						 Check.whether(data.get(0).getPreciosPor().toString().trim().equals("Precios del mes")).
						 	andIfSo(Click.on(PRECIOS_MES)).
						 	otherwise(Click.on(FECHAS_EXACTAS)),
						 Click.on(MONEDA),
						 SeleccionarLista.Desde(LISTA, data.get(0).getMoneda().trim()),
						 Click.on(ADULTOS),
						 SeleccionarLista.Desde(LISTA, data.get(0).getAdultos().trim()),
						 Click.on(NIÑOS),
						 SeleccionarLista.Desde(LISTA, data.get(0).getNiños().trim()),
						 Click.on(INFANTES),
						 SeleccionarLista.Desde(LISTA, data.get(0).getInfantes().trim()),
						 Click.on(BOTON_RESERVAR));	
	}
	
	public static ReservarVuelo EnLaPaginaPrincipal(List<Data> data) {
		return instrumented(ReservarVuelo.class, data);
	}
}
