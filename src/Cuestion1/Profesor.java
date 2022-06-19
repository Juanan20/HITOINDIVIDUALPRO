package Cuestion1;
public class Profesor extends Persona {
	private String especialidad;

	public Profesor(String nombre, String telefono, String especialidad) {
		super(nombre, telefono);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Profesor: " + super.toString() + " Especialidad " + this.especialidad;
	}

	//Sobrescritura
	@Override
	public String andar() {
		return "Est� andando";
	}
	//Sobrecarga
	
	public String andar(int cuanto) {
		return "El profesor ha andado "+cuanto+" metros";
	}


	public String correr() {
		// TODO Auto-generated method stub
		return null;
	}

}
