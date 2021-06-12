import java.util.InputMismatchException;
import java.util.Scanner;

import javax.naming.NameNotFoundException;

public class ProgramaUno {

	public static void main(String[] args) {
		
CAlumnos[] clase = new CAlumnos[3];
		
		clase[0] = new CAlumnos("Álvaro", "Gavilán", "FC");
		clase[1] = new CAlumnos("Jorge", "Gavilán", "R");
		clase[2] = new CAlumnos("Raquel", "Gavilán", "FC");
		
		CEvaluacion evaluacion1Alumno1 = new CEvaluacion(1, 6.5f);
		clase[0].setEvaluacion1(evaluacion1Alumno1);
		
		CEvaluacion evaluacion1Alumno2 = new CEvaluacion(1, 7.75f);
		clase[1].setEvaluacion1(evaluacion1Alumno2);
		
		CEvaluacion evaluacion2Alumno1 = new CEvaluacion(2, 4.25f);
		clase[0].setEvaluacion2(evaluacion2Alumno1);
		
		CEvaluacion evaluacion3Alumno1 = new CEvaluacion(3, 7.5f);
		clase[0].setEvaluacion3(evaluacion3Alumno1);
		
		CEvaluacion evaluacion3Alumno2 = new CEvaluacion(3, 6.8f);
		clase[1].setEvaluacion3(evaluacion3Alumno2);
		
		int evaluacion = ReadEvaluation();
		
		float sumaNotas = 0;

		System.out.println();

		System.out.println("NOTAS DE LA EVALUACION " + evaluacion);
				
		for (int i = 0; i < clase.length; i++) {
			
			try {
				CEvaluacion evaluacionAlumno = clase[i].GetEvaluacion(evaluacion);
				
	
				sumaNotas += evaluacionAlumno.getNota();
				
				System.out.println(clase[i].getNombre() + " " + clase[i].getApellido1() + " " + clase[i].getApellido2() + " " + evaluacionAlumno.getNota());
				
				
			} catch (NameNotFoundException e) {
				continue;
			}
			
		}
		
		float notaMedia = sumaNotas / clase.length;
		System.out.println();
		System.out.println("Nota media: " + notaMedia);
		
	}
	
	public static int ReadEvaluation() {
		int evaluacion = 0;
		boolean IsInvalidEvaluation = true;
		do {
			System.out.print("Introduce una evaluación: ");
			try {
				Scanner teclado = new Scanner(System.in);
				evaluacion = teclado.nextInt();
				if(evaluacion >= 1 && evaluacion <= 3) {
					IsInvalidEvaluation = false;
				}
			} catch (InputMismatchException ex) {
				System.out.println("Introduce un valor numérico 1, 2 o 3.");
			}
		} while (IsInvalidEvaluation);
		
		return evaluacion;
	}

}
