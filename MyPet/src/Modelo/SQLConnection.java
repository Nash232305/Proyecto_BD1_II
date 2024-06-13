package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {

    private static final String connectionString =
            "jdbc:sqlserver://localhost:1433;"
                    + "database=MyPetCR;"
                    + "user=sa;"
                    + "password=123;"
                    + "encrypt=false;"
                    + "trustServerCertificate=false;"
                    + "loginTimeout=30;";

    private SQLConnection() {
        // Constructor privado para evitar la creación de instancias de esta clase
    }

    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionString);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return connection;
    }

}
