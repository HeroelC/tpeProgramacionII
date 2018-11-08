package usuario;


import java.util.HashSet;
import java.util.Iterator;
import pelicula.Pelicula;

public abstract class User {

	//ATRIBUTOS
	protected String nombre;
	protected HashSet<Pelicula> peliculasVistas;
	
	//CONSTRUCTORES
	public User(String nombre) {
	
		this.nombre = nombre;
		this.peliculasVistas = new HashSet<>(); //Inicializamos el array de calificaciones
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
	
	public abstract boolean vioPelicula(Pelicula p);
	
	public abstract boolean contieneGeneros(Pelicula p);
	
	public abstract boolean contieneGenero(Pelicula p);
	
	public abstract void darCalificacion(Pelicula p, int calificacion);
	//METODOS
	
		
	//METODOS PROPIOS DE LOS OBJETOS EQUALS Y TOSTRING
	public boolean equals(User u) {
		return (this.getNombre().equals(u.getNombre()));
	}
	
}
