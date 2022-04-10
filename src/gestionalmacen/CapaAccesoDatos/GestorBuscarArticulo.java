package gestionalmacen.CapaAccesoDatos;

import gestionalmacen.CapaEntidades.Articulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GestorBuscarArticulo {

    private String mensaje = "";

    public boolean VerificaCodigoArticulo(Connection con, Articulo art) {
        boolean rpta=false;
        PreparedStatement pstm = null;
        String sql = "SELECT * FROM ARTICULO WHERE codigo=?";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, art.getCodigo());
            pstm.executeQuery();
            
            ResultSet rs =pstm.executeQuery();
            if(rs.next()){
                rpta=true;
            mensaje = "SE ENCONTRO EL ARTICULO " + art.getCodigo();
            }else{
            mensaje="NO SE ENCONTRO ESE CODIGO DE ARTICULO";
            }
            rs.close();
            pstm.close();
        } catch (SQLException e ) {
            mensaje = " NO SE PUDO BUSCAR CORRECTAMENTE \n " + e.getMessage();

        }
        return rpta;
    }
}
