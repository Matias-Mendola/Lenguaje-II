package model.entity;

import java.util.List;

public class Empresa {
    private String nombre;
    private String  cuit;
    private String direccion ;
    private String email ;
    private List<Campo> campo ;

    public Empresa(String nombre, String cuit, String direccion, String email) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.direccion = direccion;
        this.email = email;
    }

    public Empresa() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Campo> getCampo() {
        return campo;
    }

    public void setCampo(List<Campo> campo) {
        this.campo = campo;
    }
}
