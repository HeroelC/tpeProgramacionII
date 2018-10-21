package usuario;

import java.util.ArrayList;

import calificaciones.Calificacion;
import pelicula.Pelicula;

public abstract class User {

	protected String nombre;
	protected ArrayList<Calificacion> calificaciones;
	
	public User(String nombre) {
	
		this.nombre = nombre;
		this.calificaciones = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract ArrayList<Pelicula> listarPeliculasVistas();
	
	public abstract ArrayList<String> darGenero();
	
	public void darCalificacion(Pelicula p, int calificacion) {
		
		//Si la pelicula no esta calificada, se puede dar calificacion ¿redefinir equals de calificaciones?
		if(!calificaciones.contains(p)) {
			
			Calificacion c = new Calificacion(this, p, calificacion);
			calificaciones.add(c);
		}
	}
	
	
	
	
	
}
