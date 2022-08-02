

package com.mycompany.proyecto12;
import java.util.Scanner;

public class Proyecto12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //VARIABLES
        String user = "", rpt = "", mensaje = "";
        
        // CON DO WHILE **********************************************************
                    System.out.println("Ejecutar con Do .... while ");
                    System.out.println("****************************");
                    user = ""; rpt = ""; mensaje="";
                    do {
                    // Repetir al menos una vez lo siguiente:
                    System.out.println("Ingrese usuario: ");
                    user = sc.nextLine();
                    mensaje = mensaje + user + "\n";
                    // Mientras la condicion sea verdadera -> while (true)
                    // Establecer el criterio que se deben cumplir para repetir el proceso
                    System.out.println("Desea continuar (S/N): ");
                    rpt = sc.nextLine();
                    } while (rpt.equalsIgnoreCase("S"));
                    System.out.println( "Los usuarios ingtresados son: " + mensaje);
                    // CON WHILE **********************************************************
                    System.out.println("Ejecutar con While ");
                    System.out.println("****************************");
                    user = ""; rpt = ""; mensaje="";
                    while(rpt.equalsIgnoreCase("S")){
                    // Repetir lo siguiente si el criterio se cumple -> while (true):
                    System.out.println("Ingrese usuario: ");
                    user = sc.nextLine();
                    mensaje = mensaje + user + "\n";
                    // Mientras la condicion sea verdadera -> while (true)
                    // Establecer el criterio que se deben cumplir para repetir el proceso
                    System.out.println("Desea continuar (S/N): ");
                    rpt = sc.nextLine();
                    }
                    System.out.println( "Los usuarios ingtresados son: " + mensaje);

    
    }
}
        
