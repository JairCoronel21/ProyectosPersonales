/*
 DO.. WHILE

EJEMPLO 01: SOLICITAR EL NOMBRE DEL USUSARIO Y CONTRASEÑA 
SI EL USUSARIO NO INGRESA LA CONTRASEÑA, SE DEBE INDICAR EL MENSAJE "Contraseña Incorrecta"
y preguntar si desea volver a ingresarla
*/

package com.mycompany.proyecto13;
import java.util.Scanner;

public class Proyecto13 {

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        
           // Variables
             String user = "jperez", pwd = "abc", userIng = "", pwdIng = "", mensaje = "", rpt = "";
           
           
           // Entrada
             System.out.println("Ingrese nombre de usuario: ");
             userIng = sc.nextLine();
             if (!(user.equalsIgnoreCase(userIng))) {
                  System.out.println("Usuario incorrecto!! \n FIN del programa");
        }else {
                 do{
                 System.out.println("Ingrese password: ");
                 pwdIng = sc.nextLine();
                 
                 if (!(pwd.equals(pwdIng))) {
                     System.out.println("Password Incorrecto!");
                     System.out.println("¿Desea Continuar? (S/N)");
                     rpt = sc.nextLine();
                 } else{
                     System.out.println("Password correcto!! \n Bienvenido al sistema");
                     break;
                 }
             } while (rpt.equalsIgnoreCase("S"));   
           
           // Proceso
           
           
           // Salida
           
             }
    }
}
