package modelo;

import androidx.annotation.NonNull;

public class Parqueadero {
    private String razonSocial;
    private String nit;
    private String direccionParqueadero;
    private int telParqueadero;
    private String correoParqueadero;

    public Parqueadero(String razonSocial, String nit, String direccionParqueadero,
                       int telParqueadero, String correoParqueadero){
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.direccionParqueadero = direccionParqueadero;
        this.telParqueadero = telParqueadero;
        this.correoParqueadero = correoParqueadero;
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

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getTelParqueadero() {
        return telParqueadero;
    }

    public void setTelParqueadero(int telParqueadero) {
        this.telParqueadero = telParqueadero;
    }

    public String getCorreoParqueadero() {
        return correoParqueadero;
    }

    public void setCorreoParqueadero(String correoParqueadero) {
        this.correoParqueadero = correoParqueadero;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
