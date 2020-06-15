package es.studium.academia;

public class Persona
{

	private Matriculacion matricula;
	private String nombre;
	private String direccion;
	private Colegio centro;
	private Asignatura asignatura;
	
	public Persona() 
	{
		matricula = new Matriculacion();
		nombre = "";
		direccion = "";
		centro = new Colegio();
		asignatura = new Asignatura();
	}
	
	public Persona(Matriculacion m, String nom, String d, Colegio c, Asignatura a)
	{
		matricula = m;
		nombre = nom;
		direccion = d;
		centro = c;
		asignatura = a;
	}
	
	public Matriculacion getMatricula()
	{
		return matricula;
	}
	public void setMatricula(Matriculacion m)
	{
		matricula = m;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nom)
	{
		nombre = nom;
	}
	
	public String getDireccion()
	{
		return direccion;
	}
	public void setDireccion(String d)
	{
		direccion = d;
	}
	
	public Colegio getCentro()
	{
		return centro;
	}
	public void setCentro(Colegio c)
	{
		centro = c;
	}
	
	public Asignatura getAsignatura()
	{
		return asignatura;
	}
	public void setAsignatura(Asignatura a)
	{
		asignatura = a;
	}
	
	
}
