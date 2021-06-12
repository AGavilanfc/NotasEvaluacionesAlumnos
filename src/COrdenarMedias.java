
public class COrdenarMedias {

	public COrdenarMedias(CAlumnos[] clase) {
		this.clase = clase;
	}
	
	private CAlumnos[] clase;

	public CAlumnos[] getMediasOrdenadas() {
		
		int contadorCambios = 0;
		
		
		for(boolean ordenado = false; !ordenado;) {
			
			for (int i = 0; i < clase.length - 1; i++) {
			
				if (clase[i].getNotaMediaEvaluaciones() < clase[i+1].getNotaMediaEvaluaciones()) {
				
					CAlumnos oldGreatestNotaMedia = clase[i];
				
					clase[i] = clase[i + 1];
				
					clase[i + 1] = oldGreatestNotaMedia;
					
					contadorCambios++;
				} 
			
			}
			
			if (contadorCambios == 0) {
				
				ordenado = true;
				
			}
			
			contadorCambios = 0;
			
		}
		
		return clase;
	}
	
	
}
