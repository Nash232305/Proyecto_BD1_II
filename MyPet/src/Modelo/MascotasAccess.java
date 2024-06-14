package Modelo;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class MascotasAccess {
    
    public static void getMascotasPorCliente(int idUsuario,JList<String> lst){
        String str = "";
        DefaultListModel<String> model = new DefaultListModel<>();
        lst.setModel(model);
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC getMascotasPorCliente ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idUsuario);  
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                str += 
                        "Cód: " + resultSet.getInt(1)+ 
                        "   Nombre: " + resultSet.getString(2)+
                        "   Descripcion: " + resultSet.getString(3);
                model.addElement(str);
                str= "";
            }
            connection.close();
        } catch (SQLException ex) {
            System.out.println("problemas con las mascotas");
        }
    }
    
    public static int agregarMascotaPorCliente(int idUsuario,String nombre,  String desc){
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC agregarMascotaPorCliente ?,?,?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idUsuario);  
            statement.setString(2, nombre);  
            statement.setString(3, desc); 
            int filasActualizadas = statement.executeUpdate();
            connection.close();
            return filasActualizadas;    
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public static ArrayList<String> getInfoMascota(int idUsuario){
        ArrayList<String> info = new ArrayList<String>();
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC getInfoMascota ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idUsuario);  
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                info.add(resultSet.getString(1));
                info.add(resultSet.getString(2));
            }
            connection.close();
        } catch (SQLException ex) {
            System.out.println("problemas con las mascotas");
        }finally{
            return info;
        }
    }
    
    public static int actualizarMascota(int idMascota,String nombre, String desc){
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC actualizarMascota ?,?,?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idMascota);
            statement.setString(2, nombre);
            statement.setString(3, desc);
            int filasActualizadas = statement.executeUpdate();
            connection.close();
            return filasActualizadas;    
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public static int borrarMascota(int idMascota){
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC borrarMascota ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idMascota);
            int filasActualizadas = statement.executeUpdate();
            connection.close();
            return filasActualizadas;    
        } catch (SQLException ex) {
            return 0;
        }
    }
}
