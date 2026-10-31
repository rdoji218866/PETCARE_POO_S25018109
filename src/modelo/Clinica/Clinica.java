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
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Set<Consultorio> getConsultorios() {
        return consultorios;
    }

    public void setConsultorios(Set<Consultorio> consultorios) {
        this.consultorios = consultorios;
    }

    public Set<Persona> getPersonal() {
        return personal;
    }

    public void setPersonal(Set<Persona> personal) {
        this.personal = personal;
    }
}
