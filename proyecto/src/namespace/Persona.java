package namespace;

public class Persona {

	private String nombre;
	private String apellido;
	private int dni;
	
	public Persona()
	{
		
	}
	
	public Persona(String nom,String ape,int docu)
	{
		this.nombre = nom;
		this.apellido = ape;
		this.dni = docu;
	}
	//Sirve para el programador el Override, para q se entienda q sobrescribo el metodo,
	//No es obligatiorio.
	@Override
	public String toString()
	{
		return "Nombre: " + this.nombre + " Apellido: " + this.apellido + " Dni: " + this.dni;
	}
	
	public void setNombre(String nom)
	{
		this.nombre = nom;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setApellido(String ape)
	{
		this.apellido = ape;
	}
	
	public String getApellido()
	{
		return this.apellido;
	}
	
	public void setDni(int docu)
	{
		this.dni = docu;
	}
	
	public int getDni()
	{
		return this.dni;
	}
	//se puede cambiar el nivel de visibilidad de un metodo sobrescribido por uno de menor valor, x ejemplo: Public a protegido.
	@Override
	public boolean equals(Object a)
	{
		//pregunto si a es una instancia de a
		/*
		if(a instanceof Persona)
		{
			//casteo
			Persona p1 = (Persona)a;
			if(this.nombre.equals(p1.nombre) && this.apellido.equals(p1.apellido) && this.dni == p1.dni)
			{
					return true;
			}else{
				return false;		
			}
		}else{
			return false;
		}
		*/
		//comparo una clase con otra.
		if(a.getClass().equals(this.getClass()))
		{
			//casteo
			Persona p1 = (Persona)a;
			if(this.nombre != null && this.apellido != null && p1.nombre != null && p1.apellido != null)
			{
				if(this.nombre.equals(p1.nombre) && this.apellido.equals(p1.apellido) && this.dni == p1.dni)
				{
						return true;
				}else{
					return false;		
				}
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	//Cada objeto tiene un unico codigo solo va a ser igual a otro objeto, cuando ese otro objeto sea exactamente igual.
	@Override
	public int hashCode()
	{
		int numero=11;
		int resultado = 1;
		resultado = numero * resultado + this.dni;
		if(this.nombre != null)
		{
			resultado = numero * resultado + this.nombre.hashCode();
		}
			
		if(this.apellido != null)
		{
			resultado = numero * resultado + this.apellido.hashCode();
		}
		return resultado;
	}
}
