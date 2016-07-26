package Gestores;

import Entidades.Venta;
import AccesoDatos.VentaAD;
import AccesoDatos.Conexion;

import java.sql.Connection;
import java.util.List;

public class GestorVenta {
    public void Registrar(Venta nuevo) throws Exception{
        try{
            Conexion conexion = new Conexion();
            Connection connection = conexion.Abrir();
            
            VentaAD venta = new VentaAD(connection);
            venta.NuevaVenta(nuevo);
        } catch (Exception e){
            throw e;
        }
    }
    
    public List<Venta> Listar() throws Exception{
        try{
            Conexion conexion = new Conexion();
            Connection connection = conexion.Abrir();
            
            VentaAD venta = new VentaAD(connection);
            return venta.Listar(null);
        } catch (Exception e){
            throw e;
        }
    }
}
