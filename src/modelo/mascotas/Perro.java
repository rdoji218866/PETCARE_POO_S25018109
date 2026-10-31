package modelo.mascotas;

import java.util.Scanner;

public class Perro extends Mascota {
    private Raza raza;
    private int nivelEnergia;

    public Perro(String nombre, int edad, int peso, Raza raza, int nivelEnergia) {
        super(nombre, edad, peso);
        this.raza = raza;
        this.nivelEnergia = nivelEnergia;
    }

    public Perro() {
        super("", 0, 0);
        this.raza = Raza.SIN_RAZA;
        this.nivelEnergia = 0;
    }

    @Override
    public void emitirSonido() {
        System.out.println("Guau guau con un nivel de energia de " + this.nivelEnergia + " decibeles.");
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        if(nivelEnergia < 0 || nivelEnergia > 100) {
            Scanner leerNivelEnergia = new Scanner(System.in);
            do {
                System.out.println("Introduce un nivel de energia de entre 1 a 100");
                nivelEnergia = leerNivelEnergia.nextInt();
            }while(nivelEnergia < 1 || nivelEnergia > 100);
        }
        this.nivelEnergia = nivelEnergia;
        System.out.println("El nivel de energia es: " + nivelEnergia);
    }
}
