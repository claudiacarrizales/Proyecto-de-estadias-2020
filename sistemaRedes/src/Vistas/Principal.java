package Vistas;

import clases.Conectar;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Principal extends javax.swing.JFrame {

    public static PreparedStatement pst;
    public static ResultSet rs;
    Conectar conexion = new Conectar();
    Connection con = conexion.conectar();

    public Principal() {
        initComponents();

        setSize(811, 500);
        //Color JFrame
        this.getContentPane().setBackground(Color.WHITE);
        //Color JPanel
        jPanel1.setBackground(new Color(0, 106, 176));

        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lbl_salir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menu_alumnos = new javax.swing.JLabel();
        menu_maestros = new javax.swing.JLabel();
        btn_alumnos = new javax.swing.JButton();
        btn_maestros = new javax.swing.JButton();
        delete_historialA = new javax.swing.JButton();
        delete_historialM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("UNIVERSIDAD POLITÉCNICA DE VICTORIA");

        lbl_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        lbl_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_salirMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(108, 108, 108)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(lbl_salir)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(lbl_salir)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu_alumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gerente.png"))); // NOI18N

        menu_maestros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profesor.png"))); // NOI18N

        btn_alumnos.setBackground(new java.awt.Color(16, 40, 144));
        btn_alumnos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_alumnos.setForeground(new java.awt.Color(255, 255, 255));
        btn_alumnos.setText("ALUMNOS");
        btn_alumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alumnosActionPerformed(evt);
            }
        });

        btn_maestros.setBackground(new java.awt.Color(16, 40, 144));
        btn_maestros.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_maestros.setForeground(new java.awt.Color(255, 255, 255));
        btn_maestros.setText("MAESTROS");
        btn_maestros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_maestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_maestrosActionPerformed(evt);
            }
        });

        delete_historialA.setBackground(new java.awt.Color(255, 51, 51));
        delete_historialA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete_historialA.setForeground(new java.awt.Color(255, 255, 255));
        delete_historialA.setText("VACIAR EL HISTORIAL DE ASISTENCIAS ALUMNOS");
        delete_historialA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_historialA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_historialAActionPerformed(evt);
            }
        });

        delete_historialM.setBackground(new java.awt.Color(255, 51, 51));
        delete_historialM.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete_historialM.setForeground(new java.awt.Color(255, 255, 255));
        delete_historialM.setText("VACIAR EL HISTORIAL DE ASISTENCIAS MAESTROS");
        delete_historialM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_historialM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_historialMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(menu_maestros))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(delete_historialM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_maestros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_alumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delete_historialA, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(menu_alumnos)
                        .addGap(167, 167, 167))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_maestros)
                    .addComponent(menu_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_maestros, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_historialA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_historialM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_alumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alumnosActionPerformed
        Alumnos ventana = new Alumnos();
        //para que aparezca la nueva venta y se oculte esta
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_alumnosActionPerformed

    private void btn_maestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_maestrosActionPerformed
        Maestros ventana = new Maestros();
        //para que aparezca la nueva venta y se oculte esta
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_maestrosActionPerformed

    private void lbl_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salirMouseClicked
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cerrar sesión?");

        if (respuesta == 0) {
            PrincipalUsuarios ventana = new PrincipalUsuarios();
            //para que aparezca la nueva venta y se oculte esta
            ventana.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lbl_salirMouseClicked

    private void delete_historialMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_historialMActionPerformed
        // TODO add your handling code here:
        String sql = "DELETE FROM asistencia_maestro";
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea vaciar el historial de asistencia de maestros?");
        if (respuesta == 0) {
            try {

                try {
                    JasperReport reporte = null;
                    //cariable donde se encuentra el archivo de reporte
                    String path = "reporteMaestro\\reportAsistenciaMaestro.jasper";
                    //String path = "src\\reporteMaestro\\reportAsistenciaMaestro.jasper";

                    //iguala la variable reporte y enciamos el path para que cargue el reporte
                    reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
                    //hacer el llenado del reporte y se encia la ruta del reporte
                    JasperPrint jprint = JasperFillManager.fillReport(reporte, null, con);
                    //crear la vista del reporte
                    JasperViewer view = new JasperViewer(jprint, false);
                    //agregar un cierre para que pueda cerrar el reporte
                    view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    //MOSTRAR VISIBLE EL REPORTE 
                    view.setVisible(true);
                } catch (JRException ex) {
                    Logger.getLogger(HistorialAsistencia.class.getName()).log(Level.SEVERE, null, ex);
                }

                Conectar conexion = new Conectar();
                Connection con = conexion.conectar();

                pst = con.prepareStatement(sql);
                pst.execute();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se ha podido vaciar el registro");
            }
        }
    }//GEN-LAST:event_delete_historialMActionPerformed

    private void delete_historialAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_historialAActionPerformed
        // TODO add your handling code here:
        String sql = "DELETE FROM asistencia";
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea vaciar el historial de asistencia de alumnos?");
        if (respuesta == 0) {
            try {

                try {
                    JasperReport reporte = null;
                    //cariable donde se encuentra el archivo de reporte
                    String path = "ReporteAlumno\\reportAsistenciaAlumno.jasper";
                    //String path = "src\\ReporteAlumno\\reportAsistenciaAlumno.jasper";

                    //iguala la variable reporte y enciamos el path para que cargue el reporte
                    reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
                    //hacer el llenado del reporte y se encia la ruta del reporte
                    JasperPrint jprint = JasperFillManager.fillReport(reporte, null, con);
                    //crear la vista del reporte
                    JasperViewer view = new JasperViewer(jprint, false);
                    //agregar un cierre para que pueda cerrar el reporte
                    view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    //MOSTRAR VISIBLE EL REPORTE 
                    view.setVisible(true);
                } catch (JRException ex) {
                    Logger.getLogger(HistorialAsistencia.class.getName()).log(Level.SEVERE, null, ex);
                }

                Conectar conexion = new Conectar();
                Connection con = conexion.conectar();

                pst = con.prepareStatement(sql);
                pst.execute();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se ha podido vaciar el registro");
            }
        }
    }//GEN-LAST:event_delete_historialAActionPerformed

    

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
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alumnos;
    private javax.swing.JButton btn_maestros;
    private javax.swing.JButton delete_historialA;
    private javax.swing.JButton delete_historialM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_salir;
    private javax.swing.JLabel menu_alumnos;
    private javax.swing.JLabel menu_maestros;
    // End of variables declaration//GEN-END:variables
}
