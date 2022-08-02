/*
  MANEJO DE ARRAYS
*/
package com.mycompany.proyecto15;



public class Proyecto15 {

    public static void main(String[] args) {
          
           
           //Declarando vectores
           
           String[] usuarios = {"jperez", "agarcia", "mrodriguez", "mcastro"};
           String[] password = {"123", "abc", "ad123", "xxx"};
           int[] estado = {1, 1, 0, 1};
           
           // Recoger los vectores
           
            for (int i = 0; i < usuarios.length; i++) {
               System.out.println("Nombre de usuario: " + usuarios[i] + " " + "/ Password" + password[i]);
        }
           
           // Recoger los datos de usuarios activos
           System.out.println("**USUARIOS ACTIVOS**");
           for (int i = 0; i < usuarios.length; i++) {
               if (estado[i] == 1) {
                   System.out.println(usuarios[i]);
                   
               }
        }
           
          // Imprimir los datos del usuario mrodriguez
          System.out.println("Datos del usuario mrodriguez: ");
          System.out.println(usuarios[2] + "" + password[2] + "" + estado[2]);
    }
    
}
