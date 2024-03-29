package Vistas;

import clases.Conectar;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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

public class HistorialAsistencia extends javax.swing.JFrame {

    public static PreparedStatement pst;
    public static ResultSet rs;
    Conectar conexion = new Conectar();
    Connection con = conexion.conectar();

    public HistorialAsistencia() {
        initComponents();

        setSize(811, 500);
        //Color JFrame
        this.getContentPane().setBackground(Color.WHITE);
        //Color JPanel
        jPanel1.setBackground(new Color(0, 106, 176));

        setLocationRelativeTo(null);

        //mostrar los registros
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            table_historial.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;

            //String sql = "SELECT id_alumno, fecha, hora_entrada, hora_salida, horas_permanencia FROM asistencia";
            String sql = "Select correo, fecha, hora_entrada, hora_salida, horas_permanencia from asistencia inner join alumno on asistencia.id_alumno = alumno.codigo";
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modelo.addColumn("Matricula");
            modelo.addColumn("Fecha");
            modelo.addColumn("Hora entrada");
            modelo.addColumn("Hora salida");
            modelo.addColumn("Horas permanencia");

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

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lbl_regresarHistorial = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_historial = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_buscarHistorial = new javax.swing.JTextField();
        pdfAlumno = new javax.swing.JLabel();
        btn_buscarHistorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("UNIVERSIDAD POLITÉCNICA DE VICTORIA");

        lbl_regresarHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/espalda (1).png"))); // NOI18N
        lbl_regresarHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_regresarHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_regresarHistorialMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HISTORIAL DE ASISTENCIA ALUMNOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbl_regresarHistorial)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel4)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_regresarHistorial)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        table_historial = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        table_historial.setModel(new javax.swing.table.DefaultTableModel(
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
        table_historial.setFocusable(false);
        table_historial.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table_historial);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Matricula:");

        pdfAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf.png"))); // NOI18N
        pdfAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pdfAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdfAlumnoMouseClicked(evt);
            }
        });

        btn_buscarHistorial.setBackground(new java.awt.Color(0, 51, 204));
        btn_buscarHistorial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_buscarHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscarHistorial.setText("Buscar");
        btn_buscarHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarHistorialActionPerformed(evt);
            }
        });
        btn_buscarHistorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_buscarHistorialKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_buscarHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscarHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pdfAlumno)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pdfAlumno))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_buscarHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscarHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_regresarHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_regresarHistorialMouseClicked
        PrincipalUsuarios ventana = new PrincipalUsuarios();
        //para que aparezca la nueva venta y se oculte esta
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_regresarHistorialMouseClicked

    private void btn_buscarHistorialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_buscarHistorialKeyPressed
        
    }//GEN-LAST:event_btn_buscarHistorialKeyPressed

    private void btn_buscarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarHistorialActionPerformed
        //variable donde se va almacenar lo que contenga el campo textfield de buscaar
        String campo = txt_buscarHistorial.getText();
        //variable para poner el where para la consulta
        String where = "";

        //validar que el buscar no este vacio
        if (!"".equals(campo)) {
            where = "WHERE alumno.correo = '" + campo + "'";

            try {
                DefaultTableModel modelo = new DefaultTableModel();
                table_historial.setModel(modelo);

                PreparedStatement ps = null;
                ResultSet rs = null;
                Conectar conexion = new Conectar();
                Connection con = conexion.conectar();

                //String sql = "SELECT id_alumno, fecha, hora_entrada, hora_salida, horas_permanencia FROM asistencia " + where;
                String sql = "Select correo, fecha, hora_entrada, hora_salida, horas_permanencia from asistencia inner join alumno on asistencia.id_alumno = alumno.codigo " + where;
                
                System.out.println(sql);
                ps = con.prepareStatement(sql);

                rs = ps.executeQuery();

                ResultSetMetaData rsmd = rs.getMetaData();
                int cantidadColumnas = rsmd.getColumnCount();

                modelo.addColumn("Matricula");
                modelo.addColumn("Fecha");
                modelo.addColumn("Hora entrada");
                modelo.addColumn("Hora salida");
                modelo.addColumn("Horas permanencia");

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
            JOptionPane.showMessageDialog(this, "Ingrese un alumno a buscar");
            try {
                DefaultTableModel modelo = new DefaultTableModel();
                table_historial.setModel(modelo);

                PreparedStatement ps = null;
                ResultSet rs = null;
                //Conectar conexion = new Conectar();
                //Connection con = conexion.conectar();

                //String sql = "SELECT id_alumno, fecha, hora_entrada, hora_salida, horas_permanencia FROM asistencia";
                String sql = "Select correo, fecha, hora_entrada, hora_salida, horas_permanencia from asistencia inner join alumno on asistencia.id_alumno = alumno.codigo";
                ps = con.prepareStatement(sql);

                rs = ps.executeQuery();

                ResultSetMetaData rsmd = rs.getMetaData();
                int cantidadColumnas = rsmd.getColumnCount();

                modelo.addColumn("Matricula");
                modelo.addColumn("Fecha");
                modelo.addColumn("Hora entrada");
                modelo.addColumn("Hora salida");
                modelo.addColumn("Horas permanencia");

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
    }//GEN-LAST:event_btn_buscarHistorialActionPerformed

    private void pdfAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdfAlumnoMouseClicked
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
    }//GEN-LAST:event_pdfAlumnoMouseClicked

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
            java.util.logging.Logger.getLogger(HistorialAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorialAsistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarHistorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_regresarHistorial;
    private javax.swing.JLabel pdfAlumno;
    private javax.swing.JTable table_historial;
    private javax.swing.JTextField txt_buscarHistorial;
    // End of variables declaration//GEN-END:variables
}
