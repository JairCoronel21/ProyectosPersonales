/*
 BUCLES
  -------------------------------------
FOR -> CUANDO SE CONOCE LA CANTIDAD DE VECES QUE SE TIENE QUE 
REPETIR UN PROCESO

  
  Ejercico 01:
CREAR UNA APLICACION QUE SOLICITE 10 PRODUCTOS CON SU RSPECTIVO PRECIO Y CANTIDAD A COMPRAR
CALCULAR Importe, IGV y Total a Pagar
- Tener en cuenta que el cliente puede decidir la cantidad de productos a comprar (Maximo 10)

IMPLEMENTAR:


 1. La respuesta del usuario a lA pregunta "Desea continuar" solo puede ser N, n, S o S
SI EL USUARIO INGRESA UNA RESPUESTA DIFERENTE, LA APLICACION DEBE TERMINAR, Y MOSTRAR UN MENSAJE DE ERROR
2. SI EL USUARIO INGRESA EL DECIMO PRODUCTO, EL SISTEMA DEBE INDICAR QUE LLEGA AL MAXIMO DE SU COMPRA
Y CALCULAR EL PAGO.
*/




package com.mycompany.proyecto11;

import java.util.Scanner;

public class Proyecto11 {

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
                    Scanner scInt = new Scanner(System.in);

                    // VARIABLES
                    String nomProd = "", rpt="";
                    double preProd=0, importe=0, igv=0, totalPago=0;
                    int cant=0;
                  
                    // ENTRADA
                     // totalPago = 0 + 300 totalPago = 300+500 totalPago = 800+100
                        
                        
                    for (int i = 1; i <= 3; i++) {
                    System.out.println("Ingrese nombre del Producto: ");
                    nomProd = scStr.nextLine();

                    System.out.println("Ingrese precio del Producto: "); // bucle1 -> 300 bucle2-> 500 Buble3-> 100
                    preProd = scInt.nextDouble();

                    System.out.println("Ingrese la cantidad a comprar: "); // 1 1 1
                    cant= scInt.nextInt();
                    
              if (i <= 2) {
                    System.out.print("¿Desea continuar? S / N:  ");
                    rpt = scStr.nextLine();
               
                      
                   if (rpt.equalsIgnoreCase("s") || rpt.equalsIgnoreCase("S")) {
                          continue;
                    } else if (rpt.equalsIgnoreCase("n") || rpt.equalsIgnoreCase("N")){
                         break;
                      }else{
                            System.out.println("ERROR EN EL PROGRAMA!!!");
                            break;
                        }
                      
                    }else{
                  
                  System.out.println("****¡¡¡¡USTED LLEGO AL LÍMITE DE COMPRAS!!!!****");
                 
              }
                    }
                    
                    
                   
                    totalPago = totalPago + (preProd * cant);
                    importe = totalPago / 1.18;
                    igv = totalPago - importe;
               
                    
                    // SALIDA
                   
                          
                            
                            System.out.println("*******************************");
                            System.out.println("Importe: " + importe);
                            System.out.println("Igv : " + igv); 
                            System.out.println("Total : " + totalPago);
        
           
    
    }
}



