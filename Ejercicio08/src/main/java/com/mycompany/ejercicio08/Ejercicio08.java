

package com.mycompany.ejercicio08;
import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
     //Varibale
            //Variables por defecto
            String user= "jair", pwd="123456", cod="1122";
            //varibales que seran ingresadas
            String nombreUsuario, password, codigo;
            
        
        //Entrada
        System.out.println("Ingrese nombre de usuario: ");
        nombreUsuario = sc.nextLine();
        
        System.out.println("Ingrese Password: ");
        password= sc.nextLine();
        
        
        
        //Procesos

            if(nombreUsuario.equals(user)){
                if(password.equals(pwd)){
                    System.out.println("Bienvenido "+user);
                }else{
                    
                    System.out.println("Contraseña Incorrrecta!!!");
                    System.out.println("Ingrese codigo de seguridad");
                    codigo = sc.nextLine();
                    if(codigo.equals(cod)){
                        System.out.println("Código de seguridad correcto!! Su contraseña es: "+pwd);
                }else{
                        System.out.println("Error al ingresar");
                    
                    }}}}}

        
        
    
