package modelo.personas;

import modelo.Clinica.Consultorio;

public class Veterinario extends Persona {
    private final int cedulaProfesional;
    private final String especialidad;
    private Consultorio consultorio;


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

    public Consultorio consultarConsultorio() {
        return consultorio;
    }

    public void cambiarConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    //sobreescribo el metodo hashcode para evitar duplicados en el personal de la clinica
    @Override
    public int hashCode() {
        return Integer.hashCode(cedulaProfesional);
    }

    public int getCedulaProfesional() {
        return cedulaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

}
