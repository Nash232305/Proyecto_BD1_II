package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Vista.MenuAdministracion;
import Vista.MenuCliente;
import Vista.MenuGerente;
import Vista.MenuVeterinario;

public class Logins {

    public String usuario;
    public String contrasena;
    public static int tipoUsuario;

    public Logins(String usuario, String contrasena, int tipoUsuario) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        Logins.tipoUsuario = tipoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setTipoUsuario(int tipoUsuario) {
        Logins.tipoUsuario = tipoUsuario;
    }

    public static boolean verificarUsuario(String usuario, String contrasena, int tipoUsuario) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
    
        try {
            connection = SQLConnection.getConnection();
            String query = "{call ValidarUsuarioExistente(?, ?, ?)}";
            statement = connection.prepareCall(query);
            statement.setString(1, usuario);
            statement.setString(2, contrasena);
            statement.setInt(3, tipoUsuario);
    
            resultSet = statement.executeQuery();
    
            if (resultSet.next()) {
                JOptionPane.showMessageDialog(null, "¡Bienvenido " + usuario + "!");
    
                // Llamar al procedimiento almacenado para agregar el registro de inicio de sesión
                CallableStatement addLoginRecord = connection.prepareCall("{call AgregarUsuarioInicioSesion(?, ?)}");
                addLoginRecord.setString(1, usuario);
                addLoginRecord.setString(2, obtenerNombreTipoUsuario(tipoUsuario));
                addLoginRecord.execute();
    
                // Abrir la ventana correspondiente según el tipo de usuario
                switch (tipoUsuario) {
                    case 1:
                        MenuCliente menuCliente = new MenuCliente();
                        menuCliente.setVisible(true);
                        break;
                    case 2:
                        MenuVeterinario menuVeterinario = new MenuVeterinario();
                        menuVeterinario.setVisible(true);
                        break;
                    case 3:
                        MenuGerente menuGerente = new MenuGerente();
                        menuGerente.setVisible(true);
                        break;
                    case 4:
                        MenuAdministracion menuAdministracion = new MenuAdministracion();
                        menuAdministracion.setVisible(true);
                        break;
                    default:
                        break;
                }
    
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al autenticar el usuario: " + e.getMessage());
            return false;
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.err.println("Error al cerrar la conexión:");
                ex.printStackTrace();
            }
        }
    }
    
    // Método para obtener el nombre del tipo de usuario
    private static String obtenerNombreTipoUsuario(int tipoUsuario) {
        switch (tipoUsuario) {
            case 1:
                return "Cliente";
            case 2:
                return "Veterinario";
            case 3:
                return "Gerente";
            case 4:
                return "Administrador";
            default:
                return "";
        }
    }
}    