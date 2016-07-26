package AccesoDatos;

import Entidades.Item;
import Entidades.Usuario;
import Entidades.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VentaAD {
    private Connection connection;

    public VentaAD(Connection connection) {
        this.connection = connection;
    }
    
    public void NuevaVenta(Venta nueva) throws Exception{
        try{
            String dml = "INSERT INTO `venta`(`vendedor`, `comprador`, `item`, `cantidad`, `total`)";
            dml += " VALUES (";
            dml += " '"+nueva.getVendedor()+"' ,";
            dml += " '"+nueva.getComprador()+"' ,";
            dml += " '"+nueva.getItem().getNombre()+"' ,";
            dml += " '"+nueva.getCantidad()+"' ,";
            dml += " '"+nueva.getTotal()+"')";
            
            PreparedStatement preparedStatement = connection.prepareStatement(dml);
            preparedStatement.executeUpdate();
        } catch (Exception e){
            throw e;
        }
    }
    
    public List<Venta> Listar(String vendedor) throws Exception{
        try{
            String sql = "SELECT venta.ID, ventas.comprador, venta.item, venta.cantidad, venta.total"
                    + " usuarios.nombre_usuario, item.nombre_item, item.precio "
                    + "FROM `ventas` INNER JOIN `usuarios` ON ventas.vendedor = usuarios.nombre "
                    + "INNER JOIN `item` ON ventas.item = item.nombre";
            
            PreparedStatement preSta = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = preSta.executeQuery();
            
            List<Venta> ventas = new ArrayList<>();
            Venta venta;
            
            rs.beforeFirst();
            
            while (rs.next()) {
                venta = new Venta();
                
                venta.setID(rs.getInt("ID"));
                venta.setVendedor(rs.getString("nombre_usuario"));
                venta.setComprador(rs.getString("comprador"));
                venta.setItem(new Item(null,rs.getString("nombre_item"),0,rs.getInt("precio")));
                venta.setCantidad(rs.getInt("cantidad"));
                venta.setTotal(rs.getInt("total"));
                
                ventas.add(venta);
            }
            
            return ventas;
        }
        catch (Exception e){
            throw e;
        }
    }
}