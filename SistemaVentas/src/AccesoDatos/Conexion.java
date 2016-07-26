package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public Connection Abrir() throws Exception{
        Connection conexion = null;
        
        try {
            String servidor = "localhost";
            String puerto = "3306";
            String baseDatos = "angieventas";
            String usuario = "root";
            String contrasena = "";

            String cadenaConexion = "jdbc:mysql://" + servidor + ":" + puerto + "/" + baseDatos;

            conexion = DriverManager.getConnection(cadenaConexion,usuario,contrasena);
            return conexion;
        } 
        catch (Exception e) {
            throw e;
        }
    }
}
