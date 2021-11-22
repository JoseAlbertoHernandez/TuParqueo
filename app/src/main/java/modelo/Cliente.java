package modelo;

import androidx.annotation.NonNull;

public class Cliente {
    private int cedula;
    private String nomCliente;
    private String apeCliente;
    private String dirCliente;
    private int telCliente;
    private String correoCliente;

    public Cliente(int cedula, String nomCliente, String apeCliente, String dirCliente,
                   int telCliente, String correoCliente) {
        this.cedula = cedula;
        this.nomCliente = nomCliente;
        this.apeCliente = apeCliente;
        this.dirCliente = dirCliente;
        this.telCliente = telCliente;
        this.correoCliente = correoCliente;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
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

    public int getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(int telCliente) {
        this.telCliente = telCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
