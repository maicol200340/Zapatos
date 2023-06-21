Algoritmo TiendaZapatos
	Definir nombre, zapato, marca Como Cadena; Dimensionar zapato(5), marca(5)
	Definir precio, stock Como Entero; Dimensionar precio(5), stock(5)
	Definir bucle, total, numZapato, cantZapato, respuesta Como Entero
	Escribir 'Tienda Zapatos'
	Escribir 'Ingrese su nombre:'
	Leer nombre
	zapato[1] <- 'Zapatillas'; zapato[2] <- 'Botas'; zapato[3] <- 'Sandalias';	zapato[4] <- 'Tacones'; zapato[5] <- 'Mocasines'
	precio[1] <- 43000; precio[2] <- 13000; precio[3] <- 46000; precio[4] <- 79000;	precio[5] <- 45100
	marca[1] <- 'Nike'; marca[2] <- 'Timberland'; marca[3] <- 'Adidas'; marca[4] <- 'Jimmy Choo'; marca[5] <- 'Gucci';
	stock[1] <- 5; stock[2] <- 55; stock[3] <- 3; stock[4] <- 12; stock[5] <- 2; 
	bucle <- 0; total <- 0
	Mientras bucle=0 Hacer
		Escribir '  N   Zapato   Marca   Stock   Precio'
		Para i<-1 Hasta 5 Con Paso 1 Hacer
			Escribir '  ', ConvertirATexto(i), '   ', zapato[i], '   ', marca[i], '   ', ConvertirATexto(stock[i]), '   $', ConvertirATexto(precio[i])
		FinPara
		Escribir '----------------------------------------'
		Escribir 'Ingrese el número del zapato que desea comprar:'
		Leer numZapato
		Si numZapato<1 O numZapato>5 Entonces
			Escribir 'No existe ese zapato'
		SiNo
			Escribir 'Ingrese la cantidad de zapatos que desea comprar:'
			Leer cantZapato
			Si cantZapato>stock[numZapato] Entonces
				Escribir 'No hay suficiente stock, realice una nueva compra'
			SiNo
				Si cantZapato<=0 Entonces
					Escribir 'No se puede comprar 0 o menos zapatos'
				SiNo
					stock[numZapato] <- stock[numZapato]-cantZapato
					total <- total+(precio[numZapato]*cantZapato)
					Escribir 'Compra realizada con éxito'
				FinSi
			FinSi
		FinSi
		Escribir 'Desea comprar otro zapato? 1 = Si, 2 = No'
		Leer respuesta
		Si respuesta==2 Entonces
			bucle <- 1
		SiNo
			Escribir 'Respuesta inválida'
		FinSi
	FinMientras
	Escribir 'Factura:'
	Escribir 'Nombre: '+nombre
	Escribir 'El total a pagar es: $'+ConvertirATexto(total)
FinAlgoritmo