package Gestores;

import Entidades.Item;
import AccesoDatos.ItemAD;
import AccesoDatos.Conexion;

import java.sql.Connection;
import java.util.List;

public class GestorItem {
    public void Registrar(Item nuevo) throws Exception{
        try{
            Conexion conexion = new Conexion();
            Connection connection = conexion.Abrir();
            
            ItemAD item = new ItemAD(connection);
            item.Insertar(nuevo);
        } catch (Exception e){
            throw e;
        }
    }
    
    public void Eliminar(Item viejo) throws Exception{
        try{
            Conexion conexion = new Conexion();
            Connection connection = conexion.Abrir();
            
            ItemAD item = new ItemAD(connection);
            item.Eliminar(viejo);
        } catch (Exception e){
            throw e;
        }
    }
    
    public List<Item> Listar() throws Exception{
        try{
            Conexion conexion = new Conexion();
            Connection connection = conexion.Abrir();
            
            ItemAD item = new ItemAD(connection);
            return item.Listar();
        } catch (Exception e){
            throw e;
        }
    }
    
    public void Modificar(Item _item)throws Exception{
        try{
            Conexion conexion = new Conexion();
            Connection connection = conexion.Abrir();
            
            ItemAD item = new ItemAD(connection);
            item.Modificar(_item);
        } catch (Exception e){
            throw e;
        }
    }
    
    public void Restar(int id, int cr) throws Exception{
        try{
            Conexion conexion = new Conexion();
            Connection connection = conexion.Abrir();
            
            ItemAD item = new ItemAD(connection);
            item.Restar(id, cr);
        } catch (Exception e){
            throw e;
        }
    }
}
