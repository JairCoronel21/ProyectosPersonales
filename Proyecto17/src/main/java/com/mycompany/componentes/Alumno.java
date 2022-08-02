
package com.mycompany.componentes;

import java.time.LocalDate;

public class Alumno {
    //Atributos -> Carácteristicas de la clase
    // Visibilidad: public, private o protected
    public String Nombre;
    public String Apellidos;
    public LocalDate FechaNacimiento;
    public int Edad;
    public String Correo;
    
    
     //Metodos
    public String NombreCompleto(){
        return Nombre + " " + Apellidos;
    }
}
