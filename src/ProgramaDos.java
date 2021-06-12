
public class ProgramaDos {

	public static void main(String[] args) {
		
		CAlumnos[] clase = new CAlumnos[4];
		
		clase[0] = new CAlumnos("Alvaro", "Gavilán", "FC");
		clase[1] = new CAlumnos("Jorge", "Gavilán", "R");
		clase[2] = new CAlumnos("Beatriz", "Gavilán", "R");
		clase[3] = new CAlumnos("Raquel", "Gavilán", "FC");
		
		
		CEvaluacion evaluacion1Alumno1 = new CEvaluacion(1, 7.75f);
		clase[0].setEvaluacion1(evaluacion1Alumno1);
		
		CEvaluacion evaluacion1Alumno2 = new CEvaluacion(1, 6);
		clase[1].setEvaluacion1(evaluacion1Alumno2);
		
		CEvaluacion evaluacion1Alumno3 = new CEvaluacion(1, 6.5f);
		clase[2].setEvaluacion1(evaluacion1Alumno3);
		
		CEvaluacion evaluacion2Alumno1 = new CEvaluacion(2, 3.25f);
		clase[0].setEvaluacion2(evaluacion2Alumno1);
		
		CEvaluacion evaluacion2Alumno3 = new CEvaluacion(2, 8.75f);
		clase[2].setEvaluacion2(evaluacion2Alumno3);
		
		CEvaluacion evaluacion3Alumno1 = new CEvaluacion(3, 5.5f);
		clase[0].setEvaluacion3(evaluacion3Alumno1);
		
		CEvaluacion evaluacion3Alumno2 = new CEvaluacion(3, 7.25f);
		clase[1].setEvaluacion3(evaluacion3Alumno2);
		
		CEvaluacion evaluacion3Alumno3 = new CEvaluacion(3, 7.25f);
		clase[2].setEvaluacion3(evaluacion3Alumno3);
		
		COrdenarMedias mediasOrdenadas = new COrdenarMedias(clase);
		
		CAlumnos[] claseOrdenada = mediasOrdenadas.getMediasOrdenadas();
		
		System.out.println("NOTA MEDIA DE LOS ALUMNOS");
		
		for (int i = 0; i < clase.length; i++) {
			
			if (claseOrdenada[i].getNotaMediaEvaluaciones() == 0) {
				
				continue;
				
			} 
			else {
				
				System.out.println(claseOrdenada[i].getNombre() + " " + claseOrdenada[i].getApellido1() + " " + clase[i].getApellido2() + " " 
						+ clase[i].getNotaMediaEvaluaciones());
				
			}
		}
			
			
		
	}

}
