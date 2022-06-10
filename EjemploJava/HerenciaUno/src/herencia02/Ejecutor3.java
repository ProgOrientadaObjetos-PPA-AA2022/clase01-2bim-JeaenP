/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia02;

import herencia01.EstudiantePresencial;
import herencia01.EstudianteDistancia;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Elija una opcion");
        System.out.println("1) Ingresar Estudiante Distancia");
        System.out.println("2) Ingresar Estudiante Presencial");
        int op = sc.nextInt();
        sc.nextLine();
        if (op == 1 || op == 2) {
            System.out.println("Ingrese los nombres del Estudiante");
            String nombre = sc.nextLine();
            System.out.println("Ingrese los apellidos del Estudiante");
            String apellidos = sc.nextLine();
            System.out.println("Ingrese la identificacion del Estudiante");
            String identificacion = sc.nextLine();
            System.out.println("Ingrese la edad del Estudiante");
            int edad = sc.nextInt();
            if (op == 1) {
                EstudianteDistancia e1 = new EstudianteDistancia();
                System.out.println("INgrese el numero de asignaturas del Estudiante");
                int nAsignaturas = sc.nextInt();
                System.out.println("Ingrese el costo por Asignatura");
                double costoAsignatura = sc.nextDouble();
                e1.establecerNombresEstudiante(nombre);
                e1.establecerApellidoEstudiante(apellidos);
                e1.establecerIdentificacionEstudiante(identificacion);
                e1.establecerEdadEstudiante(edad);
                e1.establecerNumeroAsginaturas(nAsignaturas);
                e1.establecerCostoAsignatura(costoAsignatura);
                e1.calcularMatriculaDistancia();
                System.out.printf("%s\n", e1);
            } else if (op == 2) {
                EstudiantePresencial e1 = new EstudiantePresencial();
                System.out.println("INgrese el numero de creditos del Estudiante");
                int nCreditos = sc.nextInt();
                System.out.println("Ingrese el costo por credito");
                double costoCredito = sc.nextDouble();
                e1.establecerNombresEstudiante(nombre);
                e1.establecerApellidoEstudiante(apellidos);
                e1.establecerIdentificacionEstudiante(identificacion);
                e1.establecerEdadEstudiante(edad);
                e1.establecerNumeroCreditos(nCreditos);
                e1.establecerCostoCredito(costoCredito);
                e1.calcularMatriculaPresencial();
                System.out.printf("%s\n", e1);
            }
        } else {
            System.out.println("OPCION NO VALIDA");
        }

    }
}
