package modelo.servicios;

import java.util.Date;

public class ConsultaGeneral implements Cobrable {
    private int tarifaBase;
    private EstadoCita estado;
    private Date fecha;
    private Cobrable servicioAdicional;

    public ConsultaGeneral(int tarifaBase,  Date fecha) {
        this.tarifaBase = tarifaBase;
        this.estado = EstadoCita.Programada;
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
