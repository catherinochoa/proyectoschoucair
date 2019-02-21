package co.com.retotres.screenplay.tasks;

import java.util.List;

import co.com.retotres.screenplay.model.DatosAdministracionHospitales;
import co.com.retotres.screenplay.userinterface.AdministracionDeHospitalesAgregarCita;
import co.com.retotres.screenplay.userinterface.AdministracionDeHospitalesPaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AgregarCita implements Task {
	
	private List<DatosAdministracionHospitales> datos;

	public AgregarCita(List<DatosAdministracionHospitales> datos) {
		super();
		this.datos = datos;
	}
	
	@Override
	public <T extends Actor> void performAs(T carlos) {
		
		carlos.attemptsTo(Click.on(AdministracionDeHospitalesPaginaPrincipal.OPCION_AGREGAR_CITA));
	
		carlos.attemptsTo(Enter.theValue(datos.get(0).getFecha_cita()).into(AdministracionDeHospitalesAgregarCita.FECHA_CITA));
		carlos.attemptsTo(Click.on(AdministracionDeHospitalesAgregarCita.CAMPO_OBSERVACIONES));
		
		carlos.attemptsTo(Enter.theValue(datos.get(0).getDocumento_paciente()).into(AdministracionDeHospitalesAgregarCita.DOCUMENTO_PACIENTE));
		carlos.attemptsTo(Enter.theValue(datos.get(0).getDocumento_doctor()).into(AdministracionDeHospitalesAgregarCita.DOCUMENTO_DOCTOR));
		carlos.attemptsTo(Enter.theValue(datos.get(0).getObservaciones()).into(AdministracionDeHospitalesAgregarCita.CAMPO_OBSERVACIONES));
		
		carlos.attemptsTo(Click.on(AdministracionDeHospitalesAgregarCita.BOTON_GUARDAR));
		
	}

	public static AgregarCita Correctamente(List<DatosAdministracionHospitales> registroPaciente) {
		return Tasks.instrumented(AgregarCita.class, registroPaciente);
	}

}
