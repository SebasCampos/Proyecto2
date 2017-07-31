/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondpro;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Kendall
 */
public class carrera_natacion extends JFrame{
    
    JLabel lbnadador1,lbnadador2,lbnadador3,lbpiscina;
    
    //constructor
    public carrera_natacion(){
        
        super("Carrera natacion");
        
        getContentPane().setLayout(null);// colocar los componentes donde queramos
        lbnadador1= new JLabel("Nadador1");
        getContentPane().add(lbnadador1);
        lbnadador1.setBounds(0, 0, 100, 50);
        lbnadador2= new JLabel("Nadador2");
        lbnadador3= new JLabel("Nadador3");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); // cerrar ventana
        setBounds(0, 0, 1500, 1500);
        setVisible(true);
        
    }
    
}
