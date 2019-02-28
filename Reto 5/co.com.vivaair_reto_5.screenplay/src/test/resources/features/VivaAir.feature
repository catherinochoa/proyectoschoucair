#language: es
#Author: avillam@choucairtesting.com

@Resgresion
Característica: Comprar tiquetes aereos
Como usuario
Quiero comprar tiquetes para ir de vacaciones
A traves de la pagina web de Vivaair.com/co

@Test
Escenario: Comprar tiquetes para 1 adulto, 2 niños y 1 infante
Dado que Juan desea comprar tiquetes aereos
Cuando el ingresa sus preferencias 
|viajeDe			|origen														 |destino			|adultos|niños|infantes|fechaIda  |fechaRegreso|preciosPor		 |moneda|
|Ida					|Medellín, José María Córdova (MDE)|Bogotá (BOG)|2			|1		|1			 |28/02/2019|28/02/2019  |Precios del mes|USD   |
Y el escoge los tiquetes de menor precio 
Y ingresa todos los datos solicitados
|nombreAdulto1|apellidoAdulto1|generoAdulto1|documentoAdulto1|correo		|confCorreo|celular   |nombreAdulto2|apellidoAdulto2|generoAdulto2|documentoAdulto2|nombreNino|apellidoNino|fechaNino |generoNino|documentoNino|nombreInfante|apellidoInfante|fechaInfante|viajandoCon|noGracias	|
|Roberto		  |Arias          |Masculino 	  |1152203458      |rob@ct.com|rob@ct.com|3165898796|Daniela  	  |Alzate					|Femenino   	|1214725496    	 |Carlos	  |Arias			 |12/10/2010|Masculino |1568745693	 |Andres       |Arias   			 |18/12/2018  |Adulto 2		|No gracias.|
Entonces verifica que los servicios adicionales no tengan ningun costo



