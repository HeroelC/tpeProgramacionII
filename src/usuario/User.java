package usuario;

import java.util.ArrayList;

import calificaciones.Calificacion;
import pelicula.Pelicula;

public abstract class User {

	//ATRIBUTOS
	protected String nombre;
	protected ArrayList<Calificacion> calificaciones;
	
	public User(String nombre) {
	
		this.nombre = nombre;
		this.calificaciones = new ArrayList<>(); //Inicializamos el array de calificaciones
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//METODOS ABSTRACTOS
	public abstract ArrayList<Pelicula> listarPeliculasVistas();
	
	public abstract ArrayList<String> darGenero();
	
	//METODOS
	public void darCalificacion(Pelicula p, int calificacion) {
		
		//Si la pelicula no esta calificada, se puede dar calificacion ¿redefinir equals de calificaciones?
		if(!calificaciones.contains(p)) {
			
			Calificacion c = new Calificacion(this, p, calificacion);
			calificaciones.add(c);
		}
	}
	
	
	
	
	
}
