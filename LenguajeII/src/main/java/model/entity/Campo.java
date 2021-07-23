package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Campo {
    private  String nombre ;
    private String superficie ;
    private String estado ;
    private String provincia ;
    private String cantidadLotes;
    private List<Lote> lote ;

    public Campo() {

    }

    public Campo(String nombre, String superficie, String estado, String provincia, String cantidadLotes) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.estado = estado;
        this.provincia = provincia;
        this.cantidadLotes = cantidadLotes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCantidadLotes() {
        return cantidadLotes;
    }

    public void setCantidadLotes(String cantidadLotes) {
        this.cantidadLotes = cantidadLotes;
    }

    public List<Lote> getLote() {
        return lote;
    }

    public void setLote(List<Lote> lote) {
        this.lote = lote;
    }
}
