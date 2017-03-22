package namespace;

public class Principal {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		Persona p2 = new Persona("Rodrigo",null,123);
		p1.setNombre("Rodrigo");
		p1.setApellido(null);
		p1.setDni(123);
		System.out.println(p1);
		System.out.println(p2);
		//no hace falta pasarle el metodo toString(),llama a la clase padre. Solo hace referencia
		
		if(p1.equals(p2))
		{
			System.out.println("Son iguales");
		}else{
			System.out.println("Son distintos");
		}
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		if(p1.hashCode()==p2.hashCode())
		{
			System.out.println();
			System.out.println("Son iguales Hashcode");
		}else{
			System.out.println("Son distintos Hashcode");
		}
	}
}
