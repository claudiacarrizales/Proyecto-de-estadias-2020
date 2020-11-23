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
public class MarcarAsistenciaMaestro extends javax.swing.JFrame implements Runnable{

    public static PreparedStatement pst;
    public static ResultSet rs;
    Conectar conexion = new Conectar();
    Connection con = conexion.conectar();

    String hora, minutos, segundos;
    Thread hilo;
    
    public MarcarAsistenciaMaestro() {
        initComponents();

        setSize(811, 500);
        //Color JFrame
        this.getContentPane().setBackground(Color.WHITE);
        //Color JPanel
        jPanel1.setBackground(new Color(0, 106, 176));

        setLocationRelativeTo(null);

        //mandar la hora al label
        lbl_fechaMaestro.setText(fechaActual());
        //para la hora que aparezca en el label
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lbl_regresarAsistencia = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txt_asistenciaMaestro = new javax.swing.JTextField();
        btn_asistenciaMaestro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_fechaMaestro = new javax.swing.JLabel();
        lbl_horaMaestro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lector-de-huellas-digitales.png"))); // NOI18N

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
        jLabel4.setText("MARCADOR DE ASISTENCIA MAESTROS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbl_regresarAsistencia)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel4)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_regresarAsistencia)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Huella Digital", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        txt_asistenciaMaestro.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txt_asistenciaMaestro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_asistenciaMaestroKeyPressed(evt);
            }
        });

        btn_asistenciaMaestro.setBackground(new java.awt.Color(0, 51, 204));
        btn_asistenciaMaestro.setForeground(new java.awt.Color(255, 255, 255));
        btn_asistenciaMaestro.setText("REGISTRAR ASISTENCIA");
        btn_asistenciaMaestro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_asistenciaMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asistenciaMaestroActionPerformed(evt);
            }
        });
        btn_asistenciaMaestro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_asistenciaMaestroKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_asistenciaMaestro, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_asistenciaMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(txt_asistenciaMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_asistenciaMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Fecha: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Hora: ");

        lbl_fechaMaestro.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lbl_horaMaestro.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_fechaMaestro)
                    .addComponent(lbl_horaMaestro))
                .addGap(47, 47, 47)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(lbl_fechaMaestro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(lbl_horaMaestro)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Metodos_sql metodos = new Metodos_sql();
    //agregar fecha actual al label

    public static String fechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
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
            lbl_horaMaestro.setText(hora + ":" + minutos + ":" + segundos);
        }
    }
    
    private void lbl_regresarAsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_regresarAsistenciaMouseClicked
        PrincipalUsuarios ventana = new PrincipalUsuarios();
        //para que aparezca la nueva venta y se oculte esta
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_regresarAsistenciaMouseClicked

    private void txt_asistenciaMaestroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_asistenciaMaestroKeyPressed

    }//GEN-LAST:event_txt_asistenciaMaestroKeyPressed

    private void btn_asistenciaMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asistenciaMaestroActionPerformed
        // TODO add your handling code here:
        if (!txt_asistenciaMaestro.getText().equals("")) {
            //***********************VERIFICA QUE LO INGRESADO YA ESTÉ REGISTRADO EN LA BD***********************
            String campo = txt_asistenciaMaestro.getText();
            //variable para poner el where para la consulta
            String where = "";
            where = "WHERE huella = '" + campo + "'";

            //variable para avisar si esta registrado
            boolean aviso = false;
            try {
                //aqui quite el * por los campos*****************************
                String sql = "SELECT * FROM maestro " + where;
                System.out.println(sql);
                pst = con.prepareStatement(sql);

                rs = pst.executeQuery();

                while (rs.next()) {
                    String comparar = rs.getString("huella");

                    if (comparar.equals(campo)) {
                        aviso = true;
                        int i = metodos.asistenciaMaestro(txt_asistenciaMaestro.getText(), lbl_fechaMaestro.getText(), lbl_horaMaestro.getText());

                        HistorialAsistenciaMaestro ventana = new HistorialAsistenciaMaestro();
                        //para que aparezca la nueva venta y se oculte esta
                        ventana.setVisible(true);
                        this.dispose();
                    }
                }
            } catch (Exception ex) {
                System.err.println(ex.toString());
            }
            if (aviso == false) {
                JOptionPane.showMessageDialog(null, "El código ingresado no está registrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡Vuelva a intentarlo!");
        }
    }//GEN-LAST:event_btn_asistenciaMaestroActionPerformed

    
    private void btn_asistenciaMaestroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_asistenciaMaestroKeyPressed
        
    }//GEN-LAST:event_btn_asistenciaMaestroKeyPressed

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
            java.util.logging.Logger.getLogger(MarcarAsistenciaMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcarAsistenciaMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcarAsistenciaMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcarAsistenciaMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcarAsistenciaMaestro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_asistenciaMaestro;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbl_fechaMaestro;
    private javax.swing.JLabel lbl_horaMaestro;
    private javax.swing.JLabel lbl_regresarAsistencia;
    private javax.swing.JTextField txt_asistenciaMaestro;
    // End of variables declaration//GEN-END:variables
}
