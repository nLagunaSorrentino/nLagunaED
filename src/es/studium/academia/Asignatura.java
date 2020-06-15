package es.studium.academia;

public class Asignatura
{

	private int idAsignatura;
	private String nombreAsignatura;
	private int horas;
	
	public Asignatura()
	{
		idAsignatura = 0;
		nombreAsignatura = "";
		horas = 0;
	}
	
	public Asignatura(int idA, String nA, int h)
	{
		idAsignatura = idA;
		nombreAsignatura = nA;
		horas = h;
	}
	
	public int getIdAsignatura()
	{
		return idAsignatura;
	}
	public void setIdAsignatura(int idA)
	{
		idAsignatura = idA;
	}
	
	public String getNombreAsignatura()
	{
		return nombreAsignatura;
	}
	public void setNombreAsignatura(String nA)
	{
		nombreAsignatura = nA;
	}
	
	public int getHoras()
	{
		return horas;
	}
	public void setHoras(int h)
	{
		horas = h;
	}
}
