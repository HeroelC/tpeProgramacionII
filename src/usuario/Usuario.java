package usuario;

import java.util.ArrayList;

import calificaciones.Calificacion;
import pelicula.Pelicula;

public class Usuario extends User{

	//ATRIBUTOS
	private int edad;
	private ArrayList<String> generosPreferidos;
	
	//CONSTRUCTOR
	public Usuario(String nombre, int edad) {
	
		super(nombre);
		this.edad = edad;
		this.generosPreferidos = new ArrayList<>();
	}
	
	//GETTERS
	public int getEdad() {
		return edad;
	}
	
	//SETTERS
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//METODOS
	public void addGeneroPreferido(String genero) {
		generosPreferidos.add(genero);
	}
	
	public ArrayList<String> darGenero(){
		
		ArrayList<String> copiaGenero = new ArrayList<String>(generosPreferidos);
		
		return copiaGenero;
	}
	
	public ArrayList<Pelicula> listarPeliculasVistas(){
		
	 ArrayList<Pelicula> listaPeliculas = new ArrayList<>();	
		
	 for(int i=0; i < calificaciones.size(); i++) {
		
		 listaPeliculas.add(calificaciones.get(i).getPelicula());
	 }
	 
	return listaPeliculas;	
		
	}
	
	
}
