/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Repository;

import model.entity.*;

import java.util.ArrayList;
import java.util.List;

public class CampoRepository {
    private List<Campo> campo ;
    Empresa empresa = new Empresa();

    public List<Campo> getCampo() {
        return campo;
    }

    public void setCampo(List<Campo> campo) {
        this.campo = campo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public CampoRepository() {
        this.campo = new ArrayList<>();


    }
    public void agregarCampo(String nombre , String superficie , String estado , String provincia , int lotes){
        Campo crearCampo = new Campo();
        crearCampo.setNombre(nombre);
        crearCampo.setProvincia(provincia);
        crearCampo.setEstado(estado);
        crearCampo.setSuperficie(superficie);
        crearCampo.setCantidadLotes(lotes);

        this.campo.add(crearCampo);
        empresa.getCampo().add(crearCampo);
        System.out.println("campo agregado");
    }
    public void buscarCampoPorNombre (String nombre ){
        for (Campo cr: empresa.getCampo())

                  if (cr.getNombre().equals(nombre)){
                      System.out.println(" nombre  :"+cr.getNombre());
                      System.out.println("Estado  :" +cr.getEstado());
                      System.out.println(cr.getSuperficie()  +"  hectareas");
                      System.out.println("provincia de   :" +cr.getProvincia());
                      System.out.println("cantidad de Lotes   :" +cr.getCantidadLotes());

                  }

        }
        public void eliminarUnCampo(String nombre){
            for (Campo cr:empresa.getCampo()) {
                if (cr.getNombre().equals(nombre)){
                    empresa.getCampo().remove(cr);
                }
            }
        }
    }



