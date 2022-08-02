

package com.mycompany.ejercicio07;
import java.util.Scanner;

public class Ejercicio07 {
   
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        
        //Varibale
            //Variables por defecto
            String user= "jair", pwd="123456";
            //varibales que seran ingresadas
            String nombreUsuario, password, mensaje;
            
        
        //Entrada
        System.out.println("Ingrese nombre de usuario: ");
        nombreUsuario = sc.nextLine();
        
        System.out.println("Ingrese Password: ");
        password= sc.nextLine();
        
        
        
        //Procesos

            if(nombreUsuario.equals(user)){
                if(password.equals(pwd)){
                    mensaje = "Bienvenido "+nombreUsuario;
                }else{
                    mensaje = "Usuario correcto pero contraseña incorrecta";
                }
            }else{
                if(password.equals(pwd)){
                    mensaje = "Contraseña correcta pero usuario incorrecto";
                }else{
                    mensaje = "Todo incorrecto";
                }
            }
            
        //Salida
        System.out.println(mensaje);
        
    }
}

    

