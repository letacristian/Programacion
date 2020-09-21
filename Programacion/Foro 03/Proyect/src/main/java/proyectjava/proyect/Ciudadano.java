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
public class Ciudadano extends Persona {

	// Encapsulo las variables con private
	private String provincia;
	private long dni;
	
	public Ciudadano (String nombre, String apellido, String provincia, long dni) {
		super(nombre, apellido);//Llamo a las variables de Persona
		this.provincia = provincia;
		this.dni = dni;
	}
	//Metodo get
	public String getProvincia() {
		//Nos devuelve la variable provincia
		return provincia;
	}
			
	public long getdni() {
		//Nos devuelve la variable dni
		return dni;
	}		

	//Metodo set
	public void setProvincia(String provincia) {
		//Asigna el valor del parametro a la variable provincia
		this.provincia = provincia;
	}

	public void setdni(long dni) {
		//Asigna el valor del parametro a la variable dni
		this.dni = dni;
		
	}
	}
