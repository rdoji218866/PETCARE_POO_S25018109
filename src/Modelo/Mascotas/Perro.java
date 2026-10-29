package Modelo.Mascotas;

public class Perro extends Mascota {
    private String raza;
    private int nivelEnergia;

    public Perro(String nombre, int edad, int peso, String raza, int nivelEnergia) {
        super(nombre, edad, peso);
        this.raza = raza;
        this.nivelEnergia = nivelEnergia;
    }

    public Perro(String raza, int nivelEnergia) {
        super("", 0, 0);
        this.raza = raza;
        this.nivelEnergia = nivelEnergia;
    }

    @Override
    public void emitirSonido() {
        System.out.println("Guau guau");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }
}
