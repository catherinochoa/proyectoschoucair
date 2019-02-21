#language:es 
#Author: cochoar@choucairtesting.com


Característica: Comprar tiquetes
	Como persona
	Quiero comprar tiquetes para ir de vacaciones
	A través de la página web de Vivaair.com/co

	
@retotecnico
Esquema del escenario: Realizar compra de tiquetes
		Dado que un usuario quiere realizar una compra de tiquetes 
		Cuando él ingresa la información en la reserva 
		|	origen	|	destino	|	fecha_ida		|	fecha_regreso		|	adultos		|	ninos   |	infantes	| moneda	| 
		|<origen>	|<destino>|	<fecha_ida>	|	<fecha_regreso>	|	<adultos>	|	<ninos>	|	<infantes>| <moneda>| 
		Y ingresa los datos de las personas que viajan con él
		|	nombres_adulto		|	apellidos_adulto		| genero_adulto		|	documento_adulto		|	correo		|	celular		| nombres_nino1		|	apellidos_nino1		|	genero_nino1		|	documento_nino1		|	fecha_nacimiento_nino1	|  nombres_nino2	|	apellidos_nino2		|	genero_nino2		|	documento_nino2		|		fecha_nacimiento_nino2	| nombres_infante	| apellidos_infante	|	fecha_nacimiento_infante					|	viaja_con	|	servicios_adicionales	|
		|	<nombres_adulto>	|	<apellidos_adulto>	| <genero_adulto>	|	<documento_adulto>	|	<correo>	|	<celular>	| <nombres_nino1>	| <apellidos_nino1>	|	<genero_nino1>	| <documento_nino1>	|	<fecha_nacimiento_nino1>	| <nombres_nino2>	|	<apellidos_nino2>	|	<genero_nino2>	|	<documento_nino2>	|	<fecha_nacimiento_nino2>	|<nombres_infante>	| <apellidos_infante>	|	<fecha_nacimiento_infante>	|	<viaja_con>|	<servicios_adicionales>	|
		Entonces él verifica que no se generen Servicios adicionales USD 0.00
	
Ejemplos:
|	origen															|	destino				|	fecha_ida		|	fecha_regreso		|	adultos	|	ninos |	infantes	| moneda	|nombres_adulto		|	apellidos_adulto		| genero_adulto		|	documento_adulto		|	correo							|	celular		| nombres_nino1	|	apellidos_nino1	|	genero_nino1		|	documento_nino1	|	fecha_nacimiento_nino1	| nombres_nino2	|	apellidos_nino2	|	genero_nino2 |	documento_nino2	|	fecha_nacimiento_nino2	|	nombres_infante	| apellidos_infante	|	fecha_nacimiento_infante|	viaja_con	| servicios_adicionales	|	
|	Medellín, José María Córdova (MDE)	|	Pereira (PEI)	|	20/03/2019	|	15/05/2019	 		|	1				|	2			|	1	    		|	USD			| 			Susana		|						Torres		|			Femenino	 	|				1088000000		|	susana@hotmail.com	|3112000000	|  Juan					|		Rojas					|	Masculino				|	900009999				|   12/10/2010						|	Sarita				|	Lopez						|	Femenino		 |	50000222				|			12/10/2010					|	Felipe 					|		Lopez						|			18/12/2018					| Adulto 1	|	No gracias.						|

