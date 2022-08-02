
package com.mycompany.componentes;

import java.time.LocalDate;


public class Instructor {
    public String Nombre;
    public String Apellidos;
    public LocalDate FechaNacimiento;
    public int Edad;
    public String Correo;
    public String Profesion;
    
    
    //CONSTRUCTOR DE UNA CLASE
    // PERMITE DEFINIR VALORES INICIALES PARA LOS ATRIBUTOS DE LA CLASE EN EL MOMENTO QUE SE REALIZA LA INSTANCIA
    // (OBLIGAR A LA APP A CONFIGURAR VALORES EN LOS ATRIBUTOS AL GENERAR LA INSTANCIA DE LA CLASE)
    
    public  Instructor(String nom, String ape, LocalDate fnac, int edad, String correo, String prof) {
        Nombre = nom;
        Apellidos = ape;
        FechaNacimiento = fnac;
        Edad = edad;
        Correo = correo;
        Profesion = prof;
    }
            
    
    //SOBRE CARGA DE METODOS
    //CREAR UN MISMO METODO PERO CON ARGUMENTOS DIFERENTES Y FUNCIONALIDADES DIFERENTES
    public Instructor(String nom, String ape, LocalDate fnac){
        Nombre = nom;
        Apellidos = ape;
        FechaNacimiento = fnac;
    }
    
    public Instructor(){
        
    }
    
    public String NombreCompleto(){
        return Nombre + " " + Apellidos;
    }
    
    
}
