package Modificadores;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Majaderia {
	
	char genero;
	String nombre;
	
	Majaderia(char genero, String nombre){
		this.genero = genero;
		this.nombre = nombre;
	}
	
	private void Insulto () {
		String insultar = "";
		if (genero == 'M' ) {
			insultar = String.format("Pinche %s, ¡ponte a trabajar huerco mantenido!", nombre);
		}else {
			insultar = String.format("¡Órale cabrona! ¡a chingarle %s!", nombre);
			
		}
		System.out.println(insultar);
	}
	
	void deberes() throws IOException{
		//En este BufferedReader, no debemos preocuparnos por las tildes y los acentos del idioma español.
		//Debido al ISO-8859-1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		System.out.println(String.format("Oye %s, ¿terminaste tus deberes? Si/si || No/no", nombre));
		String resp = br.readLine();
		if (resp.contentEquals("Si") || resp.contentEquals( "si")) {
			System.out.println(String.format("Muy bien, %s, ¡sigue así!", nombre));
		}else {
			Insulto();
		}
		
	}
	

}





