/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo2;

/**
 *
 * @author Familia
 */
public abstract class Material {
    
    private int codigo;
    private int cantidad;
    private String titulo;
    private int anho;
    private String genero;
    
    public Material (int cod, String tit){
        
        codigo = cod;
        titulo = tit;
    }
    public Material (int cod, int can, String tit, int an, String gen){
        
        codigo = cod;
        cantidad = can;
        titulo = tit;
        anho = an;
        genero = gen;
    }
    public int getCodigo (){
        
        return codigo;
    }
    public int getCantidad (){
        
        return cantidad;
    }
    public String getTitulo (){
        
        return titulo;
    }
    public int getAnho (){
        
        return anho;
    }
    public String getGenero (){
        
        return genero;
    }
    protected void setCodigo (int val){
        
        codigo = val;
    }
    public void setCantidad (int val){
        
        cantidad = val;
    }
    public void setTitulo (String val){
        
        titulo = val;
    }
    public void setAnho (int val){
        
        anho = val;
    }
    public void setGenero (String val){
        
        genero = val;
    }
    
    @Override
    public String toString (){
        
        String atributos;
        atributos = "\n Codigo: "+codigo+"\n Cantidad: "+cantidad+"\n Titulo: "
                +titulo+"\n Anho: "+anho+"\n Genero: "+genero;
        return atributos;
    }
    public abstract int verPrecio (int dias);
}