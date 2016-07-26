package Modelos;

import Entidades.Item;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTbItems extends AbstractTableModel{
    private String[] columnas = {"ID","Nombre","Cantidad","Precio"};
    private List<Item> items;

    public ModeloTbItems(List<Item> items) {
        this.items = items;
    }
    
    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object dato = null;
        
        if(columnIndex == 0) {
            dato = items.get(rowIndex).getID();
        }
        else if(columnIndex == 1) {
            dato = items.get(rowIndex).getNombre();
        }
        else if(columnIndex == 2) {
            dato = items.get(rowIndex).getCantidad();
        }
        else if(columnIndex == 3) {
            dato = items.get(rowIndex).getPrecio();
        }        
        return dato;
    }
    
    @Override
    public String getColumnName(int column) {    
        return columnas[column];
    }
}
