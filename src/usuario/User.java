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
		return this.nombre;
	}

	//SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//METODOS ABSTRACTOS
	public abstract Iterator<Pelicula> listarPeliculasVistas();
	
	public abstract Iterator<String> darGenero();
	
	//METODOS
	public void darCalificacion(Pelicula p, int calificacion) {
		
			//Creamos la calificacion y se la agregamos al HashSet del usuario
			Calificacion c = new Calificacion(this, p, calificacion);
			calificaciones.add(c);
			//Le pasamos la calificacion a la pelicula también
			p.addCalificacion(this, calificacion);
		}
	
	//METODOS PROPIOS DE LOS OBJETOS EQUALS Y TOSTRING
	public boolean equals(User u) {
		
		if(this.getNombre().equals(u.getNombre())) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
