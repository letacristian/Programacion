/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectjava.proyect3;

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
        
        // Escribir un programa que, modificando el anterior, imprima los números enteros entre los dos ingresados siempre de menor a mayor, independientemente del orden en que los ingresó el usuario. Por ejemplo, si se ingresaron los números 20 y 17, el programa debe imprimir 17 18 19 20.
        
       Scanner scanner = new Scanner (System.in);
		
		System.out.print ("Ingrese un numero: ");		
		int num1 = scanner.nextInt();
		
		System.out.print ("Ingrese un numero: ");		
		int num2 = scanner.nextInt();
		
		//Calcular cuál de los números es el mayor y cuál el menor
        int mayor;
		int menor;
		
		if (num1 > num2) {
            mayor = num1;
            menor = num2;
            
        } else {
            mayor = num2;
            menor = num1;
        }
		
		//Mostrar por pantalla los números desde el menor hasta el mayor.
		System.out.println("Números desde " + menor + " hasta " + mayor + " : ");
        
		for (int i = menor; i <= mayor; i++) {
            
			System.out.println(i);
		
		}	 
    }
    
}
