/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import clases.Conectar;
import clases.Metodos_sql;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Acer
 */
public class MarcarSalidaAlumnos extends javax.swing.JFrame implements Runnable {

    public static PreparedStatement pst;
    public static ResultSet rs;
    Conectar conexion = new Conectar();
    Connection con = conexion.conectar();

    Metodos_sql metodos = new Metodos_sql();

    String hora, minutos, segundos;
    Thread hilo;

    public MarcarSalidaAlumnos() {
        initComponents();

        setSize(811, 500);
        //Color JFrame
        this.getContentPane().setBackground(Color.WHITE);
        //Color JPanel
        jPanel1.setBackground(new Color(0, 106, 176));

        setLocationRelativeTo(null);

        //para la hora que aparezca en el label
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
    }
    //hora
    public void hora() {
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }

    //CORRER LO DE LA SHORAS
    public void run() {
        Thread current = Thread.currentThread();

        while (current == hilo) {
            hora();
            lbl_horaSalidaAlumno.setText(hora + ":" + minutos + ":" + segundos);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lbl_regresarAsistencia = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_horaSalidaAlumno = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_salidaAlumno = new javax.swing.JTextField();
        btn_salidaAlumno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Hora: ");

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("UNIVERSIDAD POLITÉCNICA DE VICTORIA");

        lbl_regresarAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/espalda (1).png"))); // NOI18N
        lbl_regresarAsistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_regresarAsistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_regresarAsistenciaMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MARCADOR DE SALIDA ALUMNOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbl_regresarAsistencia)
                .addGap(135, 135, 135)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_regresarAsistencia)
                        .addGap(0, 30, Short.MAX_VALUE))))
        );

        lbl_horaSalidaAlumno.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "LECTOR CÓDIGO DE BARRAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        txt_salidaAlumno.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txt_salidaAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_salidaAlumnoKeyPressed(evt);
            }
        });

        btn_salidaAlumno.setBackground(new java.awt.Color(0, 51, 204));
        btn_salidaAlumno.setForeground(new java.awt.Color(255, 255, 255));
        btn_salidaAlumno.setText("REGISTRAR SALIDA");
        btn_salidaAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salidaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salidaAlumnoActionPerformed(evt);
            }
        });
        btn_salidaAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_salidaAlumnoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_salidaAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salidaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(txt_salidaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_salidaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escaner (4).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(16, 16, 16)
                .addComponent(lbl_horaSalidaAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbl_horaSalidaAlumno))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_regresarAsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_regresarAsistenciaMouseClicked
        PrincipalUsuarios ventana = new PrincipalUsuarios();
        //para que aparezca la nueva venta y se oculte esta
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_regresarAsistenciaMouseClicked

    private void txt_salidaAlumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_salidaAlumnoKeyPressed

    }//GEN-LAST:event_txt_salidaAlumnoKeyPressed

    private void btn_salidaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salidaAlumnoActionPerformed
        // TODO add your handling code here:
        //Connection con = conexion.conectar();
        if (!txt_salidaAlumno.getText().equals("")) {
            //***********************VERIFICA QUE LO INGRESADO YA ESTÉ REGISTRADO EN LA BD***********************
            String campo = txt_salidaAlumno.getText();
            //variable para poner el where para la consulta
            String where = "";
            where = "WHERE id_alumno = '" + campo + "'";

            //variable para avisar si esta registrado
            boolean aviso = false;
            try {
                String sql = "SELECT * FROM asistencia " + where;
                System.out.println(sql);
                pst = con.prepareStatement(sql);

                rs = pst.executeQuery();

                while (rs.next()) {
                    String comparar = rs.getString("id_alumno");

                    if (comparar.equals(campo)) {
                        aviso = true;
                        //int i = metodos.salidaAlumno(lbl_horaSalidaAlumno.getText());
                    }
                }
                //AQUIIII
                if (aviso == true) {
                    int i = metodos.salidaAlumno(lbl_horaSalidaAlumno.getText());
                    HistorialAsistencia ventana = new HistorialAsistencia();
                    ventana.setVisible(true);
                    this.dispose();
                }

            } catch (Exception ex) {
                System.err.println(ex.toString());
            }
            if (aviso == false) {
                JOptionPane.showMessageDialog(null, "Este alumno no ha ingresado una entrada al laboratorio");
            }
        } else {
            JOptionPane.showMessageDialog(null, "PASE EL LECTOR DE BARRAS POR SU CREDENCIAL");
        }
    }//GEN-LAST:event_btn_salidaAlumnoActionPerformed

    private void btn_salidaAlumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_salidaAlumnoKeyPressed

    }//GEN-LAST:event_btn_salidaAlumnoKeyPressed

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
            java.util.logging.Logger.getLogger(MarcarSalidaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcarSalidaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcarSalidaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcarSalidaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcarSalidaAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salidaAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_horaSalidaAlumno;
    private javax.swing.JLabel lbl_regresarAsistencia;
    public static javax.swing.JTextField txt_salidaAlumno;
    // End of variables declaration//GEN-END:variables
}
