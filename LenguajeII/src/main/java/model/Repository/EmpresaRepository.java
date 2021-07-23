package model.Repository;

import model.entity.Campo;
import model.entity.Empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpresaRepository {
    private String nombreEmpresa="";
    private String cuilEmpresa ="";
    private String domicilioEmpresa ="";
    private String emailEmpresa ="";
    private List<Campo> campos;
    Empresa empresa = new Empresa();

    public void obtenerDatos(String nombre ,String cuit ,String direccion,String email){
        this.nombreEmpresa = nombre;
       this.cuilEmpresa = cuit  ;
        this.domicilioEmpresa=direccion;
       this.emailEmpresa = email;
       empresa.setCuit(cuit);
       empresa.setNombre(nombre);
       empresa.setDireccion(direccion);
       empresa.setEmail(email);
    }
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCuilEmpresa() {
        return cuilEmpresa;
    }

    public void setCuilEmpresa(String cuilEmpresa) {
        this.cuilEmpresa = cuilEmpresa;
    }

    public String getDomicilioEmpresa() {
        return domicilioEmpresa;
    }

    public void setDomicilioEmpresa(String domicilioEmpresa) {
        this.domicilioEmpresa = domicilioEmpresa;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public EmpresaRepository() {
        campos = new ArrayList<>();
    }


    public void VerDatosDeLaEmpresa(){
        System.out.println("nombre :"+getNombreEmpresa());
        System.out.println("cuit :"+getCuilEmpresa());
        System.out.println("direccion :"+getDomicilioEmpresa() );
        System.out.println("email :" + getEmailEmpresa());
    }
    public void registro(String nombre, String superficie, String  lotes, String provincia, String estado) {
        Campo nuevoCampo = new Campo(nombre, superficie, estado, provincia, lotes);
        this.campos.add(nuevoCampo);
        empresa.setCampo(campos);
    }
    public void conocerListaDeCampos() {
        for (Campo cr : campos) {
            System.out.println("el nombre del campo es:" + cr.getNombre());
            System.out.println("su superficie es de:" + cr.getSuperficie() + "hectareas");
            System.out.println("se encuentra en la provincia de :" + cr.getProvincia());
            System.out.println("su estado es:" + cr.getEstado());
            System.out.println("cuenta con:" + cr.getCantidadLotes() + " cantidad de lotes");
        }

    }
    public void eliminarUnCampo(String nombre){
        Campo campoEncontrado = new Campo();
        for (Campo cr:this.campos) {
            if (cr.getNombre().equals(nombre)){
                System.out.println("----------------------");
                System.out.println("esta seguro que desea eliminar el campo:"+cr.getNombre());
                System.out.println("----------------------");
                System.out.println("para confirmar presione 1 .... para cancelar presione 2");
                Scanner entrada = new Scanner(System.in);
                int eleccion;
                eleccion = entrada.nextInt();
                if(eleccion==1){campos.remove(cr);}
            }
        }

    }
    public void modificarNombreDeCampo(String nombre) {
        Scanner entrada;
        Campo campoencontrado = new Campo();
        for (Campo cr : this.campos) {
            if (cr.getNombre().equals(nombre)) {
                campoencontrado=cr;
            }
        }
        System.out.println("ingrese el nuevo nombre del campo");
        entrada = new Scanner(System.in);
        String nuevoNombre = entrada.nextLine();
        campoencontrado.setNombre(nuevoNombre);
    }

    public void modificarSuperficieDeCampo(String nombre) {
        Scanner entrada;
        Campo campoencontrado = new Campo();
        for (Campo cr : this.campos) {
            if (cr.getNombre().equals(nombre)) {
                cr = campoencontrado;
            }
        }
        System.out.println("ingrese la nueva superficie del campo");
        entrada = new Scanner(System.in);
        String nuevaSuperficie = entrada.nextLine();
        campoencontrado.setNombre(nuevaSuperficie);
    }
    public void modificarProvinciaDeCampo(String nombre) {
        Campo campoEncontrado = new Campo();
        Scanner entrada;
        for (Campo cr : this.campos) {
            if (cr.getNombre().equals(nombre)) {
                campoEncontrado = cr;
            }
            System.out.println("ingrese el nuevo nombre del campo");
            entrada = new Scanner(System.in);
            String nuevoNombre = entrada.nextLine();
            campoEncontrado.setNombre(nuevoNombre);
        }
    }
    public void modificarEstadoDeCampo(String nombre) {
        Campo campoEncontrado = new Campo();
        Scanner entrada;
        for (Campo cr : this.campos) {
            if (cr.getNombre().equals(nombre)) {campoEncontrado=cr;}
        }
        System.out.println("ingrese el nuevo estado del campo");
        entrada = new Scanner(System.in);
        String nuevoEstado = entrada.nextLine();
        campoEncontrado.setEstado(nuevoEstado);
    }

    public void modificarCantidadDeLotesDeCampo(String nombre) {
        Campo campoEncontrado = new Campo();
        Scanner entrada;
        for (Campo cr : this.campos) {
            if (cr.getNombre().equals(nombre)) {campoEncontrado=cr;}
            System.out.println("ingrese el nuevo numero de lotes del campo");
            entrada = new Scanner(System.in);
            String nuevonumero = entrada.nextLine();
            campoEncontrado.setCantidadLotes(nuevonumero);
        }}
    public void buscarCampo(String nombre){
        Campo campo = new Campo();
        for (Campo cr:this.campos) {
            if(cr.getNombre().equals(nombre)){
                System.out.println(cr.getNombre());
                System.out.println(cr.getSuperficie()+"hectareas");
                System.out.println("su actual estado es:"+cr.getEstado());
                System.out.println("se encuentra en la provincia de:"+cr.getProvincia());
                System.out.println("se divide en:"+cr.getCantidadLotes()+"cantidad de lotes");
            }
        }
    }


}


