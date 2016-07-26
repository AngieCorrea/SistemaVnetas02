package AccesoDatos;

import Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioAD {
    private Connection connection;

    public UsuarioAD(Connection connection) {
        this.connection = connection;
    }
    
    public void Insertar(Usuario nuevo) throws Exception{
        try{
            String dml = "INSERT INTO `usuarios`(`nombre_usuario`, `pass`, `rango`)";
            dml += " VALUES (";           
            dml += " '"+nuevo.getNombre()+"' ,";
            dml += " '"+nuevo.getPass()+"' ,";
            dml += " '"+nuevo.getCargo()+"')";
            
            PreparedStatement preparedStatement = connection.prepareStatement(dml);
            preparedStatement.executeUpdate();
        } catch (Exception e){
            throw e;
        }
    }
    
    public void Eliminar(Usuario viejo) throws Exception{
        try{
            String dml = "DELETE FROM `usuarios` WHERE `ID` =";
            dml += viejo.getID().toString();
            
            PreparedStatement preparedStatement = connection.prepareStatement(dml);
            preparedStatement.executeUpdate();
        } catch (Exception e){
            throw e;
        }
    }
    
    public Usuario Login(String nombre, String pass) throws Exception{
        try{
            String sql = "SELECT * FROM `usuarios` WHERE ";
            sql += "`nombre_usuario` = '"+nombre+"'";
            sql += " AND ";
            sql += "`pass` = '"+pass+"'";
            
            PreparedStatement prepSta = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = prepSta.executeQuery();
            
            Usuario busqueda = null;
            rs.beforeFirst();
            
            if (rs.next()) {
                busqueda = new Usuario();
                
                busqueda.setID(rs.getInt("ID"));
                busqueda.setNombre(rs.getString("nombre_usuario"));
                busqueda.setPass(rs.getString("pass"));
                busqueda.setCargo(rs.getString("rango"));
            }
            
            return busqueda;
        } catch (Exception e){
            throw e;
        }
    }
    
    public List<Usuario> Listar() throws Exception{
        try{
            String sql = "SELECT * FROM `usuarios` where rango <> 'Administra'";
            
            PreparedStatement preSta = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = preSta.executeQuery();
            
            List<Usuario> usuarios = new ArrayList<>();
            Usuario usuario;
            
            rs.beforeFirst();
            
            while (rs.next()) {
                usuario = new Usuario();
                
                usuario.setID(rs.getInt("ID"));
                usuario.setNombre(rs.getString("nombre_usuario"));
                usuario.setPass(rs.getString("pass"));
                usuario.setCargo(rs.getString("rango"));
                
                usuarios.add(usuario);
            }
            
            return usuarios;
        }
        catch (Exception e){
            throw e;
        }
    }
    
    public void Modificar(Usuario usuario) throws Exception{
        try{
            String dml = "UPDATE `usuarios` SET ";
            dml += "`nombre_usuario`= '"+usuario.getNombre()+"', ";
            dml += "`pass`= '"+usuario.getPass()+"', ";
            dml += "`rango`= '"+usuario.getCargo()+"' ";
            dml += "WHERE `ID` = '"+usuario.getID()+"'";
            
            PreparedStatement preSta = connection.prepareStatement(dml);
            preSta.executeUpdate();
        } catch (Exception e){
            throw e;
        }
    }
    
    public void ModificarCuenta(Integer IdUsu,String Contr) throws Exception{
        try {
            String dml = "";
            dml += " UPDATE `usuarios` SET";
            dml += " pass = '" + Contr + "'";
            dml += " where `ID` = " + IdUsu;
            
            PreparedStatement preparedStatement = connection.prepareStatement(dml);
            preparedStatement.executeUpdate();
                   
        } catch (Exception e) {
            throw e;
        }
    }
}