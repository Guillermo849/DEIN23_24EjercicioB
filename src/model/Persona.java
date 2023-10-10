package model;

public class Persona {
	
	String nombre;
	String apellidos;
	int edad;
	
	public Persona(String nom, String ape, int eda) {
		nombre = nom;
		apellidos = ape;
		edad = eda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
