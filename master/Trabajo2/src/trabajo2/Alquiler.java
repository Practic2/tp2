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
public class Alquiler {
    
    private Cliente cliente;
    private Material material;
    private Fecha fecha;
    private boolean devuelto;
    
    public Alquiler (){
        
    }
    public Alquiler (Cliente cliente, Material material, Fecha fecha){
        this.cliente = cliente;
        this.material = material;
        this.fecha = fecha;
    }
    public Cliente getCliente (){
        return cliente;
    }
    public Material getMaterial(){
        return material;
    }
    public Fecha getFecha (){
        return fecha;
    }
    public void setCliente (Cliente cliente){
        this.cliente = cliente;
    }
    public void setMaterial(Material material){
        this.material = material;
    }
    public void setFecha (Fecha fecha){
        this.fecha = fecha;
    }
    public boolean getDevuelto(){
        return devuelto;
    }
    public void setDevuelto (boolean devuelto){
        this.devuelto = devuelto;
    }
    
@Override
public String toString(){
    String t;
    t = "Cliente: " + cliente + "\n";
    t = t + "Material: " + material + "\n";
    t = t + "Fecha: " + fecha;
    return t;
    
}
    
    
}
