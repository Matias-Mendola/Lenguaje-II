package model.Service;

import model.Repository.EmpresaRepository;

import java.util.Scanner;

public class EmpresaService {
    EmpresaRepository repositoryEmpresa = new EmpresaRepository();
    public void crearEmpresa (){
        String nombre , cuit , direccion , email;
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3= new Scanner(System.in);
        Scanner entrada4 = new Scanner(System.in);
        System.out.println("ingrese el nombre de la empresa a registrar");
        nombre = entrada1.nextLine();
        System.out.println("ingrese el cuit de la empresa");
        cuit = entrada2.nextLine();
        System.out.println("ingrese la direccion de la empresa");
        direccion = entrada3.nextLine();
        System.out.println("ingrese el emIL de la empresa");
        email= entrada4.nextLine();
        repositoryEmpresa.obtenerDatos(nombre,cuit,direccion,email);
    }
public void VerDatos(){
        repositoryEmpresa.VerDatosDeLaEmpresa();
}
public void modificarNombre(){
        Scanner entrada = new Scanner(System.in);
        String nombre;
    System.out.println("ingrese el nuevo nombre de la empresa");
    nombre = entrada.nextLine();
    repositoryEmpresa.setNombreEmpresa(nombre);
}
public void modificarCuit(){
    Scanner entrada = new Scanner(System.in);
    String cuit;
    System.out.println("ingrese el nuevo cuit de la empresa");
    cuit=entrada.nextLine();
    repositoryEmpresa.setCuilEmpresa(cuit);
}
public void modificarDomicilio(){
    Scanner entrada = new Scanner(System.in);
    String domicilio;
    System.out.println("ingrese el nuevo domicilio de la empresa");
    domicilio=entrada.nextLine();
    repositoryEmpresa.setDomicilioEmpresa(domicilio);
}
public void modificarEmail(){
    Scanner entrada = new Scanner(System.in);
    String email;
    System.out.println("ingrese el nuevo email de la empresa");
    email=entrada.nextLine();
    repositoryEmpresa.setEmailEmpresa(email);
}
    public void registrarUnCampo(){
        String nombre,estado,superficie,provincia,lotes;

        System.out.println("acontinuacion ingrese los datos del campo a registar");
        System.out.println("ingrese el nombre del Campo:");
        Scanner entrada = new Scanner(System.in);
        nombre = entrada.nextLine();
        System.out.println("ahora ingrese la supericie del campo en hectareas:");
        superficie = entrada.nextLine();
        System.out.println("ingrese la provincia donde se encuentra el campo");
        provincia=entrada.nextLine();
        System.out.println("ingrese en numero entero la cantidad de lotes con los que cuenta el campo:");
        lotes= entrada.nextLine();
        System.out.println("por ultimo especifique el estado en el que se encuentra el campo:");
        estado = entrada.nextLine();
        repositoryEmpresa.registro(nombre,superficie,lotes,provincia,estado);}
    public void listarCampos(){repositoryEmpresa.conocerListaDeCampos();}
    public void eliminarCampo (){
        Scanner entrada=new Scanner(System.in);
        String nombre;
        System.out.println("ingrese el nombre del campo que desea eliminar de la lista");
        nombre = entrada.nextLine();
        repositoryEmpresa.eliminarUnCampo(nombre);

    }
    public void modificarDatos(){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int eleccion;
        System.out.println("ingrese el nombre del campo que desea modificar");
        nombre = entrada.nextLine();
        System.out.println("¿Que dato desea modificar?");
        System.out.println("1 para modificar nombre");
        System.out.println("2 para modificar superficie");
        System.out.println("3 para modificar provincia donde se encuentra");
        System.out.println("4 para modificar el estado del campo");
        System.out.println("5 para modificar la cantidad de lotes que contiene");
        entrada = new Scanner(System.in);
        eleccion=entrada.nextInt();
        if (eleccion==1){repositoryEmpresa.modificarNombreDeCampo(nombre);}
        else if(eleccion==2){repositoryEmpresa.modificarSuperficieDeCampo(nombre);}
        else if(eleccion==3){repositoryEmpresa.modificarProvinciaDeCampo(nombre);}
        else if(eleccion==4){repositoryEmpresa.modificarEstadoDeCampo(nombre);}
        else if(eleccion ==5){repositoryEmpresa.modificarCantidadDeLotesDeCampo(nombre);}
    }
    public void buscarCampo(){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.println("ingrese el nombre del campo que desea buscar");
        nombre = entrada.nextLine();
        repositoryEmpresa.buscarCampo(nombre);
    }
}
