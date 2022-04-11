package gestionalmacen.CapaNegocio;

import gestionalmacen.CapaAccesoDatos.GestorBuscarArticulo;
import gestionalmacen.CapaAccesoDatos.GestorEliminarArticulo;
import gestionalmacen.CapaAccesoDatos.GestorModificarArticulo;
import gestionalmacen.CapaAccesoDatos.GestorObtenerDatos_A;
import gestionalmacen.CapaAccesoDatos.GestorRegistroArticulos;
import gestionalmacen.CapaEntidades.Articulo;
import gestionalmacen.DB.Conexion;
import java.sql.Connection;

public class ArticuloCN {

    private String mensaje = "";
    private GestorRegistroArticulos agra = new GestorRegistroArticulos();
    private GestorBuscarArticulo agba = new GestorBuscarArticulo();
    private GestorModificarArticulo agma = new GestorModificarArticulo();
    private GestorEliminarArticulo agea = new GestorEliminarArticulo();
    private GestorObtenerDatos_A agoda = new GestorObtenerDatos_A();

    public String SolicitarGuardarDatosArticulo(Articulo art) {
        Connection conn = Conexion.getConnection();

        try {
            mensaje = agra.GuardarDatosArticulo(conn, art);

        } catch (Exception e) {
            mensaje = mensaje + "er: " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();

                }
            } catch (Exception e) {

                mensaje = mensaje + " " + e.getMessage();
            }

        }

        return mensaje;

    }

    public boolean SolicitarBuscarCodigoArticulo(Articulo art) {
        boolean rpta = false;
        Connection conn = Conexion.getConnection();

        try {
            rpta = agba.VerificaCodigoArticulo(conn, art);

        } catch (Exception e) {
            mensaje = mensaje + "er: " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();

                }
            } catch (Exception e) {

                mensaje = mensaje + " " + e.getMessage();
            }

        }

        return rpta;

    }

    public String SolicitarModificarArticulo(Articulo art) {
        Connection conn = Conexion.getConnection();

        try {
            mensaje = agma.GuardarCambiosArticulo(conn, art);

        } catch (Exception e) {
            mensaje = mensaje + "er: " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();

                }
            } catch (Exception e) {

                mensaje = mensaje + " " + e.getMessage();
            }

        }

        return mensaje;

    }

    public String SolicitarEliminarArticulo(Articulo art) {
        Connection conn = Conexion.getConnection();

        try {
            mensaje = agea.EliminarDatosArticulo(conn, art);

        } catch (Exception e) {
            mensaje = mensaje + "er: " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();

                }
            } catch (Exception e) {

                mensaje = mensaje + " " + e.getMessage();
            }

        }

        return mensaje;

    }

    public int Obtener_ID_NewArticulo() {
        Connection conn = Conexion.getConnection();
        int id = 0;
        id = agra.get_ID(conn);
        return id;
    }

    public Articulo SolicitarDatosArticulo(int code) {
        Articulo A = new Articulo();
        Connection conn = Conexion.getConnection();

        try {
            A.setCodigo((agoda.ObtenerDatosArticulo(conn, code)).getCodigo());
            A.setNombre((agoda.ObtenerDatosArticulo(conn, code)).getNombre());
            A.setCantidad((agoda.ObtenerDatosArticulo(conn, code)).getCantidad());
            A.setFecha_registro((agoda.ObtenerDatosArticulo(conn, code)).getFecha_registro());

        } catch (Exception e) {
            mensaje = mensaje + "er: " + e.getMessage();
        }

        return A;

    }

}
