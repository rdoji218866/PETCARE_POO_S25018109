package Modelo.Servicios;

public class ConsultaGeneral implements Cobrable {
    private int tarifaBase;

    public ConsultaGeneral(int tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public int getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(int tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    @Override
    public int calcularCosto() {
        return tarifaBase;
    }

    @Override
    public void generarComprobante() {
        System.out.println("Comprobante Consulta General - Costo: $" + calcularCosto());
    }
}
