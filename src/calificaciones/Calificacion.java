package calificaciones;

import pelicula.Pelicula;
import usuario.User;

public class Calificacion {

	//ATRIBUTOS
	private User usuario;
	private Pelicula pelicula;
	private int calificacion;

	//CONSTRUCTOR
	public Calificacion(User usuario, Pelicula pelicula, int calificacion) {
		
		this.usuario = usuario;
		this.pelicula = pelicula;
		this.calificacion = calificacion;
	}

	public String getUsuario() {
		return usuario.getNombre();
	}

	public Pelicula getPelicula() {
		return this.pelicula;
	}

	public int getCalificacion() {
		return calificacion;
	}
	
	//METODOS
	
	//IMPLEMENTAR ECUALS CON .GETUSUARIO
	
}
