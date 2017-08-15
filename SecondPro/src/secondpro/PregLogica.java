/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondpro;

import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class PregLogica {
    
   
    
    
    
    
    public boolean derecha(String[][] logica){
        Preguntas y = new Preguntas();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if(logica[i][j].equals("u")){
                if((j+1)>7){
                    return false;
                }
                else{
                
                    if(logica[i][j+1].equals("_")){
                        
                        return true;

                       
                    }
                    else if(logica[i][j+1].equals("$")){
                        return true;
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
                if(logica[i][j].equals("u")){
                if((j-1)<0){
                    return false;
                }
                else{
                
                    if(logica[i][j-1].equals("_")){
//                        h.setVisible(true);
//                        if(h.revisar()){
//                            return true;
//                        }
//                        else{
//                            return false;
//                        }
                            return true;
                    }
                    else if(logica[i][j-1].equals("$")){
                       return true;
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
                if(logica[i][j].equals("u")){
                if((i-1)<0){
                    return false;
                }
                else{
                
                    if(logica[i-1][j].equals("_")){
//                        h.setVisible(true);
//                        if(h.revisar()){
//                            return true;
//                        }
//                        else{
//                            return false;
//                        
                        return true;
                    }
                    else if(logica[i-1][j].equals("$")){
                        return true;
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
                if(logica[i][j].equals("u")){
                if((i+1)>5){
                    return false;
                }else{
                
                    if(logica[i+1][j].equals("_")){
//                        h.setVisible(true);
//                        if(h.revisar()){
//                            return true;
//                        }
//                        else{
//                            return false;
//                        }
                        //llamar metodo con pregunta
                        //y validar la respuesta
                        return true;
                        
                    }
                    else if(logica[i+1][j].equals("$")){
                        return true;
                    }
                    else{
                        return false;
                        
                    }
                
                }
            }}
            
        }
        return false;
    
    }
    
    
    
    
    
}
