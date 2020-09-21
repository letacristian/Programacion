/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectjava.proyect6;

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
        
        // Modifique el programa anterior (conservándolo) para que le advierta al usuario si el tercer número ingresado es mayor o igual a la diferencia entre los dos primeros. Por ejemplo si el usuario ingresa 22, 18 y 6 debe advertir al usuario que 6 es un número no permitido porque es mayor a 22 menos 18
        
        Scanner scanner = new Scanner (System.in);
		
		System.out.print ("Ingrese un numero: ");		
		int num1 = scanner.nextInt();
		
		System.out.print ("Ingrese un numero: ");		
		int num2 = scanner.nextInt();
		
		System.out.print ("Ingrese un numero: ");		
		int num3 = scanner.nextInt();
		
			
		//Calcular cual de los numeros es el mayor y cual el menor
        int mayor;
		int menor;
		
		if (num1 > num2) {
            mayor = num1;
            menor = num2;
            
        } else {
            mayor = num2;
            menor = num1;
        }
		
		//Mostrar por pantalla los numeros desde el menor hasta el mayor.
		System.out.println("Numeros desde " + menor + " hasta " + mayor + " : ");
		
		int resultado = mayor-menor;
		
		System.out.println("La diferencia es " + resultado);
		
		if (resultado >= num3) {
		
			for (int i = menor; i <= mayor; i++) 
			
			if (i % num3 != 0) {			
			  
			System.out.println(i);
			
			} 
		}
    }
    
}
