/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectjava.proyect;

/**
 *
 * @author letac
 */
public class Persona {
    
    //Encapsulo las variables con private
	private String nombre;
	private String apellido;		

	//Constructor
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;

	}

	//Metodo get
	public String getNombre() {
	//Nos devuelve la variable nombre
		return nombre;
	}
		
	public String getApellido() {
		//Nos devuelve la variable apellido
		return apellido;
	}		

	//Metodo set
	public void setNombre(String nombre) {
		//Asigna el valor del parametro a la variable nombre
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		//Asigna el valor del parametro a la variable apellido
		this.apellido = apellido;
	
}
}

    

