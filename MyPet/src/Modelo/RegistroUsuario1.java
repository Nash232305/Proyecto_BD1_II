package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

    public static boolean agregarUsuarioA(String nombre, String correo, String password, int idTipo) {
        //si es administrador solo puede registrar clientes y veterinarios 
        if (idTipo == 1 || idTipo == 2) {
            Connection connection = null;
            PreparedStatement statement = null;

            //validar que no estén vacíos
            if (nombre.isEmpty() || correo.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos.");
                return false;
            }
            //validar que el tipo de usuario no esté vacío
            if (idTipo == 0) {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione un tipo de usuario.");
                return false;
            }

            try {
                connection = SQLConnection.getConnection();
                statement = connection.prepareStatement("INSERT INTO USUARIOS (Nombre, Correo, Password, IdTipo) VALUES (?, ?, ?, ?)");
                statement.setString(1, nombre);
                statement.setString(2, correo);
                statement.setString(3, password);
                statement.setInt(4, idTipo);

                statement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.");
                return true;
            } catch (SQLException ex) {
                System.err.println("Error al registrar usuario:");
                ex.printStackTrace();
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
        } else {
            JOptionPane.showMessageDialog(null, "No tiene permisos para registrar este tipo de usuario.");
            return false;
        }
    }

    public static boolean agregarUsuarioG(String nombre, String correo, String password, int idTipo) {
        //si es gerente PUEDE registrar cualquier tipo de usuario
        if (idTipo == 1 || idTipo == 2 || idTipo == 3 || idTipo == 4) {
            Connection connection = null;
            PreparedStatement statement = null;

            //validar que no estén vacíos
            if (nombre.isEmpty() || correo.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos.");
                return false;
            }
            //validar que el tipo de usuario no esté vacío
            if (idTipo == 0) {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione un tipo de usuario.");
                return false;
            }

            try {
                connection = SQLConnection.getConnection();
                statement = connection.prepareStatement("INSERT INTO USUARIOS (Nombre, Correo, Password, IdTipo) VALUES (?, ?, ?, ?)");
                statement.setString(1, nombre);
                statement.setString(2, correo);
                statement.setString(3, password);
                statement.setInt(4, idTipo);

                statement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.");
                return true;
            } catch (SQLException ex) {
                System.err.println("Error al registrar usuario:");
                ex.printStackTrace();
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
        } else {
            JOptionPane.showMessageDialog(null, "No tiene permisos para registrar este tipo de usuario.");
            return false;
        }
    }
    

   




}
