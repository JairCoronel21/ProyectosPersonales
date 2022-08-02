/*
   DO... WHILE
      EJEMPLO 02: CREAR UNA TABLA DE MULTIPLICAR
    - EL USUARIO DEBE INGRESAR EL NUMERO DE LA TABLA DE MULTIPLICAR
    - EL USUARIO PODRA GENERAR NUEVAMENTE LA TABLA DE MULTIPLICAR CON 
      OTRO NUMERO TODAS LAS VECES QUE DESEE.

RETO:
 - APLICACIÓN SOLO DEBE ACEPTAR COMO RESPUESTA S O N MAYUSCULA O MINISCULA
 - SI SE INGRESA UNA RESPUESTA DIFERENTE, SE DEBE MOSTRAR UN MENSAJE DE ERROR Y VOLVER A SOLICITAR LÑA RESPUESTA 
  CORRECTA


   RETO 2:
    -LA APLIACACION SE ACCEDE CON EL USUARIO "invitado"
   - Si no se ingresa el nombre de usuasrio correcto, la apliacion preguntara si desea seguir intentado
   - Si no desea seguir intentando la apliacion finaliza
*/

package com.mycompany.proyecto14;
import java.util.Scanner;

public class Proyecto14 {

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        
        
        //VARIABLES
           String user = "usuario", userIng= "";
           int num = 0, res = 0;
           String rpt = "";
           boolean criterio = true;
           
          //ENTRADA
          do{
          System.out.println("Ingrese nombre de ususario");
          userIng = scStr.nextLine();
              if (!(userIng.equalsIgnoreCase(user))) {
                  System.out.println("Usuario incorrecto");
                  System.out.println("Desea seguir intentando? S/N");
                  rpt = scStr.nextLine();
                  if (rpt.equalsIgnoreCase("S")) {
                      
                  }
              }
          } while(rpt.equalsIgnoreCase("S"));
          
         
                  
          do{
          // Solicitar Número
          System.out.println("Ingresar número: ");
          num = scInt.nextInt();
          
          // Crear Tabla
          for (int i = 1; i <= 12; i++) {
            res = num * i;
              System.out.println(num + " x " + i + " = " + res);
        }
          do{
              System.out.println("Desea Continuar: (S/N): ");
              rpt = scStr.nextLine();
              criterio = !(rpt.equalsIgnoreCase("s") || rpt.equalsIgnoreCase("n"));
             if (criterio) {System.out.println("Error..Vuelva a ingresar la respuesta!!!");}
           }while (criterio);
                  
          }while (rpt.equalsIgnoreCase("s"));
          
          
          
          //PROCESOS
          
          
          //SALIDAS     
    }
    }

