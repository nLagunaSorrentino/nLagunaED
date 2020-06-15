package es.studium.academia;

public class Colegio
{

	private int idColegio;
	private String nombreColegio;
	private String direccionColegio;
	
	public Colegio()
	{
		idColegio = 0;
		nombreColegio = "";
		direccionColegio = "";
	}
	
	public Colegio (int id, String n, String dC)
	{
		idColegio = id;
		nombreColegio = n;
		direccionColegio = dC;
	}
	
	public int getIdColegio()
	{
		return idColegio;
	}
	public void setIdColegio(int id)
	{
		idColegio = id;
	}
	
	public String getNombreColegio()
	{
		return nombreColegio;
	}
	public void setNombreColegio(String n)
	{
		nombreColegio = n;
	}
	
	public String getDireccionColegio()
	{
		return direccionColegio;
	}
	public void setDireccionColegio(String dC)
	{
		direccionColegio = dC;
	}	
	
}
