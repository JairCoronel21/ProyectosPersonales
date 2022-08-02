/*
   Arrays Vectores
       Realizar busquedas de un vector
*/

package com.mycompany.proyecto16;

import java.util.Scanner;

public class Proyecto16 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
                    Scanner scStr = new Scanner(System.in);
                    Scanner scNum = new Scanner(System.in);

                            // DECLARAR VECTORES Y VARIABLES
                            
                           // TABLA PRODUCTOS
                           String[] codProd = {"P01", "P02", "P03", "P04"};
                           String[] nomProd = {"Televisor", "Cocina", "Licuadora", "Lavadora"};
                           float[] preProd ={1500, 200, 150, 3000};
                           
                           
                                // TABLA CARRITO DE COMPRAS
                                String[] productos = new String[10];
                                int[] cantidad = new int[10];
                                float[] importe = new float[10];
                                String[] productos_comprados = new String[10];
                                
                        // VARIABLES
                        String codInput="", rpt="";
                        int cant=0;
                        float imp=0;
                        //CONTADOR
                        int posicion = 0;
                       
                        
                            // ENTRADAS
                  do{
                           
          
                         System.out.println("Ingrese codigo de producto: ");
                         codInput = scStr.nextLine();
            
        
                            
                        // Buscar codInput en el Vector codProd
                        for (int i = 0; i < codProd.length; i++) {
                            if (codInput.equalsIgnoreCase(productos_comprados[i])) {
                                System.out.println("CÓDIGO YA INGRESADO........");
                                break;
                            }
                            
                            
                            
                        if (codInput.equalsIgnoreCase(codProd[i])) {
                        System.out.println("Producto seleccionado: " + nomProd[i]);
                        System.out.println("Precio: " + preProd[i]);

                        
                         System.out.println("Ingrese cantidad a comprar: ");
                        cant = scNum.nextInt();
                        imp = cant * preProd[i];

                            // Almacenar en el carrito de compras
                           productos[posicion] = nomProd[i];
                           cantidad[posicion] = cant;
                           importe[posicion] = imp;
                           productos_comprados[posicion] = codInput;

                            System.out.println("Producto añadido al carrito de compras");
                           System.out.println("Desea continuar comprando (S/N)?: ");
                           rpt = scStr.nextLine();
                           }
                        }
                           } while (rpt.equalsIgnoreCase("s"));
                            
                            
                                // MOSTRAR EL CARRITO DE COMPRAS
                                System.out.println("CARRITO DE COMPRAR");
                                System.out.println("*********************************");
                                for (int i = 0; i < productos.length; i++) {
                                System.out.println(productos[i] + " " + cantidad[i] + " " + importe[i]);
                                }

                
}
}
        
