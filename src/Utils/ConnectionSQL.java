/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Cesar
 */
public class ConnectionSQL {
    
    public static Connection getConexion(){
        
        String conexionServer = "jdbc:sqlserver://DCODE:1433;"
                + "database=POOCajachica;"
                +"user=sa;"
                +"password=BANKpower9719;"
                +"loginTimeout=30;"+
                "encrypt=false;";
        
        try{
            Connection  con = DriverManager.getConnection(conexionServer);
            return con;
            
        } catch(SQLException ex){
            
            System.out.println(ex.toString());
            return null;
        
        }
    }
    
    public static void close(ResultSet rs) throws SQLException {
        
        rs.close();
        
    }
    public static void close(Statement smtn) throws SQLException {
        smtn.close();
    }
    
    public static void close(PreparedStatement smtn) throws SQLException {
        smtn.close();
    }
    
    public static void close(Connection conn) throws SQLException {
        conn.close();
    }
    
}
