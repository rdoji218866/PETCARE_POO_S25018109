package modelo.servicios;

import modelo.mascotas.Mascota;

import java.util.Date;

public class Cirugia implements Cobrable {
    private final Mascota mascotaAtendidad;
    private Complejidad complejidad;
    EstadoCita estado;
    private Date fecha;

    public Cirugia(String nombreCirugia, Complejidad complejidad, Mascota mascotaAtendidad,Date fecha) {
        this.mascotaAtendidad = mascotaAtendidad;
        this.complejidad = complejidad;
        this.estado = EstadoCita.Programada;
    }

    public Complejidad getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(Complejidad complejidad) {
        this.complejidad = complejidad;
    }

    public void atenderCita() {
        if(estado == EstadoCita.Programada) this.estado = EstadoCita.Atendida;
        generarComprobante();
    }
    public void cancelarCita() {
        if(estado == EstadoCita.Programada) this.estado = EstadoCita.Cancelada;
        generarComprobante();
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
        if (estado == EstadoCita.Atendida) {
            System.out.println("Mascota atendida: " + mascotaAtendidad.getNombre());
            System.out.println("Fecha atendida: " + fecha);
            System.out.println("Precio por cirugia ["+complejidad+"]: "+ calcularCosto());
        }else if (estado == EstadoCita.Cancelada) {
            System.out.println("Mascota: " + mascotaAtendidad.getNombre());
            System.out.println("Su cirugia fue cancelada");
        }else{
            System.out.println("Esta cita no ha sido atendida.");
            System.out.println("Mascota a atender:  " + mascotaAtendidad.getNombre());
            System.out.println("Fecha de cita: " + fecha);
        }
    }
}
