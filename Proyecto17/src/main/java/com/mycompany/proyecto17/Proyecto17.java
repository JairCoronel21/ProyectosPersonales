
 

package com.mycompany.proyecto17;
//Clase Alumno
import com.mycompany.componentes.Alumno;
//Clase Instructor
import com.mycompany.componentes.Instructor;

import com.mycompany.componentes.Empleado;
//La clase LocalDate de java para fechas
import java.time.LocalDate;

public class Proyecto17 {
  
    public static void main(String[] args) {
       //Para usar una clase se debe "instanciar la clase"
       // Crear una instancia de la clase Alumno
       System.out.println("TRABAJANDO CON LA CLASE ALUMNO");
       Alumno alum = new Alumno();
       alum.Nombre = "Juan";
       alum.Apellidos = "Perez Castro";
       alum.FechaNacimiento = LocalDate.of(2001, 03, 25);
       alum.Edad = 15;
       alum.Correo = "jperez.senati.pe";
       String nom = alum.NombreCompleto();
       System.out.println(nom);
        
        Alumno oAlumno = new Alumno();
        oAlumno.Nombre = "Raul";
        oAlumno.Apellidos = "Castro Huamani";
        System.out.println(oAlumno.NombreCompleto());
        
        
        System.out.println("TRABAJANDO CON LA CLASE INSTRUCTOR");
        
        Instructor inst01 = new Instructor("Anita", "Mendizabal", LocalDate.of(2001, 03, 25), 17, "senati@.pe", "Programador");
        System.out.println("inst01" + inst01.NombreCompleto());
        
        Instructor inst02 = new Instructor("Anita", "Mendizabal", LocalDate.of(2001, 03, 25));
        System.out.println("inst02" + inst02.NombreCompleto());
        
        Instructor inst03 = new Instructor();
        inst03.Nombre = "Rogelio";
        inst03.Apellidos = "Gonzalez";
        System.out.println("inst03" + inst03.NombreCompleto());
        
        System.out.println("TRABAJNDO CON LA CLASE EMPLEADO - PROBANDO METODOS CON TIPO Y VOID");
        Empleado emp01 = new Empleado();
        Empleado emp02 = new Empleado();
        
        System.out.println("NOMBRE COMPLETO CON METODO QUE DEVULEVE UN VALOR");
        emp01.Nombre = "Raul";
        emp01.Apellido = "Castro";
        String nomb = emp01.NombreCompleto();
        System.out.println("emp01: " + nomb);
        
        System.out.println("NOMBRE COMPLETO CON METODO VOID");
        emp02.Nombre = "Mario";
        emp02.Apellido = "Castillo";
        emp02.NombreCompeltoV2();
        System.out.println("emp02: " + emp02.NombreApellidos);
        
    }
}
