package co.com.retotres.screenplay.model;

public class DatosAdministracionHospitales {

	private String nombre;
	private String apellido;
	private String telefono;
	private String tipo_documento;
	private String documento;
	private String fecha_cita;
	private String documento_paciente;
	private String documento_doctor;
	private String observaciones;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTipo_documento() {
		return tipo_documento;
	}
	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getFecha_cita() {
		return fecha_cita;
	}
	public void setFecha_cita(String fecha_cita) {
		this.fecha_cita = fecha_cita;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getDocumento_paciente() {
		return documento_paciente;
	}
	public void setDocumento_paciente(String documento_paciente) {
		this.documento_paciente = documento_paciente;
	}
	public String getDocumento_doctor() {
		return documento_doctor;
	}
	public void setDocumento_doctor(String documento_doctor) {
		this.documento_doctor = documento_doctor;
	}
		
}
