

package com.mycompany.finaltrabajo;

import java.util.Scanner;


public class FinalTrabajo {

    public static void main(String[] args) {
        
        //VARIABLES
        Scanner sc = new Scanner(System.in);
        int opcion;
        String password, user;
        int nuevo_saldo = 0, intento = 0, seguir = 0;
        int depositar, retirar;
        boolean salir = false; // 
        
     String usuario = "Nick";
        
     String pwd = "@123";
     
     int saldo = 8000;
         
         
        System.out.println("BIENVENIDO AL CAJERO AUTOMATICO PERÚ BANK");
        System.out.println("===============================");
            
        
      
        do {
        
                         
        
            System.out.println("Ingrese su nombre de usuario por favor");
            user = sc.nextLine();
           
           
           
            System.out.println("-------------------------------");
            System.out.println("SR "+ user +" Ingrese su contraseña por favor");
            password = sc.nextLine();
            
            
            //ENTRADA
            // Definiendo el valor de la contraseña 
            
            if (user.equalsIgnoreCase(usuario) && password.equalsIgnoreCase(pwd)) {
              
                //Es lo contrario de : salir 
                while (!salir) {
                    System.out.println("=========================================");
                    System.out.println("BIENVENIDO SR " + user);
                    System.out.println("**INGRESE LAS OPCIONES: **");
                    System.out.println("1 = Deposito");
                    System.out.println("2.= Retiro de saldo");
                    System.out.println("3 = Consulta de saldo");
                    System.out.println("4 = Salir del sistema");
                    System.out.println("Ingrese la opcion que desea: ");
                    opcion = sc.nextInt();
                            
                     switch (opcion){
                         
                         
                     case 1:
                         System.out.println("=========================================");
                         System.out.println("DEPOSITO:");
                         System.out.println("Ingrese el monto a depositar: ");
                         depositar = sc.nextInt();
                         nuevo_saldo = saldo + depositar;
                         System.out.println("Su saldo actual es de: "+nuevo_saldo+" soles");
                         saldo = nuevo_saldo;
                         System.out.println("=========================================");
                         break;
                         
                         
                     case 2:
                         System.out.println("=========================================");
                         System.out.println("RETIRO:");
                         System.out.println("Ingrese el monto a retirar: ");
                         retirar = sc.nextInt();
                                if (retirar > saldo) {
                                    System.out.println("No cuenta con el saldo suficiente");
                                }else {
                                 nuevo_saldo = saldo - retirar;
                                 saldo = nuevo_saldo;
                                }
                                System.out.println("Su saldo actual es de: "+nuevo_saldo+" soles");
                         System.out.println("=========================================");   
                         break;
                         
                         
                     case 3:
                         System.out.println("=========================================");
                         System.out.println("CONSULTA DE SALDO:");
                         System.out.println("Su saldo actualmente es de: "+saldo+" soles");
                         System.out.println("=========================================");
                         break;
                         
                         
                     case 4:
                         salir = true;
                         seguir = 1;
                         System.out.println("=========================================");
                         System.out.println("Muchas gracias por su tiempo!!!");
                         System.out.println("=========================================");
                         break;
                  
                     default:
                         System.out.println("=========================================");
                         System.out.println("Ingreso una opcion erronéa..Vuelva al principio por favor!!!");
                         System.out.println("=========================================");
                break;
                         
        }     
                }
                
            }else{
                System.out.println("*************************");
                System.out.println("¡¡Los contraseña ingresada es incorrecta!!");
                intento++; // intento para contar cuantas veces se ha estdo intentando
            }
            
            // Si la condicion de intento se cumple se realiza esta operación
            if (intento == 3) {
                System.out.println("!Lamentablemente hemos bloqueado el usuario, "
                        + "ya que accedio los 3 intentos permitidos");
                System.out.println("Bloqueando el usuario..........");
                System.out.println("Comuniquese con soporte de PERU BANK ");
                break;
            }
            
        
        }while(seguir == 0);
    
    }
}

