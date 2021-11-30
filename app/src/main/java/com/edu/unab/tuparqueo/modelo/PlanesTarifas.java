package com.edu.unab.tuparqueo.modelo;

public class PlanesTarifas {
    private String plan;
    private String valor;


    public PlanesTarifas(String plan, String valor) {
        this.plan = plan;
        this.valor = valor;

    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
