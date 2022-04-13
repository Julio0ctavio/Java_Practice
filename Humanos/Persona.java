package Humanos;

class Persona{
  //Atributos:
  int edad;
  char genero;
  String nombre;

  //Metodos:
  void imprimir_info(){
	  System.out.println("Nombre: " + nombre + "\nGenero: " + genero + "\nEdad: " + edad);
  }

  void jugar_Fortnite(Persona p){
	  System.out.println(nombre + " est\u00e1 jugando con " + p.nombre);
  }

  //Constructor por defecto:
  Persona(){
	  this("Julio Lozano",23,'M');
  }

  //Constructor de instancia:
  Persona(String nombre, int edad, char genero){
	  this.nombre=nombre;
	  this.edad=edad;
	  this.genero=genero;  
  }
  

}
