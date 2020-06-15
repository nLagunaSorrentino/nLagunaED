package es.studium.academia;

public class Matriculacion
{

	private int numeroMatricula;
	private Asignatura asignatura;
	private double notas;
	
	public Matriculacion()
	{
		numeroMatricula = 0;
		asignatura = new Asignatura();
		notas = 0.0;
	}
	
	public Matriculacion(int nM, Asignatura a, double n)
	{
		numeroMatricula = nM;
		asignatura = a;
		notas = n;
	}
	
	public int getNumeroMatricula()
	{
		return numeroMatricula;
	}
	public void setNumeroMatricula(int nM)
	{
		numeroMatricula = nM;
	}
	
	public Asignatura getAsignatura()
	{
		return asignatura;
	}
	public void setAsignatura(Asignatura a)
	{
		asignatura = a;
	}
	
	public double getNota()
	{
		return notas;
	}
	public void setNota(double n)
	{
		notas = n;
	}
	
	
	
	
}
