package controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Conexion;

public class CConexion {
    
    private Conexion conexion;
    
    public CConexion(){
        conexion = new Conexion();
        conexion.setDb("sigees_db");
        conexion.setUser("sigees_dba");
        conexion.setPass("sigees_dba1210");
        conexion.setDriver("com.mysql.jdbc.Driver");
        conexion.setIp("192.168.1.42");
        conexion.setUrl("jdbc:mysql://" + conexion.getIp() + "/" + conexion.getDb());
    }
    
    public Connection getConnection(){
        try {
            Class.forName(conexion.getDriver());
            conexion.setConnection(DriverManager.getConnection(conexion.getUrl(),conexion.getUser(),conexion.getPass()));
            return conexion.getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CConexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
