package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {

    private static final String connectionString =
            "jdbc:sqlserver://DESKTOP-EME6E6L:1433;"
                    + "database=MyPetCR;"
                    + "user=nash;"
                    + "password=12345;"
                    + "encrypt=false;"
                    + "trustServerCertificate=false;"
                    + "loginTimeout=30;";

    private SQLConnection() {
        // Constructor privado para evitar la creación de instancias de esta clase
    }

    public static Connection getConnection(){
        Connection connection = null;
        try {
            // Establecer conexión a la base de datos
            connection = DriverManager.getConnection(connectionString);
            System.out.println("¡Conexión establecida con éxito!");
        } catch (SQLException ex) {
            // Manejo de excepciones
            System.err.println("Error al conectar a la base de datos:");
            ex.printStackTrace();
        }
        return connection;
    }

}
