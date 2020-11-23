package Vistas;

import clases.Conectar;
import clases.Metodos_sql;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class EditarMaestro extends javax.swing.JFrame {

    public EditarMaestro(String matricula) {
        initComponents();

        setSize(811, 500);
        //Color JFrame
        this.getContentPane().setBackground(Color.WHITE);
        //Color JPanel
        jPanel1.setBackground(new Color(0, 106, 176));
        setLocationRelativeTo(null);
    }
    Metodos_sql metodos = new Metodos_sql();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lbl_regresarMaestro = new javax.swing.JLabel();
        lbl_salir = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_correoMaestro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_telefonoMaestro = new javax.swing.JTextField();
        txt_nombreMaestro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_apellidosMaestro = new javax.swing.JTextField();
        editar_registroMaestro = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_huellaMaestro = new javax.swing.JTextField();
        txt_idMaestro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("UNIVERSIDAD POLITÉCNICA DE VICTORIA");

        lbl_regresarMaestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/espalda (1).png"))); // NOI18N
        lbl_regresarMaestro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_regresarMaestro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_regresarMaestroMouseClicked(evt);
            }
        });

        lbl_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        lbl_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_salirMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EDITAR MAESTRO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbl_regresarMaestro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addGap(119, 119, 119)))
                .addGap(123, 123, 123)
                .addComponent(lbl_salir)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_regresarMaestro)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_salir)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))
                        .addGap(22, 22, 22))))
        );

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setText("Teléfono:");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profesor (1).png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Correo:");

        txt_telefonoMaestro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoMaestroKeyTyped(evt);
            }
        });

        txt_nombreMaestro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreMaestroKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("Apellidos:");

        txt_apellidosMaestro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidosMaestroKeyTyped(evt);
            }
        });

        editar_registroMaestro.setBackground(new java.awt.Color(16, 40, 144));
        editar_registroMaestro.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        editar_registroMaestro.setForeground(new java.awt.Color(255, 255, 255));
        editar_registroMaestro.setText("EDITAR REGISTRO");
        editar_registroMaestro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editar_registroMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_registroMaestroActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("Huella:");

        txt_huellaMaestro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_huellaMaestroKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(txt_idMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_nombreMaestro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_apellidosMaestro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(49, 49, 49)
                                    .addComponent(txt_telefonoMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(70, 70, 70)
                                    .addComponent(txt_huellaMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_correoMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(editar_registroMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(118, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(txt_idMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_correoMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_nombreMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_apellidosMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_telefonoMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_huellaMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(editar_registroMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_regresarMaestroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_regresarMaestroMouseClicked
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro de cancelar la modificación?");

        if (respuesta == 0) {
            Maestros ventana = new Maestros();
            //para que aparezca la nueva venta y se oculte esta
            ventana.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lbl_regresarMaestroMouseClicked

    private void lbl_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salirMouseClicked
        Login ventana = new Login();
        //para que aparezca la nueva venta y se oculte esta
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_salirMouseClicked

    private void txt_nombreMaestroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreMaestroKeyTyped
        //validar que solo ingrese letras
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            getToolkit().beep();

            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresar solo letras");
        }
    }//GEN-LAST:event_txt_nombreMaestroKeyTyped

    private void txt_apellidosMaestroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidosMaestroKeyTyped
        //validar que solo ingrese letras
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            getToolkit().beep();

            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresar solo letras");
        }
    }//GEN-LAST:event_txt_apellidosMaestroKeyTyped

    private void txt_telefonoMaestroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoMaestroKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(this, "Ingresar solo números");
        }
    }//GEN-LAST:event_txt_telefonoMaestroKeyTyped

    private void editar_registroMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_registroMaestroActionPerformed
        //validar que el formulario se llene correctamente
        if (txt_correoMaestro.getText().equals("") || txt_nombreMaestro.getText().equals("") || txt_apellidosMaestro.getText().equals("") || txt_telefonoMaestro.getText().equals("")|| txt_huellaMaestro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Hay campos vacíos, debe llenar todos los campos");
        } else {
            int i = metodos.actualizarMaestro(txt_idMaestro.getText(), txt_correoMaestro.getText(), txt_nombreMaestro.getText(), txt_apellidosMaestro.getText(), txt_telefonoMaestro.getText(), txt_huellaMaestro.getText());
            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Datos actualizados correctamente");
                Maestros ventana = new Maestros();
                //para que aparezca la nueva venta y se oculte esta
                ventana.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_editar_registroMaestroActionPerformed

    private void txt_huellaMaestroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_huellaMaestroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_huellaMaestroKeyTyped

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
            java.util.logging.Logger.getLogger(EditarMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
 /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarMaestro().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editar_registroMaestro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_regresarMaestro;
    private javax.swing.JLabel lbl_salir;
    public static javax.swing.JTextField txt_apellidosMaestro;
    public static javax.swing.JTextField txt_correoMaestro;
    public static javax.swing.JTextField txt_huellaMaestro;
    public static javax.swing.JLabel txt_idMaestro;
    public static javax.swing.JTextField txt_nombreMaestro;
    public static javax.swing.JTextField txt_telefonoMaestro;
    // End of variables declaration//GEN-END:variables
}
