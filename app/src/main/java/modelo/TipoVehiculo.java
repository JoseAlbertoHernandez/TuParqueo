package modelo;

import androidx.annotation.NonNull;

public class TipoVehiculo {
    private String tVehiculo;

    public TipoVehiculo(String tVehiculo) {
        this.tVehiculo = tVehiculo;
    }

    public String gettVehiculo() {
        return tVehiculo;
    }

    public void settVehiculo(String tVehiculo) {
        this.tVehiculo = tVehiculo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
