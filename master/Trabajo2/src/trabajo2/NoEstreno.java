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
public class NoEstreno extends Material {
    
    public NoEstreno (int cod, String tit){
        
        super (cod,tit);
    }
    public NoEstreno (int cod, int can, String tit, int an, String gen){
        
        super (cod,can,tit,an,gen);
    }
    @Override
        public String toString (){
        
        String atributos;
        atributos = super.toString()+"\n Tipo: No Estreno";
        return atributos;
    }
    @Override
    public int verPrecio (int dias){
        
        if (dias>3){
            int retraso = dias-3;
            return 8_000+retraso*1_500;
        }
        else{
            return 8_000;
        }
    
    }
    
}
