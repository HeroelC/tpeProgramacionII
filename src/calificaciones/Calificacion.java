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

	//GETTERS
	public String getNombreUsuario() {
		return usuario.getNombre();
	}

	public Pelicula getPelicula() {
		return this.pelicula;
	}
	
	public String getTituloPelicula() {
		return pelicula.getTitulo();
	}

	public int getCalificacion() {
		return calificacion;
	}
	
	//METODOS
	
	//METODOS PROPIOS DE CLASE OBJECT 
	public boolean equals(Calificacion c) {
		
		return (this.getNombreUsuario().equals(c.getNombreUsuario()) && (this.getTituloPelicula().equals(c.getTituloPelicula())));
	}
	
}
