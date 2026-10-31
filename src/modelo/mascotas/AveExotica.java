package modelo.mascotas;

import java.util.Scanner;

public class AveExotica extends Mascota {
    private double envergaduraAlas;

    public AveExotica(String nombre, int edad, int peso, int envergaduraAlas) {
        super(nombre, edad, peso);
        this.envergaduraAlas = envergaduraAlas;
    }

    public AveExotica() {
        super("", 0, 0);
        this.envergaduraAlas = 0;
    }

    @Override
    public void emitirSonido() {
        System.out.println("Canto exotico con una envergadura de alas de"+getEnvergaduraAlas()+"m.");
    }

    public double getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    public void setEnvergaduraAlas(double envergaduraAlas) {
        if(envergaduraAlas < 1 || envergaduraAlas > 3){
            Scanner leerEnvergaduraAlas= new Scanner(System.in);
            do {
                System.out.println("Introduce envergaduraAlas entre 1 y 100");
                envergaduraAlas = leerEnvergaduraAlas.nextInt();
            } while(envergaduraAlas < 1 || envergaduraAlas > 100);
        }
        this.envergaduraAlas = envergaduraAlas;
        System.out.println("El EnvergaduraAlas nuevo es: " + getEnvergaduraAlas());
    }
}
