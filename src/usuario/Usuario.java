package usuario;


import java.util.HashSet;
import java.util.Iterator;

import calificaciones.Calificacion;
import pelicula.Pelicula;

public class Usuario extends User{

	//ATRIBUTOS
	private int edad;
	private HashSet<String> generosPreferidos;
	
	//CONSTRUCTORES
	public Usuario(String nombre, int edad) {
	
		super(nombre);
		this.edad = edad;
		this.generosPreferidos = new HashSet<>();
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
	
	//REDEFINICION DE METODOS ABSTRACTOS
	public Iterator<String> darGenero(){
		
		HashSet<String> copiaGenero = new HashSet<String>(generosPreferidos);
		
		return copiaGenero.iterator();
	}
	
	public Iterator<Pelicula> listarPeliculasVistas(){
		
		HashSet<Pelicula> listaPeliculas = new HashSet<>();	
		Iterator<Calificacion> it = calificaciones.iterator();
		
		while(it.hasNext()) {
			Calificacion c = it.next();
			listaPeliculas.add(c.getPelicula());
		}
		
	return listaPeliculas.iterator();	
	}

	
}
