/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondpro;

import java.awt.Image;
import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Sebastian
 */
public class PregGraf {
    
   
    
    JLabel[][] inter = new JLabel[8][5];
    
    PregLogica m = new PregLogica();
    
    public PregGraf() {
    }

    public JLabel[][] getInter() {
        return inter;
    }

    public void setInter(JLabel[][] inter) {
        this.inter = inter;
    }
    
    
    
    //Reads the logic matrix and transfer the info into a graphic matrix

   
    public void matrizInterfaz(){
        JLabel eti = new JLabel();
        ImageIcon obt = new ImageIcon(getClass().getResource("/imagenes/user.jpg"));
        ImageIcon user = new ImageIcon(obt.getImage().getScaledInstance(eti.getWidth(), eti.getHeight(), Image.SCALE_DEFAULT));
        JLabel[][] interG = new JLabel[8][5];
        eti.setIcon(user);
        interG[0][0] = eti;
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 5; j++) {
                
                if(m.getnMatriz()[i][j].equals("_")){
                    ImageIcon obte = new ImageIcon(getClass().getResource("/imagenes/paso.jpg"));
                    ImageIcon free = new ImageIcon(obt.getImage().getScaledInstance(eti.getWidth(), eti.getHeight(), Image.SCALE_DEFAULT));
                    eti.setIcon(free);
                    interG[i][j] = eti;
                }
                else if(m.getnMatriz()[i][j].equals("*")){
                    ImageIcon obten = new ImageIcon(getClass().getResource("/imagenes/obsta.jpg"));
                    ImageIcon lock = new ImageIcon(obt.getImage().getScaledInstance(eti.getWidth(), eti.getHeight(), Image.SCALE_DEFAULT));
                    eti.setIcon(lock);
                    interG[i][j] = eti;
                }
                else{
                    ImageIcon ob = new ImageIcon(getClass().getResource("/imagenes/como.jpg"));
                    ImageIcon como = new ImageIcon(obt.getImage().getScaledInstance(eti.getWidth(), eti.getHeight(), Image.SCALE_DEFAULT));
                    eti.setIcon(como);
                    interG[i][j] = eti;
                }
            }
        }
    
        setInter(interG);
    }

    

    
}
