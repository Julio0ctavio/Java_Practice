package Humanos;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

public class Maestro extends Persona{
	
	Map<String, Float> Evaluacion;
	
	Maestro(String nombre, int edad, char genero,String materia){
		super(nombre, edad, genero);
		System.out.println("Hola jóvenes, soy su profesor" + nombre 
							+ "\nY seré su profesor(a) de la materia de " + materia 
							+ "\nBienvenidos");
	}
	
	//Sobrescritura del método de jugar_Fortnite, que existe en la clase padre (Persona):
	@Override
	void jugar_Fortnite(Persona p) {
		System.out.println("Íjole, estoy trabajando, no juego Fortnite con " + p.nombre + " por el momento...");
	}
	
	float calificar(Estudiante e) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Evaluacion = new HashMap <String, Float>();
		float cal,suma=0;
		int por=100,cont_por,i=0;
		
		do{
			
			System.out.println("Calificacion de la Unidad: \n" + i);
			cal = Float.parseFloat(br.readLine());
			System.out.println("Valor de la unidad (%): ");
			cont_por = br.read();
			if (cont_por > 100) {
				System.out.println("No puedes asignar más del 100% de valor a la unidad");
				cont_por = 100;
			}
			Evaluacion.put(String.format("Unidad %d - %.2f/%", i,cont_por), cal*cont_por);
			por = por - cont_por;
			
		}while(por > 0);
		
		for (Map.Entry<String, Float> element : Evaluacion.entrySet()) {
			//Se recorrerá el diccionario de datos sin cambiar el valor de las calificaciones:
			suma += element.getValue();
		}
		
		return suma/100;
	}
}
