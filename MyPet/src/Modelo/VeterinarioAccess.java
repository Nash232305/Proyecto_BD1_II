package Modelo;

import java.sql.*;
import javax.swing.*;

public class VeterinarioAccess {
    public static void getPYS(JList<String> lst){
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
                        resultSet.getInt(1)+ 
                        " - " + resultSet.getString(2);
                model.addElement(str);
                str= "";
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
            
      public static void buscarPYS(String filter,JList<String> lst){
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
                        resultSet.getInt(1)+ 
                        " - " + resultSet.getString(2);
                model.addElement(str);
                str= "";
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }
    
      
    public static int agregarDetalleCita(int cita, int producto, int cant){
    try{
         Connection connection = SQLConnection.getConnection();
         String sql = "EXEC agregarDetalleCita ?,?,?";
         PreparedStatement statement = connection.prepareStatement(sql);
         statement.setInt(1, cita);  
         statement.setInt(2, producto); 
         statement.setInt(3, cant);
         int filasActualizadas = statement.executeUpdate();
         connection.close();
         return filasActualizadas;    
    } catch (SQLException ex) {
        return 0;
    }
    }
    
    public static int agregarObservaciones(String obvs, int cita){
    try{
         Connection connection = SQLConnection.getConnection();
         String sql = "EXEC agregarObservaciones ?,?";
         PreparedStatement statement = connection.prepareStatement(sql);
         statement.setString(1, obvs);
         statement.setInt(2, cita);
         int filasActualizadas = statement.executeUpdate();
         connection.close();
         return filasActualizadas;    
     } catch (SQLException ex) {
         return 0;
     }
    }
    
    public static int getMascotaCodCita(int id){
         int result = -1;
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC getMascotaCodCita ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);  
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next())
                result = resultSet.getInt(1);
            connection.close();
            return result;
        } catch (SQLException ex) {
            return result;
        }
    }
    
    public static void getExpediente(JList<String> lst, int exp){
        String str = "";
        DefaultListModel<String> model = new DefaultListModel<>();
        lst.setModel(model);
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC getExpediente ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, exp);  
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                str += 
                    "Cod:" + resultSet.getInt(1)+ "-" + resultSet.getString(2)+
                    "   Fecha: " + resultSet.getString(3)+
                    "   Prod/Serv: " + resultSet.getString(4)+
                    "   Cantidad: " + resultSet.getInt(5);
                model.addElement(str);
                str= "";
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static String getProductoDetalleCita(int id, int line){
         String result = "";
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC getProductoDetalleCita ?,?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);  
            statement.setInt(2, line); 
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next())
                result = resultSet.getString(1);
            connection.close();
            return result;
        } catch (SQLException ex) {
            return result;
        }
    }
    
    public static int setCantLineCita(int id, int line, int cant){
    try{
        Connection connection = SQLConnection.getConnection();
        String sql = "EXEC setCantLineCita ?,?,?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.setInt(2, line);
        statement.setInt(3, cant);
        int filasActualizadas = statement.executeUpdate();
        connection.close();
        return filasActualizadas;    
    } catch (SQLException ex) {
        return 0;
     }
    }
    
    public static int deleteLineCita(int id, int line){
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC deleteLineCita ?,?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.setInt(2, line);
            int filasActualizadas = statement.executeUpdate();
            connection.close();
            return filasActualizadas;    
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public static String getDetalleCita(int id){
        String result = "";
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC getDetalleCita ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);  
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next())
                result = resultSet.getString(1);
            connection.close();
            return result;
        } catch (SQLException ex) {
            return result;
        }
    }
    
    
    
    
}
