package com.edu.unab.tuparqueo.modelo;

public class Empleado {
    private String cedEmpleado;
    private String nomEmpleado;
    private String apeEmpleado;
    private String cargo;
    private String dirEmpleado;
    private String telEmpleado;
    private String correoEmpleado;

    public Empleado(String cedEmpleado, String nomEmpleado, String apeEmpleado, String cargo,
                    String dirEmpleado, String telEmpleado, String correoEmpleado) {
        this.cedEmpleado= cedEmpleado;
        this.nomEmpleado = nomEmpleado;
        this.apeEmpleado = apeEmpleado;
        this.cargo = cargo;
        this.dirEmpleado = dirEmpleado;
        this.telEmpleado = telEmpleado;
        this.correoEmpleado = correoEmpleado;
    }

    public String getCedEmpleado() {
        return cedEmpleado;
    }

    public void setCedEmpleado(String cedEmpleado) {
        this.cedEmpleado = cedEmpleado;
    }

    public String getNomEmpleado() {
        return nomEmpleado;
    }

    public void setNomEmpleado(String nomEmpleado) {
        this.nomEmpleado = nomEmpleado;
    }

    public String getApeEmpleado() {
        return apeEmpleado;
    }

    public void setApeEmpleado(String apeEmpleado) {
        this.apeEmpleado = apeEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDirEmpleado() {
        return dirEmpleado;
    }

    public void setDirEmpleado(String dirEmpleado) {
        this.dirEmpleado = dirEmpleado;
    }

    public String getTelEmpleado() {
        return telEmpleado;
    }

    public void setTelEmpleado(String telEmpleado) {
        this.telEmpleado = telEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }


}
