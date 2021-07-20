package model.Repository;

import model.entity.Empresa;

public class EmpresaRepository {
    private String nombreEmpresa="";
    private String cuilEmpresa ="";
    private String domicilioEmpresa ="";
    private String emailEmpresa ="";

    public void obtenerDatos(String nombre ,String cuit ,String direccion,String email){
        this.nombreEmpresa = nombre;
       this.cuilEmpresa = cuit  ;
        this.domicilioEmpresa=direccion;
       this.emailEmpresa = email;
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
    }


    public void VerDatosDeLaEmpresa(){
        System.out.println("nombre :"+getNombreEmpresa());
        System.out.println("cuit :"+getCuilEmpresa());
        System.out.println("direccion :"+getDomicilioEmpresa() );
        System.out.println("email :" + getEmailEmpresa());
    }



}


