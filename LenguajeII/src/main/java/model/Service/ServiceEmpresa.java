package model.Service;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import controller.ControllerOpciones;
import model.entity.Campo;
import model.entity.Empresa;

import java.util.Scanner;

public class ServiceEmpresa {
    private int opcionEmpresa ;
    Empresa empresa = new Empresa();
    ControllerOpciones controllerOpciones = new ControllerOpciones();
    public void creaEmpresa(){
        String nombre , cuit , direccion , email ;
        System.out.println("registrar datos de la Empresa");
        System.out.println("ingrese nombre de la empresa");
        Scanner entrada = new Scanner(System.in);
        nombre = entrada.nextLine();
       empresa.setNombre(nombre);
        System.out.println("ingrese el cuit de la Empresa");
         entrada =new Scanner(System.in);
         cuit = entrada.nextLine();
        empresa.setCuit(cuit);
        System.out.println("ingrese direccion de la empresa");
        entrada = new Scanner(System.in);
        direccion = entrada.nextLine();
        empresa.setDireccion(direccion);
        System.out.println("ingrese email de la empresa");
        entrada = new Scanner(System.in);
        email = entrada.nextLine();
        empresa.setEmail(email);


    }
    public void opcionesDeEmpresa() {
        System.out.println("seleccione opcion a realizar");
        System.out.println(" 1 conocer datos de la empresa");
        System.out.println("2 conocer lista de campos con los que cuenta le empresa");
        System.out.println(" 3 regresar a menu anterior");
        System.out.println(" 4 conocer la cantidad de campos con los que cuenta la empresa");
        Scanner entrada = new Scanner(System.in);
        opcionEmpresa = entrada.nextInt();

            switch (opcionEmpresa) {
                case 1:
                    System.out.println("nombre : " + empresa.getNombre());
                    System.out.println("cuit : " + empresa.getCuit());
                    System.out.println("Direccion : " + empresa.getDireccion());
                    System.out.println("Email : " + empresa.getEmail());
                    controllerOpciones.opcionesDeInicio();
                case 2:
                    System.out.println("estos son los campos con los que cuenta la empresa");
                    for (Campo camporecorrido : empresa.getCampo()) {
                        System.out.println("nombre :" + camporecorrido.getNombre() + "cantidad de hectareas :" + camporecorrido.getSuperficie() + "Estado del campo" + camporecorrido.getEstado());
                        System.out.println("provincia en que se encuentra :" + camporecorrido.getProvincia() + "lotes en los que se divide" + camporecorrido.getLote());



                    }
                    controllerOpciones.opcionesDeInicio();
                case 3:
                    controllerOpciones.opcionesDeInicio();
                case 4 :
                    conocerCantidadDeCamposDeLaEmpresa();
            }

    }
    public ServiceEmpresa() {
    }
    public void conocerCantidadDeCamposDeLaEmpresa(){
        System.out.println("la empresa cuenta con :"+ empresa.getCampo().size()+"campos");
      controllerOpciones.opcionesDeInicio();

    }

}
