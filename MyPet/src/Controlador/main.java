package Controlador;
import Vista.Login;
import Modelo.SQLConnection;
import java.sql.Connection;
import java.sql.SQLException;

public class main {

    public static void main(String[] args) {

        Connection connection = SQLConnection.getConnection();
        if (connection != null) {
            System.out.println("La conexión a la base de datos se estableció correctamente.");
            //se abre la ventana de login
            Login login = new Login();
            login.setVisible(true);

            try {
                connection.close();
            } catch (SQLException ex) {
                System.err.println("Error al cerrar la conexión:");
                ex.printStackTrace();
            }
        } else {
            System.out.println("La conexión a la base de datos falló.");
        }
       
    }
}
