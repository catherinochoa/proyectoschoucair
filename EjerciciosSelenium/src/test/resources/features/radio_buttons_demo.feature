#language:es
#Author: cochoar@choucairtesting.com


@EjerciciosSelenium
Característica: Ejercicios de automatización en Seleniumeasy

@SimpleFormDemo
Escenario: Seleccionar el radio button de género femenino
	
	Dado que ingreso al sitio web Seleniumeasy
	Y selecciono la opción Radio Buttons Demo
	Cuando doy click en el radio button femenino	
	Entonces muestra un mensaje indicando que Female ha sido seleccionado
