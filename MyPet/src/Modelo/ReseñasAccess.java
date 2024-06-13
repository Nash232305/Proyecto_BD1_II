package Modelo;

import java.sql.*;
import javax.swing.*;

public class ReseñasAccess {
    
    public static void getInventario(JList<String> lst){
        String str = "";
        DefaultListModel<String> model = new DefaultListModel<>();
        lst.setModel(model);
        try{
            Connection connection = SQLConnection.getConnection();
            Statement statement = null;
            statement = connection.createStatement();

            String selectSql = "EXEC getInventario";
            ResultSet resultSet = null;
            resultSet = statement.executeQuery(selectSql);
            while (resultSet.next()){
                str += 
                        "Cód: " + resultSet.getInt(1)+ 
                        "   Descripción: " + resultSet.getString(2)+
                        "   Precio: " + resultSet.getFloat(3) + 
                        "   Stock: " +    resultSet.getFloat(4);
                model.addElement(str);
                str= "";
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void buscarArticulo(String filter,JList<String> lst){
        String str = "";
        DefaultListModel<String> model = new DefaultListModel<>();
        lst.setModel(model);
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC buscarArticulo ?";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, filter);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                str += 
                        "Cód: " + resultSet.getInt(1)+ 
                        "   Descripción: " + resultSet.getString(2)+
                        "   Precio: " + resultSet.getFloat(3) + 
                        "   Stock: " +    resultSet.getFloat(4);
                model.addElement(str);
                str= "";
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }
    
    public static void getReseña(int id,JList<String> lst){
        String str = "";
        DefaultListModel<String> model = new DefaultListModel<>();
        lst.setModel(model);
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC getReseña ?";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                str += 
                        "Cód: " + resultSet.getInt(1)+ 
                        "   Reseña: " + resultSet.getString(2)+
                        "   Calificación: " + resultSet.getFloat(3);
                model.addElement(str);
                str= "";
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }
    
    
    public static int agregarReseña(String nombre, String resena, float calif){
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC agregarReseña ?,?,?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);  
            statement.setString(2, resena); 
            statement.setFloat(3, calif); 
            int filasActualizadas = statement.executeUpdate();
            connection.close();
            return filasActualizadas;
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public static String getNombreArticulo(int filter){
        String str = "";
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC getNombreArticulo ?";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, filter);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) 
                str = "" + resultSet.getString(1);
            
            connection.close();
            return str;
        } catch (SQLException ex) {
            return "";
        }
    }
}
