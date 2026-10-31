package modelo.personas;

public class Recepcionista extends Persona {
    private Turno turno;

    public Recepcionista(String nombre, String apellido, int telefono, String correo, Turno turno) {
        super(nombre, apellido, telefono, correo);
        this.turno = turno;
    }

    public Recepcionista(Turno turno) {
        super("", "", 0, "");
        this.turno = Turno.Sin_turno;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        if (this.turno == turno) {
            System.out.println("El recepcionista ya esta en ese turno");
        }else {
            this.turno = turno;
            System.out.println("El recepcionista ahora estara en el turno "+ getTurno());
        }
    }
}
