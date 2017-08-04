/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondpro;

import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author KENDALL
 */
public class inicio5 extends Thread{
  int posicionInicix, limitepista; 
   JLabel nadador5;
    public inicio5(int posicionInicix, int limitepista,JLabel nadador){
        this.posicionInicix = posicionInicix;
        this.limitepista = limitepista;
        this.nadador5 = nadador;
    }
    
    
    @Override
    public void run(){
        Random velocidad = new Random();
        int ritmoNa5 = 0;
        int ritmo5 = velocidad.nextInt(70);// genera la velocidad del nadador
        for(int i = limitepista-150; i > 0; i--){// limite en la cual se tiene que detener el nadador
            ritmoNa5 = ritmo5;
            
            nadador5.setBounds(posicionInicix, i, 73, 100);// posicion de inicio del nadador
            try{
                sleep(ritmoNa5);//velocidad de nadador
            }catch(Exception e){
                
            }
        }
        System.out.println("participante: "+ "nadador 5 la velocidad es de: " + ritmoNa5);
        yield();//sirve para que LOS HILOS no se ejecuten al mismo tiempo
    }   
}
