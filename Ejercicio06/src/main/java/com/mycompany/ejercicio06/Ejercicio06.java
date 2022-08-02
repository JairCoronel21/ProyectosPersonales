

package com.mycompany.ejercicio06;

import java.util.Scanner;
public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //VARIABLES
        String nombre;
        double  imp, pago, bono;
        //ENTRADA
        System.out.println("Ingrese el nombre del trabajador: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa el importe vendido en el mes: ");
        imp = sc.nextDouble();
        //PROCESO
        bono = (0.15 * imp);
                
        if(imp < 5000){
           pago = (0.35 * imp) + bono;
       }else {
           pago = (0.35 * imp);
       }
       //SALIDA
        System.out.println("El pago del vendedor: "+nombre+" es: "+pago);
        
        
    }
}
