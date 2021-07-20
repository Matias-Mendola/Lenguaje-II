package model.Service;

import model.Repository.EmpresaRepository;

import java.util.Scanner;

public class ServiceOpciones {
    EmpresaService empresaService = new EmpresaService();
    public void iniciar(){empresaService.crearEmpresa();}
    public void opcionesinicio(){
        Scanner opcion= new Scanner(System.in);
        System.out.println("sobre que entidad desea operar");
        System.out.println("1 operar sobre Empresa");
        System.out.println("2 operar sobre Campo");
        System.out.println("3 operar sobre Lote");
        System.out.println("4 operar sobre proyectos");
        int  eleccion;
        eleccion =opcion.nextInt();
        if (eleccion ==1){OpcioneEmpresa();this.opcionesinicio();}
        else if(eleccion == 2){empresaService.VerDatos();this.opcionesinicio();}
    }
    public void OpcioneEmpresa(){

        System.out.println("-----------------------");
        System.out.println("ingrese la opcion que desea realizar sobre Empresa");
        System.out.println("1 conocer datos ");
        System.out.println("2 modificar Datos ");
        System.out.println(" 3 Eliminar Empresa");
        Scanner entrada = new Scanner(System.in);
        int eleccion;
        eleccion = entrada.nextInt();
        if (eleccion ==1){empresaService.VerDatos(); opcionesinicio();}
        else if(eleccion==2){
            Scanner entrada2 = new Scanner(System.in);
            int opcion;
            System.out.println("¿que dato de la empresa desea modiicar?");
            System.out.println("presione 1 para modificar nombre");
            System.out.println("presione 2 para modificar cuit");
            System.out.println("presione 3 para modificar direccion ");
            System.out.println("presione 4 para modiicar email");
            System.out.println("presione 5 para modificar la lista de campos");
            opcion = entrada2.nextInt();
            if (opcion==1){ empresaService.modificarNombre();    opcionesinicio();}
            else if (opcion ==2){empresaService.modificarCuit();opcionesinicio();}
            else if(opcion==3){empresaService.modificarDomicilio();opcionesinicio();}
            else if(opcion==4){empresaService.modiicarEmail();opcionesinicio();}
        }
    }
}
