package modelo.personas;
import modelo.mascotas.Mascota;

import java.util.ArrayList;
import java.util.List;

public class Dueño extends Persona {
    private String direccion;
    private List<Mascota> mascotas;

    //Sobrecarga de metodos
    public Dueño(String nombre, String apellido, int telefono, String correo, String direccion) {
        super(nombre, apellido, telefono, correo);
        this.direccion = direccion;
        this.mascotas = new ArrayList<>();
    }
    //Sobrecarga de metodos
    public Dueño() {
        super("", "", 0, "");
        this.mascotas = new ArrayList<>();
    }

    //Me permite saber la direccion del dueño
    public String getDireccion() {
        return direccion;
    }

    //Modificar la direccion del dueño
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Puedo mandar la lista de las mascotas que tiene el dueño
    public List<Mascota> getMascotas() {
        return mascotas;
    }

    // Este metodo me permitira agregar mascotas al dueño
    public void agregarMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }

}