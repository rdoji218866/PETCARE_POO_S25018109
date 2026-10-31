package modelo.Clinica;

import modelo.personas.Persona;
import modelo.personas.Recepcionista;
import modelo.personas.Veterinario;

import java.util.HashSet;
import java.util.Set;

public class Clinica {
    private String nombre;
    private int telefono;
    private String direccion;
    private Set<Consultorio> consultorios;
    private Set<Persona> personal;

    public Clinica(String nombre, int telefono, String direccion, Recepcionista recepcionista, Veterinario veterinario) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.consultorios = new HashSet<>();
        this.personal = new HashSet<>();
        consultorios.add(new Consultorio(1));
    }

    public Set<Consultorio> getConsultorios() {
        return consultorios;
    }

    public Set<Consultorio> mostrarConsultorio() {
        return consultorios;
    }

    public void agregarConsultorio(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            consultorios.add(new Consultorio(consultorios.size()+ 1));
        }
    }

    public Set<Persona> getPersonal() {
        return personal;
    }

    public void agregarPersonal(Set<Persona> personal) {
        this.personal = personal;
    }
}
