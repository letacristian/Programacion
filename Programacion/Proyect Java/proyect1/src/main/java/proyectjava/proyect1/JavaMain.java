/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectjava.proyect1;

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
        
       // Escribir un programa que reciba dos números por consola y devuelva su suma.
        
        Scanner scanner=new Scanner (System.in);
		
		System.out.print ("Ingrese un numero: ");
		int num1 = scanner.nextInt();
		
		System.out.print ("Ingrese un numero: ");
		int num2 = scanner.nextInt();
		
		int resultado = num1+num2;
		
		//Mostrar por pantalla la suma.
		System.out.println("La suma de " + num1 + " + " + num2 + " es = " + resultado);
    }
    
}
