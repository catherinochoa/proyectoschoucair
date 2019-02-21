#language:es
#Author: cochoar@choucairtesting.com

Característica: Gestionar cita médica
	Como paciente
	Quiero realizar la solicitud de una cita médica
	A través del sistema de Administración de Hospitales

@escenario1
Escenario: Realizar el Registro de un Doctor
	Dado que Carlos necesita registrar un nuevo Doctor
	Cuando el realiza el registro del doctor en el aplicativo de Administración de Hospitales
	|	nombre	|	apellido	|	telefono	|	tipo_documento				|	documento	|
	|	Juan		|	Lopez			|	31111111	|	Cédula de ciudadanía	| 23456987	|
	Entonces el verifica que se presente en pantalla el mensaje Datos guardados correctamente.
	
	
@escenario2
Escenario: Realizar el Registro de un Paciente
	Dado que Carlos necesita registrar un nuevo Paciente
	Cuando el realiza el registro del paciente en el aplicativo de Administración de Hospitales
	|	nombre	|	apellido	|	telefono	|	tipo_documento				|	documento	|
	|	Santiago	|	Lopez			|	31111111	|	Cédula de ciudadanía	| 13456789	|	
	Entonces el verifica en pantalla que el paciente es creado con el mensaje Datos guardados correctamente.	
	

@escenario3
Escenario: Realizar el agendamiento de una cita 
	Dado que Carlos necesita asistir al medico
	Cuando el realiza el agendamiento de una Cita
	| fecha_cita	|	documento_paciente	|	documento_doctor	|	observaciones	|
	|	02/08/2019	|	13456789						|		23456987				|	cita general	|
	Entonces el verifica en pantalla que la cita es agendada con el mensaje Datos guardados correctamente.
