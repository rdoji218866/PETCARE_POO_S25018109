package Modelo.Mascotas;

public class AveExotica extends Mascota {
    private int envergaduraAlas;

    public AveExotica(String nombre, int edad, int peso, int envergaduraAlas) {
        super(nombre, edad, peso);
        this.envergaduraAlas = envergaduraAlas;
    }

    public AveExotica(int envergaduraAlas) {
        super("", 0, 0);
        this.envergaduraAlas = envergaduraAlas;
    }

    @Override
    public void emitirSonido() {
        System.out.println("Canto o grasnido exótico");
    }

    public int getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    public void setEnvergaduraAlas(int envergaduraAlas) {
        this.envergaduraAlas = envergaduraAlas;
    }
}
