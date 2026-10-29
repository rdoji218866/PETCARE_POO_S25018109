package app;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n==================================================");
            System.out.println("             MENÚ PETCARE - CLÍNICA              ");
            System.out.println("==================================================");
            System.out.println("1. Registrar dueño y mascota (perro, gato o ave)");
            System.out.println("2. Registrar veterinario y asignarlo a la clínica");
            System.out.println("3. Agendar una cita");
            System.out.println("4. Atender o cancelar una cita");
            System.out.println("5. Generar el comprobante de una cita atendida");
            System.out.println("6. Consultar el historial clínico de una mascota");
            System.out.println("7. Listar todas las mascotas y su sonido (polimorfismo)");
            System.out.println("8. Ver el total cobrado por veterinario");
            System.out.println("9. Dar de baja una mascota");
            System.out.println("10. Salir");
            System.out.println("==================================================");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar búfer

            switch (opcion) {
                case 1:{}
                    break;
                case 2:{}
                    break;
                case 3:{}
                    break;
                case 4:{}
                    break;
                case 5:{}
                    break;
                case 6:{}
                    break;
                case 7:{}
                    break;
                case 8:{}
                    break;
                case 9:{}
                    break;
                case 10:
                    System.out.println("Saliendo del sistema PETCARE...");
                    break;
                default:
                    System.out.println("Opción invalida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 10);

        scanner.close();
    }
}