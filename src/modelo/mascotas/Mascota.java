package modelo.mascotas;

import java.util.Scanner;

public abstract class Mascota {
    private String nombre;
    private int edad;
    private int peso;

    public Mascota(String nombre, int edad, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public abstract void emitirSonido();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.length()<2 || nombre.isBlank() || nombre.length()>10){
            Scanner leerNombre = new Scanner(System.in);
            do {
                System.out.print("Introduce un nombren,o vacio, de 2 a 10 caracteres");
                nombre = leerNombre.nextLine();
            }while(nombre.length()<2 || nombre.isBlank() || nombre.length()>10);
        }
        this.nombre = nombre;
        System.out.println("El nuevo nombre es: " + getNombre());
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad < 1 || edad > 100){
            Scanner leerEdad = new Scanner(System.in);
            do {
                System.out.println("Introduce edad entre 1 y 100");
                edad = leerEdad.nextInt();
            } while(edad < 1 || edad > 100);
        }
        this.edad = edad;
        System.out.println("Edad nueva es: " + getEdad());
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if(peso < 1 || peso > 100){
            Scanner leerPeso= new Scanner(System.in);
            do {
                System.out.println("Introduce peso entre 1 y 100");
                peso = leerPeso.nextInt();
            } while(peso < 1 || peso > 100);
        }
        this.peso = peso;
        System.out.println("El Peso nuevo es: " + getPeso());
    }
}
