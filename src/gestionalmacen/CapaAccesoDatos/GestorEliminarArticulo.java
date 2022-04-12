package gestionalmacen.CapaAccesoDatos;

import gestionalmacen.CapaEntidades.Articulo;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class GestorEliminarArticulo {

    private String mensaje = "";

    public String EliminarDatosArticulo(Connection con, Articulo art) {
        PreparedStatement pstm = null;
        String sql = "DELETE FROM ARTICULO WHERE CODIGO =?";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, art.getCodigo());
            int filas = pstm.executeUpdate();
            mensaje = "FILAS PROCESADAS : " + filas;
            pstm.close();

        } catch (Exception e) {
            mensaje = " NO SE PUDO ELIMINAR CORRECTAMENTE \n " + e.getMessage();

        }
        return mensaje;

    }

}
