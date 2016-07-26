package Modelos;

import Entidades.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTbUsuarios extends AbstractTableModel{
    String[] columnas = {"ID", "Nombre", "Contraseña", "Permisos"};
    List<Usuario> usuarios;

    public ModeloTbUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object dato = null;
        
        if (columnIndex == 0) {
            dato = usuarios.get(rowIndex).getID();
        }
        else if (columnIndex == 1) {
            dato = usuarios.get(rowIndex).getNombre();
        }
        else if (columnIndex == 2) {
            dato = usuarios.get(rowIndex).getPass();
        }
        else if (columnIndex == 3) {
            dato = usuarios.get(rowIndex).getCargo();
        }
        return dato;
    }
    
    @Override
    public String getColumnName(int column){
        return columnas[column];
    }
}
