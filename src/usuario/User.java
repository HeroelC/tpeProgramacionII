package usuario;


import java.util.HashSet;
import java.util.Iterator;

import calificaciones.Calificacion;
import pelicula.Pelicula;

public abstract class User {

	//ATRIBUTOS
	protected String nombre;
	protected HashSet<Calificacion> calificaciones;
	
	//CONSTRUCTORES
	public User(String nombre) {
	
		this.nombre = nombre;
		this.calificaciones = new HashSet<>(); //Inicializamos el array de calificaciones
	}
	
	//GETTERS
	public String getNombre() {
		return nombre;
	}

	//SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//METODOS ABSTRACTOS
	public abstract Iterator<Pelicula> listarPeliculasVistas();
	
	public abstract Iterator<String> darGenero();
	
	//METODOS
	//Deberia incluir en la pelicula la calificacion
	public void darCalificacion(Pelicula p, int calificacion) {
		
		//Si la pelicula no esta calificada, se puede dar calificacion ¿redefinir equals de calificaciones?
		if(!calificaciones.contains(p)) {
			
			Calificacion c = new Calificacion(this, p, calificacion);
			calificaciones.add(c);
		}
		
		
	}
	
	
	
	
	
}
