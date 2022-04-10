package gestionalmacen.CapaAccesoDatos;

import gestionalmacen.CapaEntidades.Articulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GestorModificarArticulo {

    private String mensaje = "";

    public String GuardarDatosArticulo(Connection con, Articulo art) {
        PreparedStatement pstm = null;
        String sql = "UPDATE articulo SET nombre =?, cantidad= ?, fecha_registro=?"
                + " WHERE codigo=?";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, art.getNombre());
            pstm.setInt(2, art.getCantidad());

            Date date = new Date();
            date = art.getFecha_registro();
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
            String FechaAformatear = sdf.format(date);
            //Cnvirtiendo de util.date a sql.date
            java.sql.Date fecha = java.sql.Date.valueOf(FechaAformatear);

            pstm.setDate(3, fecha);
            pstm.setInt(4, art.getCodigo());
            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                mensaje = " MODIFICADO CORRECTAMENTE";

            }else{  mensaje = "CODIGO DE ARTICULO NO ENCONTRADO";}
            rs.close();
            pstm.close();

        } catch (SQLException e) {
            mensaje = " NO SE PUDO MODIFICAR CORRECTAMENTE \n " + e.getMessage();

        }
        return mensaje;

    }

}
