package com.edu.unab.tuparqueo.modelo;

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


}
