package BD;


import java.sql.Connection;
import java.sql.DriverManager;


public class ConexionBaseDatos {
    public static void main(String[] args) {
         Connection conexion = null;
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/libreria","root","");
            System.out.println("CONEXIÓN EXITOSA");
        } catch (Exception e) {
            System.err.println("ERROR EN LA CONEXIÓN");
            System.err.println(e.getMessage());
        }
        
    }
    
}
