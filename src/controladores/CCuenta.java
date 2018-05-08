package controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelos.Conexion;
import modelos.Cuenta;

public class CCuenta {
    
    private Conexion conexion;
    private Connection connection;
    private Cuenta cuenta;
    
    public CCuenta(){
        conexion = new Conexion();
        if(conexion.getConexion() != null)
            connection = conexion.getConexion();
        else
            System.out.println("No hay ninguna conexion");
    }
    
    public List<Cuenta> consultarCuentas(String nombre, String apellido){
        List<Cuenta> lista = new ArrayList<>();
        String sql = "select c.idcuenta, concat(p.nombre,' ',p.apellido), c.clave, c.no_contador " +
                    "from cuenta c " +
                    "inner join persona p on c.idpersona = p.idpersona " +
                    "where p.nombre like ? and p.apellido like ? ";
        try {
               System.out.println("aqui vas 1");
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + nombre + "%");
            ps.setString(2, "%" + apellido + "%");
            System.out.println("aqui vas 2");
            ResultSet rs = ps.executeQuery();
               System.out.println("aqui vas 3");
            while(rs.next()){
                cuenta = new Cuenta();
                cuenta.setIdcuenta(rs.getInt(1));
                cuenta.setNombre(rs.getString(2));
                cuenta.setClave(rs.getString(3));
                cuenta.setNo_contador(rs.getString(4));
                lista.add(cuenta);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CCuenta.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
