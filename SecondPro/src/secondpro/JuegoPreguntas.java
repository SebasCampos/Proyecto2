/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondpro;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author h
 */
public class JuegoPreguntas extends javax.swing.JFrame {

    /**
     * Creates new form JuegoPreguntas
     */
    public JuegoPreguntas() {
        initComponents();
       
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        play = new javax.swing.JButton();
        tab = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        play.setText("Jugar");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabLayout = new javax.swing.GroupLayout(tab);
        tab.setLayout(tabLayout);
        tabLayout.setHorizontalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tabLayout.setVerticalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(play)
                .addContainerGap(609, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(play)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Shows the matrix of labels on tha panel and also creates the logic matrix
    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        //Falta realizar metodo de la matriz logica
        int x =(int) (Math.random() * 5) + 0;
        int y =(int) (Math.random() * 8) + 0;
        logic[x][y]= "$";
        logic[4][7] = "1";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if(logic[i][j] == null){
                    logic[i][j] = "_";
            }}
        }
        int conta = 0;
        while(conta < 10){
            int alex =(int) (Math.random() * 5) + 0;
            int aley =(int) (Math.random() * 8) + 0;
            if(logic[alex][aley].equals("_")){
                logic[alex][aley]= "*";
                conta++;
            }
             
            
        }
            
        
        mostrar(etiq,logic);
    }//GEN-LAST:event_playActionPerformed
    
    //Matrix
     JLabel eti = new JLabel();
    JLabel [][] etiq = new JLabel[5][8];
    String [][] logic = new String[5][8];
    //Allows to show the matrix with the graphic interface
    public void mostrar(JLabel[][] etiquetas,String[][]logica){
        int  x = 75;
        int  y = 75;
        Border border = BorderFactory.createLineBorder(Color.black, 1);
        ImageIcon user = new ImageIcon(this.getClass().getResource("/imagenes/User.jpg"));
        
        etiquetas[0][0] = new JLabel();
        etiquetas[0][0].setBounds(x, y, 75, 75);
        etiquetas[0][0].setIcon(user);
        etiquetas[0][0].setBorder(border);
        tab.add(etiquetas[0][0]);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                
                if(logica[i][j].equals("_")){
                   ImageIcon paso = new ImageIcon(this.getClass().getResource("/imagenes/paso.jpg"));
                   etiquetas[i][j] = new JLabel();
                   etiquetas[i][j].setBounds(x, y, 75, 75);
                   etiquetas[i][j].setIcon(paso);
                   etiquetas[i][j].setBorder(border);
                   
                   tab.add(etiquetas[i][j]);
                }
                else if(logica[i][j].equals("*")){
                   ImageIcon obsta = new ImageIcon(this.getClass().getResource("/imagenes/muro.jpg"));
                   etiquetas[i][j] = new JLabel();
                   etiquetas[i][j].setBounds(x, y, 75, 75);
                   etiquetas[i][j].setIcon(obsta);
                   etiquetas[i][j].setBorder(border);
                   
                   tab.add(etiquetas[i][j]);
                }else if(logica[i][j].equals("$")){
                    ImageIcon obsta = new ImageIcon(this.getClass().getResource("/imagenes/como.jpg"));
                    etiquetas[i][j] = new JLabel();
                   etiquetas[i][j].setBounds(x, y, 75, 75);
                   etiquetas[i][j].setIcon(obsta);
                   etiquetas[i][j].setBorder(border);
                   
                   tab.add(etiquetas[i][j]);                    
                }
                else{
                    ImageIcon meta = new ImageIcon(this.getClass().getResource("/imagenes/meta.jpg"));
                    etiquetas[4][7] = new JLabel();
                    etiquetas[4][7].setBounds(x, y, 75, 75);
                    etiquetas[4][7].setIcon(meta);
                    etiquetas[4][7].setBorder(border);
                    tab.add(etiquetas[4][7]);
                }
                x= x+75;
            }
            x = 75;
            y = y+75;
        }
        
    }
    
    
    //Creates a matrix of labels
    public void graf(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                etiq[i][j] = eti;
            }   
        }
    }
       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JuegoPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoPreguntas().setVisible(true);
            }
        });
    }
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton play;
    private javax.swing.JPanel tab;
    // End of variables declaration//GEN-END:variables
}
