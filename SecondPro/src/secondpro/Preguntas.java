/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondpro;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.Border;

/**
 *
 * @author Sebastian
 */
public class Preguntas extends javax.swing.JFrame {

    /**
     * Creates new form Preguntas
     */
    private Timer t;
    int count = 0;
    int nume1 = 0;
    int nume2 = 0;
    int nume3 = 0;
    ArrayList<Integer> codigo = new ArrayList<>();    
    JLabel eti = new JLabel();
    JLabel [][] etiq = new JLabel[5][8];
    String [][] logic = new String[5][8];
    ArrayList<String> pregs = new ArrayList<>();
    ArrayList<String> resp = new ArrayList<>();
    PregLogica x1 = new PregLogica();
    int ale = (int)(Math.random() * 1) + 1;
    int puntos = 0;
    int code = 0;
    
    boolean paso = false;
    public Preguntas() {
        initComponents();
        SpinnerNumberModel cantP = new SpinnerNumberModel();
        cantP.setMaximum(10);
        cantP.setMinimum(0);
        SpinnerNumberModel cantP1 = new SpinnerNumberModel();
        cantP1.setMaximum(10);
        cantP1.setMinimum(0);
        SpinnerNumberModel cantP2 = new SpinnerNumberModel();
        cantP2.setMaximum(10);
        cantP2.setMinimum(0);
        num1.setModel(cantP);
        num2.setModel(cantP1);
        num3.setModel(cantP2);
        show1();
        
        preguntas.setVisible(false);
        comodin.setVisible(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JPanel();
        preguntas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addP = new javax.swing.JTextArea();
        V = new javax.swing.JRadioButton();
        F = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        comodin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        num1 = new javax.swing.JSpinner();
        num2 = new javax.swing.JSpinner();
        num3 = new javax.swing.JSpinner();
        probar = new javax.swing.JButton();
        iniciar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        m_tiempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout tabLayout = new javax.swing.GroupLayout(tab);
        tab.setLayout(tabLayout);
        tabLayout.setHorizontalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 785, Short.MAX_VALUE)
        );
        tabLayout.setVerticalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        addP.setColumns(20);
        addP.setRows(5);
        jScrollPane1.setViewportView(addP);

        V.setText("Verdadero");

        F.setText("Falso");

