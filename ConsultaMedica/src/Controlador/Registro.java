/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import BD.ConexionBaseDatos;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author vina
 */
public class Registro {
    
    
    
    public boolean Registrar(String rut, String nombre,String genero, int edad,String direccion, String ciudad,String isapre,String donante){
        
        PreparedStatement ps = null;
        Connection connect = ConexionBaseDatos.conectar();
        String query = "INSERT INTO paciente(rut,nombre,genero,edad,direccion,ciudad,isapre,donante)"
                +"VALUES(?,?,?,?,?,?,?,?)";
        
        try {
            ps = connect.prepareStatement(query);
            ps.setString(1, rut);
            ps.setString(2, nombre);
            ps.setString(3, genero);
            ps.setInt(4, edad);
            ps.setString(5, direccion);
            ps.setString(6, ciudad);
            ps.setString(7, isapre);
            ps.setString(8, donante);
            ps.execute();
            return true;
            
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                connect.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    } 
    
    public int existeRut(String rut){ 
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection connect = ConexionBaseDatos.conectar();
        String query = "SELECT count(rut) FROM paciente WHERE rut = ?";
        
        try {
            ps = connect.prepareStatement(query);
            ps.setString(1, rut);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
            
            
            
        } catch (Exception e) {
            System.err.println(e);
            return 1;
        }finally{
            try {
                connect.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    } 
    
       
        
        
        
}
