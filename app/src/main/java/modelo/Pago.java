package modelo;

import androidx.annotation.NonNull;

public class Pago {
    private String formaPago;
    private String estado;

    public Pago(String formaPago, String estado) {
        this.formaPago = formaPago;
        this.estado = estado;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
