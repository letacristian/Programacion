/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectjava.proyect7;

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
        
        // Dado el usuario Enzo y la contraseña 4321, escribir un programa que indique cuando hay un error en el usuario o en la contraseña o en ambos.
        
        Scanner scanner = new Scanner (System.in);
		
		    String usuarioAceptado = "Enzo";
	        int contraseñaAceptada = 4321;
	        	        
	        System.out.println ("Ingrese un Usuario: ");		
	        String usuario = scanner.next();		
			
	        System.out.println ("Ingrese una contraseña: ");		
	        int contraseña = scanner.nextInt();
			
	      //Hacemos la comprobación   
	        
	        if (usuario.equals(usuarioAceptado)) {
	        	System.out.println("Usuario correcto");
	        
	        } else {
	        	System.out.println("Usuario incorrecto");
	        	
	        }
			if (contraseña == contraseñaAceptada) {
	        	System.out.println("Contraseña correcta");
	       
			} else {
	        	System.out.println("Contraseña incorrecta");
	        }
	        	        	                            
    }
    
}
