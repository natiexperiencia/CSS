

public class Habitante {

	String nombre, voto;
	int edad;

	public Habitante (String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}

	public String votar(String vot){
		this.setVoto(vot);
		return this.getVoto();
	}

	public String getNombre(){
		return this.nombre;
	}

	public void setNombre(String nom){
		this.nombre = nom;
	}

	public String getVoto(){
		return this.voto;
	}

	public void setVoto(String vot){
		this.voto = vot;
	}

	public int getEdad(){
		return this.edad;
	}

	public void setEdad(int ed){
		this.edad = ed;
	}
}