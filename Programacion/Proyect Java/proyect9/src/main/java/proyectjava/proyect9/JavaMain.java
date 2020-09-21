/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectjava.proyect9;

import java.util.Scanner;

/**
 *
 * @author letac
 */
public class JavaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Escribir un programa que cuente las vocales de una frase ingresada por el usuario. Por ejemplo, si el usuario ingresa la frase: “La poesía es la única verdad” debe devolver 12.
        
        Scanner scanner = new Scanner (System.in);
		
		//Defino la palabra o frase
		String sPalabra ="Me gusta la programacion";
		
		//defino un contador
		int contador = 0;
		
		//Hago un bucle for para recorrer la frase
		//Utilizo el metodo LENGHT para controlar el tamaño de la misma
		
		//el metodo CHART nos devuelve el caracter, y comprobaremos si es una vocal
		for(int x = 0;x < sPalabra.length();x++) {
			 if ((sPalabra.charAt(x) == 'a') || (sPalabra.charAt(x) =='e') || (sPalabra.charAt(x) == 'i') || (sPalabra.charAt(x) == 'o') || (sPalabra.charAt(x) == 'u')){ 
			    contador++;
			 }	    
						 
		}
		System.out.println("La frase " + sPalabra + " contiene " + contador + " vocales");
    }
    
}
