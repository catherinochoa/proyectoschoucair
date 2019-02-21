package co.com.retotres.screenplay.questions;

import co.com.retotres.screenplay.userinterface.AdministracionDeHospitalesAgregarPaciente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class DatosPacienteGuardados implements Question<String> {

	@Override
	public String answeredBy(Actor carlos) {
		return Text.of(AdministracionDeHospitalesAgregarPaciente.MENSAJE_EXITOSO).viewedBy(carlos).asString();
	}
	
	public static DatosPacienteGuardados Correctamente() {
		return new DatosPacienteGuardados();
	}
	
}
