package gestionalmacen.CapaEntidades;

import java.util.Date;

public class Articulo {

    private int codigo;
    private String nombre;
    private int cantidad;
    private Date fecha_registro;

    public Articulo() {
    }

    public Articulo(int codigo, String nombre, int cantidad, Date fecha_registro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fecha_registro = fecha_registro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", fecha_registro=" + fecha_registro + '}';
    }

}
