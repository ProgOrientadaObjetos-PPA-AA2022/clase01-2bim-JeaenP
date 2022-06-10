/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia02;
import herencia01.EstudiantePresencial;
import herencia01.EstudianteDistancia;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        EstudiantePresencial e1 = new EstudiantePresencial();
        e1.establecerNombresEstudiante("Jean Paul");
        e1.establecerApellidoEstudiante("Valarezo Puglla");
        e1.establecerIdentificacionEstudiante("1150038147");
        e1.establecerEdadEstudiante(18);
        e1.establecerNumeroCreditos(30);
        e1.establecerCostoCredito(150);
        e1.calcularMatriculaPresencial();
        System.out.printf("nombres: %s\n"
                + "Apellidos: %s\n"
                + "Identificacion: %s\n"
                + "Edad: %s\n"
                + "Numero de Creditos: %d\n"
                + "Costo credito: %.2f\n"
                + "Costo matricula: %.2f\n",
                e1.obtenerNombresEstudiante(),
                e1.obtenerApellidoEstudiante(),
                e1.obtenerIdentificacionEstudiante(),
                e1.obtenerEdadEstudiante(),
                e1.obtenerNumeroCreditos(),
                e1.obtenerCostoCredito(),
                e1.obtenerMatriculaPresencial());
    }
}
