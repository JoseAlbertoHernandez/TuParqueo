package com.edu.unab.tuparqueo.modelo;

public class Cliente {
    private String cedCliente;
    private String nomCliente;
    private String apeCliente;
    private String dirCliente;
    private String telCliente;
    private String correoCliente;

    public Cliente(String cedCliente, String nomCliente, String apeCliente, String dirCliente,
                   String telCliente, String correoCliente) {
        this.cedCliente = cedCliente;
        this.nomCliente = nomCliente;
        this.apeCliente = apeCliente;
        this.dirCliente = dirCliente;
        this.telCliente = telCliente;
        this.correoCliente = correoCliente;
    }

    public String getCedCliente() {
        return cedCliente;
    }

    public void setCedCliente(String cedula) {
        this.cedCliente = cedula;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getApeCliente() {
        return apeCliente;
    }

    public void setApeCliente(String apeCliente) {
        this.apeCliente = apeCliente;
    }

    public String getDirCliente() {
        return dirCliente;
    }

    public void setDirCliente(String dirCliente) {
        this.dirCliente = dirCliente;
    }

    public String getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }


}
