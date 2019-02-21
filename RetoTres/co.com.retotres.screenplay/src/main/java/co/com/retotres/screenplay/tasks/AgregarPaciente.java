package co.com.retotres.screenplay.tasks;

import java.util.List;

import co.com.retotres.screenplay.model.DatosAdministracionHospitales;
import co.com.retotres.screenplay.userinterface.AdministracionDeHospitalesAgregarPaciente;
import co.com.retotres.screenplay.userinterface.AdministracionDeHospitalesPaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AgregarPaciente implements Task{
	
	private List<DatosAdministracionHospitales> datos;

	public AgregarPaciente(List<DatosAdministracionHospitales> datos) {
		super();
		this.datos = datos;
	}
	
	@Override
	public <T extends Actor> void performAs(T carlos) {
		
		carlos.attemptsTo(Click.on(AdministracionDeHospitalesPaginaPrincipal.OPCION_AGREGAR_PACIENTE));
	
		carlos.attemptsTo(Enter.theValue(datos.get(0).getNombre()).into(AdministracionDeHospitalesAgregarPaciente.CAMPO_NOMBRE));
		carlos.attemptsTo(Enter.theValue(datos.get(0).getApellido()).into(AdministracionDeHospitalesAgregarPaciente.CAMPO_APELLIDO));
		carlos.attemptsTo(Enter.theValue(datos.get(0).getTelefono()).into(AdministracionDeHospitalesAgregarPaciente.CAMPO_TELEFONO));
		carlos.attemptsTo(Click.on(AdministracionDeHospitalesAgregarPaciente.SELECCIONAR_TIPO_DOCUMENTO));
		carlos.attemptsTo(Click.on(AdministracionDeHospitalesAgregarPaciente.SELECCIONAR_OPCION_CEDULA));
		carlos.attemptsTo(Enter.theValue(datos.get(0).getDocumento()).into(AdministracionDeHospitalesAgregarPaciente.CAMPO_DOCUMENTO));
		
		carlos.attemptsTo(Click.on(AdministracionDeHospitalesAgregarPaciente.CHECKBOX_SALUD_PREPAGADA));
		
		carlos.attemptsTo(Click.on(AdministracionDeHospitalesAgregarPaciente.BOTON_GUARDAR));
		
		
	}

	public static AgregarPaciente Correctamente(List<DatosAdministracionHospitales> registroPaciente) {
		return Tasks.instrumented(AgregarPaciente.class, registroPaciente);
	}
}
