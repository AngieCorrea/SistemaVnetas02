package AccesoDatos;

import Entidades.Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ItemAD {
    private Connection connection;

    public ItemAD(Connection connection) {
        this.connection = connection;
    }
    
    public void Insertar(Item nuevo) throws Exception{
        try{
            String dml = "INSERT INTO `item`(`nombre_item`, `cantidad`, `precio`)";
            dml += " VALUES (";           
            dml += " '"+nuevo.getNombre()+"' ,";
            dml += " '"+nuevo.getCantidad()+"' ,";
            dml += " '"+nuevo.getPrecio()+"')";
            
            PreparedStatement preparedStatement = connection.prepareStatement(dml);
            preparedStatement.executeUpdate();
        } catch (Exception e){
            throw e;
        }
    }
    
    public void Eliminar(Item viejo) throws Exception{
        try{
            String dml = "DELETE FROM `item` WHERE `ID` =";
            dml += viejo.getID().toString();
            
            PreparedStatement preparedStatement = connection.prepareStatement(dml);
            preparedStatement.executeUpdate();
        } catch (Exception e){
            throw e;
        }
    }
    
    public List<Item> Listar() throws Exception{
        try{
            String sql = "SELECT * FROM `item`";
            
            PreparedStatement preSta = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = preSta.executeQuery();
            
            List<Item> items = new ArrayList<Item>();
            Item item;
            
            rs.beforeFirst();
            
            while (rs.next()) {
                item = new Item();
                
                item.setID(rs.getInt("ID"));
                item.setNombre(rs.getString("nombre_item"));
                item.setCantidad(rs.getInt("cantidad"));
                item.setPrecio(rs.getInt("precio"));
                
                items.add(item);
            }
            
            return items;
        }
        catch (Exception e){
            throw e;
        }
    }
    
    public void Modificar(Item item) throws Exception{
        try{
            String dml = "UPDATE `item` SET ";
            dml += "`nombre_item`= '"+item.getNombre()+"', ";
            dml += "`cantidad`= '"+item.getCantidad()+"', ";
            dml += "`precio`= '"+item.getPrecio()+"' ";
            dml += "WHERE `ID` = '"+item.getID()+"'";
            
            PreparedStatement preSta = connection.prepareStatement(dml);
            preSta.executeUpdate();
        } catch (Exception e){
            throw e;
        }
    }
    
    public void Restar(int id, int cantRes) throws Exception{
        try{
            String dml = "UPDATE `item` SET ";
            dml += "cantidad = cantidad - '"+cantRes+"'";
            dml += "WHERE `ID` = '"+id+"'";
            
            PreparedStatement preSta = connection.prepareStatement(dml);
            preSta.executeUpdate();
        } catch (Exception e){
            throw e;
        }
    }
}
