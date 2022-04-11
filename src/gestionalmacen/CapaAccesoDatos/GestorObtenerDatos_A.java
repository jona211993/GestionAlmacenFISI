
package gestionalmacen.CapaAccesoDatos;

import gestionalmacen.CapaEntidades.Articulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class GestorObtenerDatos_A {
    
    public Articulo ObtenerDatosArticulo(Connection con, int code) {
        Articulo articulo = new Articulo();
        String mensaje="";
        PreparedStatement pstm = null;
        String sql = "SELECT * FROM ARTICULO WHERE codigo=?";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, code);
            pstm.executeQuery();
            
            ResultSet rs =pstm.executeQuery();
            if(rs.next()){
             articulo.setCodigo(rs.getInt(1));
             articulo.setNombre(rs.getString(2));
             articulo.setCantidad(rs.getInt(3));
             articulo.setFecha_registro(rs.getDate(4));
             mensaje = "SE ENCONTRO EL ARTICULO ";
            }else{
            mensaje="NO SE ENCONTRO ESE CODIGO DE ARTICULO";
            }
            rs.close();
            pstm.close();
        } catch (SQLException e ) {
            mensaje = " NO SE PUDO BUSCAR CORRECTAMENTE \n " + e.getMessage();

        }
        return articulo;
    }
    
}
