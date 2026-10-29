package Modelo.Servicios;

public class Cirugia implements Cobrable {
    private String nombreCirugia;
    private ConsultaGeneral numero;
    private Complejidad complejidad;

    public Cirugia(String nombreCirugia, ConsultaGeneral numero, Complejidad complejidad) {
        this.nombreCirugia = nombreCirugia;
        this.numero = numero;
        this.complejidad = complejidad;
    }

    public String getNombreCirugia() {
        return nombreCirugia;
    }

    public void setNombreCirugia(String nombreCirugia) {
        this.nombreCirugia = nombreCirugia;
    }

    public ConsultaGeneral getNumero() {
        return numero;
    }

    public void setNumero(ConsultaGeneral numero) {
        this.numero = numero;
    }

    public Complejidad getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(Complejidad complejidad) {
        this.complejidad = complejidad;
    }

    @Override
    public int calcularCosto() {
        int base = (numero != null) ? numero.getTarifaBase() : 0;
        switch (complejidad) {
            case Compleja: return base + 5000;
            case Dificil: return base + 3000;
            case Intermedia: return base + 2000;
            case Facil: return base + 1000;
            default: return base;
        }
    }

    @Override
    public void generarComprobante() {
        System.out.println("Comprobante Cirugía: " + nombreCirugia + " [" + complejidad + "] - Costo total: $" + calcularCosto());
    }
}
