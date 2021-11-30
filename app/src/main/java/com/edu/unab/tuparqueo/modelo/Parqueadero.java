package com.edu.unab.tuparqueo.modelo;

public class Parqueadero {
    private String nit;
    private String razonSocial;
    private String direccionParqueadero;
    private String telParqueadero;
    private String correoParqueadero;

    public Parqueadero(String nit, String razonSocial, String direccionParqueadero,
                       String telParqueadero, String correoParqueadero){
        this.nit = nit;
        this.razonSocial = razonSocial;
        this.direccionParqueadero = direccionParqueadero;
        this.telParqueadero = telParqueadero;
        this.correoParqueadero = correoParqueadero;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccionParqueadero() {
        return direccionParqueadero;
    }

    public void setDireccionParqueadero(String direccionParqueadero) {
        this.direccionParqueadero = direccionParqueadero;
    }

    public String getTelParqueadero() {
        return telParqueadero;
    }

    public void setTelParqueadero(String telParqueadero) {
        this.telParqueadero = telParqueadero;
    }

    public String getCorreoParqueadero() {
        return correoParqueadero;
    }

    public void setCorreoParqueadero(String correoParqueadero) {
        this.correoParqueadero = correoParqueadero;
    }


}
