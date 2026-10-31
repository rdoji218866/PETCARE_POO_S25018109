package modelo.Clinica;
import modelo.servicios.Cobrable;
import java.util.HashSet;
import java.util.Set;

public class Consultorio {
    private int numero;
    private EstadoConsultorio estado;
    private Set<Cobrable> servicios;

    public Consultorio(int numero,  EstadoConsultorio estado) {
        this.numero = numero;
        this.estado = estado;
        this.servicios = new HashSet<>();
    }



    public void agregarServicio(Cobrable servicio) {
        this.servicios.add(servicio);
    }
}
