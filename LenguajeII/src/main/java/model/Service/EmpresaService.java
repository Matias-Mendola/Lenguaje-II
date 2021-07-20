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
    nombre=entrada.nextLine();
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
public void modiicarEmail(){
    Scanner entrada = new Scanner(System.in);
    String email;
    System.out.println("ingrese el nuevo email de la empresa");
    email=entrada.nextLine();
    repositoryEmpresa.setEmailEmpresa(email);
}

}
