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
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        EstudianteDistancia e1 = new EstudianteDistancia();
        System.out.println("Ingrese los nombres del Estudiante"); 
        String nombre = sc.nextLine();
        e1.establecerNombresEstudiante(nombre);
        System.out.println("Ingrese los apellidos del Estudiante");
        String apellidos = sc.nextLine();
        e1.establecerApellidoEstudiante(apellidos);
        System.out.println("Ingrese la identificacion del Estudiante");
        String identificacion = sc.nextLine();
        e1.establecerIdentificacionEstudiante(identificacion);
        System.out.println("Ingrese la edad del Estudiante");
        int edad = sc.nextInt();
        e1.establecerEdadEstudiante(edad);
        System.out.println("INgrese el numero de asignaturas del Estudiante");
        int nAsignaturas = sc.nextInt();
        e1.establecerNumeroAsginaturas(nAsignaturas);
        System.out.println("Ingrese el costo por Asignatura");
        double costoAsignatura = sc.nextDouble();
        e1.establecerCostoAsignatura(costoAsignatura); 
        e1.calcularMatriculaDistancia();
        System.out.printf("%s\n", e1);
    }
}
