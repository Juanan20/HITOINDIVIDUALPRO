package Cuestion1;
public abstract class Persona {
	private String nombre;
	private String telefono;
	
	public Persona(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public Persona(String nombre){
	    this.nombre=nombre;
	    this.telefono="sin tel�fono";
	}
	                   
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return this.nombre + " - " + this.telefono;
	}
	
	public String saludar(){
	    return "Hola "+this.nombre;
	}
	
	public abstract String andar();
	public abstract String correr();
	
}
