
package com.mycompany.componentes;

import java.time.LocalDate;
import java.time.Period;


public class Alumno {
  
    public String Nombre;
    public String Apellidos;
    public LocalDate FechaNacimiento;
    public int Edad;
    public String Correo;
    
    //Constructores
    public Alumno(){
        
    }
    
    public Alumno(String nombre, String apellidos){
        Nombre = nombre;
        Apellidos = apellidos;
    
}
    
  
    
    //Métodos
    public String NombreCompleto(){
        return Nombre + " " + Apellidos;
    }
    
    
      public int CalcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(FechaNacimiento, fechaActual).getYears();
    }
}
