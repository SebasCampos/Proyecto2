/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondpro;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

/**
 *
 * @author Kendall
 */
public class picina extends JFrame{
    Scanner numero = new Scanner(System.in);
    JLabel lbnadador1, lbnadador2, lbnadador3, lbpicina, lbnadador4, lbnadador5;
    JButton btninicio;
    int cantidadNadadores = 0;
    int x=300,y=0,ancho=1000,alto=700;
    NataConfi cantiNadador = new NataConfi();
    
    
    //constructor
    public picina(){
        super("Juego Natacion");
        
        getContentPane().setLayout(null);// coloca las imagenes en la posiciones en las que queremos
        
        lbpicina = new JLabel(); 
        getContentPane().add(lbpicina);
        this.getContentPane().setBackground(Color.BLUE);//color
        lbpicina.setBounds(100, 0, 1000, 700);//tamano de la pisina
        
        lbnadador1 = new JLabel();
        lbpicina.add(lbnadador1); //agrega el nadador a la picina
        lbnadador1.setIcon(new ImageIcon(getClass().getResource("/imagenes/nadador1.jpg")));
        lbnadador1.setBounds(40, alto-150, 73, 100);
        
        lbnadador2 = new JLabel();
        lbpicina.add(lbnadador2);//agrega el nadador a la picina
        lbnadador2.setIcon(new ImageIcon(getClass().getResource("/imagenes/nadador1.jpg")));
        lbnadador2.setBounds(160, alto-150, 73, 100);
        
        lbnadador3 = new JLabel();
        lbpicina.add(lbnadador3);//agrega el nadador a la picina
        lbnadador3.setIcon(new ImageIcon(getClass().getResource("/imagenes/nadador1.jpg")));
        lbnadador3.setBounds(280, alto-150, 73, 100);
        
        lbnadador4 = new JLabel();
        lbpicina.add(lbnadador4);//agrega el nadador a la picina
        lbnadador4.setIcon(new ImageIcon(getClass().getResource("/imagenes/nadador1.jpg")));
        lbnadador4.setBounds(400, alto-150, 73, 100);
        
        lbnadador5 = new JLabel();
        lbpicina.add(lbnadador5);//agrega el nadador a la picina
        lbnadador5.setIcon(new ImageIcon(getClass().getResource("/imagenes/nadador1.jpg")));
        lbnadador5.setBounds(520, alto-150, 73, 100);
        
        //boton de arranque del juego
        btninicio = new JButton("INICIO");
        getContentPane().add(btninicio);
        btninicio.setBackground(Color.ORANGE);
        btninicio.setBounds(0, 0, 100, 50);
        btninicio.addActionListener(new ActionListener(){
            
            @Override // funcion del boton 
            public void actionPerformed(ActionEvent e){
                System.out.println("Inicio de carrera");
                cantidadNadadores = cantiNadador.cPlayer; // es la cantidad de personas a competir
//                System.out.println("Digite cantidad participantes: ");
//                cantidad_participantes = numero.nextInt();
                
                if(cantidadNadadores == 2){
                    inicio1 hilonadador1 = new inicio1(40, alto, lbnadador1);  
                    inicio2 hilonadador2 = new inicio2(160, alto, lbnadador2);
                    
                    hilonadador1.start();
                    hilonadador2.start();
                }
                if(cantidadNadadores == 3){
                    inicio1 hilonadador1 = new inicio1(40, alto, lbnadador1);  
                    inicio2 hilonadador2 = new inicio2(160, alto, lbnadador2);
                    inicio3 hilonadador3 = new inicio3(280, alto, lbnadador3);
                    
                    hilonadador1.start();
                    hilonadador2.start();
                    hilonadador3.start();
                }
                if(cantidadNadadores == 4){
                    inicio1 hilonadador1 = new inicio1(40, alto, lbnadador1);  
                    inicio2 hilonadador2 = new inicio2(160, alto, lbnadador2);
                    inicio3 hilonadador3 = new inicio3(280, alto, lbnadador3);
                    inicio4 hilonadador4 = new inicio4(400, alto, lbnadador4);
                    
                    hilonadador1.start();
                    hilonadador2.start();
                    hilonadador3.start();
                    hilonadador4.start();
                }
                if(cantidadNadadores == 5){
                    inicio1 hilonadador1 = new inicio1(40, alto, lbnadador1);  
                    inicio2 hilonadador2 = new inicio2(160, alto, lbnadador2);
                    inicio3 hilonadador3 = new inicio3(280, alto, lbnadador3);
                    inicio4 hilonadador4 = new inicio4(400, alto, lbnadador4);
                    inicio5 hilonadador5 = new inicio5(520, alto, lbnadador5);
                    
                    hilonadador1.start();
                    hilonadador2.start();
                    hilonadador3.start();
                    hilonadador4.start();
                    hilonadador5.start();
                }  
            }
        });
        // configuracion de la ventana principal
        Image iconoventana = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icono1.png"));
        setIconImage(iconoventana);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Para cerrar la ventana
        setBounds(x, y, ancho, alto); //ancho y alto ventana
        setVisible(true);
        setResizable(false);
}
}
