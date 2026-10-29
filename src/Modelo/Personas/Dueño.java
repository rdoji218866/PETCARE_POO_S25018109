package Modelo.Personas;
import Modelo.Mascotas.Mascota;

import java.util.ArrayList;
import java.util.List;

public class Dueño extends Persona {
    private String direccion;
    private List<Mascota> mascotas;

    public Dueño(String nombre, String apellido, int telefono, String correo, String direccion) {
        super(nombre, apellido, telefono, correo);
        this.direccion = direccion;
        this.mascotas = new ArrayList<>();
    }

    public Dueño(String direccion) {
        super("", "", 0, "");
        this.direccion = direccion;
        this.mascotas = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}