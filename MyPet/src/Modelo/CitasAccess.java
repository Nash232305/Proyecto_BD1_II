package Modelo;

import java.sql.*;
import javax.swing.*;
import java.util.ArrayList;

public class CitasAccess {
    public static void getCitas(JList<String> lst){
        String str = "";
        DefaultListModel<String> model = new DefaultListModel<>();
        lst.setModel(model);
        try{
            Connection connection = SQLConnection.getConnection();
            Statement statement = connection.createStatement();

            String selectSql = "EXEC getCitas";
            ResultSet resultSet = statement.executeQuery(selectSql);

            while (resultSet.next()){
                str += 
                        "Cód: " + resultSet.getInt(1)+ 
                        "   Fecha: " + resultSet.getString(2)+
                        "   Doctor: " + resultSet.getString(3)+
                        "   Mascota: " + resultSet.getString(4)+
                        "   Dueño: " + resultSet.getString(5);
                model.addElement(str);
                str= "";
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    public static int getCita(String fecha, int id){
        int result = -1;
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC getCita ?,?";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, fecha);
            statement.setInt(2, id);
            ResultSet resultSet = statement.executeQuery();
           
            while (resultSet.next())
                result = resultSet.getInt(1);
            connection.close();
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return result;
        }
    }
    
    
    public static ArrayList<String> getInfoCitaCod(int id){
        ArrayList<String> info = new ArrayList<>();
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC getInfoCitaCod ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);  
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                info.add(resultSet.getString(1));
                info.add(resultSet.getString(2));
            }
            connection.close();
            return info;
        } catch (SQLException ex) {
            return info;
        }
    }
    
    public static ArrayList<String> getMascotas(){
        ArrayList<String> info = new ArrayList<>();
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC getMascotas";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next())
                info.add("Exp: " + resultSet.getInt(1)+ " - " + resultSet.getString(2));
            connection.close();
            return info;
        } catch (SQLException ex) {
            return info;
        }
    }
    
    public static ArrayList<String> getDoctores(){
        ArrayList<String> info = new ArrayList<>();
        try{
            Connection connection = SQLConnection.getConnection();
            Statement statement = connection.createStatement();

            String selectSql = "EXEC getDoctores";
            ResultSet resultSet = statement.executeQuery(selectSql);

            while (resultSet.next())
                info.add("Id: " + resultSet.getInt(1)+ " - " + resultSet.getString(2));
            connection.close();
            return info;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return info;
        }
    }
    
    public static int editarCita(int id, int expediente, String fecha, int doctor, int estado){
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC editarCita ?,?,?,?,?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);  
            statement.setInt(2, expediente ); 
            statement.setString(3, fecha); 
            statement.setInt(4, doctor);
            statement.setInt(5, estado);
            int filasActualizadas = statement.executeUpdate();
            connection.close();
            return filasActualizadas;
        } catch (SQLException ex) {
            System.out.println("Exception buscada: " + ex);
            return 0;
        }
    }
     public static int cancelarCitaCod(int cod){
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC cancelarCitaCod ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, cod);
            int result = statement.executeUpdate();
            connection.close();
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }
    
    public static void getCitasPorCliente(int idUsuario,JList<String> lst){
        String str = "";
        DefaultListModel<String> model = new DefaultListModel<>();
        lst.setModel(model);
        try{
            Connection connection = SQLConnection.getConnection();
            String selectSql = "EXEC getCitasPorCliente  ?";
            PreparedStatement statement = connection.prepareStatement(selectSql);
            statement.setInt(1, idUsuario);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                str += 
                        "Cód: " + resultSet.getInt(1)+ 
                        "   Fecha: " + resultSet.getString(2)+
                        "   Doctor: " + resultSet.getString(3)+
                        "   Mascota: " + resultSet.getString(4);
                model.addElement(str);
                str= "";
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static ArrayList<String> getMascotasPorClientes(int idUsuario){
        String str = "";
        ArrayList<String> info = new ArrayList<>();
        try{
            Connection connection = SQLConnection.getConnection();
            String selectSql = "EXEC getMascotasPorClientes  ?";
            PreparedStatement statement = connection.prepareStatement(selectSql);
            statement.setInt(1, idUsuario);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                str += 
                        resultSet.getInt(1)+ "- " +
                        " " + resultSet.getString(2);
                info.add(str);
                str= "";
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            return info;
        }
    }
    
    public static int comprobarCita(String fecha){
        int result = -1;
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC comprobarCita ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, fecha);
            ResultSet resultSet = statement.executeQuery();
           
            while (resultSet.next())
                result = resultSet.getInt(1);
            connection.close();
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return result;
        }
    }
    
    public static int agregarCita(String fecha, int masc, int doc, int estado){
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC agregarCita ?,?,?,?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, fecha);  
            statement.setInt(2, masc); 
            statement.setInt(3, doc); 
            statement.setInt(4, estado); 
            int filasActualizadas = statement.executeUpdate();
            connection.close();
            return filasActualizadas;
        } catch (SQLException ex) {
            System.out.println("Expecion gooood: " + ex);
            return 0;
        }
    }
    
   
}
