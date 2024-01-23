package BD;

import java.sql.Connection;
import java.sql.DriverManager;   

public class ConexionBaseDatos {
      
    public static Connection conectar(){
    

        Connection conexion = null;
        try {
            String driverClassName= "com.mysql.cj.jdbc.Driver";
            String url= "jdbc:mysql://localhost:3306/paciente";
            String user = "root";
            String pass = "";
            Class.forName(driverClassName);
            conexion= DriverManager.getConnection(url, user, pass);
            System.out.println("CONEXION EXITOSA"); 
        } catch (Exception e) {
            System.err.println("ERROR EN LA CONEXION");
            System.err.println(e.getMessage());
        }
        return conexion;
    } 
        
        
    
    
}
