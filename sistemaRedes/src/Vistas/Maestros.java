package Vistas;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import clases.Conectar;
import clases.Metodos_sql;

import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.table.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Maestros extends javax.swing.JFrame {

    public static PreparedStatement pst;
    public static ResultSet rs;
    Conectar conexion = new Conectar();
    Connection con = conexion.conectar();

    public Maestros() {
        initComponents();
        
        setSize(811, 500);
        //Color JFrame
        this.getContentPane().setBackground(Color.WHITE);
        //Color JPanel
        jPanel1.setBackground(new Color(0, 106, 176));

        setLocationRelativeTo(null);

        //vusiaulizar los datos de la tabla
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            table_maestros.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            //Conectar conexion = new Conectar();
            //Connection con = conexion.conectar();

            String sql = "SELECT * FROM maestro";
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modelo.addColumn("Correo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellidos");
            modelo.addColumn("Género");
            modelo.addColumn("Teléfono");
            modelo.addColumn("Huella");

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                //para llenar la tabla
                modelo.addRow(filas);
            }
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_regresarAlumno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_maestros = new javax.swing.JTable();
        lbl_agregarMaestro = new javax.swing.JLabel();
        lbl_editarMaestro = new javax.swing.JLabel();
        lbl_eliminarMaestro = new javax.swing.JLabel();
        txt_buscarMaestro = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lbl_regresarMaestros = new javax.swing.JLabel();
        lbl_salir = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_buscarMaestro = new javax.swing.JButton();

        btn_regresarAlumno.setBackground(new java.awt.Color(255, 255, 255));
        btn_regresarAlumno.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_regresarAlumno.setForeground(new java.awt.Color(0, 51, 204));
        btn_regresarAlumno.setText("REGRESAR");
        btn_regresarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarAlumnoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        table_maestros = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        table_maestros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_maestros.setFocusable(false);
        table_maestros.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table_maestros);

        lbl_agregarMaestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadir.png"))); // NOI18N
        lbl_agregarMaestro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_agregarMaestro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_agregarMaestroMouseClicked(evt);
            }
        });

        lbl_editarMaestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lapiz.png"))); // NOI18N
        lbl_editarMaestro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_editarMaestro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_editarMaestroMouseClicked(evt);
            }
        });

        lbl_eliminarMaestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura.png"))); // NOI18N
        lbl_eliminarMaestro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_eliminarMaestro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_eliminarMaestroMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("UNIVERSIDAD POLITÉCNICA DE VICTORIA");

        lbl_regresarMaestros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/espalda (1).png"))); // NOI18N
        lbl_regresarMaestros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_regresarMaestros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_regresarMaestrosMouseClicked(evt);
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
        jLabel4.setText("MAESTROS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbl_regresarMaestros)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(122, 122, 122)))
                .addComponent(lbl_salir)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_regresarMaestros)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_salir)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Correo:");

        btn_buscarMaestro.setBackground(new java.awt.Color(0, 51, 153));
        btn_buscarMaestro.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btn_buscarMaestro.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscarMaestro.setText("Buscar");
        btn_buscarMaestro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscarMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarMaestroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(295, 295, 295)
                                .addComponent(btn_buscarMaestro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addComponent(lbl_agregarMaestro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_editarMaestro)
                                .addGap(14, 14, 14)
                                .addComponent(lbl_eliminarMaestro))
                            .addComponent(txt_buscarMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_buscarMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(btn_buscarMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_editarMaestro)
                            .addComponent(lbl_eliminarMaestro)
                            .addComponent(lbl_agregarMaestro))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarAlumnoActionPerformed
        /*Principal ventana = new Principal();
        //para que aparezca la nueva venta y se oculte esta
        ventana.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_btn_regresarAlumnoActionPerformed

    private void lbl_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salirMouseClicked
        Login ventana = new Login();
        //para que aparezca la nueva venta y se oculte esta
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_salirMouseClicked

    private void lbl_regresarMaestrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_regresarMaestrosMouseClicked
        Principal ventana = new Principal();
        //para que aparezca la nueva venta y se oculte esta
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_regresarMaestrosMouseClicked

    private void lbl_agregarMaestroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_agregarMaestroMouseClicked
        AgregarMaestro ventana = new AgregarMaestro();
        //para que aparezca la nueva venta y se oculte esta
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_agregarMaestroMouseClicked

    private void btn_buscarMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarMaestroActionPerformed
        //variable donde se va almacenar lo que contenga el campo textfield de buscaar
        String campo = txt_buscarMaestro.getText();
        //variable para poner el where para la consulta
        String where = "";

        //validar que el buscar no este vacio
        if (!"".equals(campo)) {
            where = "WHERE correo = '" + campo + "'";

            try {
                DefaultTableModel modelo = new DefaultTableModel();
                table_maestros.setModel(modelo);

                PreparedStatement ps = null;
                ResultSet rs = null;
                Conectar conexion = new Conectar();
                Connection con = conexion.conectar();

                String sql = "SELECT correo, nombre, apellidos, sexo, telefono, huella FROM maestro " + where;

                System.out.println(sql);
                ps = con.prepareStatement(sql);

                rs = ps.executeQuery();

                ResultSetMetaData rsmd = rs.getMetaData();
                int cantidadColumnas = rsmd.getColumnCount();

                modelo.addColumn("Correo");
                modelo.addColumn("Nombre");
                modelo.addColumn("Apellidos");
                modelo.addColumn("Género");
                modelo.addColumn("Teléfono");
                modelo.addColumn("Huella");

                while (rs.next()) {
                    Object[] filas = new Object[cantidadColumnas];

                    for (int i = 0; i < cantidadColumnas; i++) {
                        filas[i] = rs.getObject(i + 1);
                    }
                    //para llenar la tabla
                    modelo.addRow(filas);
                }
            } catch (Exception ex) {
                System.err.println(ex.toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un correo a buscar");
            //vusiaulizar los datos de la tabla
            try {
                DefaultTableModel modelo = new DefaultTableModel();
                table_maestros.setModel(modelo);

                PreparedStatement ps = null;
                ResultSet rs = null;
                //Conectar conexion = new Conectar();
                //Connection con = conexion.conectar();

                String sql = "SELECT * FROM maestro";
                ps = con.prepareStatement(sql);

                rs = ps.executeQuery();

                ResultSetMetaData rsmd = rs.getMetaData();
                int cantidadColumnas = rsmd.getColumnCount();

                modelo.addColumn("Correo");
                modelo.addColumn("Nombre");
                modelo.addColumn("Apellidos");
                modelo.addColumn("Género");
                modelo.addColumn("Teléfono");
                modelo.addColumn("Huella");

                while (rs.next()) {
                    Object[] filas = new Object[cantidadColumnas];

                    for (int i = 0; i < cantidadColumnas; i++) {
                        filas[i] = rs.getObject(i + 1);
                    }
                    //para llenar la tabla
                    modelo.addRow(filas);
                }
            } catch (Exception ex) {
                System.err.println(ex.toString());
            }
        }
    }//GEN-LAST:event_btn_buscarMaestroActionPerformed

    private void lbl_editarMaestroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_editarMaestroMouseClicked
        int selected = table_maestros.getSelectedRow();

        if (selected < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione el registro a editar");
        } else {
            int row = table_maestros.getSelectedRow();
            String cell = table_maestros.getModel().getValueAt(row, 0).toString();
            //castear de string a int para sacar la matricula
            String matricula = cell;
            //JOptionPane.showMessageDialog(this, matricula);
            //sentencia para que crguen los datos al formulario
            //try{
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea editar el registro?");
            if (respuesta == 0) {
                //centrar el frame
                setLocationRelativeTo(null);
                //para que aparezca la nueva venta y se oculte esta
                EditarMaestro ventana = new EditarMaestro(matricula);
                ventana.setVisible(true);
                this.dispose();
                //CARGAR LA INFORMACIÓN A EDITAR
                try {
                    pst = con.prepareStatement("SELECT correo, nombre, apellidos, telefono, huella FROM maestro WHERE correo=?");

                    pst.setString(1, cell);
                    rs = pst.executeQuery();

                    while (rs.next()) {
                        EditarMaestro.txt_correoMaestro.setText(rs.getString("correo"));
                        EditarMaestro.txt_nombreMaestro.setText(rs.getString("nombre"));
                        EditarMaestro.txt_apellidosMaestro.setText(rs.getString("apellidos"));
                        EditarMaestro.txt_telefonoMaestro.setText(rs.getString("telefono"));
                        EditarMaestro.txt_huellaMaestro.setText(rs.getString("huella"));
                    }
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
        }
    }//GEN-LAST:event_lbl_editarMaestroMouseClicked

    private void lbl_eliminarMaestroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eliminarMaestroMouseClicked
        int selected = table_maestros.getSelectedRow();

        if (selected < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione el registro a eliminar");
        } else {
            int row = table_maestros.getSelectedRow();
            String cell = table_maestros.getModel().getValueAt(row, 0).toString();
            //JOptionPane.showMessageDialog(this, cell);
            String sql = "DELETE FROM maestro WHERE correo='" + cell + "'";
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar el registro?");

            if (respuesta == 0) {
                try {
                    Conectar conexion = new Conectar();
                    Connection con = conexion.conectar();

                    pst = con.prepareStatement(sql);
                    pst.execute();

                    //siguiente código para actualizar la tabla despues de eliminar registros
                    try {
                        DefaultTableModel modelo = new DefaultTableModel();
                        table_maestros.setModel(modelo);

                        PreparedStatement ps = null;
                        ResultSet rs = null;

                        String update = "SELECT * FROM maestro";
                        ps = con.prepareStatement(update);

                        rs = ps.executeQuery();

                        ResultSetMetaData rsmd = rs.getMetaData();
                        int cantidadColumnas = rsmd.getColumnCount();

                        modelo.addColumn("Correo");
                        modelo.addColumn("Nombre");
                        modelo.addColumn("Apellidos");
                        modelo.addColumn("Género");
                        modelo.addColumn("Teléfono");
                        modelo.addColumn("Huella");

                        while (rs.next()) {
                            Object[] filas = new Object[cantidadColumnas];

                            for (int i = 0; i < cantidadColumnas; i++) {
                                filas[i] = rs.getObject(i + 1);
                            }
                            //para llenar la tabla
                            modelo.addRow(filas);
                        }//aqui termina
                    } catch (Exception ex) {
                        System.err.println(ex.toString());
                    }
                    JOptionPane.showMessageDialog(null, "El registro ha sido eliminado");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "El registro no se ha podido eliminar");
                }
            }
        }
    }//GEN-LAST:event_lbl_eliminarMaestroMouseClicked

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
            java.util.logging.Logger.getLogger(Maestros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maestros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maestros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maestros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maestros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarMaestro;
    private javax.swing.JButton btn_regresarAlumno;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_agregarMaestro;
    private javax.swing.JLabel lbl_editarMaestro;
    private javax.swing.JLabel lbl_eliminarMaestro;
    private javax.swing.JLabel lbl_regresarMaestros;
    private javax.swing.JLabel lbl_salir;
    private javax.swing.JTable table_maestros;
    private javax.swing.JTextField txt_buscarMaestro;
    // End of variables declaration//GEN-END:variables
}
