
package com.mycompany.componentes;

import java.time.LocalDate;


public class Empleado {
    
    // DEFINIR 5 ATRIBUTOS 
    public String Id;
    public String Nombre;
    public String Apellido;
    public String NombreApellidos;
    public LocalDate FechaNacimiento;
    public int Edad;
    public String Correo;
    public String Cargo;
    private String Nomc;
    // IMPLEMENTAR EL MÉTODO CONSTTRUCTOR DE TAL MANERA QUE SE PERMITA INSTANCIAR LA CLASE SIN ASIGNAR VALORES A LOS ATRIBUTOS
    // INSTANCIAR LA CLASE CON 2, 3, 4 ATRIBUTOS O CON LOS 5 ATRIBUTOS
    public Empleado() {
    
}
    
    
     public Empleado(String id){
        this.Id = id;
      
    }
    
    public Empleado(String id, String nombre){
        this.Id = id;
        this.Nombre = nombre;
    }
    
    
    public Empleado(String id, String nombre, String apellidos){
        this.Id = id;
        this.Nombre = nombre;
        this.Apellido = apellidos;
    }
    
 
     public Empleado(String id, String nombre, String apellidos, LocalDate fnac){
        this.Id = id;
        this.Nombre = nombre;
        this.Apellido = apellidos;
        this.FechaNacimiento = fnac;
    }
  
  //METODOS QUE DEVULVEN VALORES 
     //PERTNECEN A UN TIPO DE DATO ESPECIFICO Y SIEMPRE TERMINAN CON RETURN
     
     public String NombreCompleto(){
         return Nombre + " " + Apellido;
     }
     
     //METODOS QUE NO DEVUELVEN VALORES
     //SON METODOS SIN TIPO -> SE DECLAREN CON VOID -> NO HACEN RETURN
     
     public void NombreCompeltoV2(){
         Nomc = Nombre + " " + Apellido;
         NombreApellidos = Nomc;
     }
    
}
