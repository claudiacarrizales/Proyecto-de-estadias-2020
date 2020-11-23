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

public class MarcarAsistencia extends javax.swing.JFrame implements Runnable {

    public static PreparedStatement pst;
    public static ResultSet rs;
    Conectar conexion = new Conectar();
    Connection con = conexion.conectar();

    String hora, minutos, segundos;
    Thread hilo;

    public MarcarAsistencia() {
        initComponents();

        setSize(811, 500);
        //Color JFrame
        this.getContentPane().setBackground(Color.WHITE);
        //Color JPanel
        jPanel1.setBackground(new Color(0, 106, 176));

        setLocationRelativeTo(null);

        //mandar la hora al label
        lbl_fechaAlumno.setText(fechaActual());
        //para la hora que aparezca en el label
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        label_huellaMaestro = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lbl_regresarAsistencia = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_asistenciaAlumno = new javax.swing.JTextField();
        btn_asistenciaAlumno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_fechaAlumno = new javax.swing.JLabel();
        lbl_horaAlumno = new javax.swing.JLabel();

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Huella Digital", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION)));

        label_huellaMaestro.setText("jLabel7");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_huellaMaestro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_huellaMaestro, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
        jLabel4.setText("MARCADOR DE ASISTENCIA ALUMNOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbl_regresarAsistencia)
                .addGap(165, 165, 165)
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "LECTOR CÓDIGO DE BARRAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        txt_asistenciaAlumno.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txt_asistenciaAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_asistenciaAlumnoKeyPressed(evt);
            }
        });

        btn_asistenciaAlumno.setBackground(new java.awt.Color(0, 51, 204));
        btn_asistenciaAlumno.setForeground(new java.awt.Color(255, 255, 255));
        btn_asistenciaAlumno.setText("REGISTRAR ASISTENCIA");
        btn_asistenciaAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_asistenciaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asistenciaAlumnoActionPerformed(evt);
            }
        });
        btn_asistenciaAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_asistenciaAlumnoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_asistenciaAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_asistenciaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(txt_asistenciaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_asistenciaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escaner (4).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Fecha: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Hora: ");

        lbl_fechaAlumno.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lbl_horaAlumno.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_fechaAlumno)
                    .addComponent(lbl_horaAlumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbl_fechaAlumno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbl_horaAlumno))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
            lbl_horaAlumno.setText(hora + ":" + minutos + ":" + segundos);
        }
    }


    private void lbl_regresarAsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_regresarAsistenciaMouseClicked
        PrincipalUsuarios ventana = new PrincipalUsuarios();
        //para que aparezca la nueva venta y se oculte esta
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_regresarAsistenciaMouseClicked

    private void txt_asistenciaAlumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_asistenciaAlumnoKeyPressed

    }//GEN-LAST:event_txt_asistenciaAlumnoKeyPressed

    private void btn_asistenciaAlumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_asistenciaAlumnoKeyPressed
        
    }//GEN-LAST:event_btn_asistenciaAlumnoKeyPressed

    private void btn_asistenciaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asistenciaAlumnoActionPerformed
        // TODO add your handling code here:
        if (!txt_asistenciaAlumno.getText().equals("")) {
            //***********************VERIFICA QUE LO INGRESADO YA ESTÉ REGISTRADO EN LA BD***********************
            String campo = txt_asistenciaAlumno.getText();
            //variable para poner el where para la consulta
            String where = "";
            where = "WHERE codigo = '" + campo + "'";

            //variable para avisar si esta registrado
            boolean aviso = false;
            try {
                String sql = "SELECT * FROM alumno " + where;
                System.out.println(sql);
                pst = con.prepareStatement(sql);

                rs = pst.executeQuery();

                while (rs.next()) {
                    String comparar = rs.getString("codigo");

                    if (comparar.equals(campo)) {
                        aviso = true;
                        int i = metodos.asistenciaAlumno(rs.getString("id_a"), txt_asistenciaAlumno.getText(), lbl_fechaAlumno.getText(), lbl_horaAlumno.getText());

                        HistorialAsistencia ventana = new HistorialAsistencia();
                        //para que aparezca la nueva venta y se oculte esta
                        ventana.setVisible(true);
                        this.dispose();
                    }
                }
                /*HistorialAsistencia ventana = new HistorialAsistencia();
                //para que aparezca la nueva venta y se oculte esta
                ventana.setVisible(true);
                this.dispose();*/
                
            } catch (Exception ex) {
                System.err.println(ex.toString());
            }
            if (aviso == false) {
                JOptionPane.showMessageDialog(null, "El código ingresado no está registrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "PASE EL LECTOR DE BARRAS POR SU CREDENCIAL");
        }
    }//GEN-LAST:event_btn_asistenciaAlumnoActionPerformed

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
            java.util.logging.Logger.getLogger(MarcarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcarAsistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_asistenciaAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel label_huellaMaestro;
    private javax.swing.JLabel lbl_fechaAlumno;
    private javax.swing.JLabel lbl_horaAlumno;
    private javax.swing.JLabel lbl_regresarAsistencia;
    private javax.swing.JTextField txt_asistenciaAlumno;
    // End of variables declaration//GEN-END:variables
}
