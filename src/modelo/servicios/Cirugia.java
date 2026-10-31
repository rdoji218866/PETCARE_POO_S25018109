package modelo.servicios;

public class Cirugia implements Cobrable {
    private String nombreCirugia;
    private Complejidad complejidad;
    public Cirugia(String nombreCirugia, Complejidad complejidad, EstadoCita estado) {
        this.nombreCirugia = nombreCirugia;
        this.complejidad = complejidad;
    }

    public String getNombreCirugia() {
        return nombreCirugia;
    }

    public void setNombreCirugia(String nombreCirugia) {
        this.nombreCirugia = nombreCirugia;
    }

    public Complejidad getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(Complejidad complejidad) {
        this.complejidad = complejidad;
    }

    @Override
    public int calcularCosto() {
        int base = 0;
        switch (complejidad) {
            case Compleja -> base = 1000;
            case Dificil -> base = 900;
            case Intermedia -> base = 500;
            case Facil -> base = 100;
        }
        return base;
    }

    @Override
    public void generarComprobante() {
        System.out.println("Comprobante por cirugia [" + complejidad + "]. Precio: " + calcularCosto());
    }
}
