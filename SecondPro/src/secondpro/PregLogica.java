/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondpro;

/**
 *
 * @author Sebastian
 */
public class PregLogica {
    
    VentaPreg h = new VentaPreg();
    Comodin c = new Comodin();
    //Falta hacer el cambio de imagen 
    public boolean derecha(String[][] logica){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if((j+1)>5){
                    return false;
                }
                else{
                if(logica[i][j].equals("u")){
                    if(logica[i][j+1].equals("_")){
                        h.setVisible(true);
                        
                        if(h.revisar()){
                            return true;
                        }
                        else{
                            
                            return false;
                        }
                    }
                    else if(logica[i][j+1].equals("$")){
                        c.setVisible(true);
                        if(c.ch()){
                            return true;
                        }
                        else{
                            return false;
                        }
                    
                    }
                    else{
                        return false;
                        
                    }
                
                }}
            }
            
        }
        return false;
    
    }
    public boolean izquierda(String[][] logica){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if((j-1)<0){
                    return false;
                }
                else{
                if(logica[i][j].equals("u")){
                    if(logica[i][j-1].equals("_")){
                        h.setVisible(true);
                        if(h.revisar()){
                            return true;
                        }
                        else{
                            return false;
                        }
                    }
                    else if(logica[i][j-1].equals("$")){
                        c.setVisible(true);
                        if(c.ch()){
                            return true;
                        }
                        else{
                            return false;
                        }
                    }
                    else{
                        return false;
                        
                    }
                
                }}
            }
            
        }
        return false;
    
    }
    public boolean arriba(String[][] logica){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if((i-1)<0){
                    return false;
                }
                else{
                if(logica[i][j].equals("u")){
                    if(logica[i-1][j].equals("_")){
                        h.setVisible(true);
                        if(h.revisar()){
                            return true;
                        }
                        else{
                            return false;
                        }
                    }
                    else if(logica[i-1][j].equals("$")){
                        c.setVisible(true);
                        if(c.ch()){
                            return true;
                        }
                        else{
                            return false;
                        }
                    }
                    else{
                        return false;
                        
                    }
                
                }}
            }
            
        }
        return false;
    
    }
    public boolean abajo(String[][] logica){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if((i+1)>8){
                    return false;
                }else{
                if(logica[i][j].equals("u")){
                    if(logica[i+1][j].equals("_")){
                        h.setVisible(true);
                        if(h.revisar()){
                            return true;
                        }
                        else{
                            return false;
                        }
                        //llamar metodo con pregunta
                        //y validar la respuesta
                        
                    }
                    else if(logica[i+1][j].equals("$")){
                        c.setVisible(true);
                        if(c.ch()){
                            return true;
                        }
                        else{
                            return false;
                        }
                    }
                    else{
                        return false;
                        
                    }
                
                }}
            }
            
        }
        return false;
    
    }
    
    
    
    
    
}
