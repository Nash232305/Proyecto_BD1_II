package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class LoginAccess {

    public String usuario;
    public String contrasena;
    public static int tipoUsuario;

    public LoginAccess(String usuario, String contrasena, int tipoUsuario) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        LoginAccess.tipoUsuario = tipoUsuario;
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
        LoginAccess.tipoUsuario = tipoUsuario;
    }

    public static int verificarUsuario(String usuario, String contrasena) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String idUsuario = "",nombre = "";
        int idTipo = 0;
        try {
            connection = SQLConnection.getConnection();
            String sql = "exec LoginUsuario ?, ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, usuario);
            statement.setString(2, contrasena);
            
            resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                idUsuario = resultSet.getInt(1) + "";
                idTipo = resultSet.getInt(2);
                nombre = resultSet.getString(3);
            }
            System.out.println("pene: " + nombre);
            return idTipo;
        } catch (SQLException e) {
            return 0;
        } finally {
            try {
                if (connection != null) 
                    connection.close();
            } catch (SQLException ex) {
                System.err.println("no se cerro la cone");
            }
        }
    }
    
}    