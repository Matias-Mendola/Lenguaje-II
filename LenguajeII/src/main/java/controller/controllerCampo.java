package controller;

import model.Repository.CampoRepository;
import model.entity.Campo;

import java.util.List;

public class controllerCampo {
    CampoRepository repositorycampo = new CampoRepository();
    private List<Campo> campoController;
    public void craerCampo(String nombre , String superficie , String estado , String provincia , int lotes){
        if (nombre != null && superficie !=null && estado!= null &&provincia !=null && lotes !=0 ){
           repositorycampo.agregarCampo(nombre,superficie,estado,provincia,lotes);
        }
    }
}
