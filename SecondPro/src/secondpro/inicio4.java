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
public class inicio4 extends Thread{
    int posicionInicix, limitepista; 
   JLabel nadador4;
    public inicio4(int posicionInicix, int limitepista,JLabel nadador){
        this.posicionInicix = posicionInicix;
        this.limitepista = limitepista;
        this.nadador4 = nadador;
    }
    
    
    @Override
    public void run(){
        Random velocidad = new Random();
        int ritmoNa4 = 0;
        int ritmo4 = velocidad.nextInt(70);// genera la velocidad del nadador
        for(int i = limitepista-150; i > 0; i--){// limite en la cual se tiene que detener el nadador
            ritmoNa4 = ritmo4;
            
            nadador4.setBounds(posicionInicix, i, 73, 100);// posicion de inicio del nadador
            try{
                sleep(ritmoNa4);//velocidad de nadador
            }catch(Exception e){
                
            }
        }
        System.out.println("participante: "+ "nadador 4 la velocidad es de: " + ritmoNa4);
        yield();//sirve para que LOS HILOS no se ejecuten al mismo tiempo
    }
}
