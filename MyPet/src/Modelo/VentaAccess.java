package Modelo;

import java.sql.*;
import javax.swing.*;

public class VentaAccess {
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
    
    public static String getPrecioPorCod(int cod){
        String str = "";
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC getPrecioPorCod ?";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, cod);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                str += "" + resultSet.getString(1);
            }
            connection.close();
            return str;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return str;
    }
    
    public static String getDescripcionPorCod(int cod){
        String str = "";
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC getDescripcionPorCod ?";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, cod);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                str += "" + resultSet.getString(1);

            }
            connection.close();
            return str;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return str;
    }
    
    public static int agregarPedido(int idUsuario,String nombre,  String direccion){
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC agregarPedido ?,?,?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idUsuario);  
            statement.setString(2, nombre);  
            statement.setString(3, direccion); 
            int filasActualizadas = statement.executeUpdate();
            connection.close();
            return filasActualizadas;    
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public static int getUltimoPedido(){
        String str = "";
        try{
            Connection connection = SQLConnection.getConnection();
            Statement statement = connection.createStatement();
            String selectSql = "EXEC getUltimoPedido";
            ResultSet resultSet = statement.executeQuery(selectSql);
            while (resultSet.next()) {
                str = "" + resultSet.getInt(1);
            }
            connection.close();
            return Integer.parseInt(str);
        } catch (SQLException ex) {
            System.out.println("Error: "+ex);
            return -1;
        }
    }
    
    public static int agregarDetallePedido(int factura, int producto, int cant){
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC agregarDetallePedido ?,?,?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, factura);  
            statement.setInt(2, producto); 
            statement.setInt(3, cant);
            int filasActualizadas = statement.executeUpdate();
            connection.close();
            return filasActualizadas;    
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public static int actualizarEncabezado(int factura){
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC actualizarEncabezado ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, factura);
            int filasActualizadas = statement.executeUpdate();
            connection.close();
            return filasActualizadas;    
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public static int agregarFactura(int cliente){
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC agregarFactura ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, cliente);
            int filasActualizadas = statement.executeUpdate();
            connection.close();
            return filasActualizadas;    
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public static int getUltimaFactura(){
        String str = "";
        try{
            Connection connection = SQLConnection.getConnection();
            Statement statement = connection.createStatement();
            String selectSql = "EXEC getUltimaFactura";
            ResultSet resultSet = statement.executeQuery(selectSql);
            while (resultSet.next()) {
                str = "" + resultSet.getInt(1);
            }
            connection.close();
            return Integer.parseInt(str);
        } catch (SQLException ex) {
            System.out.println("Error: "+ex);
            return -1;
        }
    }
    
    public static int agregarDetalleFactura(int factura,  int producto, int cant){
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC agregarDetalleFactura ?,?,?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, factura);  
            statement.setInt(2, producto); 
            statement.setInt(3, cant);
            int filasActualizadas = statement.executeUpdate();
            connection.close();
            return filasActualizadas;    
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public static int actualizarEncabezadoFactura(int factura){
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC actualizarEncabezadoFactura ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, factura);
            int filasActualizadas = statement.executeUpdate();
            connection.close();
            return filasActualizadas;    
        } catch (SQLException ex) {
            return 0;
        }
    }
    
}
