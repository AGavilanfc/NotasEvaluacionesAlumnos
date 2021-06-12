import javax.naming.NameNotFoundException;


public class CAlumnos {

	public CAlumnos(String nombre, String apellido1, String apellido2) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}

	private String nombre;
	private String apellido1;
	private String apellido2;
	private CEvaluacion evaluacion1;
	private CEvaluacion evaluacion2;
	private CEvaluacion evaluacion3;
	
	
	
	public String getNombre() {
		return nombre;
	}



	public String getApellido1() {
		return apellido1;
	}



	public String getApellido2() {
		return apellido2;
	}



	public CEvaluacion getEvaluacion1() {
		return evaluacion1;
	}



	public void setEvaluacion1(CEvaluacion evaluacion1) {
		this.evaluacion1 = evaluacion1;
	}



	public CEvaluacion getEvaluacion2() {
		return evaluacion2;
	}



	public void setEvaluacion2(CEvaluacion evaluacion2) {
		this.evaluacion2 = evaluacion2;
	}



	public CEvaluacion getEvaluacion3() {
		return evaluacion3;
	}



	public void setEvaluacion3(CEvaluacion evaluacion3) {
		this.evaluacion3 = evaluacion3;
	}
	
	public CEvaluacion GetEvaluacion(int numEvaluacion) throws NameNotFoundException {
		CEvaluacion evaluacion = null; 
		switch (numEvaluacion) {
		case 1:
			evaluacion = this.evaluacion1;
			break;
		case 2:
			evaluacion = this.evaluacion2;
			break;
		case 3:
			evaluacion = this.evaluacion3;
			break;
		}
		
		if(evaluacion == null)
		{
			throw new NameNotFoundException();
		}
		else 
		{
			return evaluacion;
		}
	}
	
	public float getSumaNotasEvaluaciones() {
		
		float sumaNotaEvaluaciones = 0;
		
		try {
			sumaNotaEvaluaciones = evaluacion1.getNota() + evaluacion2.getNota() + evaluacion3.getNota();
		}
		
		catch(NullPointerException e) {
			
			if (evaluacion1 == null && evaluacion2 == null && evaluacion3 == null) {
				
				sumaNotaEvaluaciones = 0;
				
			}
			
			else if (evaluacion1 == null && evaluacion2 == null && evaluacion3 != null) {
				
				sumaNotaEvaluaciones = evaluacion3.getNota();
				
			}
			
			else if (evaluacion1 == null && evaluacion3 == null && evaluacion2 != null) {
				
				sumaNotaEvaluaciones = evaluacion2.getNota();
				
			}
			
			else if (evaluacion2 == null && evaluacion3 == null && evaluacion1 != null) {
				
				sumaNotaEvaluaciones = evaluacion1.getNota();
				
			}
			
			else if (evaluacion1 == null && evaluacion2 != null && evaluacion3 != null) {
				
				sumaNotaEvaluaciones = evaluacion2.getNota() + evaluacion3.getNota();
				
			}
			
			else if (evaluacion2 == null && evaluacion1 != null && evaluacion3 != null) {
				
				sumaNotaEvaluaciones = evaluacion1.getNota() + evaluacion3.getNota();
				
			}
			
			else if (evaluacion3 == null && evaluacion1 != null && evaluacion2 != null) {
				
				sumaNotaEvaluaciones = evaluacion1.getNota() + evaluacion2.getNota();
				
			}
			
		}
		
		return sumaNotaEvaluaciones;
	}
}
