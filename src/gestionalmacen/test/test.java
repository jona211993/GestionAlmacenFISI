package gestionalmacen.test;

import gestionalmacen.CapaEntidades.Articulo;
import gestionalmacen.CapaNegocio.ArticuloCN;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

    ArticuloCN acn = new ArticuloCN();
    Articulo articulo = new Articulo();
    String mensaje = "";

    public void RegistarArticulo() {

        articulo.setNombre("Carpeta");
        articulo.setCantidad(30);
        try {
            String cadena_fecha = "08-02-2022";
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            Date fecha_registro = formato.parse(cadena_fecha);
            articulo.setFecha_registro(fecha_registro);

        } catch (ParseException e) {
            System.out.println("Se encontro un errror" + e.getMessage());
        }

        mensaje = acn.SolicitarGuardarDatosArticulo(articulo);
        System.out.println(mensaje);

    }

    public void BuscarArticulo() {

        articulo.setCodigo(115);

        boolean mensaje = acn.SolicitarBuscarCodigoArticulo(articulo);
        System.out.println(mensaje);

    }
    
     public void ModificarArticulo() {

        articulo.setCodigo(102);
        articulo.setNombre("Mesa ");
        articulo.setCantidad(20);
        
         try {
            String cadena_fecha = "11-03-2022";
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            Date fecha_registro = formato.parse(cadena_fecha);
            articulo.setFecha_registro(fecha_registro);

        } catch (ParseException e) {
            System.out.println("Se encontro un errror" + e.getMessage());
        }
      

        mensaje = acn.SolicitarModificarArticulo(articulo);
        System.out.println(mensaje);

    }
     
     
      public void EliminarArticulo() {

        articulo.setCodigo(101);              
        mensaje = acn.SolicitarEliminarArticulo(articulo);
        System.out.println(mensaje);

    } 
     

    public static void main(String[] args) {
        test test = new test();
//        test.RegistarArticulo();
         test.BuscarArticulo();
          //test.ModificarArticulo();
//        test.EliminarArticulo();
    }
}
