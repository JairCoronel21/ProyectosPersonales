

package com.mycompany.componentes;

import java.time.LocalDate;
import java.time.Period;

public class Empleado {
    
    public String Codigo;
    public String Nombre;
    public String Apellido;
    public String NombreApellidos;
    public LocalDate FechaNacimiento;
    public int Edad;
    public String Correo;
    public String Puesto;
    
    
    
    
    public Empleado() {
        
    }
    
    public Empleado(String nombre, String apellidos){
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
