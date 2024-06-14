package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



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

    public static ArrayList<String> verificarUsuario(String usuario, String contrasena) {
        ArrayList<String> info = new ArrayList<>();
        try {
            Connection connection = SQLConnection.getConnection();
            String sql = "exec LoginUsuario ?, ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, usuario);
            statement.setString(2, contrasena);
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                info.add(resultSet.getInt(1) + "");
                info.add(resultSet.getInt(2) + "");
                info.add(resultSet.getString(3) + "");
                
            }
            connection.close();
            
        } catch (SQLException e) {
            return null;
        } finally {
            return info;
        }
    }
    
}    