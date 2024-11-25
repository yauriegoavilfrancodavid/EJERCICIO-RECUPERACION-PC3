package Controlador;

import Modelo.LenguajeProgramacion;
import java.util.Scanner;

public class GestionLenguaje {
    private LenguajeProgramacion[] arregloLenguajes;
    private int contadorLenguajes;
    private final int FACTOR_CRECIMIENTO = 2;
    private Scanner scanner;

    public GestionLenguaje() {
        arregloLenguajes = new LenguajeProgramacion[FACTOR_CRECIMIENTO];
        contadorLenguajes = 0;
        scanner = new Scanner(System.in);
    }

    public void agregarLenguaje() {
        System.out.print("Ingrese el año de creacion: ");
        int añoCreacion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese la caracteristica principal: ");
        String caracteristicaPrincipal = scanner.nextLine();

        System.out.print("Ingrese el nombre del lenguaje: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la utilizacion del lenguaje: ");
        String utilizacion = scanner.nextLine();

        agregarLenguaje(añoCreacion, caracteristicaPrincipal, nombre, utilizacion);
        System.out.println("Lenguaje agregado correctamente.");
    }

    public void agregarLenguaje(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {
        if (contadorLenguajes == arregloLenguajes.length) {
            ampliarArreglo();
        }
        arregloLenguajes[contadorLenguajes] = new LenguajeProgramacion(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
        contadorLenguajes++;
    }

    private void ampliarArreglo() {
        LenguajeProgramacion[] nuevoArreglo = new LenguajeProgramacion[arregloLenguajes.length * FACTOR_CRECIMIENTO];
        for (int i = 0; i < contadorLenguajes; i++) {
            nuevoArreglo[i] = arregloLenguajes[i];
        }
        arregloLenguajes = nuevoArreglo;
    }

    public void buscarLenguaje() {
        System.out.print("Ingrese el nombre del lenguaje a buscar: ");
        String nombre = scanner.nextLine();

        LenguajeProgramacion lenguajeEncontrado = buscarLenguaje(nombre);
        if (lenguajeEncontrado != null) {
            System.out.println("Lenguaje encontrado: " + lenguajeEncontrado);
        } else {
            System.out.println("Lenguaje no encontrado.");
        }
    }

    public LenguajeProgramacion buscarLenguaje(String nombre) {
        for (int i = 0; i < contadorLenguajes; i++) {
            if (arregloLenguajes[i].getNombre().equals(nombre)) {
                return arregloLenguajes[i];
            }
        }
        return null;
    }

    public void eliminarLenguaje() {
        System.out.print("Ingrese el nombre del lenguaje a eliminar: ");
        String nombre = scanner.nextLine();

        if (eliminarLenguaje(nombre)) {
            System.out.println("Lenguaje eliminado correctamente.");
        } else {
            System.out.println("Lenguaje no encontrado.");
        }
    }

    public boolean eliminarLenguaje(String nombre) {
        for (int i = 0; i < contadorLenguajes; i++) {
            if (arregloLenguajes[i].getNombre().equals(nombre)) {
                for (int j = i; j < contadorLenguajes - 1; j++) {
                    arregloLenguajes[j] = arregloLenguajes[j + 1];
                }
                contadorLenguajes--;
                return true;
            }
        }
        return false;
    }

    public void imprimirLenguajes() {
        System.out.println("Lenguajes de programacion:");
        for (int i = 0; i < contadorLenguajes; i++) {
            System.out.println(arregloLenguajes[i]);
        }
    }

    public LenguajeProgramacion[] getArregloLenguajes() {
        LenguajeProgramacion[] lenguajes = new LenguajeProgramacion[contadorLenguajes];
        for (int i = 0; i < contadorLenguajes; i++) {
            lenguajes[i] = arregloLenguajes[i];
        }
        return lenguajes;
    }
}