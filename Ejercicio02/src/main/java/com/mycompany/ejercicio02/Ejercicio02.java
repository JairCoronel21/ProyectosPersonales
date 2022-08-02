

package com.mycompany.ejercicio02;

import java.util.Scanner;
public class Ejercicio02 {

 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

//VARIABLES
String nombre;
double precio,importeTotal,igv,subTotal;
int cantidad;

//ENTRADA
System.out.println("Ingresa el nombre del producto: ");
nombre = sc.nextLine();
System.out.println("Ingresa el precio del producto: ");
precio = sc.nextDouble();
System.out.println("Ingresa la cantidad de productos: ");
cantidad = sc.nextInt();
//PROCESO
importeTotal = precio * cantidad;


subTotal = importeTotal/1.18;


igv = importeTotal - subTotal;
igv = Math.round(igv*100.0)/100.0;


//SALIDA
System.out.println("PRODUCTO: "+nombre);
System.out.println("PRECIO UNITARIO: "+precio);
System.out.println("CANTIDAD: "+cantidad);
System.out.println("SUBTOTAL: "+subTotal);
System.out.println("IGV: " + igv);
System.out.println("IMPORTE TOTAL: "+importeTotal);
}

}

