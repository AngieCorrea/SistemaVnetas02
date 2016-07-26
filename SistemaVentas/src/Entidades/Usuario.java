package Entidades;

public class Usuario {
    public Integer ID;
    public String Nombre;
    public String Pass;
    public String Cargo;

    public Usuario() {
    }
    
    public Usuario(Integer ID, String Nombre, String Pass, String Cargo) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Pass = Pass;
        this.Cargo = Cargo;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    
}