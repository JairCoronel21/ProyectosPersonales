

package com.mycompany.ejercicio05;

import java.util.Scanner;
public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //VARIABLES
        int num1, num2, num3, a, b, c;
        //ENTRADA
        System.out.println("Ingrese el primer número: ");
        num1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        num2 = sc.nextInt();
        
        System.out.println("Ingrese el tercer número: ");
        num3 = sc.nextInt();
        //PROCESO
        if (num1 > num2 && num1 > num3) {
            a = num1;
        }else if (num2 > num1 && num2 > num3) {
            a = num2;
        }else{
            a = num3;
        }
        
        
        if (num1 < num2 && num1 < num3) {
            b = num1;
        }else if (num2 < num1 && num2 < num3) {
            b = num2;
        }else{
            b = num3;
        }
        
        c = (num1 + num2 + num3) - (a+b);
        
        //SALIDA
        System.out.println("************");
        System.out.println("El orden ascendente de los números ingresados son: " + b + ", " + c + ", " + a);
        System.out.println("El orden descendente de los números ingresados son: " + a + ", " + c + ", " + b);
    }
    
    
 
}

