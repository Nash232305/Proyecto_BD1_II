package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class RegistroUsuario1 {

    /*
     * La tabla USUARIOS tiene los siguientes campos:
     * Nombre 
	   Correo 
	   Password 
	   IdTipo int, 

       Este es el SP  AgregarUsuario
     */

    private String nombre;
    private String correo;
    private String password;
    private int idTipo;

    public RegistroUsuario1(String nombre, String correo, String password, int idTipo) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public static boolean agregarUsuario(String nombre, String correo, String password, int idTipo) {

        // Validación de entradas (más detallada)
        if (nombre == null || nombre.trim().isEmpty() || 
            correo == null || correo.trim().isEmpty() ||
            password == null || password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return false;
        }

        if (!isValidEmail(correo)) { // Validación básica de correo electrónico
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un correo electrónico válido.");
            return false;
        }

        if (idTipo <= 0) { 
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un tipo de usuario válido.");
            return false;
        }

        // Encriptar contraseña (importante para la seguridad)
        String passwordEncriptado = encriptarPassword(password); // Método que debes implementar

        Connection connection = SQLConnection.getConnection();
        PreparedStatement statement = null;

        try {
            connection = SQLConnection.getConnection(); // Obtener conexión a la base de datos
            String sql = "{CALL AgregarUsuario(?, ?, ?, ?)}";
            statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setString(2, correo);
            statement.setString(3, passwordEncriptado);
            statement.setInt(4, idTipo);
            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.");
            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar usuario: " + ex.getMessage());
            // Registrar el error en un archivo de registro o sistema de logging
            return false;

        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.err.println("Error al cerrar conexión:");
                ex.printStackTrace();
            }
        }
    }

    // Método para validar el formato de correo electrónico (implementación básica)
    private static boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    // Método para encriptar la contraseña (debes implementar esto)
    private static String encriptarPassword(String password) {
        // ... (Implementa un algoritmo seguro de encriptación, como bcrypt o Argon2)
        return password;


    }

    public static boolean agregarUsuarioG(String nombre, String correo, String password, int idTipo) {

        // Validación más completa de las entradas
        if (nombre == null || nombre.trim().isEmpty() || 
            correo == null || correo.trim().isEmpty() ||
            password == null || password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return false;
        }

        if (!isValidEmail(correo)) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un correo electrónico válido.");
            return false;
        }

        if (idTipo <= 0) { 
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un tipo de usuario válido.");
            return false;
        }

        // Encriptación de la contraseña
        String passwordEncriptado = encriptarPassword(password);

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = SQLConnection.getConnection(); // Obtener conexión a la base de datos y llamar al StoreProcedure
            String sql = "{CALL AgregarUsuario(?, ?, ?, ?)}";
            statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setString(2, correo);
            statement.setString(3, passwordEncriptado); 
            statement.setInt(4, idTipo);
            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuario" + nombre + " registrado correctamente.");
            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar usuario: " + ex.getMessage());
            // Considera registrar el error en un log o archivo de texto para depuración
            return false;

        } finally {
            // Bloque try-with-resources para cerrar recursos de manera segura
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.err.println("Error al cerrar conexión:");
                ex.printStackTrace();
            }
        }
    }
}
        
    

