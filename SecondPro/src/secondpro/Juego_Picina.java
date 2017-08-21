/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondpro;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.Timer;

/**
 *
 * @author KENDALL
 */
public class Juego_Picina extends javax.swing.JFrame {

    /**
     * Creates new form Juego_Picina
     */
    int x = 1500, y = 700;
    int limite = 700;
    int contadorCarreras = 0;
    int cantidadNadadores = 0;
    int contMayor2 = 0;
    int contMayor3 = 0;
    int contMayor4 = 0;
    int contMayor5 = 0;
    int contmayor = 0;
    int contMenor = 0;
    int contMenor2 = 0;
    int contMenor3 = 0;
    int contMenor4 = 0;
    int contMenor5 = 0;
    int cambio = 0;
    int cambio2 = 0;
    int cambio3 = 0;
    int cambio4 = 0;
    int cambio5 = 0;
    int remplazo1 = 0;
    int remplazo2 = 0;
    int remplazo3 = 0;
    int remplazo4 = 0;
    int remplazo5 = 0;
    int comEmpate = 0;
    int cPlayer = 0;
    int campo = 0; 
    int valor1 = 0, valor2 = 0, valor3 = 0, valor4 = 0, valor5 = 0; 
    ArrayList<String> participantes = new ArrayList<>();//lista que recibe la ventana para jugar
    ArrayList<Integer> numeroMenor = new ArrayList<>();
    ArrayList<String> confirmacionNombre = new ArrayList<>(); //COLOCAR EN BOTON REINICIO PARA ELIMINAR EL CONTENIDO
    Cronometro_3 tiempo = new Cronometro_3();
    SpinnerNumberModel cantP = new SpinnerNumberModel();
    
