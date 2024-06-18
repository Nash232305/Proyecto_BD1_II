package Modelo;

import java.sql.*;
import javax.swing.*;

public class ClientesAccess {
    public static void getClientes(JList<String> lst){
        String str = "";
        DefaultListModel<String> model = new DefaultListModel<>();
        lst.setModel(model);
        try{
            Connection connection = SQLConnection.getConnection();
            Statement statement = connection.createStatement();

            String selectSql = "EXEC getClientes";
            ResultSet resultSet = statement.executeQuery(selectSql);

            while (resultSet.next()){
                str += 
                        "Cód: " + resultSet.getString(1)+ 
                        "   Nombre: " + resultSet.getString(2)+
                        "   Correo: " + resultSet.getString(3);
                model.addElement(str);
                str= "";
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static int agregarUsuario(String nombre, String Correo, String pass){
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC agregarUsuario ?,?,?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);  
            statement.setString(2, Correo); 
            statement.setString(3, pass); 
            int filasActualizadas = statement.executeUpdate();
            connection.close();
            return filasActualizadas;
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public static String getNombreClientePorCod(int id){
        String str = "";
        
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC getNombreClientePorCod ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);  
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) 
                str = resultSet.getString(1);
            
            connection.close();
            return str;
        } catch (SQLException ex) {
            return "";
        }
    }
    
    public static String getCorreoClientePorCod(int id){
        String str = "";
        
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC getCorreoClientePorCod ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);  
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) 
                str = resultSet.getString(1);
            
            connection.close();
            return str;
        } catch (SQLException ex) {
            return "";
        }
    }
    
    public static String getPassClientePorCod(int id){
        String str = "";
        
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC getPassClientePorCod ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);  
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) 
                str = resultSet.getString(1);
            
            connection.close();
            return str;
        } catch (SQLException ex) {
            return "";
        }
    }
    
    public static int actualizarUsuario(int id,String nombre, String Correo, String pass){
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC actualizarUsuario ?,?,?,?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);  
            statement.setString(2, nombre); 
            statement.setString(3, Correo); 
            statement.setString(4, pass);
            int filasActualizadas = statement.executeUpdate();
            connection.close();
            return filasActualizadas;
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public static void getUsuarios(JList<String> lst){
        String str = "";
        DefaultListModel<String> model = new DefaultListModel<>();
        lst.setModel(model);
        try{
            Connection connection = SQLConnection.getConnection();
            Statement statement = connection.createStatement();

            String selectSql = "EXEC getUsuarios";
            ResultSet resultSet = statement.executeQuery(selectSql);

            while (resultSet.next()){
                str += 
                        "Cód: " + resultSet.getInt(1)+ 
                        "   Nombre: " + resultSet.getString(2)+
                        "   Correo: " + resultSet.getString(3)+
                        "   Tipo: " + resultSet.getString(4) ;
                model.addElement(str);
                str= "";
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static int setUserType(int id, int tipo){
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC setUserType ?,?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);  
            statement.setInt(2, tipo);
            int filasActualizadas = statement.executeUpdate();
            connection.close();
            return filasActualizadas;
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    
}
