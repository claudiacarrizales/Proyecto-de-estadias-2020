package clases;

import Vistas.MarcarSalidaAlumnos;
import Vistas.MarcarSalidaMaestros;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Metodos_sql {

    public static Conectar conexion = new Conectar();

    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    Connection con = conexion.conectar();
    public static int resultado_numero = 0;

    static Statement sentencia;

    //METODO PARA GUARDAR ALUMNOS nuevos
    public int guardar(String correo, String nombre, String apellidos, String sexo, String telefono, String codigo) {
        int resultado = 0;
        Connection conexion = null;
        //sentencias sql
        String sentencia_guardar = ("INSERT INTO alumno(correo, nombre, apellidos, sexo, telefono, codigo) VALUES (?,?,?,?,?,?)");

        try {
            conexion = Conectar.conectar();
            //conexion = conectar.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);

            sentencia_preparada.setString(1, correo);
            sentencia_preparada.setString(2, nombre);
            sentencia_preparada.setString(3, apellidos);
            sentencia_preparada.setString(4, sexo);
            sentencia_preparada.setString(5, telefono);
            sentencia_preparada.setString(6, codigo);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();

            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
    //metodo para actualizar estudiantes
    public int actualizar(String correo, String nombre, String apellidos, String telefono, String codigo) {
        int resultado = 0;
        Connection conexion = null;
        //sentencias sql
        String sentencia_guardar = ("UPDATE alumno SET correo=?, nombre=?, apellidos=?, telefono=?, codigo=? WHERE correo=?");

        try {
            conexion = Conectar.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);

            sentencia_preparada.setString(1, correo);
            sentencia_preparada.setString(2, nombre);
            sentencia_preparada.setString(3, apellidos);
            sentencia_preparada.setString(4, telefono);
            sentencia_preparada.setString(5, codigo);
            sentencia_preparada.setString(6, correo);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();

            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    //AGREGAR MAESTROOOO metodo
    public int guardarMaestro(String correo, String nombre, String apellidos, String sexo, String telefono, String huella) {
        int resultado = 0;
        Connection conexion = null;
        //sentencias sql
        String sentencia_guardar = ("INSERT INTO maestro(correo, nombre, apellidos, sexo, telefono, huella) VALUES (?,?,?,?,?,?)");

        try {
            conexion = Conectar.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);

            sentencia_preparada.setString(1, correo);
            sentencia_preparada.setString(2, nombre);
            sentencia_preparada.setString(3, apellidos);
            sentencia_preparada.setString(4, sexo);
            sentencia_preparada.setString(5, telefono);
            sentencia_preparada.setString(6, huella);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();

            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    //metodo actualizar maestros
    public int actualizarMaestro(String correo, String nombre, String apellidos, String telefono, String huella) {
        int resultado = 0;
        Connection conexion = null;
        //sentencias sql
        String sentencia_guardar = ("UPDATE maestro SET correo=?, nombre=?, apellidos=?, telefono=?, huella=? WHERE correo=?");

        try {
            conexion = Conectar.conectar();
            //conexion = conectar.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);

            sentencia_preparada.setString(1, correo);
            sentencia_preparada.setString(2, nombre);
            sentencia_preparada.setString(3, apellidos);
            sentencia_preparada.setString(4, telefono);
            sentencia_preparada.setString(5, huella);
            sentencia_preparada.setString(6, correo);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();

            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
    //metodo para marcar asistencia alumnos
    public int asistenciaAlumno(String id_alumno, String fecha, String hora_entrada) {
        int resultado = 0;
        Connection conexion = null;
        boolean banderaSalida = false;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "SELECT * FROM asistencia WHERE id_alumno=?";
            ps = con.prepareStatement(sql);

            ps.setString(1, id_alumno);
            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getString("hora_salida") == null) {
                    int fecha1 = fecha.charAt(0) + fecha.charAt(1);
                    int fecha2 = rs.getString("fecha").charAt(0) + rs.getString("fecha").charAt(1);

                    if (fecha1 != fecha2) {
                        int id_asistenciaMaestro = Integer.parseInt(rs.getString("id"));
                        String where = "WHERE id = '" + id_asistenciaMaestro + "'";
                        String sentencia_guardar = ("UPDATE asistencia SET hora_salida = ?, horas_permanencia = ?" + where);

                        try {
                            conexion = Conectar.conectar();
                            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);

                            sentencia_preparada.setString(1, "0");
                            sentencia_preparada.setString(2,"0");

                            resultado = sentencia_preparada.executeUpdate();
                            sentencia_preparada.close();

                            conexion.close();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    } else {
                        banderaSalida = true;
                    }
                }
            }
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }

        //sentencias sql
        String sentencia_guardar = ("INSERT INTO asistencia(id_alumno, fecha, hora_entrada) VALUES (?,?,?)");
        if (banderaSalida == false) {
            try {
                conexion = Conectar.conectar();
                //conexion = conectar.conectar();
                sentencia_preparada = conexion.prepareStatement(sentencia_guardar);

                sentencia_preparada.setString(1, id_alumno);
                sentencia_preparada.setString(2, fecha);
                sentencia_preparada.setString(3, hora_entrada);

                resultado = sentencia_preparada.executeUpdate();
                sentencia_preparada.close();

                JOptionPane.showMessageDialog(null, "¡El alumno ha registrado su entrada con éxito!");
                conexion.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ya se encuentra el alumno dentro del laboratorio, debe marcar salida para poder ingresar asistencia nuevamente");
        }
        return resultado;
    }
    //metodo para marcar alida de alumno
    public int salidaAlumno(String hora_salida) {
        int resultado = 0;
        Connection conexion = null;
        String campo = MarcarSalidaAlumnos.txt_salidaAlumno.getText();
        boolean banderaSalida = false;

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "SELECT * FROM asistencia WHERE id_alumno=?";
            ps = con.prepareStatement(sql);

            ps.setString(1, campo);

            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getString("hora_salida") == null) {
                    //variable para poner el where para la consulta
                    String where = "";

                    int id_asistencia = Integer.parseInt(rs.getString("id"));
                    where = "WHERE id = '" + id_asistencia + "'";
                    String sentencia_guardar = ("UPDATE asistencia SET hora_salida = ?, horas_permanencia = ?" + where);

                    horasPermanencia(rs.getString("hora_entrada"), hora_salida);

                    try {
                        conexion = Conectar.conectar();
                        sentencia_preparada = conexion.prepareStatement(sentencia_guardar);

                        sentencia_preparada.setString(1, hora_salida);
                        sentencia_preparada.setString(2, horasPermanencia(rs.getString("hora_entrada"), hora_salida));

                        resultado = sentencia_preparada.executeUpdate();
                        sentencia_preparada.close();

                        JOptionPane.showMessageDialog(null, "¡El alumno ya registró su salida con éxito!");
                        banderaSalida = true;
                        conexion.close();

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    return resultado;
                }
            }
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }
        if (banderaSalida == false) {
            JOptionPane.showMessageDialog(null, "¡Este alumno ya había registrado su hora de salida!");
        }
        return resultado;
    }

    //MAESTROOOOOOOOOOOOOOOOO marcar entrada
    public int asistenciaMaestro(String id_maestro, String fecha, String hora_entrada) {
        int resultado = 0;
        Connection conexion = null;
        boolean banderaSalida = false;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "SELECT * FROM asistencia_maestro WHERE id_maestro=?";
            ps = con.prepareStatement(sql);

            ps.setString(1, id_maestro);
            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getString("hora_salida") == null) {
                    int fecha1 = fecha.charAt(0) + fecha.charAt(1);
                    int fecha2 = rs.getString("fecha").charAt(0) + rs.getString("fecha").charAt(1);

                    if (fecha1 != fecha2) {
                        int id_asistenciaMaestro = Integer.parseInt(rs.getString("id"));
                        String where = "WHERE id = '" + id_asistenciaMaestro + "'";
                        String sentencia_guardar = ("UPDATE asistencia_maestro SET hora_salida = ?, hora_permanencia = ?" + where);

                        try {
                            conexion = Conectar.conectar();
                            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);

                            sentencia_preparada.setString(1, "0");
                            sentencia_preparada.setString(2,"0");

                            resultado = sentencia_preparada.executeUpdate();
                            sentencia_preparada.close();

                            conexion.close();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    } else {
                        banderaSalida = true;
                    }
                }
            }
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }

        //sentencias sql
        String sentencia_guardar = ("INSERT INTO asistencia_maestro(id_maestro, fecha, hora_entrada) VALUES (?,?,?)");
        if (banderaSalida == false) {
            try {
                conexion = Conectar.conectar();
                sentencia_preparada = conexion.prepareStatement(sentencia_guardar);

                sentencia_preparada.setString(1, id_maestro);
                sentencia_preparada.setString(2, fecha);
                sentencia_preparada.setString(3, hora_entrada);

                resultado = sentencia_preparada.executeUpdate();
                sentencia_preparada.close();

                JOptionPane.showMessageDialog(null, "¡El maestro ha registrado su entrada con éxito!");
                conexion.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ya se encuentra el maestro dentro del laboratorio, debe marcar salida para poder ingresar asistencia nuevamente");
        }
        return resultado;
    }
    //metodo marcar salida del maestro
    public int salidaMaestro(String hora_salida) {
        int resultado = 0;
        Connection conexion = null;
        String campo = MarcarSalidaMaestros.txt_salidaMaestro.getText();
        boolean banderaSalida = false;

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "SELECT * FROM asistencia_maestro WHERE id_maestro=?";
            ps = con.prepareStatement(sql);

            ps.setString(1, campo);
            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getString("hora_salida") == null) {
                    //variable para poner el where para la consulta
                    String where = "";

                    int id_asistenciaMaestro = Integer.parseInt(rs.getString("id"));
                    where = "WHERE id = '" + id_asistenciaMaestro + "'";
                    String sentencia_guardar = ("UPDATE asistencia_maestro SET hora_salida = ?, hora_permanencia = ?" + where);

                    horasPermanencia(rs.getString("hora_entrada"), hora_salida);

                    try {
                        conexion = Conectar.conectar();
                        sentencia_preparada = conexion.prepareStatement(sentencia_guardar);

                        sentencia_preparada.setString(1, hora_salida);
                        sentencia_preparada.setString(2, horasPermanencia(rs.getString("hora_entrada"), hora_salida));

                        resultado = sentencia_preparada.executeUpdate();
                        sentencia_preparada.close();

                        JOptionPane.showMessageDialog(null, "¡El maestro ya registró su salida con éxito!");
                        banderaSalida = true;
                        conexion.close();

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    return resultado;
                }
            }
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }
        if (banderaSalida == false) {
            JOptionPane.showMessageDialog(null, "¡El maestro ya había registrado su hora de salida!");
        }
        return resultado;
    }
    //metodo para sacar las horas de permanencia de estudiantes y profesores
    public String horasPermanencia(String entrada, String salida) {
        //se obtienen los dos primeros valores que son posicion 0 y 1 del array del string de la hora de entrada y salida y se concatenan
        String horaEntrada = entrada.charAt(0) +""+ entrada.charAt(1);
        String horaSalida = salida.charAt(0) +""+ salida.charAt(1);
        //se parsean de string a int para realizar la resta
        int entradahrs = Integer.parseInt(horaEntrada);
        int salidashors = Integer.parseInt(horaSalida); 
        //se retorna el resultado de la resta que en la que se inserta en el campo hora de permamnencia
        return salidashors - entradahrs + "";
    }
}
