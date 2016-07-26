package Entidades;

import java.util.Date;

public class Venta {
    public Integer ID;
    public String Vendedor;
    public String Comprador;
    public Item Item;
    public int Cantidad;
    public int Total;

    public Venta() {
    }

    public Venta(Integer ID, String Vendedor, String Comprador, Item Item, int Cantidad, int Total) {
        this.ID = ID;
        this.Vendedor = Vendedor;
        this.Comprador = Comprador;
        this.Item = Item;
        this.Cantidad = Cantidad;
        this.Total = Total;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public String getComprador() {
        return Comprador;
    }

    public void setComprador(String Comprador) {
        this.Comprador = Comprador;
    }

    public Item getItem() {
        return Item;
    }

    public void setItem(Item Item) {
        this.Item = Item;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }   
}
