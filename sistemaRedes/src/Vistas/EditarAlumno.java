/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import clases.Conectar;
import clases.Metodos_sql;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class EditarAlumno extends javax.swing.JFrame {

    //public static PreparedStatement sentencia_preparada;
    //public static ResultSet rs;
    //Conectar conexion = new Conectar();
    //Connection con = conexion.conectar();
    /**
     * Creates new form EditarAlumno
     */
    public EditarAlumno(int matricula) {
        initComponents();

        setSize(811, 500);
        //Color JFrame
        this.getContentPane().setBackground(Color.WHITE);
        //Color JPanel
        jPanel1.setBackground(new Color(0, 106, 176));
        setLocationRelativeTo(null);
        //JOptionPane.showMessageDialog(null,"RECIBIDO: "+matricula);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_correoA = new javax.swing.JTextField();
        txt_nombreA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_apellidosA = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lbl_regresarAlumno = new javax.swing.JLabel();
        lbl_salir = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_telefonoA = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        editar_registoAlumno = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_codigoA = new javax.swing.JTextField();
        txt_idAlumno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txt_correoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_correoAKeyTyped(evt);
            }
        });

        txt_nombreA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreAKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("Apellidos:");

        txt_apellidosA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidosAKeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("UNIVERSIDAD POLITÉCNICA DE VICTORIA");

        lbl_regresarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/espalda (1).png"))); // NOI18N
        lbl_regresarAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_regresarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_regresarAlumnoMouseClicked(evt);
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
        jLabel4.setText("EDITAR ALUMNO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_regresarAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(122, 122, 122)))
                .addGap(128, 128, 128)
                .addComponent(lbl_salir)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_regresarAlumno)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(lbl_salir))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setText("Teléfono:");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiante.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("Código de barras:");

        txt_telefonoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoAKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Matrícula:");

        editar_registoAlumno.setBackground(new java.awt.Color(16, 40, 144));
        editar_registoAlumno.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        editar_registoAlumno.setForeground(new java.awt.Color(255, 255, 255));
        editar_registoAlumno.setText("EDITAR REGISTRO");
        editar_registoAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editar_registoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_registoAlumnoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(txt_idAlumno))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_telefonoA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_codigoA, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(editar_registoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_apellidosA, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_nombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_correoA, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(124, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txt_idAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_correoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellidosA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_telefonoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(txt_codigoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(editar_registoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Metodos_sql metodos = new Metodos_sql();

    private void txt_nombreAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreAKeyTyped
        //validar que solo ingrese letras
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            getToolkit().beep();

            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresar solo letras");
        }
    }//GEN-LAST:event_txt_nombreAKeyTyped

    private void txt_apellidosAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidosAKeyTyped
        //validar que solo ingrese letras
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            getToolkit().beep();

            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresar solo letras");
        }
    }//GEN-LAST:event_txt_apellidosAKeyTyped

    private void lbl_regresarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_regresarAlumnoMouseClicked
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro de cancelar la modificación?");

        if (respuesta == 0) {
            Alumnos ventana = new Alumnos();
            //para que aparezca la nueva venta y se oculte esta
            ventana.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lbl_regresarAlumnoMouseClicked

    private void lbl_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salirMouseClicked
        Login ventana = new Login();
        //para que aparezca la nueva venta y se oculte esta
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_salirMouseClicked

    private void txt_telefonoAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoAKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(this, "Ingresar solo números");
        }
    }//GEN-LAST:event_txt_telefonoAKeyTyped

    private void editar_registoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_registoAlumnoActionPerformed
        //validar que el formulario se llene correctamente
        if (txt_correoA.getText().equals("") || txt_nombreA.getText().equals("") || txt_apellidosA.getText().equals("") || txt_telefonoA.getText().equals("") || txt_codigoA.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Hay campos vacíos, debe llenar todos los campos");
        } else {
            int i = metodos.actualizar(txt_idAlumno.getText(), txt_correoA.getText(), txt_nombreA.getText(), txt_apellidosA.getText(), txt_telefonoA.getText(), txt_codigoA.getText());
            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Datos actualizados correctamente");
                Alumnos ventana = new Alumnos();
                //para que aparezca la nueva venta y se oculte esta
                ventana.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_editar_registoAlumnoActionPerformed

    private void txt_correoAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correoAKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(this, "Ingresar solo números");
        }
    }//GEN-LAST:event_txt_correoAKeyTyped

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
            java.util.logging.Logger.getLogger(EditarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
 /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarAlumno(matricula).setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editar_registoAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_regresarAlumno;
    private javax.swing.JLabel lbl_salir;
    public static javax.swing.JTextField txt_apellidosA;
    public static javax.swing.JTextField txt_codigoA;
    public static javax.swing.JTextField txt_correoA;
    public static javax.swing.JLabel txt_idAlumno;
    public static javax.swing.JTextField txt_nombreA;
    public static javax.swing.JTextField txt_telefonoA;
    // End of variables declaration//GEN-END:variables
}
