
package com.mycompany.ejercicio01;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Variable
        String nombre;
        int hora, pago, total;
        //entrada
        System.out.println("Ingrese su nombre: ");
        nombre= sc.nextLine();
        System.out.println("Ingrese las horas trabajadas: ");
        hora = sc.nextInt();
        System.out.println("Ingrese el pago por hora: ");
        pago = sc.nextInt();
        
        //Proceso
        total = hora * pago;
        
        //Salida
        System.out.println("El total a pagar es: " + total);
    }
}
