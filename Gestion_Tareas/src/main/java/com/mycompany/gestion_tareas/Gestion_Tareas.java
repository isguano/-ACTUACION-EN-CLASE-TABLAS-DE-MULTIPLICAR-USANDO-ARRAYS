package com.mycompany.gestion_tareas;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestion_Tareas {

    ArrayList<Gestion> tareas = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Gestion_Tareas gestionTareas = new Gestion_Tareas();
        boolean salir = false;

        while (!salir) {
            System.out.println("Sistema de Gestión de Tareas");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Completar tarea");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    gestionTareas.agregartarea();
                    break;
                case 2:
                    gestionTareas.mostrartarea();
                    break;
                case 3:
                    gestionTareas.eliminartarea();
                    break;
                case 4:
                    gestionTareas.completartarea();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor ingrese una opción del 1 al 5.");
            }
        }
    }

    public void agregartarea() {
        System.out.print("Ingresa el nombre de la tarea: ");
        String nombre = scanner.nextLine();

        int prioridad = 0;
        while (prioridad < 1 || prioridad > 5) {
            System.out.print("Ingresa la prioridad (1-5): ");
            prioridad = scanner.nextInt();
            scanner.nextLine();
            if (prioridad < 1 || prioridad > 5) {
                System.out.println("Prioridad inválida. Debe estar entre 1 y 5.");
            }
        }

        tareas.add(new Gestion(nombre, prioridad));
        System.out.println("Tarea agregada exitosamente.");
    }

    public void mostrartarea() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas disponibles.");
            return;
        }

        System.out.println("Lista de tareas:");
        for (int i = 0; i < tareas.size(); i++) {
            Gestion t = tareas.get(i);
            System.out.println(i + 1 + ". " + t.nombre + " (Prioridad: " + t.prioridad + ", Completada: " + (t.completada ? "Sí" : "No") + ")");
        }
    }

    public void eliminartarea() {
        mostrartarea();
        if (tareas.isEmpty()) return;

        System.out.print("Ingresa el número de la tarea a eliminar: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < tareas.size()) {
            tareas.remove(index);
            System.out.println("Tarea eliminada exitosamente.");
        } else {
            System.out.println("Número inválido.");
        }
    }

    public void completartarea() {
        mostrartarea();
        if (tareas.isEmpty()) return;

        System.out.print("Ingresa el número de la tarea a marcar como completada: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < tareas.size()) {
            tareas.get(index).completada = true;
            System.out.println("Tarea marcada como completada.");
        } else {
            System.out.println("Número inválido.");
        }
    }
}
