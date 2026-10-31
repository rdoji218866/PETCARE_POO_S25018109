package modelo.mascotas;

public class Gato extends Mascota {
    private boolean esDomestico;

    public Gato(String nombre, int edad, int peso, boolean esDomestico) {
        super(nombre, edad, peso);
        this.esDomestico = esDomestico;
    }

    public Gato() {
        super("", 0, 0);
        this.esDomestico = true;
    }

    @Override
    public void emitirSonido() {
        if(esDomestico){
            System.out.println("Miau miau con exceso de ternura");
        }else{
            System.out.println("Rugido con probabilidad de zarpaso");
        }
    }

    public boolean EsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        if (!esDomestico) {
            System.out.println("Advertencia: no es domestico, cuidado al manipularlo");
        }else{
            System.out.println("Advertencia: es domestico, cuidado con su ternura");
        }
        this.esDomestico = esDomestico;
    }
}
