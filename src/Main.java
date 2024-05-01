//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
@author Paola Peiro
@version Java 21.0.1 23-10-17
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenidos a la inmersión en Java");
        System.out.println("Película Matrix");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        double mediaEvaluacionUsuario = 0;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = "La mejor película del fin del milenio";

        System.out.println("Pelicula: " + nombre);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Puntuación: " + evaluacion);
        System.out.println("¿Está incluido en el plan Básico?: " + incluidoEnElPlanBasico);


        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluación de Matrix : " + mediaEvaluacion);


        // Estructuras de decisión

        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula anterior a 2023, es retro, pero vale la pena");
        }

        // Ciclos de repetición

        for (int i = 0; i < 3; i++) {
            System.out.println("Buenas");
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }

        System.out.println("Media de la película " + " Matrix calculada por el usuario es:  " + mediaEvaluacionUsuario / 3);



    }
}