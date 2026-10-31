package modelo.servicios;
import modelo.mascotas.Mascota;

import java.util.Date;

public class ConsultaGeneral implements Cobrable {
    private int tarifaBase;
    private EstadoCita estado;
    private Date fecha;
    private final Mascota mascotaAtendidad;

    public ConsultaGeneral(int tarifaBase, Mascota mascotaAtendidad,  Date fecha) {
        this.tarifaBase = tarifaBase;
        this.mascotaAtendidad = mascotaAtendidad;
        this.estado = EstadoCita.Programada;
    }
    public Mascota getMascotaAtendidad() {
        return mascotaAtendidad;
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
        return tarifaBase;
    }

    @Override
    public void generarComprobante() {
        if (estado == EstadoCita.Atendida) {
            System.out.println("Mascota atendida: " + mascotaAtendidad.getNombre());
            System.out.println("Fecha atendida: " + fecha);
            System.out.println("Precio por consulta: " + calcularCosto());
        }else if (estado == EstadoCita.Cancelada) {
            System.out.println("Mascota: " + mascotaAtendidad.getNombre());
            System.out.println("Su consulta fue cancelada");
        }else{
            System.out.println("Esta cita no ha sido atendida.");
            System.out.println("Mascota a atender:  " + mascotaAtendidad.getNombre());
            System.out.println("Fecha de cita: " + fecha);
        }
    }
}
