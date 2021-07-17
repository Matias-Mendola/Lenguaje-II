package controller;


import model.Service.ServiceEmpresa;

public class Main {
    public static void main(String[] args){

        ControllerOpciones controllerOpciones = new ControllerOpciones();
        ServiceEmpresa serviceEmpresa = new ServiceEmpresa();

        serviceEmpresa.creaEmpresa();
        serviceEmpresa.opcionesDeEmpresa();

    }
}
