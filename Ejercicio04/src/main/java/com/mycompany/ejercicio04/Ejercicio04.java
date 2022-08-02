

package com.mycompany.ejercicio04;
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //VARIABLES
        int num1, num2;
        //ENTRADA
        System.out.println("Ingrese el primer número: ");
        num1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        num2 = sc.nextInt();
        //PROCESO
        if ( num1 > num2) {
        System.out.println(num1 + " es mayor que " + num2);
        }else{
        System.out.println(num2 + " es mayor que " + num1);
        }
        
        
    }
}
