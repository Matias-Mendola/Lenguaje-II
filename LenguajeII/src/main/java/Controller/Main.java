package controller;

import model.Repository.CampoRepository;

public class Main {
    public static void main(String[] args){
        CampoRepository repositoriocampo = new CampoRepository();
        repositoriocampo.agregarCampo("Las dolores","1000","desocupado","Misiones",5);

        repositoriocampo.buscarCampoPorNombre("Las dolores");


    }
}
