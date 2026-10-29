package Modelo.Personas;

public class Veterinario extends Persona {
    private int cedulaProfesional;
    private String especialidad;

    public Veterinario(String nombre, String apellido, int telefono, String correo, int cedulaProfesional, String especialidad) {
        super(nombre, apellido, telefono, correo);
        this.cedulaProfesional = cedulaProfesional;
        this.especialidad = especialidad;
    }

    public Veterinario(int cedulaProfesional, String especialidad) {
        super("", "", 0, "");
        this.cedulaProfesional = cedulaProfesional;
        this.especialidad = especialidad;
    }

    public int getCedulaProfesional() {
        return cedulaProfesional;
    }

    public void setCedulaProfesional(int cedulaProfesional) {
        this.cedulaProfesional = cedulaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
