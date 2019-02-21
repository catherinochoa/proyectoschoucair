package co.com.retotres.screenplay.tasks;

import java.util.List;

import co.com.retotres.screenplay.model.DatosAdministracionHospitales;
import co.com.retotres.screenplay.userinterface.AdministracionDeHospitalesAgregarDoctor;
import co.com.retotres.screenplay.userinterface.AdministracionDeHospitalesPaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AgregarDoctor implements Task {
	
	private List<DatosAdministracionHospitales> datos;

	public AgregarDoctor(List<DatosAdministracionHospitales> datos) {
		super();
		this.datos = datos;
	}


	@Override
	public <T extends Actor> void performAs(T carlos) {
		
		carlos.attemptsTo(Click.on(AdministracionDeHospitalesPaginaPrincipal.OPCION_AGREGAR_DOCTOR));
	
		carlos.attemptsTo(Enter.theValue(datos.get(0).getNombre()).into(AdministracionDeHospitalesAgregarDoctor.CAMPO_NOMBRE));
		carlos.attemptsTo(Enter.theValue(datos.get(0).getApellido()).into(AdministracionDeHospitalesAgregarDoctor.CAMPO_APELLIDO));
		carlos.attemptsTo(Enter.theValue(datos.get(0).getTelefono()).into(AdministracionDeHospitalesAgregarDoctor.CAMPO_TELEFONO));
		carlos.attemptsTo(Click.on(AdministracionDeHospitalesAgregarDoctor.SELECCIONAR_TIPO_DOCUMENTO));
		carlos.attemptsTo(Click.on(AdministracionDeHospitalesAgregarDoctor.SELECCIONAR_OPCION_CEDULA));
		carlos.attemptsTo(Enter.theValue(datos.get(0).getDocumento()).into(AdministracionDeHospitalesAgregarDoctor.CAMPO_DOCUMENTO));
			
		carlos.attemptsTo(Click.on(AdministracionDeHospitalesAgregarDoctor.BOTON_GUARDAR));
		
	}
	
	
	public static AgregarDoctor Correctamente(List<DatosAdministracionHospitales> registroDoctor) {
		return Tasks.instrumented(AgregarDoctor.class, registroDoctor);
	}
	
}
