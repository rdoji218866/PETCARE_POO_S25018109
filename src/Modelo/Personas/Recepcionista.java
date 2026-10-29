package Modelo.Personas;

public class Recepcionista extends Persona {
    private Turno turno;

    public Recepcionista(String nombre, String apellido, int telefono, String correo, Turno turno) {
        super(nombre, apellido, telefono, correo);
        this.turno = turno;
    }

    public Recepcionista(Turno turno) {
        super("", "", 0, "");
        this.turno = turno;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
