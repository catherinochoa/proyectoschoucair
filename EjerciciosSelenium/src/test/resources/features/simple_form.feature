#language:es
#Author: cochoar@choucairtesting.com


@EjerciciosSelenium
Característica: Ejercicios de automatización en Seleniumeasy

@SimpleFormDemo
Escenario: Ingresar una palabra en el textbox y verificarla en el mensaje
	
	Dado que ingreso al sitio web Seleniumeasy
	Y selecciono la opción Simple Form Demo
	Cuando ingreso el mensaje
	|	mensaje		| 
	| Selenium	|	
	Entonces muestra el mensaje correcto Selenium 
	
@TwoInputFields
Escenario: Ingresaar dos números enteros y sumarlos

	Dado que ingreso al sitio web Seleniumeasy
	Y selecciono la opción Simple Form Demo
	Cuando ingreso dos números enteros
	| numero1	|	numero2	|
	|		5			|		5			|
	Entonces muestra el resultado de la suma es 10




