package Humanos;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

//La clase de Estudiante es una instacia de Persona y a su vez es la clase por default de java (Object)
public class Estudiante extends Persona {
	
	//Variables de estudiante:
	Map<String, Float> boleta;
	float prom;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	//Constructor principal
	Estudiante(String name, int edad, char sexo) throws IOException{
		//Ejecuta el constructor con parametros de la clase padre:
		super(name, edad, sexo);
		prom = promedio();
	}
	
	//Constructor secundario:
	Estudiante() throws IOException{
		//Ejecuta el constructor por defecto de su clase padre:
		super();
		prom = promedio();
	}
	
	float promedio() throws IOException {
		boleta = new HashMap <String, Float>();
		float cal, prom=0, suma=0;
		boolean resp=true;
		String text, resp_text;
		
		do {
			
			System.out.println("Ingrese el nombre de la materia: ");
			text = br.readLine();
			System.out.println("\nIngrese su calificación de " + text + ":");
			cal = Float.parseFloat(br.readLine());
			boleta.put(text, cal);
			System.out.println("\nDesea continuar agregando más materias? (y/n): ");
			resp_text = br.readLine();
			if (resp_text.contentEquals("n")) {
				resp = false;
			}
			System.out.println();
			
		} while(resp);
		
		for (Map.Entry<String, Float> element : boleta.entrySet()) {
			//Se recorrerá el diccionario de datos sin cambiar el valor de las calificaciones:
			suma += element.getValue();
		}
		
		prom = (float) suma / boleta.size();
		
		return prom;
	}
	
	void Boleta_info() {
		System.out.println("Boleta de Calificaciones: \n");
		for (Map.Entry<String, Float> element : boleta.entrySet()) {
			System.out.println(element.getKey() + " -> " + element.getValue());
		}
	}
	
	public static void main (String[] Args) throws IOException{
		Estudiante est = new Estudiante();
		if(est.prom > 6.9) {
			System.out.println(String.format("Usted ha aprobado el curso: %.2f", est.prom));		
		}else {
			System.out.println(String.format("Usted ha reprobado el curso: %.2f, solicite un exámen de recuperación.", est.prom));
		}
		est.Boleta_info();
	}


}
