package gestionalmacen.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static Connection conn = null;
    private static String login = "Jonatan_Pacora";
    private static String clave = "12345";
    private static String url = "jdbbc:oracle:thin@localhost:1521:xe";

    public static Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, login, clave);
            conn.setAutoCommit(false);
            if (conn != null) {

                System.out.println("Conexion Exitosa");

            } else {

                System.out.println("Conexion Fallida");
            }

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion Erronea "+ e.getMessage());

        }

        return conn;

    }

    public void desconexxion() {
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar" + " " + e.getMessage());
        }

    }

}
