#language:es
#Author: cochoar@choucairtesting.com


@EjerciciosSelenium
Característica: Ejercicios de automatización en Seleniumeasy

@SimpleFormDemo
Escenario: Seleccionar un día de la semana de la lista 
	
	Dado que ingreso al sitio web Seleniumeasy
	Y selecciono la opción select dropddown list 
	Cuando selecciono el día Monday	
	Entonces aparece un mensaje indicando que Monday ha sido seleccionado