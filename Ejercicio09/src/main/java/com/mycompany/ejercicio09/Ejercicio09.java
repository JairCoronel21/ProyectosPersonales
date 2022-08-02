
package com.mycompany.ejercicio09;
import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Varibale
        String user, producto, codigo;
        int cantidad;
        double descuento = 0,importe,igv,subtotal,neto,precio;
        //ENTRADA
        System.out.println("Ingrese nombre de usuario: ");
        user = sc.nextLine();
             
        System.out.println("Ingrese el producto a comprar: ");
        producto = sc.nextLine();
        
        System.out.println("Ingrese el código de descuento: (A12-2022 /B20-2022/ C10-2022)");
        codigo = sc.nextLine();
        
        System.out.println("Ingrese la cantidad a comprar: ");
        cantidad = sc.nextInt();
        
        System.out.println("Ingrese el precio del producto: ");
        precio = sc.nextDouble();
        
        
        //PROCESO
        importe = precio * cantidad;
        importe = Math.round(importe*100.0)/100.0;

        subtotal = importe/1.18;
        subtotal = Math.round(subtotal*100.0)/100.0;

        igv = importe - subtotal;
        igv = Math.round(igv*100.0)/100.0;
        
        if (codigo.equalsIgnoreCase("A12-2022")){
            descuento = (0.20 * importe);
        }else if(codigo.equalsIgnoreCase("B20-2022")){
            descuento = (0.10 * importe);
        }else if(codigo.equalsIgnoreCase("C10-2022")){
            descuento = (0.05 * importe);
        }else{
            System.out.println("No hay descuento");
        }
          
        neto = (importe - descuento);
        
        //SALIDA
        System.out.println("El nombre de usuario es: "+ user);
        System.out.println("El producto a comprar es: "+producto);
        System.out.println("La cantidad a comprar es: "+cantidad);
        System.out.println("El precio del producto es: "+precio);
        System.out.println("El codigo de descuento usado es: "+ codigo);
        System.out.println("El importe del producto es: "+importe);
        System.out.println("El subtotal del producto es: "+subtotal);
        System.out.println("El igv del producto es: "+igv);
        System.out.println("El descuento del producto es: "+descuento);
        System.out.println("El Neto a Pagar  es: "+neto);
      
}
}
