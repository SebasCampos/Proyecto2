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
 * @author Kendall
 */
public class inicio1 extends Thread{
    int posicionInicix, limitepista; // se crean las varibles 
   JLabel nadador1;
    public inicio1(int posicionInicix, int limitepista,JLabel nadador){
        this.posicionInicix = posicionInicix; // inicializa la variable
        this.limitepista = limitepista; // inicializa la variable
        this.nadador1 = nadador; // inicializa la variable
    }
    
    
    @Override
    public void run(){
        Random velocidad = new Random();
        int ritmoNa1 = 0;
        int ritmo1 = velocidad.nextInt(70);// genera la velocidad del nadador
        for(int i = limitepista-150; i > 0; i--){ // limite en la cual se tiene que detener el nadador 
            ritmoNa1 = ritmo1; 
            
            nadador1.setBounds(posicionInicix, i, 73, 100); // posicion en la que comienza el nadador
            try{
                sleep(ritmoNa1);//velocidad de nadador
            }catch(Exception e){
                
            }
        }
        System.out.println("participante: " + "nadador 1 la velocidad es de: " + ritmoNa1);//ritmoNa1);
        yield();//sirve para que LOS HILOS no se ejecuten al mismo tiempo
    }
}
