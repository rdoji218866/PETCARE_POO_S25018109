package Modelo.Servicios;

public class Vacunacion implements Cobrable {
    private String nombreEnfermedad;
    private int precioVacuna;
    private ConsultaGeneral numero;

    public Vacunacion(String nombreEnfermedad, int precioVacuna, ConsultaGeneral numero) {
        this.nombreEnfermedad = nombreEnfermedad;
        this.precioVacuna = precioVacuna;
        this.numero = numero;
    }

    public String getNombreEnfermedad() {
        return nombreEnfermedad;
    }

    public void setNombreEnfermedad(String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }

    public int getPrecioVacuna() {
        return precioVacuna;
    }

    public void setPrecioVacuna(int precioVacuna) {
        this.precioVacuna = precioVacuna;
    }

    public ConsultaGeneral getNumero() {
        return numero;
    }

    public void setNumero(ConsultaGeneral numero) {
        this.numero = numero;
    }

    @Override
    public int calcularCosto() {
        return precioVacuna + (numero != null ? numero.getTarifaBase() : 0);
    }

    @Override
    public void generarComprobante() {
        System.out.println("Comprobante Vacunación: " + nombreEnfermedad + " - Costo total: $" + calcularCosto());
    }
}