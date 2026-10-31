package modelo.servicios;

import modelo.mascotas.Mascota;

import java.util.Date;

public class Vacunacion implements Cobrable {
    private final Enfermedad enfermedad;
    private final Mascota mascotaAtendidad;
    private EstadoCita estado;
    private int precioVacuna;
    private Date fecha;

    public Vacunacion(Enfermedad nombreEnfermedad, Mascota mascotaAtendidad, Date fecha) {
        estado = EstadoCita.Programada;
        this.mascotaAtendidad = mascotaAtendidad;
        this.enfermedad = nombreEnfermedad;
        switch (enfermedad) {
            case RABIA:
            case PARASITOSIS_INTESTINAL:
            case OTITIS:
                this.precioVacuna = 250;
                break;

            case PARVOVIROSIS:
            case MOQUILLO:
            case TOS_DE_LAS_PERRERAS:
                this.precioVacuna = 400;
                break;

            case LEUCEMIA_FELINA:
            case PANLEUCOPENIA:
                this.precioVacuna = 450;
                break;

            case NEWCASTLE:
            case PSITACOSIS:
            case CANDIDIASIS_AVIAR:
            case CIRCOVIRUS_AVIAR:
                this.precioVacuna = 300;
                break;

            case LEISHMANIOSIS:
                this.precioVacuna = 750;
                break;

            case INMUNODEFICIENCIA_FELINA:
            case PIF:
                this.precioVacuna = 800;
                break;
        }
    }

    public Enfermedad getNombreEnfermedad() {
        return enfermedad;
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
        return precioVacuna;
    }

    @Override
    public void generarComprobante() {
        if (estado == EstadoCita.Atendida) {
            System.out.println("Mascota atendida: " + mascotaAtendidad.getNombre());
            System.out.println("Fecha atendida: " + fecha);
            System.out.println("Vacunacion concluida por enfermedad " + enfermedad);
            System.out.println("Precio por vacunacion: " + calcularCosto());
        }else if (estado == EstadoCita.Cancelada) {
            System.out.println("Mascota: " + mascotaAtendidad.getNombre());
            System.out.println("Su vacunacion por "+ enfermedad+ " fue cancelada");
        }else{
            System.out.println("Esta cita no ha sido atendida.");
            System.out.println("Mascota a atender:  " + mascotaAtendidad.getNombre());
            System.out.println("Fecha de cita: " + fecha);
        }
    }
}