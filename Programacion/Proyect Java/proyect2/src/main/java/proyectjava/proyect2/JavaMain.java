/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectjava.proyect2;

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
        
          // Escribir un programa que reciba dos números por consola e imprima todos los números enteros entre esos dos números.
        
        Scanner scanner = new Scanner (System.in);
		
		System.out.print ("Ingrese un numero: ");		
		int num1 = scanner.nextInt();
		
		System.out.print ("Ingrese un numero: ");		
		int num2 = scanner.nextInt();
		
		//Mostrar por pantalla los números desde el numero 1 hasta el numero 2.
		System.out.println("Números desde " + num1 + " hasta " + num2 + " : ");
        
		for (int i = num1; i <= num2; i++) {
            
			System.out.println(i);
		
		}
    }
    
}

