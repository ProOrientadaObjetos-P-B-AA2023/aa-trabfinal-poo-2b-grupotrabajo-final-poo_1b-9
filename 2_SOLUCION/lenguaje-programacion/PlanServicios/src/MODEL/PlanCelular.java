package MODEL;

public abstract class PlanCelular {
 public Propietario propietario;
    protected double pagoMensual;

    // Clase abstracta
    public abstract void calcularPagoMensual();

    public double obtenerPagoMesual() {
        return pagoMensual;
    }

}
