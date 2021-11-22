package modelo;

import androidx.annotation.NonNull;

public class Empleado {
    private int cedula;
    private String nomEmpleado;
    private String apeEmpleado;
    private String cargo;
    private String dirEmpleado;
    private int telEmpleado;
    private String correoEmpleado;

    public Empleado(int cedula, String nomEmpleado, String apeEmpleado, String cargo,
                    String dirEmpleado, int telEmpleado, String correoEmpleado) {
        this.cedula = cedula;
        this.nomEmpleado = nomEmpleado;
        this.apeEmpleado = apeEmpleado;
        this.cargo = cargo;
        this.dirEmpleado = dirEmpleado;
        this.telEmpleado = telEmpleado;
        this.correoEmpleado = correoEmpleado;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
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

    public int getTelEmpleado() {
        return telEmpleado;
    }

    public void setTelEmpleado(int telEmpleado) {
        this.telEmpleado = telEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
