/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo2;

/**
 *
 * @author Juanjo
 */
public class Cliente {
    
    private int cedula;
    private String nombre;
    private String apellido;
    
     Cliente(){
     
    
    }
     Cliente (int cedula, String nombre, String apellido){
         this.cedula = cedula;
         this.nombre = nombre;
         this.apellido = apellido;
    }
     public void setNombre (String nombre){
         this.nombre = nombre;
     }
     public void setApellido (String apellido){
         this.apellido = apellido;
     }
     public int getCedula (){
         return cedula;
     }
     public String getNombre(){
         return nombre;
     }
     public String getApellido(){
         return apellido;
     }
     @Override
     public String toString (){
         String t;
         t = "Cedula: " + cedula + "\n";
         t = t + "Nombres: " + nombre + "\n";
         t = t + "Apellidos: " + apellido;
         return t;
     }
}
    
