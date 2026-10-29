package Modelo.Mascotas;

public class Gato extends Mascota {
    private boolean esDomestico;

    public Gato(String nombre, int edad, int peso, boolean esDomestico) {
        super(nombre, edad, peso);
        this.esDomestico = esDomestico;
    }

    public Gato(boolean esDomestico) {
        super("", 0, 0);
        this.esDomestico = esDomestico;
    }

    @Override
    public void emitirSonido() {
        System.out.println("Miau miau");
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }
}
