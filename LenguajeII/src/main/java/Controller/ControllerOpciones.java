package controller;

import model.Service.ServiceEmpresa;

import java.util.Scanner;

public class ControllerOpciones {
    private Scanner opcion ;

    public ControllerOpciones() {
    }

    public void opcionesDeInicio(){
    int opcion = 0;
        System.out.println("ingrese la entidad sobre la cual desea operar");
        System.out.println("1 Empresa");
        System.out.println("2 Campo");
        System.out.println("3 Lotes");
        System.out.println("4 cultivos");
        System.out.println("5 Proyectos");
        Scanner entrada = new Scanner(System.in);
        opcion = entrada.nextInt();
        ServiceEmpresa serviceEmpresa = new ServiceEmpresa();
        serviceEmpresa.opcionesDeEmpresa();
    }

    }
