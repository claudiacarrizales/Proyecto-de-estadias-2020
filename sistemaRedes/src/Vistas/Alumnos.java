package Vistas;

import clases.Conectar;
import clases.Metodos_sql;

import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
import java.sql.ResultSet;

import java.sql.SQLException;

//import java.sql.SQLException;
import javax.swing.JOptionPane;
//com.mysql.jdbc.exceptions

public class Alumnos extends javax.swing.JFrame {

    public static PreparedStatement pst;
    public static ResultSet rs;
    Conectar conexion = new Conectar();
    Connection con = conexion.conectar();

    public Alumnos() {
        initComponents();

        setSize(811, 500);
        //Color JFrame
        this.getContentPane().setBackground(Color.WHITE);
        //Color JPanel
        jPanel1.setBackground(new Color(0, 106, 176));

        setLocationRelativeTo(null);

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            table_alumnos.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            //Conectar conexion = new Conectar();
            //Connection con = conexion.conectar();

            String sql = "SELECT * FROM alumno";
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modelo.addColumn("Matricula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellidos");
            modelo.addColumn("Género");
            modelo.addColumn("Teléfono");
            modelo.addColumn("Código");

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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lbl_regresarAlumno = new javax.swing.JLabel();
        lbl_salir = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_alumnos = new javax.swing.JTable();
        lbl_agregarAlumno = new javax.swing.JLabel();
        lbl_editarAlumno = new javax.swing.JLabel();
        lbl_eliminarAlumno = new javax.swing.JLabel();
        txt_buscarAlumno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_buscarAlumno = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gerente.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
        jLabel4.setText("ALUMNOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbl_regresarAlumno)
                .addGap(178, 178, 178)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_salir)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_salir)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(lbl_regresarAlumno))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        table_alumnos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        table_alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Nombre", "Apellidos", "Género", "Teléfono", "Código"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_alumnos.setFocusable(false);
        table_alumnos.getTableHeader().setReorderingAllowed(false);
        table_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_alumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_alumnos);

        lbl_agregarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadir (1).png"))); // NOI18N
        lbl_agregarAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_agregarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_agregarAlumnoMouseClicked(evt);
            }
        });

        lbl_editarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lapiz.png"))); // NOI18N
        lbl_editarAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_editarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_editarAlumnoMouseClicked(evt);
            }
        });

        lbl_eliminarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura.png"))); // NOI18N
        lbl_eliminarAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_eliminarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_eliminarAlumnoMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Matrícula:");

        btn_buscarAlumno.setBackground(new java.awt.Color(0, 51, 153));
        btn_buscarAlumno.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btn_buscarAlumno.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscarAlumno.setText("Buscar");
        btn_buscarAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_buscarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscarAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(lbl_agregarAlumno)
                .addGap(28, 28, 28)
                .addComponent(lbl_editarAlumno)
                .addGap(25, 25, 25)
                .addComponent(lbl_eliminarAlumno)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_buscarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(btn_buscarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_agregarAlumno)
                        .addComponent(lbl_editarAlumno)
                        .addComponent(lbl_eliminarAlumno)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_agregarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_agregarAlumnoMouseClicked
        AgregarAlumno ventana = new AgregarAlumno();
        //para que aparezca la nueva venta y se oculte esta
        ventana.setVisible(true);
        this.dispose();

        //PRUEBAAAAAAAAAAAAAAAAAAAAAAA
        //guardar_registroAlumno.setVisible();
    }//GEN-LAST:event_lbl_agregarAlumnoMouseClicked

    private void lbl_regresarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_regresarAlumnoMouseClicked
        Principal ventana = new Principal();
        //para que aparezca la nueva venta y se oculte esta
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_regresarAlumnoMouseClicked

    private void lbl_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salirMouseClicked
        Login ventana = new Login();
        //para que aparezca la nueva venta y se oculte esta
        ventana.setVisible(true);
        this.dispose();
        //System.exit(0);
    }//GEN-LAST:event_lbl_salirMouseClicked

    private void btn_buscarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarAlumnoActionPerformed
        //variable donde se va almacenar lo que contenga el campo textfield de buscaar
        String campo = txt_buscarAlumno.getText();
        //variable para poner el where para la consulta
        String where = "";

        //validar que el buscar no este vacio
        if (!"".equals(campo)) {
            where = "WHERE correo = '" + campo + "'";

            try {
                DefaultTableModel modelo = new DefaultTableModel();
                table_alumnos.setModel(modelo);

                PreparedStatement ps = null;
                ResultSet rs = null;
                Conectar conexion = new Conectar();
                Connection con = conexion.conectar();

                String sql = "SELECT correo, nombre, apellidos, sexo, telefono, codigo FROM alumno " + where;

                System.out.println(sql);
                ps = con.prepareStatement(sql);

                rs = ps.executeQuery();

                ResultSetMetaData rsmd = rs.getMetaData();
                int cantidadColumnas = rsmd.getColumnCount();

                modelo.addColumn("Matricula");
                modelo.addColumn("Nombre");
                modelo.addColumn("Apellidos");
                modelo.addColumn("Género");
                modelo.addColumn("Teléfono");
                modelo.addColumn("Código");

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
            JOptionPane.showMessageDialog(this, "Ingrese una matrícula a buscar");
            try {
                DefaultTableModel modelo = new DefaultTableModel();
                table_alumnos.setModel(modelo);

                PreparedStatement ps = null;
                ResultSet rs = null;
                //Conectar conexion = new Conectar();
                //Connection con = conexion.conectar();

                String sql = "SELECT * FROM alumno";
                ps = con.prepareStatement(sql);

                rs = ps.executeQuery();

                ResultSetMetaData rsmd = rs.getMetaData();
                int cantidadColumnas = rsmd.getColumnCount();

                modelo.addColumn("Matricula");
                modelo.addColumn("Nombre");
                modelo.addColumn("Apellidos");
                modelo.addColumn("Género");
                modelo.addColumn("Teléfono");
                modelo.addColumn("Código");

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
    }//GEN-LAST:event_btn_buscarAlumnoActionPerformed

    private void lbl_editarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_editarAlumnoMouseClicked
        int selected = table_alumnos.getSelectedRow();

        if (selected < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione el registro a editar");
        } else {
            int row = table_alumnos.getSelectedRow();
            String cell = table_alumnos.getModel().getValueAt(row, 0).toString();
            //castear de string a int para sacar la matricula
            int matricula = Integer.parseInt(cell);
            //sentencia para que crguen los datos al formulario
            //try{
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea editar el registro?");
            if (respuesta == 0) {
                //centrar el frame
                setLocationRelativeTo(null);
                //para que aparezca la nueva venta y se oculte esta
                EditarAlumno ventana = new EditarAlumno(matricula);
                ventana.setVisible(true);
                this.dispose();
                //CARGAR LA INFORMACIÓN A EDITAR
                try {
                    pst = con.prepareStatement("SELECT correo, nombre, apellidos, telefono, codigo FROM alumno WHERE correo=?");

                    pst.setString(1, cell);
                    rs = pst.executeQuery();

                    while (rs.next()) {
                        EditarAlumno.txt_correoA.setText(rs.getString("correo"));
                        EditarAlumno.txt_nombreA.setText(rs.getString("nombre"));
                        EditarAlumno.txt_apellidosA.setText(rs.getString("apellidos"));
                        EditarAlumno.txt_telefonoA.setText(rs.getString("telefono"));
                        EditarAlumno.txt_codigoA.setText(rs.getString("codigo"));
                    }
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
        }
    }//GEN-LAST:event_lbl_editarAlumnoMouseClicked

    //PARA ELIMINAR REGISTRO DE LA TABLA
    private void lbl_eliminarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eliminarAlumnoMouseClicked
        int selected = table_alumnos.getSelectedRow();

        if (selected < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione el registro a eliminar");
        } else {
            int row = table_alumnos.getSelectedRow();
            String cell = table_alumnos.getModel().getValueAt(row, 0).toString();
            String sql = "DELETE FROM alumno WHERE correo=" + cell;
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
                        table_alumnos.setModel(modelo);

                        PreparedStatement ps = null;
                        ResultSet rs = null;

                        String update = "SELECT * FROM alumno";
                        ps = con.prepareStatement(update);

                        rs = ps.executeQuery();

                        ResultSetMetaData rsmd = rs.getMetaData();
                        int cantidadColumnas = rsmd.getColumnCount();

                        modelo.addColumn("Matricula");
                        modelo.addColumn("Nombre");
                        modelo.addColumn("Apellidos");
                        modelo.addColumn("Género");
                        modelo.addColumn("Teléfono");
                        modelo.addColumn("Código");

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
    }//GEN-LAST:event_lbl_eliminarAlumnoMouseClicked

    private void table_alumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_alumnosMouseClicked

    }//GEN-LAST:event_table_alumnosMouseClicked

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
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_agregarAlumno;
    private javax.swing.JLabel lbl_editarAlumno;
    private javax.swing.JLabel lbl_eliminarAlumno;
    private javax.swing.JLabel lbl_regresarAlumno;
    private javax.swing.JLabel lbl_salir;
    private javax.swing.JTable table_alumnos;
    private javax.swing.JTextField txt_buscarAlumno;
    // End of variables declaration//GEN-END:variables
}
