/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectjava.proyect5;

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
        
        // Escribir un programa similar al anterior, pero que no imprima los múltiplos de un número también ingresado por el usuario. Por ejemplo, si se ingresaron los números 22, 18 y 3 el programa debe imprimir 19 20 22.
        
        Scanner scanner = new Scanner (System.in);
		
		System.out.print ("Ingrese un numero: ");		
		int num1 = scanner.nextInt();
		
		System.out.print ("Ingrese un numero: ");		
		int num2 = scanner.nextInt();
		
		System.out.print ("Ingrese un numero: ");		
		int num3 = scanner.nextInt();
		
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
		
		for (int i = menor; i <= mayor; i++) 
			
			if (i % num3 != 0)
            
			System.out.println(i);
    }
    
}
