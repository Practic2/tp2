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
public class Estreno extends Material {
    
    Estreno (int cod, String tit){
        
         super(cod,tit);
    }
    Estreno (int cod, int can, String tit, int an, String gen){
    super (cod,can,tit,an,gen);
        
}
    @Override
    public int verPrecio (int dias){
        if(dias<4){
            return 10_000;
        }
        else{
            int precio = 10_000;
            return precio;
        }  
    }
    @Override
    public String toString (){
        String t;
        t = super.toString() + "\n";
        t = t + "Tipo: Estreno";
        return t;
    }
        
    }