    public Juego_Picina() { // Initializes the swimmers, the pool with its respective configurations
         initComponents();
        this.setSize(x, y);
        this.getContentPane().setBackground(Color.lightGray);//color JFrame
        setLocationRelativeTo(null);
        cantP.setMaximum(5);
        cantP.setMinimum(0);
        cP.setModel(cantP);
        this.setTitle("Juego Natacion");
        this.setResizable(false);
        
        lbnadador1 = new JLabel();
        lbPicina.add(lbnadador1); // The swmmer is adds to the pool
        lbnadador1.setIcon(new ImageIcon(getClass().getResource("/imagenes/nadador.jpg")));
        lbnadador1.setBounds(40, 550, 73, 100);

        lbnadador2 = new JLabel();
        lbPicina.add(lbnadador2); // The swmmer is adds to the pool
        lbnadador2.setIcon(new ImageIcon(getClass().getResource("/imagenes/nadador.jpg")));
        lbnadador2.setBounds(160, 550, 73, 100);

        lbnadador3 = new JLabel();
        lbPicina.add(lbnadador3); // The swmmer is adds to the pool
        lbnadador3.setIcon(new ImageIcon(getClass().getResource("/imagenes/nadador.jpg")));
        lbnadador3.setBounds(280, 550, 73, 100);

        lbnadador4 = new JLabel();
        lbPicina.add(lbnadador4); // The swmmer is adds to the pool
        lbnadador4.setIcon(new ImageIcon(getClass().getResource("/imagenes/nadador.jpg")));
        lbnadador4.setBounds(400, 550, 73, 100);

        lbnadador5 = new JLabel();
        lbPicina.add(lbnadador5); // The swmmer is adds to the pool
        lbnadador5.setIcon(new ImageIcon(getClass().getResource("/imagenes/nadador.jpg")));
        lbnadador5.setBounds(520, 550, 73, 100);
        
        linea0 = new JLabel();
        lbPicina.add(linea0);
        linea0.setIcon(new ImageIcon(getClass().getResource("/imagenes/linea blanca.jpg")));
        linea0.setBounds(7, 7, 10, 645);
        
        linea1 = new JLabel();
        lbPicina.add(linea1);
        linea1.setIcon(new ImageIcon(getClass().getResource("/imagenes/linea roja.jpg")));
        linea1.setBounds(130, 7, 10, 645);
        
        linea2 = new JLabel();
        lbPicina.add(linea2);
        linea2.setIcon(new ImageIcon(getClass().getResource("/imagenes/linea roja.jpg")));
        linea2.setBounds(250, 7, 10, 645);
        
        linea3 = new JLabel();
        lbPicina.add(linea3);
        linea3.setIcon(new ImageIcon(getClass().getResource("/imagenes/linea roja.jpg")));
        linea3.setBounds(373, 7, 10, 645);
        
        linea4 = new JLabel();
        lbPicina.add(linea4);
        linea4.setIcon(new ImageIcon(getClass().getResource("/imagenes/linea roja.jpg")));
        linea4.setBounds(493, 7, 10, 645);
        
        linea5 = new JLabel();
        lbPicina.add(linea5);
        linea5.setIcon(new ImageIcon(getClass().getResource("/imagenes/linea blanca.jpg")));
        linea5.setBounds(610, 7, 10, 645);
        
        lbPicina = new JLabel();
        this.add(lbPicina);
        lbPicina.setIcon(new ImageIcon(getClass().getResource("/imagenes/piscina_fondo.jpg")));
        lbPicina.setBounds(600, 10, 915, 650);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPicina = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        lbnadador3 = new javax.swing.JLabel();
        lbnadador1 = new javax.swing.JLabel();
        lbnadador2 = new javax.swing.JLabel();
        lbnadador4 = new javax.swing.JLabel();
        lbnadador5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cP = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        p1 = new javax.swing.JRadioButton();
        p2 = new javax.swing.JRadioButton();
        p3 = new javax.swing.JRadioButton();
        p4 = new javax.swing.JRadioButton();
        p5 = new javax.swing.JRadioButton();
        btnReiniciar = new javax.swing.JButton();
        txtEmpates = new javax.swing.JTextField();
        txtEjecucion_juego = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnReportes = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtRerp2Na1 = new javax.swing.JTextField();
        txtRerp2Na2 = new javax.swing.JTextField();
        txtRerp2Na3 = new javax.swing.JTextField();
        txtRerp2Na4 = new javax.swing.JTextField();
        txtRerp2Na5 = new javax.swing.JTextField();
        linea1 = new javax.swing.JLabel();
        linea2 = new javax.swing.JLabel();
        linea3 = new javax.swing.JLabel();
        linea4 = new javax.swing.JLabel();
        linea0 = new javax.swing.JLabel();
        linea5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtGanadorMas = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPerdioMas = new javax.swing.JTextField();
        btnBorrarReportes = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtGanoEmpate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lbPicina.setBackground(new java.awt.Color(255, 255, 255));

        btnIniciar.setBackground(new java.awt.Color(51, 255, 51));
        btnIniciar.setText("INICIAR JUEGO");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantidad Competidores");

        jLabel2.setText("Nadador 1");

        jLabel3.setText("Nadador 2");

        jLabel4.setText("Nadador 3");

        jLabel5.setText("Nadador 4");

        jLabel6.setText("Nadador 5");

        p1.setBackground(new java.awt.Color(255, 255, 255));

        p2.setBackground(new java.awt.Color(255, 255, 255));

        p3.setBackground(new java.awt.Color(255, 255, 255));

        p4.setBackground(new java.awt.Color(255, 255, 255));

        p5.setBackground(new java.awt.Color(255, 255, 255));

        btnReiniciar.setText("REINICIAR");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        jLabel7.setText("Ejecucion del juego");

        jLabel8.setText("Empates");

        btnReportes.setText("REPORTES");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        jLabel9.setText("Nadador1");

        jLabel10.setText("Nadador2");

        jLabel11.setText("Nadador3");

        jLabel12.setText("Nadador4");

        jLabel13.setText("Nadador5");

        jLabel14.setText("Cantidad de veces que gana cada Competidor");

        jLabel15.setText("El nadador que a ganado mas: ");

        jLabel16.setText("El nadador que a perdido mas:");

        btnBorrarReportes.setText("BORRAR REPORTES");
        btnBorrarReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarReportesActionPerformed(evt);
            }
        });

        btnRegresar.setText("REGRESAR");

        jLabel17.setText("Gano Empate:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(linea1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(p5))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel5)
                                                            .addComponent(jLabel2)
                                                            .addComponent(jLabel4))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(p4)
                                                            .addComponent(p3)
                                                            .addComponent(p1)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtEmpates, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(130, 130, 130)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbnadador3)
                                                    .addComponent(lbnadador4)
                                                    .addComponent(lbnadador5)
                                                    .addComponent(lbnadador2)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(p2))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnIniciar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnReiniciar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnRegresar)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEjecucion_juego, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGanoEmpate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRerp2Na1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRerp2Na2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRerp2Na3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRerp2Na4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRerp2Na5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGanadorMas, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPerdioMas, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnReportes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBorrarReportes)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)))
                .addComponent(lbPicina, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linea5))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(linea0)
                .addGap(199, 199, 199))
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(linea2)
                .addGap(61, 61, 61)
                .addComponent(linea3)
                .addGap(71, 71, 71)
                .addComponent(linea4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbnadador1)
                    .addContainerGap(1158, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(linea1)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnIniciar)
                                            .addComponent(btnReiniciar)
                                            .addComponent(btnRegresar))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(lbnadador2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(cP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(p1))
                                                .addGap(7, 7, 7)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(p2)
                                                    .addComponent(jLabel3))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(lbnadador3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(p3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(p4))
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(p5))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(txtEjecucion_juego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbnadador4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(txtEmpates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtGanoEmpate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtRerp2Na1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtRerp2Na2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtRerp2Na3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtRerp2Na4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtRerp2Na5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtGanadorMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtPerdioMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnReportes)
                                    .addComponent(btnBorrarReportes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbnadador5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(linea5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbPicina, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linea2)
                    .addComponent(linea3)
                    .addComponent(linea4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linea0)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(lbnadador1)
                    .addContainerGap(717, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        //The Start button verifies the number of swimmers and which are the ones chosen to go swimming and also extracts the speed of each swimmer for then see 
        // which is the fastest and thus to be able to indicate which swimmer won and what lost and if there are draws.
        
        btnIniciar.setEnabled(false);//desactiva el boton
        SpinnerNumberModel cantP = new SpinnerNumberModel();
        cPlayer = (int) cP.getValue();
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Nadador1");
        nombres.add("Nadador2");
        nombres.add("Nadador3");
        nombres.add("Nadador4");
        nombres.add("Nadador5");

        try {
            int cont = 0;

            if (p1.isSelected() == true) {
                cont++;
                participantes.add(nombres.get(0));
            }
            if (p2.isSelected() == true) {
                cont++;
                participantes.add(nombres.get(1));
            }
            if (p3.isSelected() == true) {
                cont++;
                participantes.add(nombres.get(2));
            }
            if (p4.isSelected() == true) {
                cont++;
                participantes.add(nombres.get(3));
            }
            if (p5.isSelected() == true) {
                cont++;
                participantes.add(nombres.get(4));
            }
            if (cont == 1) {
                JOptionPane.showMessageDialog(rootPane, "No se pude competir con uno solo participante");
            } else if (cont == cPlayer) {
                //se inicia el juego

                if (cPlayer == 2) {
                    
                    System.out.println("Inicio de carrera");
                    contadorCarreras = contadorCarreras + 1;
                    System.out.println("cantidad carreras: " + contadorCarreras);
                    
                    for (int x = 0; x < participantes.size(); x++) {
                        if (participantes.get(x).contains("Nadador1")) {
                            inicioPrueba hilonadador1 = new inicioPrueba(40, y, lbnadador1);
                            hilonadador1.start();
                        }
                        if (participantes.get(x).contains("Nadador2")) {
                            inicioPrueba2 hilonadador2 = new inicioPrueba2(160, y, lbnadador2);
                            hilonadador2.start();
                        }
                        if (participantes.get(x).contains("Nadador3")) {
                            inicioPrueba3 hilonadador3 = new inicioPrueba3(280, y, lbnadador3);
                            hilonadador3.start();
                        }
                        if (participantes.get(x).contains("Nadador4")) {
                            inicioPrueba4 hilonadador4 = new inicioPrueba4(400, y, lbnadador4);
                            hilonadador4.start();
                        }
                        if (participantes.get(x).contains("Nadador5")) {
                            inicioPrueba5 hilonadador5 = new inicioPrueba5(520, y, lbnadador5);
                            hilonadador5.start();
                        }
                    }

                    tiempo.start();//inicia el cronometro
                    tiempo.setVisible(true);
                }

                if (cPlayer == 3) {
                    
                    System.out.println("Inicio de carrera");
                    contadorCarreras = contadorCarreras + 1;
                    System.out.println("cantidad carreras: " + contadorCarreras);
                    
                    for (int x = 0; x < participantes.size(); x++) {
                        if (participantes.get(x).contains("Nadador1")) {
                            inicioPrueba hilonadador1 = new inicioPrueba(40, y, lbnadador1);
                            hilonadador1.start();
                        }
                        if (participantes.get(x).contains("Nadador2")) {
                            inicioPrueba2 hilonadador2 = new inicioPrueba2(160, y, lbnadador2);
                            hilonadador2.start();
                        }
                        if (participantes.get(x).contains("Nadador3")) {
                            inicioPrueba3 hilonadador3 = new inicioPrueba3(280, y, lbnadador3);
                            hilonadador3.start();
                        }
                        if (participantes.get(x).contains("Nadador4")) {
                            inicioPrueba4 hilonadador4 = new inicioPrueba4(400, y, lbnadador4);
                            hilonadador4.start();
                        }
                        if (participantes.get(x).contains("Nadador5")) {
                            inicioPrueba5 hilonadador5 = new inicioPrueba5(520, y, lbnadador5);
                            hilonadador5.start();
                        }
                    }

                    tiempo.start();//inicia el cronometro
                    tiempo.setVisible(true);
                }
                if (cPlayer == 4) {
                    
                    System.out.println("Inicio de carrera");
                    contadorCarreras = contadorCarreras + 1;
                    System.out.println("cantidad carreras: " + contadorCarreras);
                    
                    for (int x = 0; x < participantes.size(); x++) {
                        if (participantes.get(x).contains("Nadador1")) {
                            inicioPrueba hilonadador1 = new inicioPrueba(40, y, lbnadador1);
                            hilonadador1.start();
                        }
                        if (participantes.get(x).contains("Nadador2")) {
                            inicioPrueba2 hilonadador2 = new inicioPrueba2(160, y, lbnadador2);
                            hilonadador2.start();
                        }
                        if (participantes.get(x).contains("Nadador3")) {
                            inicioPrueba3 hilonadador3 = new inicioPrueba3(280, y, lbnadador3);
                            hilonadador3.start();
                        }
                        if (participantes.get(x).contains("Nadador4")) {
                            inicioPrueba4 hilonadador4 = new inicioPrueba4(400, y, lbnadador4);
                            hilonadador4.start();
                        }
                        if (participantes.get(x).contains("Nadador5")) {
                            inicioPrueba5 hilonadador5 = new inicioPrueba5(520, y, lbnadador5);
                            hilonadador5.start();
                        }
                    }

                    tiempo.start();//inicia el cronometro
                    tiempo.setVisible(true);
                }
                if (cPlayer == 5) {
                    
                    System.out.println("Inicio de carrera");
                    contadorCarreras = contadorCarreras + 1;
                    System.out.println("cantidad carreras: " + contadorCarreras);
                    
                    for (int x = 0; x < participantes.size(); x++) {
                        if (participantes.get(x).contains("Nadador1")) {
                            inicioPrueba hilonadador1 = new inicioPrueba(40, y, lbnadador1);
                            hilonadador1.start();
                            
                        }
                        if (participantes.get(x).contains("Nadador2")) {
                            inicioPrueba2 hilonadador2 = new inicioPrueba2(160, y, lbnadador2);
                            hilonadador2.start();  
                            
                        }
                        if (participantes.get(x).contains("Nadador3")) {
                            inicioPrueba3 hilonadador3 = new inicioPrueba3(280, y, lbnadador3);
                            hilonadador3.start();  
                            
                        }
                        if (participantes.get(x).contains("Nadador4")) {
                            inicioPrueba4 hilonadador4 = new inicioPrueba4(400, y, lbnadador4);
                            hilonadador4.start();     
                            
                        }
                        if (participantes.get(x).contains("Nadador5")) {
                            inicioPrueba5 hilonadador5 = new inicioPrueba5(520, y, lbnadador5);
                            hilonadador5.start(); 
                            
                        }
                        
                    }
                    
                    tiempo.start();//inicia el cronometro
                    tiempo.setVisible(true);
                }
                
//                numeroMenor.clear();//BOORA EL CONTENIDO DE LISTA 
//                System.out.print(numeroMenor);
                
                for (int t = 0; t < participantes.size(); t++) {//comprueba si la lista tiene los nadadores activos para obtener la velocidad
                    if (participantes.get(t).contains("Nadador1")) {
                        valor1 = inicioPrueba.ritmo1;//captura el numero que genero el random
                        System.out.println("NA 1: "  + inicioPrueba.ritmo1 + " : " + valor1);
                        numeroMenor.add(valor1);//agrega a la lista para ver cual es mayor
                    }
                    if (participantes.get(t).contains("Nadador2")) {
                        valor2 = inicioPrueba2.ritmo2;//captura el numero que genero el random
                        System.out.println("NA 2: "  + inicioPrueba2.ritmo2 + " : " + valor2);
                        numeroMenor.add(valor2);//agrega a la lista para ver cual es mayor
                    }
                    if (participantes.get(t).contains("Nadador3")) {
                        valor3 = inicioPrueba3.ritmo3;//captura el numero que genero el random
                        System.out.println("NA 3: "  + inicioPrueba3.ritmo3 + " : " + valor3);
                        numeroMenor.add(valor3);//agrega a la lista para ver cual es mayor
                    }
                    if (participantes.get(t).contains("Nadador4")) {
                        valor4 = inicioPrueba4.ritmo4;//captura el numero que genero el random
                        System.out.println("NA 4: "  + inicioPrueba4.ritmo4 + " : " + valor4);
                        numeroMenor.add(valor4);//agrega a la lista para ver cual es mayor
                    }
                    if (participantes.get(t).contains("Nadador5")) {
                        valor5 = inicioPrueba5.ritmo5;//captura el numero que genero el random
                        System.out.println("NA 5: "  + inicioPrueba5.ritmo5 + " : " + valor5);
                        numeroMenor.add(valor5);//agrega a la lista para ver cual es mayor
                    }
                }
                Collections.sort(numeroMenor);

                for (int r = 0; r < numeroMenor.size(); r++) {//validad cual nadador tiene el numero que esta 
                    if (!numeroMenor.isEmpty()) {             //en la posicion 0 de la lista para sumarle 1 al contador
                        
                        if (numeroMenor.get(0) == numeroMenor.get(1)) {
                            comEmpate = comEmpate + 1;
                            break;
                        }
                        
                        if (numeroMenor.get(0).equals(valor1)) {
                            contmayor = contmayor + 1;
                            System.out.println("na1 " + contmayor);
                            break;

                        }
                        if (numeroMenor.get(0).equals(valor2)) {
                            contMayor2 = contMayor2 + 1;
                            System.out.println("na2 " + contMayor2);
                            break;

                        } else if (numeroMenor.get(0).equals(valor3)) {
                            contMayor3 = contMayor3 + 1;
                            System.out.println("na3 " + contMayor3);
                            break;

                        } else if (numeroMenor.get(0).equals(valor4)) {
                            contMayor4 = contMayor4 + 1;
                            System.out.println("na4 " + contMayor4);
                            break;

                        } else if (numeroMenor.get(0).equals(valor5)) {
                            contMayor5 = contMayor5 + 1;
                            System.out.println("na5 " + contMayor5);
                            break;
                        }
                    }
                }
                        
                Collections.sort(numeroMenor, Collections.reverseOrder());//ORDENA LA LISTA EN FORMA DECENDENTE
                System.out.println(numeroMenor);
                
                for (int q = 0; q < numeroMenor.size(); q++) {//validad cual nadador tiene el numero que esta 
                    if (!numeroMenor.isEmpty()) {             //en la posicion 0 de la lista para sumarle 1 al contador para cual a perdirdo mas
                        
                        if (numeroMenor.get(0).equals(valor1)) {
                            contMenor = contMenor + 1;
                            System.out.println("na1 PER " + contMenor);
                            break;

                        }
                        if (numeroMenor.get(0).equals(valor2)) {
                            contMenor2 = contMenor2 + 1;
                            System.out.println("na2 PER " + contMenor2);
                            break;

                        } else if (numeroMenor.get(0).equals(valor3)) {
                            contMenor3 = contMenor3 + 1;
                            System.out.println("na3 PER " + contMenor3);
                            break;

                        } else if (numeroMenor.get(0).equals(valor4)) {
                            contMenor4 = contMenor4 + 1;
                            System.out.println("na4 PER " + contMenor4);
                            break;

                        } else if (numeroMenor.get(0).equals(valor5)) {
                            contMenor5 = contMenor5 + 1;
                            System.out.println("na5 PER " + contMenor5);
                            break;
                        }
                    }
                }
                Collections.sort(numeroMenor);
                if (numeroMenor.isEmpty() == false) { //Para empates
                    if (numeroMenor.get(0) != 0 && numeroMenor.get(1) != 0) {
                        if (numeroMenor.get(0) == numeroMenor.get(1)) {

                            System.err.println("Empate entro");

                            Random numeroale1 = new Random();
                            Random numeroale2 = new Random();

                            if (numeroMenor.get(0).equals(valor1)) {
                                confirmacionNombre.add("Nadador1");
                            }
                            if (numeroMenor.get(0).equals(valor2)) {
                                confirmacionNombre.add("Nadador2");
                            }
                            if (numeroMenor.get(0).equals(valor3)) {
                                confirmacionNombre.add("Nadador3");

                            }
                            if (numeroMenor.get(0).equals(valor4)) {
                                confirmacionNombre.add("Nadador4");
                            }
                            if (numeroMenor.get(0).equals(valor5)) {
                                confirmacionNombre.add("Nadador5");
                            }

                            while (true) {
                                int valor1 = numeroale1.nextInt(20);
                                int valor2 = numeroale2.nextInt(20);

                                if (valor1 != valor2) {
                                    if (valor1 > valor2) {
                                        System.out.println("posicion 0");
                                        if (confirmacionNombre.get(0).contains("Nadador1")) {
                                            contmayor = contmayor + 1;
                                            txtGanoEmpate.setText("Nadador 1");
                                            break;
                                        }
                                        if (confirmacionNombre.get(0).contains("Nadador2")) {
                                            contMayor2 = contMayor2 + 1;
                                            txtGanoEmpate.setText("Nadador 2");
                                            break;
                                        }
                                        if (confirmacionNombre.get(0).contains("Nadador3")) {
                                            contMayor3 = contMayor3 + 1;
                                            txtGanoEmpate.setText("Nadador 3");
                                            break;
                                        }
                                        if (confirmacionNombre.get(0).contains("Nadador4")) {
                                            contMayor4 = contMayor4 + 1;
                                            txtGanoEmpate.setText("Nadador 4");
                                            break;
                                        }
                                        if (confirmacionNombre.get(0).contains("Nadador5")) {
                                            contMayor5 = contMayor5 + 1;
                                            txtGanoEmpate.setText("Nadador 5");
                                            break;
                                        }

                                    } else {
                                        System.out.println("posicion 1");
                                        if (confirmacionNombre.get(1).contains("Nadador1")) {
                                            contmayor = contmayor + 1;
                                            txtGanoEmpate.setText("Nadador 1");
                                            break;
                                        }
                                        if (confirmacionNombre.get(1).contains("Nadador2")) {
                                            contMayor2 = contMayor2 + 1;
                                            txtGanoEmpate.setText("Nadador 2");
                                            break;
                                        }
                                        if (confirmacionNombre.get(1).contains("Nadador3")) {
                                            contMayor3 = contMayor3 + 1;
                                            txtGanoEmpate.setText("Nadador 3");
                                            break;
                                        }
                                        if (confirmacionNombre.get(1).contains("Nadador4")) {
                                            contMayor4 = contMayor4 + 1;
                                            txtGanoEmpate.setText("Nadador 4");
                                            break;
                                        }
                                        if (confirmacionNombre.get(1).contains("Nadador5")) {
                                            contMayor5 = contMayor5 + 1;
                                            txtGanoEmpate.setText("Nadador 5");
                                            break;
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            } else if (cont == 0) {
                JOptionPane.showMessageDialog(rootPane, "No se puede competir sin participantes");
            } else {
                JOptionPane.showMessageDialog(rootPane, "El número de participantes no coincide");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "El número de participantes no coincide");
        }
        

        
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        //Resets some of the variables and lists to their original values.
        
        numeroMenor.clear();// borra el contenido de la lista
        System.out.println("contenido lista: " + numeroMenor);
        btnIniciar.setEnabled(true);//activa el boton
        participantes.clear();// borra el contenido de la lista 
        lbnadador1.setBounds(40, 550, 73, 100);//vuelve el jlabel a su posicion de origen
        lbnadador2.setBounds(160, 550, 73, 100);//vuelve el jlabel a su posicion de origen
        lbnadador3.setBounds(280, 550, 73, 100);//vuelve el jlabel a su posicion de origen
        lbnadador4.setBounds(400, 550, 73, 100);//vuelve el jlabel a su posicion de origen
        lbnadador5.setBounds(520, 550, 73, 100);//vuelve el jlabel a su posicion de origen
        p1.setSelected(false);//deselecciona el juegador seleccionado
        p2.setSelected(false);//deselecciona el juegador seleccionado
        p3.setSelected(false);//deselecciona el juegador seleccionado
        p4.setSelected(false);//deselecciona el juegador seleccionado
        p5.setSelected(false);//deselecciona el juegador seleccionado
        tiempo.stop1();//detiene el cronometro
        tiempo.actualizar();
        tiempo.setVisible(true); 
        valor1 = 0;
        valor2 = 0;
        valor3 = 0; 
        valor4 = 0; 
        valor5 = 0;
        confirmacionNombre.clear();
        inicioPrueba.limite1 = 0;
        inicioPrueba2.limite2 = 0;
        inicioPrueba3.limite3 = 0;
        inicioPrueba4.limite4 = 0;
        inicioPrueba5.limite5 = 0;
        inicioPrueba.verdad1 = 0;
        inicioPrueba2.verdad2 = 0;
        inicioPrueba3.verdad3 = 0;
        inicioPrueba4.verdad4 = 0;
        inicioPrueba5.verdad5 = 0;
        Cronometro_3.suma = 0;
        Cronometro_3.suma2 = 0;
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        //The reports button executes all the reports and verifies which of the counters of each swimmer is 
        //greater to indicate which swimmer is the one that is gaining more.
        
        txtEjecucion_juego.setText(String.valueOf(contadorCarreras));
        txtEmpates.setText(String.valueOf(comEmpate)); 
        cambio = contmayor;
        cambio2 = contMayor2;
        cambio3 = contMayor3;
        cambio4 = contMayor4;
        cambio5 = contMayor5;
        remplazo1 = contMenor;
        remplazo2 = contMenor2;
        remplazo3 = contMenor3;
        remplazo4 = contMenor4;
        remplazo5 = contMenor5;
        
        txtRerp2Na1.setText(String.valueOf(cambio));
        txtRerp2Na2.setText(String.valueOf(cambio2));
        txtRerp2Na3.setText(String.valueOf(cambio3));
        txtRerp2Na4.setText(String.valueOf(cambio4));
        txtRerp2Na5.setText(String.valueOf(cambio5));
        
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< GANADO MAS >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>//
        if(cambio > cambio2){//validad si es mayor  que los demas para decir que es el nadador con mas competencias ganadas
            if(cambio > cambio3){
                if(cambio > cambio4){
                    if(cambio > cambio5){
                        txtGanadorMas.setText("EL NADADOR 1 HA GANADO MAS");
                    }
                }
            }
        }
        if(cambio2 > cambio){//validad si es mayor  que los demas para decir que es el nadador con mas competencias ganadas
            if(cambio2 > cambio3){
                if(cambio2 > cambio4){
                    if(cambio2 > cambio5){
                        txtGanadorMas.setText("EL NADADOR 2 HA GANADO MAS");
                    }
                }
            }
        } 
        if(cambio3 > cambio){//validad si es mayor  que los demas para decir que es el nadador con mas competencias ganadas
            if(cambio3 > cambio2){
                if(cambio3 > cambio4){
                    if(cambio3 > cambio5){
                        txtGanadorMas.setText("EL NADADOR 3 HA GANADO MAS");
                    }
                }
            }
        }
        if(cambio4 > cambio){//validad si es mayor  que los demas para decir que es el nadador con mas competencias ganadas
            if(cambio4 > cambio2){
                if(cambio4 > cambio3){
                    if(cambio4 > cambio5){
                        txtGanadorMas.setText("EL NADADOR 4 HA GANADO MAS");
                    }
                }
            }
        }
        if(cambio5 > cambio){//validad si es mayor  que los demas para decir que es el nadador con mas competencias ganadas
            if(cambio5 > cambio2){
                if(cambio5 > cambio3){
                    if(cambio5 > cambio4){
                        txtGanadorMas.setText("EL NADADOR 5 HA GANADO MAS");
                    }
                }
            }
        }

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< PERDIDO MAS >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>//
        if(remplazo1 > remplazo2){//validad si es mayor  que los demas para decir que es el nadador con mas competencias ganadas
            if(remplazo1 > remplazo3){
                if(remplazo1 > remplazo4){
                    if(remplazo1 > remplazo5){
                        txtPerdioMas.setText("EL NADADOR 1 HA PERDIDO MAS");
                    }
                }
            }
        }
        if(remplazo2 > remplazo1){//validad si es mayor  que los demas para decir que es el nadador con mas competencias ganadas
            if(remplazo2 > remplazo3){
                if(remplazo2 > remplazo4){
                    if(remplazo2 > remplazo5){
                        txtPerdioMas.setText("EL NADADOR 2 HA PERDIDO MAS");
                    }
                }
            }
        } 
        if(remplazo3 > remplazo1){//validad si es mayor  que los demas para decir que es el nadador con mas competencias ganadas
            if(remplazo3 > remplazo2){
                if(remplazo3 > remplazo4){
                    if(remplazo3 > remplazo5){
                        txtPerdioMas.setText("EL NADADOR 3 HA PERDIDO MAS");
                    }
                }
            }
        }
        if(remplazo4 > remplazo1){//validad si es mayor  que los demas para decir que es el nadador con mas competencias ganadas
            if(remplazo4 > remplazo2){
                if(remplazo4 > remplazo3){
                    if(remplazo4 > remplazo5){
                        txtPerdioMas.setText("EL NADADOR 4 HA PERDIDO MAS");
                    }
                }
            }
        }
        if(remplazo5 > remplazo1){//validad si es mayor  que los demas para decir que es el nadador con mas competencias ganadas
            if(remplazo5 > remplazo2){
                if(remplazo5 > remplazo3){
                    if(remplazo5 > remplazo4){
                        txtPerdioMas.setText("EL NADADOR 5 HA PERDIDO MAS");
                    }
                }
            }
        }
        numeroMenor.clear();// boora la lista es por seguridad
        System.out.print(numeroMenor);

    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnBorrarReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarReportesActionPerformed
        //Resets all counters and JLabels of each report to their original value.
        
        cambio = 0;
        cambio2 = 0;
        cambio3 = 0;
        cambio4 = 0;
        cambio5 = 0;
        remplazo1 = 0;
        remplazo2 = 0;
        remplazo3 = 0;
        remplazo4 = 0;
        remplazo5 = 0;
        contmayor = 0;
        contMayor2 = 0;
        contMayor3 = 0;
        contMayor4 = 0;
        contMayor5 = 0;
        contMenor = 0;
        contMenor2 = 0;
        contMenor3 = 0;
        contMenor4 = 0;
        contMenor5 = 0;
        contadorCarreras = 0;
        txtGanoEmpate.setText(null);
        txtPerdioMas.setText(null);
        txtGanadorMas.setText(null);
        txtRerp2Na1.setText(null);
        txtRerp2Na2.setText(null);
        txtRerp2Na3.setText(null);
        txtRerp2Na4.setText(null);
        txtRerp2Na5.setText(null);
        txtEjecucion_juego.setText(null);
        txtEmpates.setText(null);
    }//GEN-LAST:event_btnBorrarReportesActionPerformed
    
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
            java.util.logging.Logger.getLogger(Juego_Picina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego_Picina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego_Picina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego_Picina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego_Picina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarReportes;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnReportes;
    private javax.swing.JSpinner cP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbPicina;
    private javax.swing.JLabel lbnadador1;
    private javax.swing.JLabel lbnadador2;
    private javax.swing.JLabel lbnadador3;
    private javax.swing.JLabel lbnadador4;
    private javax.swing.JLabel lbnadador5;
    private javax.swing.JLabel linea0;
    private javax.swing.JLabel linea1;
    private javax.swing.JLabel linea2;
    private javax.swing.JLabel linea3;
    private javax.swing.JLabel linea4;
    private javax.swing.JLabel linea5;
    private javax.swing.JRadioButton p1;
    private javax.swing.JRadioButton p2;
    private javax.swing.JRadioButton p3;
    private javax.swing.JRadioButton p4;
    private javax.swing.JRadioButton p5;
    private javax.swing.JTextField txtEjecucion_juego;
    private javax.swing.JTextField txtEmpates;
    private javax.swing.JTextField txtGanadorMas;
    private javax.swing.JTextField txtGanoEmpate;
    private javax.swing.JTextField txtPerdioMas;
    private javax.swing.JTextField txtRerp2Na1;
    private javax.swing.JTextField txtRerp2Na2;
    private javax.swing.JTextField txtRerp2Na3;
    private javax.swing.JTextField txtRerp2Na4;
    private javax.swing.JTextField txtRerp2Na5;
    // End of variables declaration//GEN-END:variables

    //jugador1
    private static class inicioPrueba extends Thread {
        //Initializes the thread configurations in order to execute it.
        
        int posicionInicix, limitepista; // se crean las varibles 
        JLabel nadador1;

        public inicioPrueba(int posicionInicix, int limitepista, JLabel nadador) {
            this.posicionInicix = posicionInicix; // inicializa la variable
            this.limitepista = limitepista; // inicializa la variable
            this.nadador1 = nadador; // inicializa la variable
        }
       
        public static int limite1;
        
        public static int verdad1;

        @Override
        public void run() {
            verdad1 = 1;
            Random velocidad = new Random();
            ritmo1 = velocidad.nextInt(70)+10;// genera la velocidad del nadador
            for (int i = limitepista - 150; i > 0; i--) { // limite en la cual se tiene que detener el nadador 

                nadador1.setBounds(posicionInicix, i, 73, 100); // posicion en la que comienza el nadador
                try {
                    sleep(ritmo1);//velocidad de nadador 
                } catch (Exception e) {

                }
            }
            System.out.println("participante: " + "nadador 1 la velocidad es de: " + ritmo1);
            limite1 = 700;
        }
        public static int ritmo1;
    }

    //jugador 2
    private static class inicioPrueba2 extends Thread {
         //Initializes the thread configurations in order to execute it.
        
        int posicionInicix, limitepista;
        JLabel nadador2;

        public inicioPrueba2(int posicionInicix, int limitepista, JLabel nadador) {
            this.posicionInicix = posicionInicix;
            this.limitepista = limitepista;
            this.nadador2 = nadador;
        }
        
        public static int limite2;
        
        public static int verdad2;

        @Override
        public void run() {
            verdad2 = 1;
            Random velocidad = new Random();
            ritmo2 = velocidad.nextInt(70)+10;// genera la velocidad del nadador
            for (int i = limitepista - 150; i > 0; i--) {// limite en la cual se tiene que detener el nadador

                nadador2.setBounds(posicionInicix, i, 73, 100);// posicion de inicio del nadador
                try {
                    sleep(ritmo2);//velocidad de nadador 
                } catch (Exception e) {

                }
            }
            System.out.println("participante: " + "nadador 2 la velocidad es de: " + ritmo2);
            limite2 = 700;
        }
        public static int ritmo2;
    }

    //jugador 3
    private static class inicioPrueba3 extends Thread {
        //Initializes the thread configurations in order to execute it.
        
        int posicionInicix, limitepista;
        JLabel nadador3;

        public inicioPrueba3(int posicionInicix, int limitepista, JLabel nadador) {
            this.posicionInicix = posicionInicix;
            this.limitepista = limitepista;
            this.nadador3 = nadador;
        }
        
        public static int limite3;
        
        public static int verdad3;

        @Override
        public void run() {
            verdad3 = 1;
            Random velocidad = new Random();
            ritmo3 = velocidad.nextInt(70)+10;// genera la velocidad del nadador
            for (int i = limitepista - 150; i > 0; i--) {// limite en la cual se tiene que detener el nadador

                nadador3.setBounds(posicionInicix, i, 73, 100);// posicion de inicio del nadador
                try {
                    sleep(ritmo3);//velocidad de nadador
                } catch (Exception e) {

                }
            }
            System.out.println("participante: " + "nadador 3 la velocidad es de: " + ritmo3);
            limite3 = 700;
        }
        public static int ritmo3;
    }

    //jugador4
    private static class inicioPrueba4 extends Thread {
        //Initializes the thread configurations in order to execute it.
        
        int posicionInicix, limitepista;
        JLabel nadador4;

        public inicioPrueba4(int posicionInicix, int limitepista, JLabel nadador) {
            this.posicionInicix = posicionInicix;
            this.limitepista = limitepista;
            this.nadador4 = nadador;
        }
        
        public static int limite4;
        
        public static int verdad4;

        @Override
        public void run() {
            verdad4 = 1;
            Random velocidad = new Random();
            ritmo4 = velocidad.nextInt(70)+10;// genera la velocidad del nadador
            for (int i = limitepista - 150; i > 0; i--) {// limite en la cual se tiene que detener el nadador

                nadador4.setBounds(posicionInicix, i, 73, 100);// posicion de inicio del nadador
                try {
                    sleep(ritmo4);//velocidad de nadador
                } catch (Exception e) {

                }
            }
            System.out.println("participante: " + "nadador 4 la velocidad es de: " + ritmo4);
            limite4 = 700;;
        }
        public static int ritmo4;
    }

    //jugador5
    private static class inicioPrueba5 extends Thread {
        //Initializes the thread configurations in order to execute it. 
        
        int posicionInicix, limitepista;
        JLabel nadador5;

        public inicioPrueba5(int posicionInicix, int limitepista, JLabel nadador) {
            this.posicionInicix = posicionInicix;
            this.limitepista = limitepista;
            this.nadador5 = nadador;
        }
        
        public static int limite5;
        
        public static int verdad5;

        @Override
        public void run() {
            verdad5 = 1;
            Random velocidad = new Random();
            ritmo5 = velocidad.nextInt(70)+10;// genera la velocidad del nadador
            for (int i = limitepista - 150; i > 0; i--) {// limite en la cual se tiene que detener el nadador

                nadador5.setBounds(posicionInicix, i, 73, 100);// posicion de inicio del nadador
                try {
                    sleep(ritmo5);//velocidad de nadador
                } catch (Exception e) {

                }
            }
            System.out.println("participante: " + "nadador 5 la velocidad es de: " + ritmo5);
            limite5 = 700;
        }
        public static int ritmo5;
    }
    private static class Cronometro_3 extends javax.swing.JFrame{
        //The timer window is created.
        /**
         * Creates new form Cronometro_3
         */
        public Cronometro_3() {
            initComponents();
            setLocationRelativeTo(null); // ubcaion centro
            t = new Timer(10, acciones);// cada 10 milesegundos va ejecutar una accion
            this.setSize(300, 120);
            this.setResizable(false);//bloquea minimizar
            this.setAlwaysOnTop(true);//siempre al frente 
            this.setTitle("Cronometro");
            this.getContentPane().setBackground(Color.GREEN);
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            etiquetaTiempo = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLabel1.setText("Cronometro");

            etiquetaTiempo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            etiquetaTiempo.setText("00:00:00:00");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(29, 29, 29)
                                                    
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    )
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(95, 95, 95)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(etiquetaTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))))
                                    .addContainerGap(58, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(etiquetaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            )
                                    .addContainerGap(46, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>                        
        public static int suma2 = 0;
        public static int suma = 0;
        private Timer t;
        private int h, m, s, cs; // cs son centesimas de segunodos
        private ActionListener acciones = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 suma2 = inicioPrueba.verdad1+inicioPrueba2.verdad2 + inicioPrueba3.verdad3 + inicioPrueba4.verdad4 + inicioPrueba5.verdad5;
                t.start();
                //System.err.println("la suma2 " + suma2);
                cs++;
                if (cs == 100) {
                    cs = 0;
                    s++;
                }
                if (s == 60) {
                    s = 0;
                    m++;
                }
                if (m == 60) {
                    m = 0;
                    h++;
                }
                suma = inicioPrueba.limite1 + inicioPrueba2.limite2 + inicioPrueba3.limite3 + inicioPrueba4.limite4 + inicioPrueba5.limite5;
                actualizarLabel();// actuliza el label
                
                if (suma2 == 5) {
                    //System.err.println("entro al 5");
                    if (suma == 3500) {//700*5
                        t.stop();
                        suma2 = 0;
                        suma = 0;
                    }
                }

                if (suma2 == 4) {
                    //System.err.println("entro al 4");
                    if (suma == 2800) {//700*4
                        t.stop();
                        suma2 = 0;
                        suma = 0;
                    }
                }

                if (suma2 == 3) {
                    //System.err.println("entro al 3");
                    if (suma == 2100) {//700*3
                        t.stop();
                        suma2 = 0;
                        suma = 0;
                    }
                }

                if (suma2 == 2) {
                    //System.err.println("entro al 2");
                    if (suma == 1400) {//700*2
                        t.stop();
                        suma2 = 0;
                        suma = 0;
                    }
                }
            }
        };

        private void actualizarLabel() {
            String tiempo = (h <= 9 ? "0" : "") + h + ":" + (m <= 9 ? "0" : "") + m + ":" + (s <= 9 ? "0" : "") + s + ":" + (cs <= 9 ? "0" : "") + cs;
            etiquetaTiempo.setText(tiempo);// para que cuando hora o minuto o segundo o centesima de segundo sea menor a 9 se remplace por 0
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
                java.util.logging.Logger.getLogger(Cronometro_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Cronometro_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Cronometro_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Cronometro_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Cronometro_3().setVisible(true);
                }
            });
        }

        // Variables declaration - do not modify                     
        private javax.swing.JLabel etiquetaTiempo;
        private javax.swing.JLabel jLabel1;
        // End of variables declaration                   

        void start() {
            t.start(); /// permite que en la ventana de piscina se pueda iniciar el cronometro 
            ///cuando se oprime el boton de inicio
        }

        void stop1() {
            t.stop();// es para detener el cronometro desde otra ventan pero no sirve todavia
        }

        void actualizar() {
            h = 0;
            m = 0;
            s = 0;
            cs = 0; // se recetean los valores para iniciar desde 0
            actualizarLabel(); // se actuliza el label para que quede en 0
        }
    }
}