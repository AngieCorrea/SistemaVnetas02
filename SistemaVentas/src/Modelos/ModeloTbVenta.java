package Modelos;

import Entidades.Item;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTbVenta extends AbstractTableModel{
    
    private String[] columnas = {"Nombre","Cantidad","Precio"};
    private List<Item> items;

    public ModeloTbVenta(List<Item> items) {
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
            dato = items.get(rowIndex).getNombre();
        }
        else if(columnIndex == 1) {
            dato = items.get(rowIndex).getCantidad();
        }
        else if(columnIndex == 2) {
            dato = items.get(rowIndex).getPrecio();
        }        
        return dato;
    }
    
    @Override
    public String getColumnName(int column) {    
        return columnas[column];
    }
    
    @Override
    public boolean isCellEditable (int row, int col){
       return col == 1;
   }
    
    @Override
    public void setValueAt(Object value, int row, int col){
        int cani = items.get(row).getCantidad();
        int prei = items.get(row).getPrecio();
        int preu = prei/cani;
        int nc = Integer.parseInt(value.toString());
        int np = nc*preu;
        items.get(row).setCantidad(nc);
        items.get(row).setPrecio(np);
        fireTableDataChanged();
    }
}
