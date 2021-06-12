
public class ProgramaDos {

	public static void main(String[] args) {
		
		CAlumnos[] clase = new CAlumnos[3];
		
		clase[0] = new CAlumnos("Alvaro", "Gavilán", "FC");
		clase[1] = new CAlumnos("Jorge", "Gavilán", "R");
		clase[2] = new CAlumnos("Raquel", "Gavilán", "FC");
		
		
		CEvaluacion evaluacion1Alumno1 = new CEvaluacion(1, 7.75f);
		clase[0].setEvaluacion1(evaluacion1Alumno1);
		
		CEvaluacion evaluacion1Alumno2 = new CEvaluacion(1, 6);
		clase[1].setEvaluacion1(evaluacion1Alumno2);
		
		CEvaluacion evaluacion2Alumno1 = new CEvaluacion(2, 3.25f);
		clase[0].setEvaluacion2(evaluacion2Alumno1);
		
		CEvaluacion evaluacion3Alumno1 = new CEvaluacion(3, 5.5f);
		clase[0].setEvaluacion3(evaluacion3Alumno1);
		
		CEvaluacion evaluacion3Alumno2 = new CEvaluacion(3, 7.25f);
		clase[1].setEvaluacion3(evaluacion3Alumno2);
		
		System.out.println("NOTA MEDIA DE LOS ALUMNOS");
		
		
		for (int i = 0; i < clase.length; i++) {
			
			if (clase[i].getSumaNotasEvaluaciones() == 0) {
				
				continue;
				
			} 
			else {
				
				System.out.println(clase[i].getNombre() + " " + clase[i].getApellido1() + " " + clase[i].getApellido2() + " " 
						+ clase[i].getSumaNotasEvaluaciones() / 3);
				
			}
		}
	}

}
