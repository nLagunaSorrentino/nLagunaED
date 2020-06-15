package es.studium.academia;

public class TestColegio
{
	public static void main(String[] args)
	{
		// 2 tipos de asignatura de ingl�s y 2 tipos de asignatura de franc�s
		Asignatura ingles1 = new Asignatura(01, "Ingl�s B1", 50);
		Asignatura ingles2 = new Asignatura(02, "Ingl�s B2", 50);
		Asignatura frances1 = new Asignatura(03, "Franc�s B1", 50);
		Asignatura frances2 = new Asignatura(04, "Franc�s A2", 50);
		
		// 1 colegio ingl�s, 1 colegio franc�s
		Colegio cIngles = new Colegio(28201,"Escuela de ingl�s", "Reyes Cat�licos, 14");
		Colegio cFrances = new Colegio(27202, "Escuela de franc�s", "Crist�bal Col�n, 92");
		
		// matriculaciones de cada alumno, 3 de ingl�s y 2 de franc�s
		Matriculacion m1 = new Matriculacion(1, ingles1, 7.0);
		Matriculacion m2 = new Matriculacion(2, ingles2, 6.0);
		Matriculacion m3 = new Matriculacion(3, ingles1, 5.0);
		
		Matriculacion m4 = new Matriculacion(4, frances1, 9.0);
		Matriculacion m5 = new Matriculacion(5, frances2, 8.5);
		
		//alumnos de los distintos centros
		Persona anaA = new Persona(m1, "Ana Abel", "Paseo de Am�rica, 15", cIngles, ingles1);
		Persona benitoB = new Persona(m2, "Benito Bueno", "Reyes Cat�licos, 16", cIngles, ingles2);
		Persona carmenC = new Persona (m3, "Carmen Cano", "Reyes Cat�licos, 2", cIngles, ingles1);
		Persona estebanE = new Persona (m4, "Esteban Escalera", "Isabel la Cat�lica, 28", cFrances, frances1);
		Persona francisF = new Persona (m5, "Francisco Farf�n", "Crist�bal Col�n, s/n", cFrances, frances2);
		
		//mostrar direcciones de los dos centros
		System.out.println("Direcci�n de " + cIngles.getNombreColegio()+":");
		System.out.println(cIngles.getDireccionColegio() + ".");
		System.out.println("Direcci�n de " + cFrances.getNombreColegio()+":");
		System.out.println(cFrances.getDireccionColegio() + ".");
		
		
		
		System.out.println("\n" + "Direcci�n del centro donde estudia " + carmenC.getNombre() + ": " + cFrances.getDireccionColegio() + ".");
	
		System.out.println("\n" + benitoB.getNombre() + " tiene una nota de " + m2.getNota() + " en la asignatura " + ingles2.getNombreAsignatura() + ".");
	}
}
