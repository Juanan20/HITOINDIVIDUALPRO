package Cuestion1;

public class Principal {

	public static void main(String[] args) {
		Profesor miProfesor = new Profesor("Jonathan", "654342645", "Lenguaje de Marcas");
		
		System.out.println(miProfesor.andar(500));
		System.out.println(miProfesor.andar());

	}

}
