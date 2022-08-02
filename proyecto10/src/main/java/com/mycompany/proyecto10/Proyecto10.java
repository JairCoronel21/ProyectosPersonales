/*
 BUCLES
  -------------------------------------
FOR -> CUANDO SE CONOCE LA CANTIDAD DE VECES QUE SE TIENE QUE 
REPETIR UN PROCESO
 */

package com.mycompany.proyecto10;


public class Proyecto10 {

    public static void main(String[] args) {

        // Repeter el mensaje 5 veces   
                System.out.println("Hello Mundo!!!!");
                System.out.println("Hello Mundo!!!!");
                System.out.println("Hello Mundo!!!!");
                System.out.println("Hello Mundo!!!!");
                System.out.println("Hello Mundo!!!!");
                // Repetoir 5 veces el mensaje con FOR
                System.out.println("Repetir el mensaje con FOR");
                System.out.println("***************************");
                // i++ -> que el varlo de i se incremente en 1 en cada bucle.
                // i inicia en 1, luego sera 2, 3, ..... hasta que i sea menor o gual a 5
                for (int i = 1; i <= 5; i++) {
                System.out.println("Hello Mundo!!!!");
                System.out.println("El bucle for se ejecuto: " + i + " veces");
                }


// Acumulador
// variable = variable + valor
// int v = 0;
// v = v + 50 -> 50 v += 50
// v = v + 20 -> 70 v += 20
// v = v + 15 -> 85 v += 15



// Contador
// contador = contador + 1
// int c = 0;
// c = c + 1 -> 1 c++
// c = c + 1 -> 2 c++
// c = c + 1 -> 3 c++



// Interruptor
// boolean sw = false (off)
// -> Si se ejecuta una instrucción -> sw = true (on);
// if (sw == true){
//    }
        
        
    }
}