        jButton1.setText("Verificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout preguntasLayout = new javax.swing.GroupLayout(preguntas);
        preguntas.setLayout(preguntasLayout);
        preguntasLayout.setHorizontalGroup(
            preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(preguntasLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, preguntasLayout.createSequentialGroup()
                        .addGroup(preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(preguntasLayout.createSequentialGroup()
                                .addComponent(V)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, preguntasLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(162, 162, 162))))
        );
        preguntasLayout.setVerticalGroup(
            preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(preguntasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(V)
                    .addComponent(F))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Adivina los Números");

        probar.setText("Probar");
        probar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                probarActionPerformed(evt);
            }
        });

        iniciar.setText("Iniciar");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Vani", 0, 18)); // NOI18N
        jLabel2.setText("Tiempo");

        m_tiempo.setBackground(new java.awt.Color(255, 255, 255));
        m_tiempo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout comodinLayout = new javax.swing.GroupLayout(comodin);
        comodin.setLayout(comodinLayout);
        comodinLayout.setHorizontalGroup(
            comodinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comodinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(comodinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comodinLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comodinLayout.createSequentialGroup()
                        .addComponent(probar)
                        .addGap(217, 217, 217))))
            .addGroup(comodinLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comodinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(66, 66, 66))
            .addGroup(comodinLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(iniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(m_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        comodinLayout.setVerticalGroup(
            comodinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comodinLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(comodinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(probar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addGroup(comodinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iniciar)
                    .addComponent(m_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comodin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(preguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(preguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comodin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        
        if(evt.getKeyCode()== 39){
            if(x1.derecha(logic)){
                code = 39;
              
                    comodin.setVisible(true);
                
//                preguntas.setVisible(true);
//                addPreg();
                
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Hay un obstaculo");
                
            }
        }else if(evt.getKeyCode() == 37){
         
            if (x1.izquierda(logic)) {
                code = 37;
               
                    comodin.setVisible(true);
                
//                preguntas.setVisible(true);
//                addPreg();
                
                
    
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Hay un obstaculo");
                
            }
        }
        else if(evt.getKeyCode()== 38){
            if(x1.arriba(logic)){
                code = 38;    
               
                    comodin.setVisible(true);
                
//                preguntas.setVisible(true);
//                addPreg();
                
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Hay un obstaculo");
              
            }
        }
        else if(evt.getKeyCode()== 40){
            if(x1.abajo(logic)){
                code = 40;
                    comodin.setVisible(true);
                
//                preguntas.setVisible(true);
//                addPreg();
                
                
                
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Hay un obstaculo");
                
            }
        }
        else{
         
          JOptionPane.showMessageDialog(rootPane,"Tecla invalida");
        }
    }//GEN-LAST:event_formKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(V.isSelected()&& F.isSelected()){
            JOptionPane.showMessageDialog(rootPane,"Solo debe marcar una opción");
        }
        else{
        if(resp.get(ale).equals("V")){
            if(V.isSelected() == true){
                
                JOptionPane.showMessageDialog(rootPane,"Correcto");
                System.out.println(code);
                cambio(code);
                tab.removeAll();
                tab.setVisible(false);
                tab.setVisible(true);
                mostrar(etiq, logic);
                preguntas.setVisible(false);
                
            }
            else{
                
                JOptionPane.showMessageDialog(rootPane,"Incorrecto");
                addObsta();
                tab.removeAll();
                tab.setVisible(false);
                tab.setVisible(true);
                mostrar(etiq, logic);
                preguntas.setVisible(false);
                
                
            }
        }
        if(resp.get(ale).equals("F")){
            if(F.isSelected() == true){
 
                JOptionPane.showMessageDialog(rootPane,"Correcto");
                cambio(code);
                tab.removeAll();
                tab.setVisible(false);
                tab.setVisible(true);
                mostrar(etiq, logic);
                preguntas.setVisible(false);
                
            }else{
                
                JOptionPane.showMessageDialog(rootPane,"Incorrecto");
                addObsta();
                tab.removeAll();
                tab.setVisible(false);
                tab.setVisible(true);
                mostrar(etiq, logic);
                preguntas.setVisible(false);
                
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Incorrecto");
            preguntas.setVisible(false);
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count ++;
                if(count == 60){
                    t.stop();
                    dispose();
                }
                else{
                m_tiempo.setHorizontalAlignment(SwingConstants.CENTER);
                m_tiempo.setText(count+"");
            }}
        });
        t.start();
        
        for (int i = 0; i != 3; i++) {
            int al  = (int) (Math.random()*10)+0;
            codigo.add(al);
        }
        System.out.println(codigo);
        iniciar.setEnabled(false);
    }//GEN-LAST:event_iniciarActionPerformed

    private void probarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_probarActionPerformed
        if(corro() == 3){
            // cambiar
            JOptionPane.showMessageDialog(rootPane,"Correcto!!!");
            t.stop();
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Incorrecto!!!");
        }
    }//GEN-LAST:event_probarActionPerformed
    //Allows to show the matrix
    public void show1(){
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
            if(alex != 0 || alex != 1){
                if(aley != 1 || aley != 0){
            if(logic[alex][aley].equals("_")){
                logic[alex][aley]= "*";
                conta++;
            }}
            }
            
        }
        logic[0][0] = "u";
            
        
        mostrar(etiq,logic);
    
    
    }
     
     //Allows to show the matrix with the graphic interface
    public void mostrar(JLabel[][] etiquetas,String[][]logica){
        int  x = 75;
        int  y = 75;
        Border border = BorderFactory.createLineBorder(Color.black, 1);
        
        
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
                else if(logica[i][j].equals("u")){
                    ImageIcon user = new ImageIcon(this.getClass().getResource("/imagenes/User.jpg"));
                    etiquetas[i][j] = new JLabel();
                    etiquetas[i][j].setBounds(x, y, 75, 75);
                    etiquetas[i][j].setIcon(user);
                    etiquetas[i][j].setBorder(border);
                    tab.add(etiquetas[i][j]);
                    
                }
                else{
                    ImageIcon meta = new ImageIcon(this.getClass().getResource("/imagenes/meta.jpg"));
                    etiquetas[4][7] = new JLabel();
                    etiquetas[4][7].setBounds(x, y, 75, 75);
                    etiquetas[4][7].setIcon(meta);
                    etiquetas[4][7].setBorder(border);
                
                }
                x= x+75;
            }
            x = 75;
            y = y+75;
        }
        
        tab.add(etiquetas[4][7]);
//        tab.setVisible(false);
//        tab.setVisible(true);
    }
    
    //Makes the change in the logic matrix for the new positions
    public void cambio( int code){
        int round = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                
                if (logic[i][j].equals("u")) {
                    if(code == 39){
                        //Right
                        logic[i][j+1] = "u";
                        logic[i][j] = "_";
                        round = 1;
                        break;
                    }
                    else if(code == 37){
                        //Left
                        logic[i][j-1] = "u";
                        logic[i][j] = "_";
                        round = 1;
                        break;
                    }
                    else if(code == 38){
                        //Up
                        logic[i-1][j] = "u";
                        logic[i][j] = "_";
                        round = 1;
                        break;
                    }
                    else{
                        //Down
                        System.out.println(i);
                        logic[i+1][j] = "u";
                        logic[i][j] = "_";
                        round = 1;
                        break;
                    }
                } 
                
            }
            if(round == 1){
                break;
            }
        }
    
    
    
    }
    //Add questions to the text area
    public void addPreg(){
        
        addPreguntas();
        addP.setText(pregs.get(ale));
        
    
    }
    //Add the questions to a list
    public void addPreguntas(){
        pregs.add("¿Las listas son lo mismo que un arreglo?"); pregs.add("¿Un String es lo mismo que un Char?");
        resp.add("F"); resp.add("F");
    
    }
    
    public void addObsta(){
        while(true){
        int x = (int)(Math.random() * 5) + 0;
        int y = (int)(Math.random() * 8) + 0;
        
        if(logic[x][y].equals("_")){
            logic[x][y]="*";
            break;
        }
        
        }
    }
    
   public int corro(){
        nume1 = (int) num1.getValue();
        nume2 = (int) num2.getValue();
        nume3 = (int) num3.getValue();
        System.out.println(nume1);
        System.out.println(nume2);
        System.out.println(nume3);
        int cont = 0;
        
        if (nume1 == codigo.get(0)) {
            cont++;}
        if(nume2 == codigo.get(1)){
            cont++;
        }
        if(nume3 == codigo.get(2)){
            cont++;
        }
                   
        
        System.out.println(cont);
        return cont;

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
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Preguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton F;
    private javax.swing.JRadioButton V;
    private javax.swing.JTextArea addP;
    private javax.swing.JPanel comodin;
    private javax.swing.JButton iniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel m_tiempo;
    private javax.swing.JSpinner num1;
    private javax.swing.JSpinner num2;
    private javax.swing.JSpinner num3;
    private javax.swing.JPanel preguntas;
    private javax.swing.JButton probar;
    private javax.swing.JPanel tab;
    // End of variables declaration//GEN-END:variables
}
