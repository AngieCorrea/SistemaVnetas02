package Gestores;
import Entidades.Usuario;
import AccesoDatos.UsuarioAD;
import AccesoDatos.Conexion;

import java.sql.Connection;
import java.util.List;

public class GestorUsuario {
    public void Registrar(Usuario nuevo) throws Exception{
        try{
            Conexion conexion = new Conexion();
            Connection connection = conexion.Abrir();
            
            UsuarioAD usuario = new UsuarioAD(connection);
            usuario.Insertar(nuevo);
        } catch (Exception e){
            throw e;
        }
    }
    
    public void Eliminar(Usuario viejo) throws Exception{
        try{
            Conexion conexion = new Conexion();
            Connection connection = conexion.Abrir();
            
            UsuarioAD usuario = new UsuarioAD(connection);
            usuario.Eliminar(viejo);
        } catch (Exception e){
            throw e;
        }
    }
    
    public Usuario Login(String nombre, String pass) throws Exception{
        try{
            Conexion conexion = new Conexion();
            Connection connection = conexion.Abrir();
            
            UsuarioAD usuario = new UsuarioAD(connection);
            return usuario.Login(nombre, pass);
            
        } catch (Exception e){
            throw e;
        }
    }
    
    public List<Usuario> Listar() throws Exception{
        try{
            Conexion conexion = new Conexion();
            Connection connection = conexion.Abrir();
            
            UsuarioAD usuario = new UsuarioAD(connection);
            return usuario.Listar();
        } catch (Exception e){
            throw e;
        }
    }
    
    public void ModificarCuenta(Integer ID, String pass)throws Exception{
        try{
            Conexion conexion = new Conexion();
            Connection connection = conexion.Abrir();
            
            UsuarioAD usuarioA = new UsuarioAD(connection);
            usuarioA.ModificarCuenta(ID, pass);
        } catch (Exception e){
            throw e;
        }
    }
    
    public void Modificar(Usuario usuario)throws Exception{
        try{
            Conexion conexion = new Conexion();
            Connection connection = conexion.Abrir();
            
            UsuarioAD usuarioA = new UsuarioAD(connection);
            usuarioA.Modificar(usuario);
        } catch (Exception e){
            throw e;
        }
    }
}
