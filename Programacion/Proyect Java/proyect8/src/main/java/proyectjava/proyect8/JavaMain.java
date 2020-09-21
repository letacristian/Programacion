/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectjava.proyect8;

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
        
        // Modifique el programa anterior (pero no lo deseche pues debe presentarlo), de manera que el usuario pueda modificar la contraseña una vez que se haya “logueado” o identificado correctamente.
        
        
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
        
		
		
		if (usuario.equals(usuarioAceptado) && contraseña == (contraseñaAceptada)) {
			System.out.println("Bienvenido, Usted se ha logueado correctamente");
			
			
		
			System.out.println("");
			System.out.println("Disculpe, debera actualizar su contraseña");
			
			
			
			System.out.println("");
			System.out.println("Digite su nueva contraseña de 4 numeros, por favor");
			
			System.out.println ("Ingrese una contraseña: ");		
	        int contraseñanueva = scanner.nextInt();
	        
	        
	        
	        System.out.println("");
	        System.out.println("Su contraseña ha sido cambiada.");
	        
	       
		
        
	        System.out.println("Debera loguearse nuevamente");
	        System.out.println("");
		 
	        String usuarioAceptado1 = "Enzo";
	        int contraseñaAceptada1 = contraseñanueva;
	        
	        System.out.println ("Ingrese un Usuario: ");		
	        String usuario1 = scanner.next();		
			
	        System.out.println ("Ingrese una contraseña: ");		
	        int contraseña1 = scanner.nextInt();
		 
	        
	       
			if (usuario1.equals(usuarioAceptado1) && contraseña1 == (contraseñaAceptada1)) {
				System.out.println("Bienvenido, Usted se ha logueado correctamente");	
        
			} else {
				System.out.println("Usted se ha logueado incorrectamente");
			}
			
	}
}

}
