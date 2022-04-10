package gestionalmacen.CapaAccesoDatos;

import gestionalmacen.CapaEntidades.Articulo;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class GestorRegistroArticulos {

    private String mensaje = "";

    public String GuardarDatosArticulo(Connection con, Articulo art) {
        PreparedStatement pstm = null;
        String sql = "INSERT INTO articulo (codigo,nombre,cantidad,fecha_registro) "
                + "VALUES (SEC_ARTICULO.nextval,?,?,?)";

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
            mensaje = " GUARDADO CORRECTAMENTE";
            JOptionPane.showMessageDialog(null, mensaje);
            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            mensaje = " NO SE PUDO GUARDAR CORRECTAMENTE \n " + e.getMessage();

        }
        return mensaje;

    }
    
    public int get_ID(Connection con){
       int id=0;
       PreparedStatement pstm=null;
        ResultSet rs=null;
        try {
            String sql="SELECT max(codigo)+1 as id FROM ARTICULO";
            pstm=con.prepareStatement(sql);
            rs=pstm.executeQuery();
            if(rs.next()){
                id = rs.getInt(1);
            }
            rs.close();
            pstm.close();
        } catch (SQLException e) {
            System.out.println("Error al asignar el codigo del articulo");
        }
        
       return id;
    }

}
