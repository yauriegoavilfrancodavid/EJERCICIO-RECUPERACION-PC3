package Vista;

import Controlador.GestionLenguaje;
import java.util.Scanner;

public class SistemaRegistro {
    private GestionLenguaje gestionLenguaje;

    public SistemaRegistro() {
        gestionLenguaje = new GestionLenguaje();
    }

    public static void main(String[] args) {
        SistemaRegistro sistemaRegistro = new SistemaRegistro();
        sistemaRegistro.menu();
    }

    public void menu() {
        String opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nMenu de Lenguajes de Programacion:");
            System.out.println("A. Agregar lenguaje");
            System.out.println("B. Buscar lenguaje");
            System.out.println("C. Eliminar lenguaje");
            System.out.println("D. Imprimir lenguajes");
            System.out.println("S. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextLine().toUpperCase(); // Convertir a mayúsculas para facilitar la comparación

            switch (opcion) {
                case "A":
                    gestionLenguaje.agregarLenguaje();
                    break;
                case "B":
                    gestionLenguaje.buscarLenguaje();
                    break;
                case "C":
                    gestionLenguaje.eliminarLenguaje();
                    break;
                case "D":
                    gestionLenguaje.imprimirLenguajes();
                    break;
                case "S":
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (!opcion.equals("S"));
        scanner.close();
    }
}
