package model.Service;

import model.Repository.EmpresaRepository;

import java.util.Scanner;

public class ServiceOpciones {
    EmpresaService empresaService = new EmpresaService();
    ServiceCampo serviceCampo = new ServiceCampo();
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
        else if(eleccion == 2){this.opcionesDeCampo();this.opcionesinicio();}
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
            System.out.println("presione 4 para modificar email");
            System.out.println("presione 5 para modificar la lista de campos");
            opcion = entrada2.nextInt();
            if (opcion==1){ empresaService.modificarNombre();    opcionesinicio();}
            else if (opcion ==2){empresaService.modificarCuit();opcionesinicio();}
            else if(opcion==3){empresaService.modificarDomicilio();opcionesinicio();}
            else if(opcion==4){empresaService.modificarEmail();opcionesinicio();}
        }
    }
    public void opcionesDeCampo(){
        System.out.println("-----------------------");
        System.out.println("ingrese la opcion que desea realizar sobre Campo");
        System.out.println("1 conocer lista de Campos ");
        System.out.println("2 Buscar un Campo");
        System.out.println("3 modificar Datos de un campo");
        System.out.println("4 Eliminar un campo de la lista");
        System.out.println("5 agregar un nuevo campo a la lista ");
        System.out.println("..............................");
        Scanner entrada = new Scanner(System.in);
         int eleccion = entrada.nextInt();

        if(eleccion ==1){empresaService.listarCampos();}
        else if(eleccion==2){empresaService.buscarCampo();}
        else if(eleccion==3){empresaService.modificarDatos();}
        else if(eleccion==4){empresaService.eliminarCampo();}
        else if(eleccion==5){empresaService.registrarUnCampo();}


    }
}
