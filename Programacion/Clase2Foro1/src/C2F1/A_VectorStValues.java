package C2F1;

import java.util.Scanner;
public class A_VectorStValues {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int [] vectorInt = new int [5];

        System.out.println("***************************************");
        System.out.println("Programa: Amacenando valores al vector!");
        System.out.println("***************************************");
        System.out.println("Almacene 5 valores enteros al vector");

        for (int i=0;i<vectorInt.length;i++){

            System.out.print("["+i+"] = ");
            vectorInt [i] =input.nextInt();
        }

        System.out.println("Imprimiendo...");

        for (int i=0;i<vectorInt.length;i++){
            System.out.println("["+i+"] = "+vectorInt[i]);
        }
    }
}
