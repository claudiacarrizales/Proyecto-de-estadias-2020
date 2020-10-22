package clases;
//importacion que nos ayuda a la conexion de la base de datos
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Acer
 */
public class Conectar {
    //variables privades staticas 
    //referencia al driver que hemos importado
    private static final String driver = "com.mysql.jdbc.Driver";
    //variable del usuario en mi caso es root
    private static final String user ="root";
    //lo mismo del user pero ahora para el password
    private static final String password ="";
    //variable lugar donde se almacena la bd
    private static final String url ="jdbc:mysql://localhost/labredes";
    
    //objeto privado statico de la clase connection
    private static Connection conexion;
    
    //metodo constructor
    public static Connection conectar(){
        Connection conexion = null;
        //si hay error en conectar nos avise
        try{  
            Class.forName(driver);
            //variable conexion es =
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion establecida...");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar " + e);
        }
        return conexion;
    }
}
