package core;

import java.util.ArrayList;
import java.util.List;
import alta.Alta;
import baja.Baja;
import listado.Listado;


public class Main {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        boolean salir = false;
        while (!salir) {
            System.out.println("---ESCUELA DE FUTBOL GESTION ESTUDIANTES---");
            System.out.println("1) Listado de los estudiantes");
            System.out.println("2) Alta de estudiantes");
            System.out.println("3) Baja de estudiantes");
            System.out.println("4) Salir del programa");
            System.out.print("Ingresar una opcion: ");
            switch (opcion) {
                case 1:
                    Estudiante nuevo = Alta.crearEstudiante();
                    estudiantes.add(nuevo);
                    break;

                case 2:
                    Baja.eliminarEstudiante(estudiantes);
                    break;

                case 3:
                    Listado.mostrarEstudiantes(estudiantes);

                case 4:
                    salir = true;
                    System.out.println("Saliendo del programa.....");
                    break;
                default:
                    System.out.println("Opcion NO valida");
            }
        }
    }
}